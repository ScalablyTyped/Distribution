package typings.sipJs.invitationProgressOptionsMod

import typings.sipJs.anon.Body
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationProgressOptions extends js.Object {
  /**
    * Body
    */
  var body: js.UndefOr[String | Body] = js.undefined
  /**
    * Array of extra headers added to the response.
    */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Reason phrase for response.
    */
  var reasonPhrase: js.UndefOr[String] = js.undefined
  /**
    * Send reliable response.
    */
  var rel100: js.UndefOr[Boolean] = js.undefined
  /**
    * Modifiers to pass to SessionDescriptionHandler's getDescription() and setDescription().
    */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
  /**
    * Options to pass to SessionDescriptionHandler's getDescription() and setDescription().
    */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
  /**
    * Status code for response.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}

object InvitationProgressOptions {
  @scala.inline
  def apply(
    body: String | Body = null,
    extraHeaders: js.Array[String] = null,
    reasonPhrase: String = null,
    rel100: js.UndefOr[Boolean] = js.undefined,
    sessionDescriptionHandlerModifiers: js.Array[SessionDescriptionHandlerModifier] = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null,
    statusCode: js.UndefOr[Double] = js.undefined
  ): InvitationProgressOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase.asInstanceOf[js.Any])
    if (!js.isUndefined(rel100)) __obj.updateDynamic("rel100")(rel100.get.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerModifiers != null) __obj.updateDynamic("sessionDescriptionHandlerModifiers")(sessionDescriptionHandlerModifiers.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationProgressOptions]
  }
}

