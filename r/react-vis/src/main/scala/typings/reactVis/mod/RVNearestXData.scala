package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RVNearestXData[T /* <: AbstractSeriesPoint */] extends StObject {
  
  var event: MouseEvent[HTMLElement, NativeMouseEvent] = js.native
  
  var index: Double = js.native
  
  var innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any = js.native
}
object RVNearestXData {
  
  @scala.inline
  def apply[T /* <: AbstractSeriesPoint */](
    event: MouseEvent[HTMLElement, NativeMouseEvent],
    index: Double,
    innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
  ): RVNearestXData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerX = innerX.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVNearestXData[T]]
  }
  
  @scala.inline
  implicit class RVNearestXDataMutableBuilder[Self <: RVNearestXData[_], T /* <: AbstractSeriesPoint */] (val x: Self with RVNearestXData[T]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerX(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): Self = StObject.set(x, "innerX", value.asInstanceOf[js.Any])
  }
}
