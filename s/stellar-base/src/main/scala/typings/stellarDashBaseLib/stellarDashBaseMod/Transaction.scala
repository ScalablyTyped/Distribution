package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Transaction")
@js.native
class Transaction[TMemo /* <: Memo[MemoType] */, TOps /* <: js.Array[Operation] */] protected () extends js.Object {
  def this(envelope: java.lang.String) = this()
  def this(envelope: stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionEnvelope) = this()
  var fee: scala.Double = js.native
  var memo: TMemo = js.native
  var operations: TOps = js.native
  var sequence: scala.Double = js.native
  var signatures: js.Array[stellarDashBaseLib.stellarDashBaseMod.xdrNs.DecoratedSignature] = js.native
  var source: java.lang.String = js.native
  def hash(): nodeLib.Buffer = js.native
  def sign(keypairs: Keypair*): scala.Unit = js.native
  def signHashX(preimage: java.lang.String): scala.Unit = js.native
  def signHashX(preimage: nodeLib.Buffer): scala.Unit = js.native
  def signatureBase(): nodeLib.Buffer = js.native
  def toEnvelope(): stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionEnvelope = js.native
}

