package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RVNearestXData[T /* <: AbstractSeriesPoint */] extends js.Object {
  var event: MouseEvent[HTMLElement, NativeMouseEvent] = js.native
  var index: Double = js.native
  var innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any = js.native
}

object RVNearestXData {
  @scala.inline
  def apply[/* <: typings.reactVis.mod.AbstractSeriesPoint */ T](
    event: MouseEvent[HTMLElement, NativeMouseEvent],
    index: Double,
    innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
  ): RVNearestXData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerX = innerX.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVNearestXData[T]]
  }
  @scala.inline
  implicit class RVNearestXDataOps[Self <: RVNearestXData[_], /* <: typings.reactVis.mod.AbstractSeriesPoint */ T] (val x: Self with RVNearestXData[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerX(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = this.set("innerX", value.asInstanceOf[js.Any])
  }
  
}

