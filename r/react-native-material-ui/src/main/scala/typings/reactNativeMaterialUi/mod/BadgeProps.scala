package typings.reactNativeMaterialUi.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactNativeMaterialUi.AnonColor
import typings.reactNativeMaterialUi.AnonContainerContentStrokeContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var accent: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Element] = js.undefined
  var icon: js.UndefOr[String | AnonColor] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonContainerContentStrokeContainer] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    accent: js.UndefOr[Boolean] = js.undefined,
    children: Element = null,
    icon: String | AnonColor = null,
    size: Int | Double = null,
    stroke: Int | Double = null,
    style: AnonContainerContentStrokeContainer = null,
    text: String = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

