package typings.protobufjsBase64

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/base64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(string: String, buffer: Uint8Array, offset: Double): Double = js.native
  def encode(buffer: Uint8Array, start: Double, end: Double): String = js.native
  def length(string: String): Double = js.native
  def test(string: String): Boolean = js.native
}

