package typings.sipJs

import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.methodsByeMod.IncomingByeRequest
import typings.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/bye", JSImport.Namespace)
@js.native
object byeMod extends js.Object {
  @js.native
  class Bye protected () extends js.Object {
    /** @internal */
    def this(incomingByeRequest: IncomingByeRequest) = this()
    var incomingByeRequest: js.Any = js.native
    /** Incoming BYE request message. */
    val request: IncomingRequestMessage = js.native
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
  }
  
}

