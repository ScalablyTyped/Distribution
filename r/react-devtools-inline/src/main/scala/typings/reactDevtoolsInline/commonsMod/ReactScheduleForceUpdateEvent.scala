package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`schedule-force-update`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactScheduleForceUpdateEvent
  extends StObject
     with BaseReactScheduleEvent
     with SchedulingEvent {
  
  val `type`: `schedule-force-update`
}
object ReactScheduleForceUpdateEvent {
  
  inline def apply(lanes: js.Array[ReactLane], timestamp: Milliseconds): ReactScheduleForceUpdateEvent = {
    val __obj = js.Dynamic.literal(lanes = lanes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.updateDynamic("type")("schedule-force-update")
    __obj.asInstanceOf[ReactScheduleForceUpdateEvent]
  }
  
  extension [Self <: ReactScheduleForceUpdateEvent](x: Self) {
    
    inline def setType(value: `schedule-force-update`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
