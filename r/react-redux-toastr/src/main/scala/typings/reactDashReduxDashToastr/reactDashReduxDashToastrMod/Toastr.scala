package typings.reactDashReduxDashToastr.reactDashReduxDashToastrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toastr extends js.Object {
  var id: String
  var message: js.UndefOr[String] = js.undefined
  var options: BasicToastrOptions | LightToastrOptions
  var position: positionType
  var title: js.UndefOr[String] = js.undefined
  var `type`: toastType
}

object Toastr {
  @scala.inline
  def apply(
    id: String,
    options: BasicToastrOptions | LightToastrOptions,
    position: positionType,
    `type`: toastType,
    message: String = null,
    title: String = null
  ): Toastr = {
    val __obj = js.Dynamic.literal(id = id, options = options.asInstanceOf[js.Any], position = position)
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Toastr]
  }
}

