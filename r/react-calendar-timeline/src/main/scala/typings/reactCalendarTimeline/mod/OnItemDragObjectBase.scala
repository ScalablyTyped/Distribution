package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnItemDragObjectBase extends StObject {
  
  var eventType: move | resize = js.native
  
  var itemId: Id = js.native
  
  var time: Double = js.native
}
object OnItemDragObjectBase {
  
  @scala.inline
  def apply(eventType: move | resize, itemId: Id, time: Double): OnItemDragObjectBase = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectBase]
  }
  
  @scala.inline
  implicit class OnItemDragObjectBaseMutableBuilder[Self <: OnItemDragObjectBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: move | resize): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: Id): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
