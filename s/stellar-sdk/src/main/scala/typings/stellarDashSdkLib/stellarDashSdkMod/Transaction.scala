package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Transaction")
@js.native
class Transaction protected () extends js.Object {
  def this(envelope: java.lang.String) = this()
  def this(envelope: stellarDashSdkLib.stellarDashSdkMod.xdrNs.TransactionEnvelope) = this()
  var fee: scala.Double = js.native
  var memo: Memo = js.native
  var operations: js.Array[TransactionOperation] = js.native
  var sequence: scala.Double = js.native
  var signatures: js.Array[stellarDashSdkLib.stellarDashSdkMod.xdrNs.DecoratedSignature] = js.native
  var source: java.lang.String = js.native
  def hash(): nodeLib.Buffer = js.native
  def sign(keypairs: Keypair*): scala.Unit = js.native
  def signHashX(preimage: java.lang.String): scala.Unit = js.native
  def signHashX(preimage: nodeLib.Buffer): scala.Unit = js.native
  def signatureBase(): nodeLib.Buffer = js.native
  def toEnvelope(): stellarDashSdkLib.stellarDashSdkMod.xdrNs.TransactionEnvelope = js.native
}

