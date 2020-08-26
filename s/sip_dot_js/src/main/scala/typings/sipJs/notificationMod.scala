package typings.sipJs

import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.notifyMod.IncomingNotifyRequest
import typings.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/notification", JSImport.Namespace)
@js.native
object notificationMod extends js.Object {
  @js.native
  class Notification protected () extends js.Object {
    /** @internal */
    def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
    var incomingNotifyRequest: js.Any = js.native
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    /** Incoming NOTIFY request message. */
    def request: IncomingRequestMessage = js.native
  }
  
}

