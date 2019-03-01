package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleFeedbackProps extends js.Object {
  var borderless: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.Global.JSXNs.Element
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object RippleFeedbackProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element,
    borderless: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null
  ): RippleFeedbackProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[RippleFeedbackProps]
  }
}

