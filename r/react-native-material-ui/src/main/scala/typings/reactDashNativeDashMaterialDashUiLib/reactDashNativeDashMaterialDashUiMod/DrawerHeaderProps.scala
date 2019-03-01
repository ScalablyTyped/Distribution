package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerHeaderProps extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var image: js.UndefOr[js.Array[reactDashNativeLib.reactDashNativeMod.Image]] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerContentContainer] = js.undefined
}

object DrawerHeaderProps {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    children: reactLib.reactMod.Global.JSXNs.Element = null,
    image: js.Array[reactDashNativeLib.reactDashNativeMod.Image] = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerContentContainer = null
  ): DrawerHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (children != null) __obj.updateDynamic("children")(children)
    if (image != null) __obj.updateDynamic("image")(image)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DrawerHeaderProps]
  }
}

