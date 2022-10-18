package typings.sipJs

import typings.sipJs.anon.Error
import typings.sipJs.libCoreLogLoggerMod.Logger
import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMessagesParserMod {
  
  object Parser {
    
    @JSImport("sip.js/lib/core/messages/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getHeader(data: Any, headerStart: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeader")(data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def parseHeader(message: IncomingRequestMessage, data: Any, headerStart: Double, headerEnd: Double): Boolean | Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHeader")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any], headerEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean | Error]
    inline def parseHeader(message: IncomingResponseMessage, data: Any, headerStart: Double, headerEnd: Double): Boolean | Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHeader")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headerStart.asInstanceOf[js.Any], headerEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean | Error]
    
    inline def parseMessage(data: String, logger: Logger): js.UndefOr[IncomingRequestMessage | IncomingResponseMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMessage")(data.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[IncomingRequestMessage | IncomingResponseMessage]]
  }
}
