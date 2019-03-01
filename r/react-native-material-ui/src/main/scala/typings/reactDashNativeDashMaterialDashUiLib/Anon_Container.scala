package typings
package reactDashNativeDashMaterialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
  var icon: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.TextStyle
  ] = js.undefined
  var positionContainer: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
}

object Anon_Container {
  @scala.inline
  def apply(
    container: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null,
    icon: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.TextStyle = null,
    positionContainer: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null
  ): Anon_Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (positionContainer != null) __obj.updateDynamic("positionContainer")(positionContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Container]
  }
}

