package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.TextStyle
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[TextStyle] = js.undefined
  var positionContainer: js.UndefOr[ViewStyle] = js.undefined
}

object Anon_Container {
  @scala.inline
  def apply(container: ViewStyle = null, icon: TextStyle = null, positionContainer: ViewStyle = null): Anon_Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (positionContainer != null) __obj.updateDynamic("positionContainer")(positionContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Container]
  }
}

