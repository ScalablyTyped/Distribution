package typings
package reactDashNativeDashMaterialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerIcon extends js.Object {
  var container: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
  var icon: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
  var label: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.TextStyle
  ] = js.undefined
}

object Anon_ContainerIcon {
  @scala.inline
  def apply(
    container: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null,
    icon: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null,
    label: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.TextStyle = null
  ): Anon_ContainerIcon = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerIcon]
  }
}

