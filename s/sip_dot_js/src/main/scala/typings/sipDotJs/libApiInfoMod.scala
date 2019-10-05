package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesMethodsInfoMod.IncomingInfoRequest
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/info", JSImport.Namespace)
@js.native
object libApiInfoMod extends js.Object {
  @js.native
  class Info protected () extends js.Object {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest) = this()
    var incomingInfoRequest: js.Any = js.native
    /** Incoming MESSAGE request message. */
    val request: IncomingRequestMessage = js.native
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
  }
  
}

