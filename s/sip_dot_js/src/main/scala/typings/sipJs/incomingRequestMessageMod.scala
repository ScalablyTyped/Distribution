package typings.sipJs

import typings.sipJs.incomingMessageMod.IncomingMessage
import typings.sipJs.messagesMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/incoming-request-message", JSImport.Namespace)
@js.native
object incomingRequestMessageMod extends js.Object {
  @js.native
  class IncomingRequestMessage () extends IncomingMessage {
    var ruri: js.UndefOr[URI] = js.native
  }
  
}

