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
    onRequestTimeout: () => scala.Unit,
    onTransportError: () => scala.Unit,
    receiveResponse: sipDotJsLib.typesSipDashMessageMod.IncomingResponse => scala.Unit,
    request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest
  ): StreamlinedApplicant = {
    val __obj = js.Dynamic.literal(onRequestTimeout = js.Any.fromFunction0(onRequestTimeout), onTransportError = js.Any.fromFunction0(onTransportError), receiveResponse = js.Any.fromFunction1(receiveResponse), request = request)
  
    __obj.asInstanceOf[StreamlinedApplicant]
  }
}

