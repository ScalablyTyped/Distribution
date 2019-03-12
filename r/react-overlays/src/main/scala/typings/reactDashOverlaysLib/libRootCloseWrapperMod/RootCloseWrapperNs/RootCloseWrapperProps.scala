package typings
package reactDashOverlaysLib.libRootCloseWrapperMod.RootCloseWrapperNs

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
  var onRootClose: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit]
  ] = js.undefined
}

object RootCloseWrapperProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    event: reactDashOverlaysLib.reactDashOverlaysLibStrings.click | reactDashOverlaysLib.reactDashOverlaysLibStrings.mousedown = null,
    onRootClose: /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event] => scala.Unit = null
  ): RootCloseWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (onRootClose != null) __obj.updateDynamic("onRootClose")(js.Any.fromFunction1(onRootClose))
    __obj.asInstanceOf[RootCloseWrapperProps]
  }
}

