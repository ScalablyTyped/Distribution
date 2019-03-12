package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
  var active: scala.Boolean
  var onActionClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[Snackbar]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  def onTimeout(): js.Any
}

object SnackbarProps {
  @scala.inline
  def apply(
    active: scala.Boolean,
    onTimeout: () => js.Any,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    action: java.lang.String = null,
    onActionClick: reactLib.reactMod.ReactNs.MouseEventHandler[Snackbar] = null,
    timeout: scala.Int | scala.Double = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active, onTimeout = js.Any.fromFunction0(onTimeout))
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (action != null) __obj.updateDynamic("action")(action)
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(onActionClick)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

