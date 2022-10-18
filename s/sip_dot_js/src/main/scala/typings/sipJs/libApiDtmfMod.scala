package typings.sipJs

import typings.sipJs.libApiInfoMod.Info
import typings.sipJs.libCoreMessagesMethodsInfoMod.IncomingInfoRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiDtmfMod {
  
  @JSImport("sip.js/lib/api/dtmf", "DTMF")
  @js.native
  open class DTMF protected () extends Info {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest, tone: String, duration: Double) = this()
    
    /* private */ var _duration: Any = js.native
    
    /* private */ var _tone: Any = js.native
    
    def duration: Double = js.native
    
    def tone: String = js.native
  }
}
