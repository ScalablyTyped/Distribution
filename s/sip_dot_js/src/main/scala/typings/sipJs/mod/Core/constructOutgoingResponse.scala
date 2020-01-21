package typings.sipJs.mod.Core

import typings.sipJs.outgoingResponseMod.OutgoingResponse
import typings.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.constructOutgoingResponse")
@js.native
object constructOutgoingResponse extends js.Object {
  def apply(message: typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage, options: ResponseOptions): OutgoingResponse = js.native
}

