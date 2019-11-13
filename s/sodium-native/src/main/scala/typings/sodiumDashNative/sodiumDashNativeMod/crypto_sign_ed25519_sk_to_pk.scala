package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_ed25519_sk_to_pk")
@js.native
object crypto_sign_ed25519_sk_to_pk extends js.Object {
  def apply(pk: Buffer, sk: Buffer): Unit = js.native
}

