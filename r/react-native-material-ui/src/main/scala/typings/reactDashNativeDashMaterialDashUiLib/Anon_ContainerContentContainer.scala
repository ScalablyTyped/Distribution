package typings
package reactDashNativeDashMaterialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerContentContainer extends js.Object {
  var container: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
  var contentContainer: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
}

object Anon_ContainerContentContainer {
  @scala.inline
  def apply(
    container: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null,
    contentContainer: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null
  ): Anon_ContainerContentContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (contentContainer != null) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerContentContainer]
  }
}

