package typings.stellarBase.mod

import typings.node.Buffer
import typings.stellarBase.AnonPublicKey
import typings.stellarBase.AnonPublicKeyType
import typings.stellarBase.mod.xdr.DecoratedSignature
import typings.stellarBase.mod.xdr.Signature
import typings.stellarBase.mod.xdr.SignatureHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Keypair")
@js.native
class Keypair protected () extends js.Object {
  def this(keys: AnonPublicKey) = this()
  def this(keys: AnonPublicKeyType) = this()
  val `type`: KeypairType = js.native
  def canSign(): Boolean = js.native
  def publicKey(): String = js.native
  def rawPublicKey(): Buffer = js.native
  def rawSecretKey(): Buffer = js.native
  def secret(): String = js.native
  def sign(data: Buffer): Signature = js.native
  def signDecorated(data: Buffer): DecoratedSignature = js.native
  def signatureHint(): SignatureHint = js.native
  def verify(data: Buffer, signature: Signature): Boolean = js.native
}

/* static members */
@JSImport("stellar-base", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: String): Keypair = js.native
  def fromPublicKey(publicKey: String): Keypair = js.native
  def fromRawEd25519Seed(secretSeed: Buffer): Keypair = js.native
  def fromSecret(secretKey: String): Keypair = js.native
  def master(): Keypair = js.native
  def master(networkPassphrase: String): Keypair = js.native
  def random(): Keypair = js.native
}

