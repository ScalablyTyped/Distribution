package typings
package reactDashBootstrapLib.libControlLabelMod.ControlLabelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlLabelProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libControlLabelMod.ControlLabel] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var srOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object ControlLabelProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libControlLabelMod.ControlLabel] = null,
    bsClass: java.lang.String = null,
    htmlFor: java.lang.String = null,
    srOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): ControlLabelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly)
    __obj.asInstanceOf[ControlLabelProps]
  }
}

