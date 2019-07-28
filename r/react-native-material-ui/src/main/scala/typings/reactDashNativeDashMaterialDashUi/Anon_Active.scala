package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.TextStyle
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[TextStyle] = js.undefined
  var container: js.UndefOr[ViewStyle] = js.undefined
  var disabled: js.UndefOr[TextStyle] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(active: TextStyle = null, container: ViewStyle = null, disabled: TextStyle = null): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

