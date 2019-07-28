package typings.reactDashRedux.reactDashReduxMod

import typings.react.reactMod.Context
import typings.redux.reduxMod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  /**
    * The react context to get the store from.
    *
    * @default ReactReduxContext
    */
  var context: js.UndefOr[Context[ReactReduxContextValue[_, AnyAction]]] = js.undefined
  /**
    * Computes the connector component's displayName property relative to that of the wrapped component. Usually
    * overridden by wrapper functions.
    *
    * @default name => 'ConnectAdvanced('+name+')'
    * @param componentName
    */
  var getDisplayName: js.UndefOr[js.Function1[/* componentName */ String, String]] = js.undefined
  /**
    * Shown in error messages. Usually overridden by wrapper functions.
    *
    * @default 'connectAdvanced'
    */
  var methodName: js.UndefOr[String] = js.undefined
  /**
    * If defined, a property named this value will be added to the props passed to the wrapped component. Its value
    * will be the number of times the component has been rendered, which can be useful for tracking down unnecessary
    * re-renders.
    *
    * @default undefined
    */
  var renderCountProp: js.UndefOr[String] = js.undefined
  /**
    * Controls whether the connector component subscribes to redux store state changes. If set to false, it will only
    * re-render on <code>componentWillReceiveProps</code>.
    *
    * @default true
    */
  var shouldHandleStateChanges: js.UndefOr[Boolean] = js.undefined
  /**
    * The key of props/context to get the store. You probably only need this if you are in the inadvisable position of
    * having multiple stores.
    *
    * @default 'store'
    */
  var storeKey: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Use forwardRef
    *
    * @default false
    */
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    context: Context[ReactReduxContextValue[_, AnyAction]] = null,
    getDisplayName: /* componentName */ String => String = null,
    methodName: String = null,
    renderCountProp: String = null,
    shouldHandleStateChanges: js.UndefOr[Boolean] = js.undefined,
    storeKey: String = null,
    withRef: js.UndefOr[Boolean] = js.undefined
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (getDisplayName != null) __obj.updateDynamic("getDisplayName")(js.Any.fromFunction1(getDisplayName))
    if (methodName != null) __obj.updateDynamic("methodName")(methodName)
    if (renderCountProp != null) __obj.updateDynamic("renderCountProp")(renderCountProp)
    if (!js.isUndefined(shouldHandleStateChanges)) __obj.updateDynamic("shouldHandleStateChanges")(shouldHandleStateChanges)
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey)
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[ConnectOptions]
  }
}

