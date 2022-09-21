package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableState[D /* <: js.Object */] extends StObject {
  
  var hiddenColumns: js.UndefOr[js.Array[IdType[D]]] = js.undefined
}
object TableState {
  
  inline def apply[D /* <: js.Object */](): TableState[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableState[D]]
  }
  
  extension [Self <: TableState[?], D /* <: js.Object */](x: Self & TableState[D]) {
    
    inline def setHiddenColumns(value: js.Array[IdType[D]]): Self = StObject.set(x, "hiddenColumns", value.asInstanceOf[js.Any])
    
    inline def setHiddenColumnsUndefined: Self = StObject.set(x, "hiddenColumns", js.undefined)
    
    inline def setHiddenColumnsVarargs(value: IdType[D]*): Self = StObject.set(x, "hiddenColumns", js.Array(value*))
  }
}
