package typings.std

import typings.std.stdNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait CountQueuingStrategy
  extends QueuingStrategy[js.Any] {
  @JSName("highWaterMark")
  var highWaterMark_CountQueuingStrategy: Double = js.native
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): `1` = js.native
}

object CountQueuingStrategy {
  @scala.inline
  def apply(highWaterMark: Double, size: js.Any => `1`): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
  @scala.inline
  implicit class CountQueuingStrategyOps[Self <: CountQueuingStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: js.Any => `1`): Self = this.set("size", js.Any.fromFunction1(value))
  }
  
}

