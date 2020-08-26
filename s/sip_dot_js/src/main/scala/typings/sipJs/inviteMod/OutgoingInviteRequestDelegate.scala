package typings.sipJs.inviteMod

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingInviteRequestDelegate extends OutgoingRequestDelegate {
  /**
    * Received a 2xx positive final response to this request.
    * @param response - Incoming response (including a confirmed Session).
    */
  @JSName("onAccept")
  var onAccept_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ AckableIncomingResponseWithSession, Unit]] = js.native
  /**
    * Received a 1xx provisional response to this request. Excluding 100 responses.
    * @param response - Incoming response (including an early Session).
    */
  @JSName("onProgress")
  var onProgress_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ PrackableIncomingResponseWithSession, Unit]] = js.native
}

object OutgoingInviteRequestDelegate {
  @scala.inline
  def apply(): OutgoingInviteRequestDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingInviteRequestDelegate]
  }
  @scala.inline
  implicit class OutgoingInviteRequestDelegateOps[Self <: OutgoingInviteRequestDelegate] (val x: Self) extends AnyVal {
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
    def setOnAccept(value: /* response */ AckableIncomingResponseWithSession => Unit): Self = this.set("onAccept", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAccept: Self = this.set("onAccept", js.undefined)
    @scala.inline
    def setOnProgress(value: /* response */ PrackableIncomingResponseWithSession => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
  }
  
}

