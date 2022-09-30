package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`schedule-state-update`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactScheduleStateUpdateEvent
  extends StObject
     with BaseReactScheduleEvent
     with SchedulingEvent {
  
  val `type`: `schedule-state-update`
}
object ReactScheduleStateUpdateEvent {
  
  inline def apply(lanes: js.Array[ReactLane], timestamp: Milliseconds): ReactScheduleStateUpdateEvent = {
    val __obj = js.Dynamic.literal(lanes = lanes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.updateDynamic("type")("schedule-state-update")
    __obj.asInstanceOf[ReactScheduleStateUpdateEvent]
  }
  
  extension [Self <: ReactScheduleStateUpdateEvent](x: Self) {
    
    inline def setType(value: `schedule-state-update`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
