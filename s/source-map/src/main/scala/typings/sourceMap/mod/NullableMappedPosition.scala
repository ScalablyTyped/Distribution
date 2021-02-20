package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableMappedPosition extends StObject {
  
  var column: Double | Null = js.native
  
  var line: Double | Null = js.native
  
  var name: String | Null = js.native
  
  var source: String | Null = js.native
}
object NullableMappedPosition {
  
  @scala.inline
  def apply(): NullableMappedPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NullableMappedPosition]
  }
  
  @scala.inline
  implicit class NullableMappedPositionMutableBuilder[Self <: NullableMappedPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNull: Self = StObject.set(x, "column", null)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = StObject.set(x, "line", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
  }
}
