package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_shorthash")
@js.native
object crypto_shorthash extends js.Object {
  def apply(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
}

