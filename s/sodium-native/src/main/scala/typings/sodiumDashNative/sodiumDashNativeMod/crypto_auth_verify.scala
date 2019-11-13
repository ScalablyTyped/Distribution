package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_auth_verify")
@js.native
object crypto_auth_verify extends js.Object {
  def apply(output: Buffer, input: Buffer, key: Buffer): Boolean = js.native
}

