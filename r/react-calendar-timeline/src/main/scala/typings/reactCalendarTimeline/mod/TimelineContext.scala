package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineContext extends StObject {
  
  var canvasTimeEnd: Double
  
  var canvasTimeStart: Double
  
  var timelineWidth: Double
  
  var visibleTimeEnd: Double
  
  var visibleTimeStart: Double
}
object TimelineContext {
  
  inline def apply(
    canvasTimeEnd: Double,
    canvasTimeStart: Double,
    timelineWidth: Double,
    visibleTimeEnd: Double,
    visibleTimeStart: Double
  ): TimelineContext = {
    val __obj = js.Dynamic.literal(canvasTimeEnd = canvasTimeEnd.asInstanceOf[js.Any], canvasTimeStart = canvasTimeStart.asInstanceOf[js.Any], timelineWidth = timelineWidth.asInstanceOf[js.Any], visibleTimeEnd = visibleTimeEnd.asInstanceOf[js.Any], visibleTimeStart = visibleTimeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineContext]
  }
  
  extension [Self <: TimelineContext](x: Self) {
    
    inline def setCanvasTimeEnd(value: Double): Self = StObject.set(x, "canvasTimeEnd", value.asInstanceOf[js.Any])
    
    inline def setCanvasTimeStart(value: Double): Self = StObject.set(x, "canvasTimeStart", value.asInstanceOf[js.Any])
    
    inline def setTimelineWidth(value: Double): Self = StObject.set(x, "timelineWidth", value.asInstanceOf[js.Any])
    
    inline def setVisibleTimeEnd(value: Double): Self = StObject.set(x, "visibleTimeEnd", value.asInstanceOf[js.Any])
    
    inline def setVisibleTimeStart(value: Double): Self = StObject.set(x, "visibleTimeStart", value.asInstanceOf[js.Any])
  }
}
