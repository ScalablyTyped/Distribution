package typings
package sipDotJsLib.libRequestSenderMod.RequestSenderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamlinedApplicant extends js.Object {
  var request: sipDotJsLib.libSIPMessageMod.OutgoingRequest
  def onRequestTimeout(): scala.Unit
  def onTransportError(): scala.Unit
  def receiveResponse(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit
}

object StreamlinedApplicant {
  @scala.inline
  def apply(
    onRequestTimeout: () => scala.Unit,
    onTransportError: () => scala.Unit,
    receiveResponse: sipDotJsLib.libSIPMessageMod.IncomingResponse => scala.Unit,
    request: sipDotJsLib.libSIPMessageMod.OutgoingRequest
  ): StreamlinedApplicant = {
    val __obj = js.Dynamic.literal(onRequestTimeout = js.Any.fromFunction0(onRequestTimeout), onTransportError = js.Any.fromFunction0(onTransportError), receiveResponse = js.Any.fromFunction1(receiveResponse), request = request)
  
    __obj.asInstanceOf[StreamlinedApplicant]
  }
}

