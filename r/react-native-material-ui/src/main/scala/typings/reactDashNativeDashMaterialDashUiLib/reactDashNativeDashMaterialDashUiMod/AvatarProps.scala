package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  var iconSize: js.UndefOr[scala.Double] = js.undefined
  var image: js.UndefOr[reactDashNativeLib.reactDashNativeMod.Image] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerContent] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    icon: java.lang.String = null,
    iconColor: java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    image: reactDashNativeLib.reactDashNativeMod.Image = null,
    size: scala.Int | scala.Double = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerContent = null,
    text: java.lang.String = null
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

