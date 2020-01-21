package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "sodium_pad")
@js.native
object sodiumPad extends js.Object {
  def apply(buf: Buffer, unpaddedLength: Double, blocksize: Double): Double = js.native
}

