package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_str")
@js.native
object crypto_pwhash_str extends js.Object {
  def apply(output: Buffer, password: Buffer, opslimit: Double, memlimit: Double): Unit = js.native
}

