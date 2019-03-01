package typings
package reactDashReduxDashToastrLib.reactDashReduxDashToastrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toastr extends js.Object {
  var id: java.lang.String
  var message: js.UndefOr[java.lang.String] = js.undefined
  var options: BasicToastrOptions | LightToastrOptions
  var position: positionType
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: toastType
}

object Toastr {
  @scala.inline
  def apply(
    id: java.lang.String,
    options: BasicToastrOptions | LightToastrOptions,
    position: positionType,
    `type`: toastType,
    message: java.lang.String = null,
    title: java.lang.String = null
  ): Toastr = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(position)
    if (message != null) __obj.updateDynamic("message")(message)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Toastr]
  }
}

