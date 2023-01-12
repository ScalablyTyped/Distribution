package typings.primereact.datatableDatatableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<primereact.primereact/datatable/datatable.DataTableRowEventParams, 'originalEvent'> */
trait DataTableRowClickEventParams extends StObject {
  
  var data: Any
  
  var index: Double
  
  var originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]
}
object DataTableRowClickEventParams {
  
  inline def apply(data: Any, index: Double, originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]): DataTableRowClickEventParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowClickEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowClickEventParams] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
