package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var message: js.UndefOr[ViewStyle] = js.undefined
}

object AnonMessage {
  @scala.inline
  def apply(container: ViewStyle = null, message: ViewStyle = null): AnonMessage = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

