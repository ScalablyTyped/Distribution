package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesIncomingDashMessageMod.IncomingMessage
import typings.sipDotJs.libCoreMessagesMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/incoming-request-message", JSImport.Namespace)
@js.native
object libCoreMessagesIncomingDashRequestDashMessageMod extends js.Object {
  @js.native
  class IncomingRequestMessage () extends IncomingMessage {
    var ruri: js.UndefOr[URI] = js.native
  }
  
}

