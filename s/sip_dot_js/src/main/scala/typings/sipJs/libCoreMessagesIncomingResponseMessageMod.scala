package typings.sipJs

import typings.sipJs.libCoreMessagesIncomingMessageMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMessagesIncomingResponseMessageMod {
  
  @JSImport("sip.js/lib/core/messages/incoming-response-message", "IncomingResponseMessage")
  @js.native
  open class IncomingResponseMessage () extends IncomingMessage {
    
    var reasonPhrase: js.UndefOr[String] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
}
