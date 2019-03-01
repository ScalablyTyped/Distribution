package typings
package sipDotJsLib.typesRequestDashSenderMod.RequestSenderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamlinedApplicant extends js.Object {
  var request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest
  def onRequestTimeout(): scala.Unit
  def onTransportError(): scala.Unit
  def receiveResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit
}

object StreamlinedApplicant {
  @scala.inline
  def apply(
    onRequestTimeout: js.Function0[scala.Unit],
    onTransportError: js.Function0[scala.Unit],
    receiveResponse: js.Function1[sipDotJsLib.typesSipDashMessageMod.IncomingResponse, scala.Unit],
    request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest
  ): StreamlinedApplicant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onRequestTimeout")(onRequestTimeout)
    __obj.updateDynamic("onTransportError")(onTransportError)
    __obj.updateDynamic("receiveResponse")(receiveResponse)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[StreamlinedApplicant]
  }
}

