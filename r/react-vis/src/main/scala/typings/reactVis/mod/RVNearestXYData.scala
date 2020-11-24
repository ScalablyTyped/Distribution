package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RVNearestXYData[T /* <: AbstractSeriesPoint */] extends js.Object {
  
  var event: MouseEvent[HTMLElement, NativeMouseEvent] = js.native
  
  var index: Double = js.native
  
  var innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any = js.native
  
  var innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any = js.native
}
object RVNearestXYData {
  
  @scala.inline
  def apply[T /* <: AbstractSeriesPoint */](
    event: MouseEvent[HTMLElement, NativeMouseEvent],
    index: Double,
    innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any,
    innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
  ): RVNearestXYData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerX = innerX.asInstanceOf[js.Any], innerY = innerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVNearestXYData[T]]
  }
  
  @scala.inline
  implicit class RVNearestXYDataOps[Self <: RVNearestXYData[_], T /* <: AbstractSeriesPoint */] (val x: Self with RVNearestXYData[T]) extends AnyVal {
    
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
    
    @scala.inline
    def setInnerY(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): Self = this.set("innerY", value.asInstanceOf[js.Any])
  }
}
