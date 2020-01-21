package typings.sipJs

import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.coreMod.NameAddrHeader
import typings.sipJs.inviterMod.Inviter
import typings.sipJs.inviterOptionsMod.InviterOptions
import typings.sipJs.outgoingResponseMod.ResponseOptions
import typings.sipJs.referMod.IncomingReferRequest
import typings.sipJs.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/referral", JSImport.Namespace)
@js.native
object referralMod extends js.Object {
  @js.native
  class Referral protected () extends js.Object {
    /** @internal */
    def this(incomingReferRequest: IncomingReferRequest, session: Session) = this()
    var incomingReferRequest: js.Any = js.native
    var inviter: js.Any = js.native
    val referTo: NameAddrHeader = js.native
    val referredBy: js.UndefOr[String] = js.native
    val replaces: js.UndefOr[String] = js.native
    /** Incoming REFER request message. */
    val request: IncomingRequestMessage = js.native
    var session: js.Any = js.native
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    /**
      * Creates an inviter which may be used to send an out of dialog INVITE request.
      *
      * @remarks
      * This a helper method to create an Inviter which will execute the referral
      * of the `Session` which was referred. The appropriate headers are set and
      * the referred `Session` is linked to the new `Session`. Note that only a
      * single instance of the `Inviter` will be created and returned (if called
      * more than once a reference to the same `Inviter` will be returned every time).
      *
      * @param options - Options bucket.
      * @param modifiers - Session description handler modifiers.
      */
    def makeInviter(): Inviter = js.native
    def makeInviter(options: InviterOptions): Inviter = js.native
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
  }
  
}

