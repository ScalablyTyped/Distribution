package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.SendReplayData
import typings.sentryTypes.typesTransportMod.TransportMakeRequestResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilSendReplayRequestMod {
  
  @JSImport("@sentry/replay/types/util/sendReplayRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/replay/types/util/sendReplayRequest", "TransportStatusCodeError")
  @js.native
  open class TransportStatusCodeError protected ()
    extends StObject
       with Error {
    def this(statusCode: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def sendReplayRequest(param0: SendReplayData): js.Promise[Unit | TransportMakeRequestResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendReplayRequest")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | TransportMakeRequestResponse]]
}
