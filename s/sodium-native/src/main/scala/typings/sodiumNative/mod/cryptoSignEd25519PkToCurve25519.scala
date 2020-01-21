package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_sign_ed25519_pk_to_curve25519")
@js.native
object cryptoSignEd25519PkToCurve25519 extends js.Object {
  def apply(curve_pk: Buffer, ed_pk: Buffer): Unit = js.native
}

