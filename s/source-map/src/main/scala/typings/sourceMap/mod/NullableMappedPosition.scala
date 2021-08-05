package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableMappedPosition extends StObject {
  
  var column: Double | Null
  
  var line: Double | Null
  
  var name: String | Null
  
  var source: String | Null
}
object NullableMappedPosition {
  
  inline def apply(): NullableMappedPosition = {
    val __obj = js.Dynamic.literal(column = null, line = null, name = null, source = null)
    __obj.asInstanceOf[NullableMappedPosition]
  }
  
  extension [Self <: NullableMappedPosition](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
  }
}
