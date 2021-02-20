package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullablePosition extends StObject {
  
  var column: Double | Null = js.native
  
  var lastColumn: Double | Null = js.native
  
  var line: Double | Null = js.native
}
object NullablePosition {
  
  @scala.inline
  def apply(): NullablePosition = {
    val __obj = js.Dynamic.literal()
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
