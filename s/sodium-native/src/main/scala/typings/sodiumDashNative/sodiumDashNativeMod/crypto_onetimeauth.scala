package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_onetimeauth")
@js.native
object crypto_onetimeauth extends js.Object {
  def apply(output: Buffer, input: Buffer, key: Buffer): Unit = js.native
}

