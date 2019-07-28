package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerMessage extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var message: js.UndefOr[ViewStyle] = js.undefined
}

object Anon_ContainerMessage {
  @scala.inline
  def apply(container: ViewStyle = null, message: ViewStyle = null): Anon_ContainerMessage = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerMessage]
  }
}

