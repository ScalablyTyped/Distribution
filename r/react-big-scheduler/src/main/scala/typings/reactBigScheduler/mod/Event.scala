package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  var bgColor: js.UndefOr[String] = js.native
  
  var end: String = js.native
  
  var id: Double = js.native
  
  var resourceId: String = js.native
  
  var rrule: js.UndefOr[String] = js.native
  
  var start: String = js.native
  
  var title: String = js.native
}
object Event {
  
  @scala.inline
  def apply(end: String, id: Double, resourceId: String, start: String, title: String): Event = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrule(value: String): Self = StObject.set(x, "rrule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRruleUndefined: Self = StObject.set(x, "rrule", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
