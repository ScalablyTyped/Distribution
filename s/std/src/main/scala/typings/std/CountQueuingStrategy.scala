package typings.std

import typings.std.stdNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
trait CountQueuingStrategy
  extends QueuingStrategy[js.Any] {
  @JSName("highWaterMark")
  var highWaterMark_CountQueuingStrategy: Double
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): `1`
}

object CountQueuingStrategy {
  @scala.inline
  def apply(highWaterMark: Double, size: js.Any => `1`): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
}

