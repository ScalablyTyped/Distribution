package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "constructOutgoingResponse")
@js.native
object constructOutgoingResponse extends js.Object {
  def apply(
    message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
}

