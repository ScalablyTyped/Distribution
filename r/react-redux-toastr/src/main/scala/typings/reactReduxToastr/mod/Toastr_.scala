package typings.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toastr_ extends js.Object {
  var id: String
  var message: js.UndefOr[String] = js.undefined
  var options: BasicToastrOptions | LightToastrOptions
  var position: positionType
  var title: js.UndefOr[String] = js.undefined
  var `type`: toastType
}

object Toastr_ {
  @scala.inline
  def apply(
    id: String,
    options: BasicToastrOptions | LightToastrOptions,
    position: positionType,
    `type`: toastType,
    message: String = null,
    title: String = null
  ): Toastr_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toastr_]
  }
}

