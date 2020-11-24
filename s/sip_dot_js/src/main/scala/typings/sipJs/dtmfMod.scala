package typings.sipJs

import typings.sipJs.infoMod.Info
import typings.sipJs.methodsInfoMod.IncomingInfoRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/dtmf", JSImport.Namespace)
@js.native
object dtmfMod extends js.Object {
  
  @js.native
  class DTMF protected () extends Info {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest, tone: String, duration: Double) = this()
    
    var _duration: js.Any = js.native
    
    var _tone: js.Any = js.native
    
    def duration: Double = js.native
    
    def tone: String = js.native
  }
}
