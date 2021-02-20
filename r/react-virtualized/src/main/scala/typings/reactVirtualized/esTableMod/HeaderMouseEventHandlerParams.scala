package typings.reactVirtualized.esTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderMouseEventHandlerParams extends StObject {
  
  var columnData: js.Any = js.native
  
  var dataKey: String = js.native
  
  var event: MouseEvent[_, NativeMouseEvent] = js.native
}
object HeaderMouseEventHandlerParams {
  
  @scala.inline
  def apply(columnData: js.Any, dataKey: String, event: MouseEvent[_, NativeMouseEvent]): HeaderMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderMouseEventHandlerParams]
  }
  
  @scala.inline
  implicit class HeaderMouseEventHandlerParamsMutableBuilder[Self <: HeaderMouseEventHandlerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnData(value: js.Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: MouseEvent[_, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
