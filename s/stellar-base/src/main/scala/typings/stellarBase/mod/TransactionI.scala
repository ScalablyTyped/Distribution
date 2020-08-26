package typings.stellarBase.mod

import typings.node.Buffer
import typings.stellarBase.xdrMod.default.DecoratedSignature
import typings.stellarBase.xdrMod.default.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "TransactionI")
@js.native
class TransactionI () extends js.Object {
  var fee: String = js.native
  var networkPassphrase: String = js.native
  var signatures: js.Array[DecoratedSignature] = js.native
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

