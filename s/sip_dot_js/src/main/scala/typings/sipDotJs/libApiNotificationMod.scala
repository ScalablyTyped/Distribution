package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/notification", JSImport.Namespace)
@js.native
object libApiNotificationMod extends js.Object {
  @js.native
  class Notification protected () extends js.Object {
    /** @internal */
    def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
    var incomingNotifyRequest: js.Any = js.native
    /** Incoming NOTIFY request message. */
    val request: IncomingRequestMessage = js.native
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
  }
  
}

