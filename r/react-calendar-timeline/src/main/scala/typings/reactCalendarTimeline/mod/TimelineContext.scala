package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineContext extends StObject {
  
  var canvasTimeEnd: Double = js.native
  
  var canvasTimeStart: Double = js.native
  
  var timelineWidth: Double = js.native
  
  var visibleTimeEnd: Double = js.native
  
  var visibleTimeStart: Double = js.native
}
object TimelineContext {
  
  @scala.inline
  def apply(
    canvasTimeEnd: Double,
    canvasTimeStart: Double,
    timelineWidth: Double,
    visibleTimeEnd: Double,
    visibleTimeStart: Double
  ): TimelineContext = {
    val __obj = js.Dynamic.literal(canvasTimeEnd = canvasTimeEnd.asInstanceOf[js.Any], canvasTimeStart = canvasTimeStart.asInstanceOf[js.Any], timelineWidth = timelineWidth.asInstanceOf[js.Any], visibleTimeEnd = visibleTimeEnd.asInstanceOf[js.Any], visibleTimeStart = visibleTimeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineContext]
  }
  
  @scala.inline
  implicit class TimelineContextMutableBuilder[Self <: TimelineContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasTimeEnd(value: Double): Self = StObject.set(x, "canvasTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasTimeStart(value: Double): Self = StObject.set(x, "canvasTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineWidth(value: Double): Self = StObject.set(x, "timelineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleTimeEnd(value: Double): Self = StObject.set(x, "visibleTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleTimeStart(value: Double): Self = StObject.set(x, "visibleTimeStart", value.asInstanceOf[js.Any])
  }
}
