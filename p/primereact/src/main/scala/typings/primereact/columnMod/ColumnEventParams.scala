package typings.primereact.columnMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnEventParams extends StObject {
  
  var columnProps: ColumnProps
  
  var originalEvent: SyntheticEvent[Element, Event]
}
object ColumnEventParams {
  
  inline def apply(columnProps: ColumnProps, originalEvent: SyntheticEvent[Element, Event]): ColumnEventParams = {
    val __obj = js.Dynamic.literal(columnProps = columnProps.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEventParams]
  }
  
  extension [Self <: ColumnEventParams](x: Self) {
    
    inline def setColumnProps(value: ColumnProps): Self = StObject.set(x, "columnProps", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
