package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropIndex extends StObject {
  
  var columns: js.Any = js.native
  
  var dragIndex: Double = js.native
  
  var dropIndex: Double = js.native
}
object DropIndex {
  
  @scala.inline
  def apply(columns: js.Any, dragIndex: Double, dropIndex: Double): DropIndex = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndex]
  }
  
  @scala.inline
  implicit class DropIndexMutableBuilder[Self <: DropIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragIndex(value: Double): Self = StObject.set(x, "dragIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
  }
}
