package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Keypair")
@js.native
class Keypair protected () extends js.Object {
  def this(keys: stellarDashSdkLib.Anon_Type) = this()
  def this(keys: stellarDashSdkLib.Anon_TypeEd25519) = this()
  def canSign(): scala.Boolean = js.native
  def publicKey(): java.lang.String = js.native
  def rawPublicKey(): nodeLib.Buffer = js.native
  def rawSecretKey(): nodeLib.Buffer = js.native
  def secret(): java.lang.String = js.native
  def sign(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def signDecorated(data: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.DecoratedSignature = js.native
  def signatureHint(): stellarDashSdkLib.stellarDashSdkMod.xdrNs.SignatureHint = js.native
  def verify(data: nodeLib.Buffer, signature: nodeLib.Buffer): scala.Boolean = js.native
}

@JSImport("stellar-sdk", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.Keypair = js.native
  def fromPublicKey(publicKey: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.Keypair = js.native
  def fromRawEd25519Seed(secretSeed: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.Keypair = js.native
  def fromSecret(secretKey: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.Keypair = js.native
  def master(): stellarDashSdkLib.stellarDashSdkMod.Keypair = js.native
  def random(): stellarDashSdkLib.stellarDashSdkMod.Keypair = js.native
}

