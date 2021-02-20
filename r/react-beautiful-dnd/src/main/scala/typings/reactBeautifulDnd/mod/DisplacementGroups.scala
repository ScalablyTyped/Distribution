package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplacementGroups extends StObject {
  
  var all: js.Array[DraggableId] = js.native
  
  var invisible: DraggableIdMap = js.native
  
  var visible: DisplacementMap = js.native
}
object DisplacementGroups {
  
  @scala.inline
  def apply(all: js.Array[DraggableId], invisible: DraggableIdMap, visible: DisplacementMap): DisplacementGroups = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementGroups]
  }
  
  @scala.inline
  implicit class DisplacementGroupsMutableBuilder[Self <: DisplacementGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: js.Array[DraggableId]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllVarargs(value: DraggableId*): Self = StObject.set(x, "all", js.Array(value :_*))
    
    @scala.inline
    def setInvisible(value: DraggableIdMap): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: DisplacementMap): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
