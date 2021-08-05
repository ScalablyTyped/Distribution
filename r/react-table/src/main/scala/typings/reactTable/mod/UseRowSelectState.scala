package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowSelectState[D /* <: js.Object */] extends StObject {
  
  var selectedRowIds: Record[IdType[D], Boolean]
}
object UseRowSelectState {
  
  inline def apply[D /* <: js.Object */](selectedRowIds: Record[IdType[D], Boolean]): UseRowSelectState[D] = {
    val __obj = js.Dynamic.literal(selectedRowIds = selectedRowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectState[D]]
  }
  
  extension [Self <: UseRowSelectState[?], D /* <: js.Object */](x: Self & UseRowSelectState[D]) {
    
    inline def setSelectedRowIds(value: Record[IdType[D], Boolean]): Self = StObject.set(x, "selectedRowIds", value.asInstanceOf[js.Any])
  }
}
