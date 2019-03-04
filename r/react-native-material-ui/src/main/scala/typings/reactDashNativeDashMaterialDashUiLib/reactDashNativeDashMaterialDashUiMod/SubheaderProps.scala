package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubheaderProps extends js.Object {
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var lines: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerText] = js.undefined
  var text: java.lang.String
}

object SubheaderProps {
  @scala.inline
  def apply(
    text: java.lang.String,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    lines: scala.Int | scala.Double = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerText = null
  ): SubheaderProps = {
    val __obj = js.Dynamic.literal(text = text)
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SubheaderProps]
  }
}

