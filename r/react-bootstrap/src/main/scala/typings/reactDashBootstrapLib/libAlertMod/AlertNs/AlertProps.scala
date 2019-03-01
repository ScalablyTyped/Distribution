package typings
package reactDashBootstrapLib.libAlertMod.AlertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libAlertMod.Alert] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var closeLabel: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated since v0.29.0 */ var dismissAfter: js.UndefOr[scala.Double] = js.undefined
  // TODO: Add more specific type
  var onDismiss: js.UndefOr[js.Function] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libAlertMod.Alert] = null,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    closeLabel: java.lang.String = null,
    dismissAfter: scala.Int | scala.Double = null,
    onDismiss: js.Function = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (closeLabel != null) __obj.updateDynamic("closeLabel")(closeLabel)
    if (dismissAfter != null) __obj.updateDynamic("dismissAfter")(dismissAfter.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    __obj.asInstanceOf[AlertProps]
  }
}

