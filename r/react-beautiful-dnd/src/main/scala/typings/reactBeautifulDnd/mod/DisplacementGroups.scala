package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplacementGroups extends StObject {
  
  var all: js.Array[DraggableId]
  
  var invisible: DraggableIdMap
  
  var visible: DisplacementMap
}
object DisplacementGroups {
  
  inline def apply(all: js.Array[DraggableId], invisible: DraggableIdMap, visible: DisplacementMap): DisplacementGroups = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementGroups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplacementGroups] (val x: Self) extends AnyVal {
    
    inline def setAll(value: js.Array[DraggableId]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllVarargs(value: DraggableId*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setInvisible(value: DraggableIdMap): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: DisplacementMap): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
