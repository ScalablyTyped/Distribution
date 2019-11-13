package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_seed_keypair")
@js.native
object crypto_sign_seed_keypair extends js.Object {
  def apply(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = js.native
}

