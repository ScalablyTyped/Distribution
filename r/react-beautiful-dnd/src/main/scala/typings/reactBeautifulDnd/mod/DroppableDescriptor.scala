package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableDescriptor extends StObject {
  
  var id: DroppableId = js.native
  
  var mode: DroppableMode = js.native
  
  var `type`: TypeId = js.native
}
object DroppableDescriptor {
  
  @scala.inline
  def apply(id: DroppableId, mode: DroppableMode, `type`: TypeId): DroppableDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableDescriptor]
  }
  
  @scala.inline
  implicit class DroppableDescriptorMutableBuilder[Self <: DroppableDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: DroppableId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: DroppableMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
