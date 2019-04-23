package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Transactions")
@js.native
object TransactionsNs extends js.Object {
  @js.native
  class InviteClientTransaction protected ()
    extends sipDotJsLib.libTransactionsMod.InviteClientTransaction {
    /**
      * Constructor.
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.1
      * @param request The outgoing INVITE request.
      * @param transport The transport.
      * @param user The transaction user.
      */
    def this(request: sipDotJsLib.libSIPMessageMod.OutgoingRequest, transport: sipDotJsLib.libTransportMod.Transport, user: sipDotJsLib.libTransactionsMod.ClientTransactionUser) = this()
  }
  
  @js.native
  class InviteServerTransaction protected ()
    extends sipDotJsLib.libTransactionsMod.InviteServerTransaction {
    /**
      * Constructor.
      * Upon construction, a "100 Trying" reply will be immediately sent.
      * After construction the transaction will be in the "proceeding" state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.1
      * @param request Incoming INVITE request from the transport.
      * @param transport The transport.
      * @param user The transaction user.
      */
    def this(request: sipDotJsLib.libSIPMessageMod.IncomingRequest, transport: sipDotJsLib.libTransportMod.Transport, user: sipDotJsLib.libTransactionsMod.ServerTransactionUser) = this()
  }
  
  @js.native
  class NonInviteClientTransaction protected ()
    extends sipDotJsLib.libTransactionsMod.NonInviteClientTransaction {
    /**
      * Constructor
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2
      * @param request The outgoing Non-INVITE request.
      * @param transport The transport.
      * @param user The transaction user.
      */
    def this(request: sipDotJsLib.libSIPMessageMod.OutgoingRequest, transport: sipDotJsLib.libTransportMod.Transport, user: sipDotJsLib.libTransactionsMod.ClientTransactionUser) = this()
  }
  
  @js.native
  class NonInviteServerTransaction protected ()
    extends sipDotJsLib.libTransactionsMod.NonInviteServerTransaction {
    /**
      * Constructor.
      * After construction the transaction will be in the "trying": state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.2
      * @param request Incoming Non-INVITE request from the transport.
      * @param transport The transport.
      * @param user The transaction user.
      */
    def this(request: sipDotJsLib.libSIPMessageMod.IncomingRequest, transport: sipDotJsLib.libTransportMod.Transport, user: sipDotJsLib.libTransactionsMod.ServerTransactionUser) = this()
  }
  
}

