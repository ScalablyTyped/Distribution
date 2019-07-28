package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_Color
import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerContentStrokeContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var accent: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Element] = js.undefined
  var icon: js.UndefOr[String | Anon_Color] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Anon_ContainerContentStrokeContainer] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    accent: js.UndefOr[Boolean] = js.undefined,
    children: Element = null,
    icon: String | Anon_Color = null,
    size: Int | Double = null,
    stroke: Int | Double = null,
    style: Anon_ContainerContentStrokeContainer = null,
    text: String = null
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

