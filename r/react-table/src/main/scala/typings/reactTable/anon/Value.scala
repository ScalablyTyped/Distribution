package typings.reactTable.anon

import typings.reactTable.mod.FilterValue
import typings.reactTable.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[D /* <: js.Object */] extends StObject {
  
  var id: IdType[D]
  
  var value: FilterValue
}
object Value {
  
  inline def apply[D /* <: js.Object */](id: IdType[D], value: FilterValue): Value[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[D]]
  }
  
  extension [Self <: Value[?], D /* <: js.Object */](x: Self & Value[D]) {
    
    inline def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
