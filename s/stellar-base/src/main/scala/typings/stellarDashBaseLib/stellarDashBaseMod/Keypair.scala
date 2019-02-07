package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Keypair")
@js.native
class Keypair protected () extends js.Object {
  def this(keys: stellarDashBaseLib.Anon_PublicKey) = this()
  def this(keys: stellarDashBaseLib.Anon_PublicKeyType) = this()
  val `type`: KeypairType = js.native
  def canSign(): scala.Boolean = js.native
  def publicKey(): java.lang.String = js.native
  def rawPublicKey(): nodeLib.Buffer = js.native
  def rawSecretKey(): nodeLib.Buffer = js.native
  def secret(): java.lang.String = js.native
  def sign(data: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Signature = js.native
  def signDecorated(data: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.DecoratedSignature = js.native
  def signatureHint(): stellarDashBaseLib.stellarDashBaseMod.xdrNs.SignatureHint = js.native
  def verify(data: nodeLib.Buffer, signature: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Signature): scala.Boolean = js.native
}

/* static members */
@JSImport("stellar-base", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def fromPublicKey(publicKey: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def fromRawEd25519Seed(secretSeed: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def fromSecret(secretKey: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def master(): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def random(): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
}

