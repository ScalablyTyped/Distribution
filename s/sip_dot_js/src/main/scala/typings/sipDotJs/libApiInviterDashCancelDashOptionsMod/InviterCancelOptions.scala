package typings.sipDotJs.libApiInviterDashCancelDashOptionsMod

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
    statusCode: Int | Double = null
  ): InviterCancelOptions = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviterCancelOptions]
  }
}

