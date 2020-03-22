package typings.reactNativeMaterialUi.mod

import typings.reactNative.mod.Image
import typings.reactNativeMaterialUi.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var iconSize: js.UndefOr[Double] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonContent] = js.undefined
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
    style: AnonContent = null,
    text: String = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
}

