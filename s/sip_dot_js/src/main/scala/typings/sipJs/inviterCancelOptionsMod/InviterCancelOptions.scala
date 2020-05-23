package typings.sipJs.inviterCancelOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviterCancelOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var reasonPhrase: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object InviterCancelOptions {
  @scala.inline
  def apply(
    extraHeaders: js.Array[String] = null,
    reasonPhrase: String = null,
    statusCode: js.UndefOr[Double] = js.undefined
  ): InviterCancelOptions = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviterCancelOptions]
  }
}

