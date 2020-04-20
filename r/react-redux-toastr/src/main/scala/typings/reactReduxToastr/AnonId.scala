package typings.reactReduxToastr

import typings.reactReduxToastr.mod.ConfirmToastrCustomOptions
import typings.reactReduxToastr.mod.ConfirmToastrOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var message: String
  var options: ConfirmToastrOptions | ConfirmToastrCustomOptions
  var show: Boolean
}

object AnonId {
  @scala.inline
  def apply(
    id: String,
    message: String,
    options: ConfirmToastrOptions | ConfirmToastrCustomOptions,
    show: Boolean
  ): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

