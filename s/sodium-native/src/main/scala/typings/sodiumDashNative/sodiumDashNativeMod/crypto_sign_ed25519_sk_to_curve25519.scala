package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_ed25519_sk_to_curve25519")
@js.native
object crypto_sign_ed25519_sk_to_curve25519 extends js.Object {
  def apply(curve_sk: Buffer, ed_sk: Buffer): Unit = js.native
}

