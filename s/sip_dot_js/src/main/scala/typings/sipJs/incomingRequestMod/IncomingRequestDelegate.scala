package typings.sipJs.incomingRequestMod

import typings.sipJs.coreExceptionsMod.TransportError
import typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingRequestDelegate extends js.Object {
  /**
    * Receive CANCEL request.
    * https://tools.ietf.org/html/rfc3261#section-9.2
    * Note: Currently CANCEL is being handled as a special case.
    * No UAS is created to handle the CANCEL and the response to
    * it CANCEL is being handled statelessly by the user agent core.
    * As such, there is currently no way to externally impact the
    * response to the a CANCEL request and thus the method here is
    * receiving a "message" (as apposed to a "uas").
    * @param message - Incoming CANCEL request message.
    */
  var onCancel: js.UndefOr[js.Function1[/* message */ IncomingRequestMessage, Unit]] = js.native
  /**
    * A transport error occurred attempted to send a response.
    * @param error - Transport error.
    */
  var onTransportError: js.UndefOr[js.Function1[/* error */ TransportError, Unit]] = js.native
}

object IncomingRequestDelegate {
  @scala.inline
  def apply(): IncomingRequestDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingRequestDelegate]
  }
  @scala.inline
  implicit class IncomingRequestDelegateOps[Self <: IncomingRequestDelegate] (val x: Self) extends AnyVal {
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
    def setOnCancel(value: /* message */ IncomingRequestMessage => Unit): Self = this.set("onCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnTransportError(value: /* error */ TransportError => Unit): Self = this.set("onTransportError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransportError: Self = this.set("onTransportError", js.undefined)
  }
  
}

