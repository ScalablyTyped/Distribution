package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
trait ByteLengthQueuingStrategy extends QueuingStrategy[ArrayBufferView] {
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: Double
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): Double
}

object ByteLengthQueuingStrategy {
  @scala.inline
  def apply(highWaterMark: Double, size: ArrayBufferView => Double): ByteLengthQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[ByteLengthQueuingStrategy]
  }
}

