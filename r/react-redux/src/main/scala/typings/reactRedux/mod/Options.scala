package typings.reactRedux.mod

import typings.react.mod.Context
import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[State, TStateProps, TOwnProps, TMergedProps] extends ConnectOptions {
  /**
    * When pure, compares the result of mergeProps to its previous value.
    * @default shallowEqual
    */
  var areMergedPropsEqual: js.UndefOr[
    js.Function2[/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps, Boolean]
  ] = js.undefined
  /**
    * When pure, compares incoming props to its previous value.
    * @default shallowEqual
    */
  var areOwnPropsEqual: js.UndefOr[
    js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, Boolean]
  ] = js.undefined
  /**
    * When pure, compares the result of mapStateToProps to its previous value.
    * @default shallowEqual
    */
  var areStatePropsEqual: js.UndefOr[
    js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, Boolean]
  ] = js.undefined
  /**
    * When pure, compares incoming store state to its previous value.
    * @default strictEqual
    */
  var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, Boolean]] = js.undefined
  /**
    * If true, use React's forwardRef to expose a ref of the wrapped component
    *
    * @default false
    */
  var forwardRef: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
    * preventing unnecessary updates, assuming that the component is a “pure” component
    * and does not rely on any input or state other than its props and the selected Redux store’s state.
    * Defaults to true.
    * @default true
    */
  var pure: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[State, TStateProps, TOwnProps, TMergedProps](
    areMergedPropsEqual: (/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps) => Boolean = null,
    areOwnPropsEqual: (/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps) => Boolean = null,
    areStatePropsEqual: (/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps) => Boolean = null,
    areStatesEqual: (/* nextState */ State, /* prevState */ State) => Boolean = null,
    context: Context[ReactReduxContextValue[_, AnyAction]] = null,
    forwardRef: js.UndefOr[Boolean] = js.undefined,
    getDisplayName: /* componentName */ String => String = null,
    methodName: String = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    renderCountProp: String = null,
    shouldHandleStateChanges: js.UndefOr[Boolean] = js.undefined,
    storeKey: String = null,
    withRef: js.UndefOr[Boolean] = js.undefined
  ): Options[State, TStateProps, TOwnProps, TMergedProps] = {
    val __obj = js.Dynamic.literal()
    if (areMergedPropsEqual != null) __obj.updateDynamic("areMergedPropsEqual")(js.Any.fromFunction2(areMergedPropsEqual))
    if (areOwnPropsEqual != null) __obj.updateDynamic("areOwnPropsEqual")(js.Any.fromFunction2(areOwnPropsEqual))
    if (areStatePropsEqual != null) __obj.updateDynamic("areStatePropsEqual")(js.Any.fromFunction2(areStatePropsEqual))
    if (areStatesEqual != null) __obj.updateDynamic("areStatesEqual")(js.Any.fromFunction2(areStatesEqual))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef.get.asInstanceOf[js.Any])
    if (getDisplayName != null) __obj.updateDynamic("getDisplayName")(js.Any.fromFunction1(getDisplayName))
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    if (renderCountProp != null) __obj.updateDynamic("renderCountProp")(renderCountProp.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHandleStateChanges)) __obj.updateDynamic("shouldHandleStateChanges")(shouldHandleStateChanges.get.asInstanceOf[js.Any])
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[State, TStateProps, TOwnProps, TMergedProps]]
  }
}

