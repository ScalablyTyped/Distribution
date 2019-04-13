package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[State, TStateProps, TOwnProps, TMergedProps] extends ConnectOptions {
  /**
    * When pure, compares the result of mergeProps to its previous value.
    * @default shallowEqual
    */
  var areMergedPropsEqual: js.UndefOr[
    js.Function2[
      /* nextMergedProps */ TMergedProps, 
      /* prevMergedProps */ TMergedProps, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * When pure, compares incoming props to its previous value.
    * @default shallowEqual
    */
  var areOwnPropsEqual: js.UndefOr[
    js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, scala.Boolean]
  ] = js.undefined
  /**
    * When pure, compares the result of mapStateToProps to its previous value.
    * @default shallowEqual
    */
  var areStatePropsEqual: js.UndefOr[
    js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, scala.Boolean]
  ] = js.undefined
  /**
    * When pure, compares incoming store state to its previous value.
    * @default strictEqual
    */
  var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, scala.Boolean]] = js.undefined
  /**
    * If true, use React's forwardRef to expose a ref of the wrapped component
    *
    * @default false
    */
  var forwardRef: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
    * preventing unnecessary updates, assuming that the component is a “pure” component
    * and does not rely on any input or state other than its props and the selected Redux store’s state.
    * Defaults to true.
    * @default true
    */
  var pure: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[State, TStateProps, TOwnProps, TMergedProps](
    areMergedPropsEqual: (/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps) => scala.Boolean = null,
    areOwnPropsEqual: (/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps) => scala.Boolean = null,
    areStatePropsEqual: (/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps) => scala.Boolean = null,
    areStatesEqual: (/* nextState */ State, /* prevState */ State) => scala.Boolean = null,
    context: reactLib.reactMod.Context[ReactReduxContextValue[_, reduxLib.reduxMod.AnyAction]] = null,
    forwardRef: js.UndefOr[scala.Boolean] = js.undefined,
    getDisplayName: /* componentName */ java.lang.String => java.lang.String = null,
    methodName: java.lang.String = null,
    pure: js.UndefOr[scala.Boolean] = js.undefined,
    renderCountProp: java.lang.String = null,
    shouldHandleStateChanges: js.UndefOr[scala.Boolean] = js.undefined,
    storeKey: java.lang.String = null,
    withRef: js.UndefOr[scala.Boolean] = js.undefined
  ): Options[State, TStateProps, TOwnProps, TMergedProps] = {
    val __obj = js.Dynamic.literal()
    if (areMergedPropsEqual != null) __obj.updateDynamic("areMergedPropsEqual")(js.Any.fromFunction2(areMergedPropsEqual))
    if (areOwnPropsEqual != null) __obj.updateDynamic("areOwnPropsEqual")(js.Any.fromFunction2(areOwnPropsEqual))
    if (areStatePropsEqual != null) __obj.updateDynamic("areStatePropsEqual")(js.Any.fromFunction2(areStatePropsEqual))
    if (areStatesEqual != null) __obj.updateDynamic("areStatesEqual")(js.Any.fromFunction2(areStatesEqual))
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef)
    if (getDisplayName != null) __obj.updateDynamic("getDisplayName")(js.Any.fromFunction1(getDisplayName))
    if (methodName != null) __obj.updateDynamic("methodName")(methodName)
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    if (renderCountProp != null) __obj.updateDynamic("renderCountProp")(renderCountProp)
    if (!js.isUndefined(shouldHandleStateChanges)) __obj.updateDynamic("shouldHandleStateChanges")(shouldHandleStateChanges)
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey)
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[Options[State, TStateProps, TOwnProps, TMergedProps]]
  }
}

