package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppablePublish extends StObject {
  
  var droppableId: DroppableId = js.native
  
  var scroll: Position = js.native
}
object DroppablePublish {
  
  @scala.inline
  def apply(droppableId: DroppableId, scroll: Position): DroppablePublish = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppablePublish]
  }
  
  @scala.inline
  implicit class DroppablePublishMutableBuilder[Self <: DroppablePublish] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDroppableId(value: DroppableId): Self = StObject.set(x, "droppableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: Position): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
