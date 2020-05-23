package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Image
import typings.reactNativeMaterialUi.anon.ContainerContentContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerHeaderProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Element] = js.undefined
  var image: js.UndefOr[js.Array[Image]] = js.undefined
  var style: js.UndefOr[ContainerContentContainer] = js.undefined
}

object DrawerHeaderProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    children: Element = null,
    image: js.Array[Image] = null,
    style: ContainerContentContainer = null
  ): DrawerHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerHeaderProps]
  }
}

