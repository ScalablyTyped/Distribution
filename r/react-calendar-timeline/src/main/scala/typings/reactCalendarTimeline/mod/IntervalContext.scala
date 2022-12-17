package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.EndTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalContext extends StObject {
  
  var interval: EndTime
  
  var intervalText: String
}
object IntervalContext {
  
  inline def apply(interval: EndTime, intervalText: String): IntervalContext = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], intervalText = intervalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalContext]
  }
  
  extension [Self <: IntervalContext](x: Self) {
    
    inline def setInterval(value: EndTime): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalText(value: String): Self = StObject.set(x, "intervalText", value.asInstanceOf[js.Any])
  }
}
