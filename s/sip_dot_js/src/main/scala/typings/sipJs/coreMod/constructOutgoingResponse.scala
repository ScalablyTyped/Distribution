package typings.sipJs.coreMod

import typings.sipJs.outgoingResponseMod.OutgoingResponse
import typings.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "constructOutgoingResponse")
@js.native
object constructOutgoingResponse extends js.Object {
  def apply(message: typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage, options: ResponseOptions): OutgoingResponse = js.native
}

