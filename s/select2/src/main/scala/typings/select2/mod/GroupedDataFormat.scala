package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedDataFormat extends StObject {
  
  var children: js.UndefOr[js.Array[DataFormat]] = js.undefined
  
  var id: Unit
  
  var text: String
}
object GroupedDataFormat {
  
  inline def apply(id: Unit, text: String): GroupedDataFormat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedDataFormat]
  }
  
  extension [Self <: GroupedDataFormat](x: Self) {
    
    inline def setChildren(value: js.Array[DataFormat]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DataFormat*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
