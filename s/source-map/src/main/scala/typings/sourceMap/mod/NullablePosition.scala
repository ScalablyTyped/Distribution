package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullablePosition extends StObject {
  
  var column: Double | Null
  
  var lastColumn: Double | Null
  
  var line: Double | Null
}
object NullablePosition {
  
  inline def apply(): NullablePosition = {
    val __obj = js.Dynamic.literal(column = null, lastColumn = null, line = null)
    __obj.asInstanceOf[NullablePosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullablePosition] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setLastColumn(value: Double): Self = StObject.set(x, "lastColumn", value.asInstanceOf[js.Any])
    
    inline def setLastColumnNull: Self = StObject.set(x, "lastColumn", null)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
  }
}
