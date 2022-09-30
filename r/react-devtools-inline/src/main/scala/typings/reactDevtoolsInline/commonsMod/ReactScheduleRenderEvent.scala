package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`schedule-render`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactScheduleRenderEvent
  extends StObject
     with BaseReactScheduleEvent
     with SchedulingEvent {
  
  val `type`: `schedule-render`
}
object ReactScheduleRenderEvent {
  
  inline def apply(lanes: js.Array[ReactLane], timestamp: Milliseconds): ReactScheduleRenderEvent = {
    val __obj = js.Dynamic.literal(lanes = lanes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.updateDynamic("type")("schedule-render")
    __obj.asInstanceOf[ReactScheduleRenderEvent]
  }
  
  extension [Self <: ReactScheduleRenderEvent](x: Self) {
    
    inline def setType(value: `schedule-render`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
