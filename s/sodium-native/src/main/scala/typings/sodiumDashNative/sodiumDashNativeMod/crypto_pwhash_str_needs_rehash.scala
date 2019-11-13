package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_str_needs_rehash")
@js.native
object crypto_pwhash_str_needs_rehash extends js.Object {
  def apply(hash: Buffer, opslimit: Double, memlimit: Double): Boolean = js.native
}

