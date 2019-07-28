package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerIconViewStyle extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[ViewStyle] = js.undefined
}

object Anon_ContainerIconViewStyle {
  @scala.inline
  def apply(container: ViewStyle = null, icon: ViewStyle = null): Anon_ContainerIconViewStyle = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerIconViewStyle]
  }
}

