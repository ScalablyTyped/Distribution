package typings.stellarBase.mod

import typings.node.Buffer
import typings.stellarBase.AnonMaxTime
import typings.stellarBase.mod.xdr.DecoratedSignature
import typings.stellarBase.mod.xdr.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Transaction")
@js.native
class Transaction[TMemo /* <: Memo[MemoType] */, TOps /* <: js.Array[Operation] */] protected () extends js.Object {
  def this(envelope: String) = this()
  def this(envelope: TransactionEnvelope) = this()
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
  var fee: Double = js.native
  var memo: TMemo = js.native
  var networkPassphrase: String = js.native
  var operations: TOps = js.native
  var sequence: String = js.native
  var signatures: js.Array[DecoratedSignature] = js.native
  var source: String = js.native
  var timeBounds: js.UndefOr[AnonMaxTime] = js.native
  def addSignature(publicKey: String, signature: String): Unit = js.native
  def getKeypairSignature(keypair: Keypair): String = js.native
  def hash(): Buffer = js.native
  def sign(keypairs: Keypair*): Unit = js.native
  def signHashX(preimage: String): Unit = js.native
  def signHashX(preimage: Buffer): Unit = js.native
  def signatureBase(): Buffer = js.native
  def toEnvelope(): TransactionEnvelope = js.native
  def toXDR(): String = js.native
}

