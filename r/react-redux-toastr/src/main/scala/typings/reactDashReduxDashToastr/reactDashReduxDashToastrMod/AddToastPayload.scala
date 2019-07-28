package typings.reactDashReduxDashToastr.reactDashReduxDashToastrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToastPayload extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[BasicToastrOptions | LightToastrOptions] = js.undefined
  var position: js.UndefOr[positionType] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: toastType
}

object AddToastPayload {
  @scala.inline
  def apply(
    `type`: toastType,
    id: String = null,
    message: String = null,
    options: BasicToastrOptions | LightToastrOptions = null,
    position: positionType = null,
    title: String = null
  ): AddToastPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AddToastPayload]
  }
}

