package typings.stellarDashSdk.stellarDashSdkMod

import typings.node.Buffer
import typings.stellarDashBase.Anon_PublicKey
import typings.stellarDashBase.Anon_PublicKeyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Keypair")
@js.native
class Keypair protected ()
  extends typings.stellarDashBase.stellarDashBaseMod.Keypair {
  def this(keys: Anon_PublicKey) = this()
  def this(keys: Anon_PublicKeyType) = this()
}

/* static members */
@JSImport("stellar-sdk", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: String): typings.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def fromPublicKey(publicKey: String): typings.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def fromRawEd25519Seed(secretSeed: Buffer): typings.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def fromSecret(secretKey: String): typings.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def master(): typings.stellarDashBase.stellarDashBaseMod.Keypair = js.native
  def random(): typings.stellarDashBase.stellarDashBaseMod.Keypair = js.native
}

