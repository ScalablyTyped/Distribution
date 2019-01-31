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

