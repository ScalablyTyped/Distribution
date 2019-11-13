package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "sodium_unpad")
@js.native
object sodium_unpad extends js.Object {
  def apply(buf: Buffer, paddedLength: Double, blocksize: Double): Double = js.native
}

