package typings.reactVirtualized.esTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowMouseEventHandlerParams extends StObject {
  
  var event: MouseEvent[_, NativeMouseEvent] = js.native
  
  var index: Double = js.native
  
  var rowData: js.Any = js.native
}
object RowMouseEventHandlerParams {
  
  @scala.inline
  def apply(event: MouseEvent[_, NativeMouseEvent], index: Double, rowData: js.Any): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
  
  @scala.inline
  implicit class RowMouseEventHandlerParamsMutableBuilder[Self <: RowMouseEventHandlerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: MouseEvent[_, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
