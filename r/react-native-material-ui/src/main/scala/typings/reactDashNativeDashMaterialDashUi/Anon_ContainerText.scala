package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.TextStyle
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerText extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var text: js.UndefOr[TextStyle] = js.undefined
}

object Anon_ContainerText {
  @scala.inline
  def apply(container: ViewStyle = null, text: TextStyle = null): Anon_ContainerText = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerText]
  }
}

