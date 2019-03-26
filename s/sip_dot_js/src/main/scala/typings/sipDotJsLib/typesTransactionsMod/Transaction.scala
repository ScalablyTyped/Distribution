package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/transactions", "Transaction")
@js.native
abstract class Transaction ()
  extends nodeLib.eventsMod.EventEmitter {
  /** Transaction id. */
  val id: java.lang.String = js.native
  /** Transaction kind. Deprecated. */
  val kind: java.lang.String = js.native
  /** Transaction state. */
  val state: TransactionState = js.native
  /** Transaction transport. */
  val transport: sipDotJsLib.typesTransportMod.Transport = js.native
  /**
    * Destructor.
    * Once the transaction is in the "terminated" state, it is destroyed
    * immediately and there is no need to call `dispose`. However, if a
    * transaction needs to be ended prematurely, the transaction user may
    * do so by calling this method (for example, perhaps the UA is shutting down).
    * No state transition will occur upon calling this method, all outstanding
    * transmission timers will be cancelled, and use of the transaction after
    * calling `dispose` is undefined.
    */
  def dispose(): scala.Unit = js.native
}

