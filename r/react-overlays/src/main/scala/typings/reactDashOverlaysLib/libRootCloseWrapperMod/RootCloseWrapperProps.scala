package typings
package reactDashOverlaysLib.libRootCloseWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RootCloseWrapperProps extends js.Object {
  /**
     * Children to render.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
  	 * Disable the the RootCloseWrapper, preventing it from triggering
  	 * `onRootClose`.
  	 */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Choose which document mouse event to bind to
  	 */
  var event: js.UndefOr[
    reactDashOverlaysLib.reactDashOverlaysLibStrings.click | reactDashOverlaysLib.reactDashOverlaysLibStrings.mousedown
  ] = js.undefined
  /**
     * Callback fired after click or mousedown. Also triggers when user hits `esc`.
     */
  var onRootClose: js.UndefOr[js.Function1[/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_], scala.Unit]] = js.undefined
}

