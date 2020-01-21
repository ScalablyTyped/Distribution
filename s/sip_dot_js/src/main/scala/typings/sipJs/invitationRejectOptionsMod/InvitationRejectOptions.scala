package typings.sipJs.invitationRejectOptionsMod

import typings.sipJs.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationRejectOptions extends js.Object {
  /**
    * Body
    */
  var body: js.UndefOr[String | AnonBody] = js.undefined
  /**
    * Array of extra headers added to the response.
    */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Reason phrase for response.
    */
  var reasonPhrase: js.UndefOr[String] = js.undefined
  /**
    * Status code for response.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}

object InvitationRejectOptions {
  @scala.inline
  def apply(
    body: String | AnonBody = null,
    extraHeaders: js.Array[String] = null,
    reasonPhrase: String = null,
    statusCode: Int | Double = null
  ): InvitationRejectOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationRejectOptions]
  }
}

