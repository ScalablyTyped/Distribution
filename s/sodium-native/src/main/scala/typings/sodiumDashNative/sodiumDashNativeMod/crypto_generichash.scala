package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_generichash")
@js.native
object crypto_generichash extends js.Object {
  def apply(output: Buffer, input: Buffer): Unit = js.native
  def apply(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
}

