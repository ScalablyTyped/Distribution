package typings.reduxFirstRouter.mod

import typings.history.mod.History
import typings.redux.mod.Dispatch
import typings.reduxFirstRouter.anon.Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[TKeys, TState] extends js.Object {
  
  /**
    * A prefix that will be prepended to the URL. For example, using a basename of '/playground',
    * a route with the path '/home' would correspond to the URL path '/playground/home'.
    */
  var basename: js.UndefOr[String] = js.native
  
  /**
    * A function returning a history object compatible with the popular `history` package.
    */
  var createHistory: js.UndefOr[js.Function0[History[typings.history.mod.LocationState]]] = js.native
  
  /**
    * A function receiving `message` and `callback` when navigation is blocked with `confirmLeave`.
    * The message is the return value from `confirmLeave`.
    * The callback can be called with `true` to unblock the navigation, or with `false` to cancel the navigation.
    */
  var displayConfirmLeave: js.UndefOr[DisplayConfirmLeave] = js.native
  
  /**
    * An optional value that will be passed as part of the third `bag` argument to all options callbacks and routes thunk.
    * It works much like the `withExtraArgument` feature of `redux-thunk` or the `context` argument of GraphQL resolvers.
    * You can use it to pass any required context to your thunks without having to tightly couple them to it.
    * For example, you could pass an instance of an API client initialised with authentication cookies,
    * or a function `addReducer` to inject new code split reducers into the store.
    */
  var extra: js.UndefOr[js.Any] = js.native
  
  /**
    * Can be set to false to bypass the initial dispatch, so you can do it manually, perhaps after running sagas.
    */
  var initialDispatch: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of entries to initialise history object. Useful for server side rendering and tests.
    */
  var initialEntries: js.UndefOr[HistoryEntries] = js.native
  
  /**
    * The name of the state key or a selector function to specify where in your Redux state tree
    * Redux First Router should expect your page location reducer to be attached to.
    */
  var location: js.UndefOr[String | (SelectLocationState_[TKeys, TState])] = js.native
  
  /**
    * A map of of your Redux state keys to _React Navigation_ navigators.
    */
  var navigators: js.UndefOr[NavigatorsConfig[TKeys, TState]] = js.native
  
  /**
    * The path where users may be redirected in 2 situations: when you dispatch an action with no matching path,
    *  or if you manually call dispatch(redirect({ type: NOT_FOUND })), where NOT_FOUND is an export from this package.
    *  The type in actions and state will be NOT_FOUND, which you can use to show a 404 page.
    */
  var notFoundPath: js.UndefOr[String] = js.native
  
  /**
    * A simple function that will be called after the routes change.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action` and the configured `extra` value.
    */
  var onAfterChange: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.native
  
  /**
    * A simple function that will be called whenever the user uses the browser back/next buttons.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action`
    * and the configured `extra` value. Actions with kinds `back`, `next`, and `pop` trigger this.
    */
  var onBackNext: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.native
  
  /**
    * A simple function that will be called before the routes change.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action` and the configured `extra` value.
    */
  var onBeforeChange: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.native
  
  /**
    * An object with parse and stringify methods, such as the `query-string` or `qs` libraries (or anything handmade).
    * This will be used to handle querystrings. Without this option, query strings are ignored silently.
    */
  var querySerializer: js.UndefOr[QuerySerializer] = js.native
  
  /**
    * A function to update window/elements scroll position.
    */
  var restoreScroll: js.UndefOr[
    js.Function1[/* history */ History[typings.history.mod.LocationState], ScrollBehavior_]
  ] = js.native
  
  /**
    * Whether or not window.scrollTo(0, 0) should be run on route changes so the user starts each page at the top.
    */
  var scrollTop: js.UndefOr[Boolean] = js.native
  
  /**
    *  Whether or not a trailing delimiter is allowed when matching path.
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the state key or a selector function to specify where in your Redux state tree
    * Redux First Router should expect your page title reducer to be attached to.
    * This can be omitted if you attach the reducer at state.title.
    */
  var title: js.UndefOr[String | SelectTitleState[TState]] = js.native
}
object Options {
  
  @scala.inline
  def apply[TKeys, TState](): Options[TKeys, TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TKeys, TState]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], TKeys, TState] (val x: Self with (Options[TKeys, TState])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    
    @scala.inline
    def setCreateHistory(value: () => History[typings.history.mod.LocationState]): Self = this.set("createHistory", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreateHistory: Self = this.set("createHistory", js.undefined)
    
    @scala.inline
    def setDisplayConfirmLeave(value: (/* message */ String, /* callback */ js.Function1[/* unblock */ Boolean, Unit]) => Unit): Self = this.set("displayConfirmLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDisplayConfirmLeave: Self = this.set("displayConfirmLeave", js.undefined)
    
    @scala.inline
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setInitialDispatch(value: Boolean): Self = this.set("initialDispatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDispatch: Self = this.set("initialDispatch", js.undefined)
    
    @scala.inline
    def setInitialEntriesVarargs(value: Pathname*): Self = this.set("initialEntries", js.Array(value :_*))
    
    @scala.inline
    def setInitialEntries(value: HistoryEntries): Self = this.set("initialEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialEntries: Self = this.set("initialEntries", js.undefined)
    
    @scala.inline
    def setLocationFunction1(value: TState => LocationState[TKeys, TState]): Self = this.set("location", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocation(value: String | (SelectLocationState_[TKeys, TState])): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNavigators(value: NavigatorsConfig[TKeys, TState]): Self = this.set("navigators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigators: Self = this.set("navigators", js.undefined)
    
    @scala.inline
    def setNotFoundPath(value: String): Self = this.set("notFoundPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFoundPath: Self = this.set("notFoundPath", js.undefined)
    
    @scala.inline
    def setOnAfterChange(value: (/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit): Self = this.set("onAfterChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    
    @scala.inline
    def setOnBackNext(value: (/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit): Self = this.set("onBackNext", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnBackNext: Self = this.set("onBackNext", js.undefined)
    
    @scala.inline
    def setOnBeforeChange(value: (/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit): Self = this.set("onBeforeChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnBeforeChange: Self = this.set("onBeforeChange", js.undefined)
    
    @scala.inline
    def setQuerySerializer(value: QuerySerializer): Self = this.set("querySerializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerySerializer: Self = this.set("querySerializer", js.undefined)
    
    @scala.inline
    def setRestoreScroll(value: /* history */ History[typings.history.mod.LocationState] => ScrollBehavior_): Self = this.set("restoreScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRestoreScroll: Self = this.set("restoreScroll", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Boolean): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setTitleFunction1(value: TState => String): Self = this.set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String | SelectTitleState[TState]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
