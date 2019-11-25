package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import typings.history.historyMod.History
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TKeys, TState] extends js.Object {
  /**
    * A prefix that will be prepended to the URL. For example, using a basename of '/playground',
    * a route with the path '/home' would correspond to the URL path '/playground/home'.
    */
  var basename: js.UndefOr[String] = js.undefined
  /**
    * A function returning a history object compatible with the popular `history` package.
    */
  var createHistory: js.UndefOr[js.Function0[History[typings.history.historyMod.LocationState]]] = js.undefined
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
  var extra: js.UndefOr[js.Any] = js.undefined
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
  var location: js.UndefOr[String | (SelectLocationState[TKeys, TState])] = js.undefined
  /**
    * A map of of your Redux state keys to _React Navigation_ navigators.
    */
  var navigators: js.UndefOr[NavigatorsConfig[TKeys, TState]] = js.undefined
  /**
    * The path where users may be redirected in 2 situations: when you dispatch an action with no matching path,
    *  or if you manually call dispatch(redirect({ type: NOT_FOUND })), where NOT_FOUND is an export from this package.
    *  The type in actions and state will be NOT_FOUND, which you can use to show a 404 page.
    */
  var notFoundPath: js.UndefOr[String] = js.undefined
  /**
    * A simple function that will be called after the routes change.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action` and the configured `extra` value.
    */
  var onAfterChange: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.undefined
  /**
    * A simple function that will be called whenever the user uses the browser back/next buttons.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action`
    * and the configured `extra` value. Actions with kinds `back`, `next`, and `pop` trigger this.
    */
  var onBackNext: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.undefined
  /**
    * A simple function that will be called before the routes change.
    * It's passed your standard `dispatch` and `getState` arguments like a thunk,
    * as well as the `bag` object as a third parameter, which contains the dispatched `action` and the configured `extra` value.
    */
  var onBeforeChange: js.UndefOr[
    js.Function3[/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag, Unit]
  ] = js.undefined
  /**
    * An object with parse and stringify methods, such as the `query-string` or `qs` libraries (or anything handmade).
    * This will be used to handle querystrings. Without this option, query strings are ignored silently.
    */
  var querySerializer: js.UndefOr[QuerySerializer] = js.undefined
  /**
    * A function to update window/elements scroll position.
    */
  var restoreScroll: js.UndefOr[
    js.Function1[/* history */ History[typings.history.historyMod.LocationState], ScrollBehavior]
  ] = js.undefined
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
  @scala.inline
  def apply[TKeys, TState](
    basename: String = null,
    createHistory: () => History[typings.history.historyMod.LocationState] = null,
    displayConfirmLeave: (/* message */ String, /* callback */ js.Function1[/* unblock */ Boolean, Unit]) => Unit = null,
    extra: js.Any = null,
    initialDispatch: js.UndefOr[Boolean] = js.undefined,
    initialEntries: HistoryEntries = null,
    location: String | (SelectLocationState[TKeys, TState]) = null,
    navigators: NavigatorsConfig[TKeys, TState] = null,
    notFoundPath: String = null,
    onAfterChange: (/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit = null,
    onBackNext: (/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit = null,
    onBeforeChange: (/* dispatch */ Dispatch[_], /* getState */ StateGetter[TState], /* bag */ Bag) => Unit = null,
    querySerializer: QuerySerializer = null,
    restoreScroll: /* history */ History[typings.history.historyMod.LocationState] => ScrollBehavior = null,
    scrollTop: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    title: String | SelectTitleState[TState] = null
  ): Options[TKeys, TState] = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (createHistory != null) __obj.updateDynamic("createHistory")(js.Any.fromFunction0(createHistory))
    if (displayConfirmLeave != null) __obj.updateDynamic("displayConfirmLeave")(js.Any.fromFunction2(displayConfirmLeave))
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(initialDispatch)) __obj.updateDynamic("initialDispatch")(initialDispatch.asInstanceOf[js.Any])
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigators != null) __obj.updateDynamic("navigators")(navigators.asInstanceOf[js.Any])
    if (notFoundPath != null) __obj.updateDynamic("notFoundPath")(notFoundPath.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction3(onAfterChange))
    if (onBackNext != null) __obj.updateDynamic("onBackNext")(js.Any.fromFunction3(onBackNext))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction3(onBeforeChange))
    if (querySerializer != null) __obj.updateDynamic("querySerializer")(querySerializer.asInstanceOf[js.Any])
    if (restoreScroll != null) __obj.updateDynamic("restoreScroll")(js.Any.fromFunction1(restoreScroll))
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TKeys, TState]]
  }
}

