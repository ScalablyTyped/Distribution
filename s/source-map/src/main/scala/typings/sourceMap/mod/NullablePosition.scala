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
  
  @scala.inline
  def apply(): NullablePosition = {
    val __obj = js.Dynamic.literal(column = null, lastColumn = null, line = null)
    __obj.asInstanceOf[NullablePosition]
  }
  
  @scala.inline
  implicit class NullablePositionMutableBuilder[Self <: NullablePosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNull: Self = StObject.set(x, "column", null)
    
    @scala.inline
    def setLastColumn(value: Double): Self = StObject.set(x, "lastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastColumnNull: Self = StObject.set(x, "lastColumn", null)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = StObject.set(x, "line", null)
  }
}
