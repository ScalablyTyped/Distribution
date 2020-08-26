package typings.sipJs.invitationProgressOptionsMod

import typings.sipJs.anon.Body
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationProgressOptions extends js.Object {
  /**
    * Body
    */
  var body: js.UndefOr[String | Body] = js.native
  /**
    * Array of extra headers added to the response.
    */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Reason phrase for response.
    */
  var reasonPhrase: js.UndefOr[String] = js.native
  /**
    * Send reliable response.
    */
  var rel100: js.UndefOr[Boolean] = js.native
  /**
    * Modifiers to pass to SessionDescriptionHandler during the initial INVITE transaction.
    */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  /**
    * Options to pass to SessionDescriptionHandler during the initial INVITE transaction.
    */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
  /**
    * Status code for response.
    */
  var statusCode: js.UndefOr[Double] = js.native
}

object InvitationProgressOptions {
  @scala.inline
  def apply(): InvitationProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationProgressOptions]
  }
  @scala.inline
  implicit class InvitationProgressOptionsOps[Self <: InvitationProgressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String | Body): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    @scala.inline
    def setReasonPhrase(value: String): Self = this.set("reasonPhrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonPhrase: Self = this.set("reasonPhrase", js.undefined)
    @scala.inline
    def setRel100(value: Boolean): Self = this.set("rel100", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRel100: Self = this.set("rel100", js.undefined)
    @scala.inline
    def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = this.set("sessionDescriptionHandlerModifiers", js.Array(value :_*))
    @scala.inline
    def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = this.set("sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionDescriptionHandlerModifiers: Self = this.set("sessionDescriptionHandlerModifiers", js.undefined)
    @scala.inline
    def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = this.set("sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionDescriptionHandlerOptions: Self = this.set("sessionDescriptionHandlerOptions", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

