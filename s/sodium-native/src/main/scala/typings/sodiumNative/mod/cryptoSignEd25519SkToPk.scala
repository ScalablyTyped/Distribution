package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_ed25519_sk_to_pk")
@js.native
object cryptoSignEd25519SkToPk extends js.Object {
  def apply(pk: Buffer, sk: Buffer): Unit = js.native
}

