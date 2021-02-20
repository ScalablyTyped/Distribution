package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.EndTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalContext extends StObject {
  
  var interval: EndTime = js.native
  
  var intervalText: String = js.native
}
object IntervalContext {
  
  @scala.inline
  def apply(interval: EndTime, intervalText: String): IntervalContext = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], intervalText = intervalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalContext]
  }
  
  @scala.inline
  implicit class IntervalContextMutableBuilder[Self <: IntervalContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: EndTime): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalText(value: String): Self = StObject.set(x, "intervalText", value.asInstanceOf[js.Any])
  }
}
