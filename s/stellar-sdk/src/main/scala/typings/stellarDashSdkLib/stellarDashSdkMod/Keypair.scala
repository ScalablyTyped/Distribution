package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Keypair")
@js.native
class Keypair protected ()
  extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair {
  def this(keys: stellarDashSdkLib.Anon_Type) = this()
  def this(keys: stellarDashSdkLib.Anon_TypeEd25519) = this()
}

@JSImport("stellar-sdk", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
  def fromPublicKey(publicKey: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
  def fromRawEd25519Seed(secretSeed: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
  def fromSecret(secretKey: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
  def master(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
  def random(): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.Keypair = js.native
}

