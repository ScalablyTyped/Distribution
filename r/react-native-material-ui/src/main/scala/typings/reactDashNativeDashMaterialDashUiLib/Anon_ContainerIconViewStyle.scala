package typings
package reactDashNativeDashMaterialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerIconViewStyle extends js.Object {
  var container: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
  var icon: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
}

object Anon_ContainerIconViewStyle {
  @scala.inline
  def apply(
    container: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null,
    icon: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null
  ): Anon_ContainerIconViewStyle = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerIconViewStyle]
  }
}

