package typings.reduxFirstRouter.mod

import typings.history.mod.History
import typings.redux.mod.Dispatch
import typings.reduxFirstRouter.anon.Pathname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[TKeys, TState] extends StObject {
  
  /**
    * A prefix that will be prepended to the URL. For example, using a basename of '/playground',
    * a route with the path '/home' would correspond to the URL path '/playground/home'.
    */
  var basename: js.UndefOr[String] = js.undefined
  
  /**
    * A function returning a history object compatible with the popular `history` package.
    */
  var createHistory: js.UndefOr[js.Function0[History]] = js.undefined
  
  /**
    * A function receiving `message` and `callback` when navigation is blocked with `confirmLeave`.
    * The message is the return value from `confirmLeave`.
    * The callback can be called with `true` to unblock the navigation, or with `false` to cancel the navigation.
    */
  var displayConfirmLeave: js.UndefOr[DisplayConfirmLeave] = js.undefined
  
  /**
    * An optional value that will be passed as part of the third `bag` argument to all options callbacks and routes thunk.
    * It works much like the `withExtraArgument` feature of `redux-thunk` or the `context` argument of GraphQL resolvers.
    * You can use it to pass any required context to your thunks without having to tightly couple them to it.
    * For example, you could pass an instance of an API client initialised with authentication cookies,
    * or a function `addReducer` to inject new code split reducers into the store.
    */
  var extra: js.UndefOr[Any] = js.undefined
  
  /**
    * Can be set to false to bypass the initial dispatch, so you can do it manually, perhaps after running sagas.
    */
  var initialDispatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of entries to initialise history object. Useful for server side rendering and tests.
    */
  var initialEntries: js.UndefOr[HistoryEntries] = js.undefined
  
  /**
    * The name of the state key or a selector function to specify where in your Redux state tree
    * Redux First Router should expect your page location reducer to be attached to.
    */
  var location: js.UndefOr[String | (SelectLocationState_[TKeys, TState])] = js.undefined
  
  /**
    * A map of of your Redux state keys to _React Navigation_ navigators.
    */
  var navigators: js.UndefOr[NavigatorsConfig[TKeys, TState]] = js.undefined
  
  /**
    * The path where users may be redirected in 2 situations: when you dispatch an action with no matching path,
    *  or if you manually call dispatch(redirect({ type: NOT_FOUND })), where NOT_FOUND is an export from this package.
    *  The type in actions and state will be NOT_FOUND, which you can use to show a 404 page.
    */
  var notFoundPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A simple function that will be called after the routes change.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action` and the configured `extra` value.
    */
  var onAfterChange: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[Any], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.undefined
  
  /**
    * A simple function that will be called whenever the user uses the browser back/next buttons.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action`
    * and the configured `extra` value. Actions with kinds `back`, `next`, and `pop` trigger this.
    */
  var onBackNext: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[Any], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.undefined
  
  /**
    * A simple function that will be called before the routes change.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action` and the configured `extra` value.
    */
  var onBeforeChange: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[Any], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.undefined
  
  /**
    * An object with parse and stringify methods, such as the `query-string` or `qs` libraries (or anything handmade).
    * This will be used to handle querystrings. Without this option, query strings are ignored silently.
    */
  var querySerializer: js.UndefOr[QuerySerializer] = js.undefined
  
  /**
    * A function to update window/elements scroll position.
    */
  var restoreScroll: js.UndefOr[js.Function1[/* history */ History, ScrollBehavior_]] = js.undefined
  
  /**
    * Whether or not window.scrollTo(0, 0) should be run on route changes so the user starts each page at the top.
    */
  var scrollTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Whether or not a trailing delimiter is allowed when matching path.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the state key or a selector function to specify where in your Redux state tree
    * Redux First Router should expect your page title reducer to be attached to.
    * This can be omitted if you attach the reducer at state.title.
    */
  var title: js.UndefOr[String | SelectTitleState[TState]] = js.undefined
}
object Options {
  
  inline def apply[TKeys, TState](): Options[TKeys, TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TKeys, TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options[?, ?], TKeys, TState] (val x: Self & (Options[TKeys, TState])) extends AnyVal {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setCreateHistory(value: () => History): Self = StObject.set(x, "createHistory", js.Any.fromFunction0(value))
    
    inline def setCreateHistoryUndefined: Self = StObject.set(x, "createHistory", js.undefined)
    
    inline def setDisplayConfirmLeave(value: (/* message */ String, /* callback */ js.Function1[/* unblock */ Boolean, Unit]) => Unit): Self = StObject.set(x, "displayConfirmLeave", js.Any.fromFunction2(value))
    
    inline def setDisplayConfirmLeaveUndefined: Self = StObject.set(x, "displayConfirmLeave", js.undefined)
    
    inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setInitialDispatch(value: Boolean): Self = StObject.set(x, "initialDispatch", value.asInstanceOf[js.Any])
    
    inline def setInitialDispatchUndefined: Self = StObject.set(x, "initialDispatch", js.undefined)
    
    inline def setInitialEntries(value: HistoryEntries): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
    
    inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
    
    inline def setInitialEntriesVarargs(value: Pathname*): Self = StObject.set(x, "initialEntries", js.Array(value*))
    
    inline def setLocation(value: String | (SelectLocationState_[TKeys, TState])): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationFunction1(value: TState => LocationState[TKeys, TState]): Self = StObject.set(x, "location", js.Any.fromFunction1(value))
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNavigators(value: NavigatorsConfig[TKeys, TState]): Self = StObject.set(x, "navigators", value.asInstanceOf[js.Any])
    
    inline def setNavigatorsUndefined: Self = StObject.set(x, "navigators", js.undefined)
    
    inline def setNotFoundPath(value: String): Self = StObject.set(x, "notFoundPath", value.asInstanceOf[js.Any])
    
    inline def setNotFoundPathNull: Self = StObject.set(x, "notFoundPath", null)
    
    inline def setNotFoundPathUndefined: Self = StObject.set(x, "notFoundPath", js.undefined)
    
    inline def setOnAfterChange(value: (/* dispatch */ Dispatch[Any], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction3(value))
    
    inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
    
    inline def setOnBackNext(value: (/* dispatch */ Dispatch[Any], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit): Self = StObject.set(x, "onBackNext", js.Any.fromFunction3(value))
    
    inline def setOnBackNextUndefined: Self = StObject.set(x, "onBackNext", js.undefined)
    
    inline def setOnBeforeChange(value: (/* dispatch */ Dispatch[Any], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction3(value))
    
    inline def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
    
    inline def setQuerySerializer(value: QuerySerializer): Self = StObject.set(x, "querySerializer", value.asInstanceOf[js.Any])
    
    inline def setQuerySerializerUndefined: Self = StObject.set(x, "querySerializer", js.undefined)
    
    inline def setRestoreScroll(value: /* history */ History => ScrollBehavior_): Self = StObject.set(x, "restoreScroll", js.Any.fromFunction1(value))
    
    inline def setRestoreScrollUndefined: Self = StObject.set(x, "restoreScroll", js.undefined)
    
    inline def setScrollTop(value: Boolean): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTitle(value: String | SelectTitleState[TState]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction1(value: TState => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
