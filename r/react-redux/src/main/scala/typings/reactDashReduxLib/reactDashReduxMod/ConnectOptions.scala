package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  /**
    * Computes the connector component's displayName property relative to that of the wrapped component. Usually
    * overridden by wrapper functions.
    *
    * @default name => 'ConnectAdvanced('+name+')'
    * @param componentName
    */
  var getDisplayName: js.UndefOr[js.Function1[/* componentName */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * Shown in error messages. Usually overridden by wrapper functions.
    *
    * @default 'connectAdvanced'
    */
  var methodName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If defined, a property named this value will be added to the props passed to the wrapped component. Its value
    * will be the number of times the component has been rendered, which can be useful for tracking down unnecessary
    * re-renders.
    *
    * @default undefined
    */
  var renderCountProp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls whether the connector component subscribes to redux store state changes. If set to false, it will only
    * re-render on <code>componentWillReceiveProps</code>.
    *
    * @default true
    */
  var shouldHandleStateChanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The key of props/context to get the store. You probably only need this if you are in the inadvisable position of
    * having multiple stores.
    *
    * @default 'store'
    */
  var storeKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated Use forwardRef
    *
    * @default false
    */
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

