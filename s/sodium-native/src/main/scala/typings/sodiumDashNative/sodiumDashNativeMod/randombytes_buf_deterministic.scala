package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "randombytes_buf_deterministic")
@js.native
object randombytes_buf_deterministic extends js.Object {
  def apply(buffer: Buffer, seed: Buffer): Unit = js.native
}

