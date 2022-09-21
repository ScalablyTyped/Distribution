package typings.sipJs

import typings.sipJs.infoMod.Info
import typings.sipJs.methodsInfoMod.IncomingInfoRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtmfMod {
  
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
