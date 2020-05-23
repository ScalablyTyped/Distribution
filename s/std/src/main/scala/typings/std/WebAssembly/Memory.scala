package typings.std.WebAssembly

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memory extends _ExportValue {
  val buffer: ArrayBuffer
  def grow(delta: Double): Double
}

object Memory {
  @scala.inline
  def apply(buffer: ArrayBuffer, grow: Double => Double): Memory = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
    __obj.asInstanceOf[Memory]
  }
}

