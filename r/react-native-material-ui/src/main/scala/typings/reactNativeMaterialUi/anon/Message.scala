package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var message: js.UndefOr[ViewStyle] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    message: js.UndefOr[Null | ViewStyle] = js.undefined
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

