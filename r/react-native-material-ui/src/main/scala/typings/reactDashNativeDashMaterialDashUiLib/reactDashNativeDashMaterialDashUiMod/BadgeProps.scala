package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var accent: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactDashNativeDashMaterialDashUiLib.Anon_Color] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerContentStrokeContainer] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    accent: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.Global.JSXNs.Element = null,
    icon: java.lang.String | reactDashNativeDashMaterialDashUiLib.Anon_Color = null,
    size: scala.Int | scala.Double = null,
    stroke: scala.Int | scala.Double = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerContentStrokeContainer = null,
    text: java.lang.String = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent)
    if (children != null) __obj.updateDynamic("children")(children)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BadgeProps]
  }
}

