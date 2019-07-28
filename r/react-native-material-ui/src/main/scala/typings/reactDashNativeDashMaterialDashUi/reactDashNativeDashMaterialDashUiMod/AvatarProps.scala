package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.reactDashNative.reactDashNativeMod.Image
import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var iconSize: js.UndefOr[Double] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Anon_ContainerContent] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    icon: String = null,
    iconColor: String = null,
    iconSize: Int | Double = null,
    image: Image = null,
    size: Int | Double = null,
    style: Anon_ContainerContent = null,
    text: String = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[AvatarProps]
  }
}

