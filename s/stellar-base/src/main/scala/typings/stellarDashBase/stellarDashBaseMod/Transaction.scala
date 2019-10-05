package typings.stellarDashBase.stellarDashBaseMod

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.xdr.DecoratedSignature
import typings.stellarDashBase.stellarDashBaseMod.xdr.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Transaction")
@js.native
class Transaction[TMemo /* <: Memo[MemoType] */, TOps /* <: js.Array[Operation] */] protected () extends js.Object {
  def this(envelope: String) = this()
  def this(envelope: TransactionEnvelope) = this()
  var fee: Double = js.native
  var memo: TMemo = js.native
  var operations: TOps = js.native
  var sequence: Double = js.native
  var signatures: js.Array[DecoratedSignature] = js.native
  var source: String = js.native
  def hash(): Buffer = js.native
  def sign(keypairs: Keypair*): Unit = js.native
  def signHashX(preimage: String): Unit = js.native
  def signHashX(preimage: Buffer): Unit = js.native
  def signatureBase(): Buffer = js.native
  def toEnvelope(): TransactionEnvelope = js.native
}

