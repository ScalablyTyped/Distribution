package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.reactCalendarTimelineStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnItemDragObjectMove extends OnItemDragObjectBase {
  
  @JSName("eventType")
  var eventType_OnItemDragObjectMove: move = js.native
  
  var newGroupOrder: Double = js.native
}
object OnItemDragObjectMove {
  
  @scala.inline
  def apply(eventType: move, itemId: Id, newGroupOrder: Double, time: Double): OnItemDragObjectMove = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], newGroupOrder = newGroupOrder.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectMove]
  }
  
  @scala.inline
  implicit class OnItemDragObjectMoveMutableBuilder[Self <: OnItemDragObjectMove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: move): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewGroupOrder(value: Double): Self = StObject.set(x, "newGroupOrder", value.asInstanceOf[js.Any])
  }
}
