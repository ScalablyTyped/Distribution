package typings.sipJs

import typings.sipJs.anon.Error
import typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import typings.sipJs.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  object Parser {
    
    @JSImport("sip.js/lib/core/messages/parser", "Parser.getHeader")
    @js.native
    def getHeader(data: js.Any, headerStart: Double): Double = js.native
    
    @JSImport("sip.js/lib/core/messages/parser", "Parser.parseHeader")
    @js.native
    def parseHeader(message: IncomingRequestMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | Error = js.native
    @JSImport("sip.js/lib/core/messages/parser", "Parser.parseHeader")
    @js.native
    def parseHeader(message: IncomingResponseMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | Error = js.native
    
    @JSImport("sip.js/lib/core/messages/parser", "Parser.parseMessage")
    @js.native
    def parseMessage(data: String, logger: Logger): js.UndefOr[IncomingRequestMessage | IncomingResponseMessage] = js.native
  }
}
