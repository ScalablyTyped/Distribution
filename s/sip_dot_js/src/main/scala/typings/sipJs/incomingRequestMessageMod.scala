package typings.sipJs

import typings.sipJs.incomingMessageMod.IncomingMessage
import typings.sipJs.messagesMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incomingRequestMessageMod {
  
  @JSImport("sip.js/lib/core/messages/incoming-request-message", "IncomingRequestMessage")
  @js.native
  open class IncomingRequestMessage () extends IncomingMessage {
    
    var ruri: js.UndefOr[URI] = js.native
  }
}
