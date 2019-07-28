package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.TextStyle
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerIcon extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[ViewStyle] = js.undefined
  var label: js.UndefOr[TextStyle] = js.undefined
}

object Anon_ContainerIcon {
  @scala.inline
  def apply(container: ViewStyle = null, icon: ViewStyle = null, label: TextStyle = null): Anon_ContainerIcon = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerIcon]
  }
}

