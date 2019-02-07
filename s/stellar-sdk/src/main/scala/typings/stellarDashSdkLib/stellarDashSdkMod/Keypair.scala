package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Keypair")
@js.native
class Keypair protected ()
  extends stellarDashBaseLib.stellarDashBaseMod.Keypair {
  def this(keys: stellarDashBaseLib.Anon_PublicKey) = this()
  def this(keys: stellarDashBaseLib.Anon_PublicKeyType) = this()
}

/* static members */
@JSImport("stellar-sdk", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def fromPublicKey(publicKey: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def fromRawEd25519Seed(secretSeed: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def fromSecret(secretKey: java.lang.String): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def master(): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
  def random(): stellarDashBaseLib.stellarDashBaseMod.Keypair = js.native
}

