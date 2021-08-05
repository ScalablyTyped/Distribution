package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropIndex extends StObject {
  
  var columns: js.Any
  
  var dragIndex: Double
  
  var dropIndex: Double
}
object DropIndex {
  
  inline def apply(columns: js.Any, dragIndex: Double, dropIndex: Double): DropIndex = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndex]
  }
  
  extension [Self <: DropIndex](x: Self) {
    
    inline def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setDragIndex(value: Double): Self = StObject.set(x, "dragIndex", value.asInstanceOf[js.Any])
    
    inline def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
  }
}
