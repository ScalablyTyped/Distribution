package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseReactScheduleEvent
  extends StObject
     with BaseReactEvent {
  
  val lanes: js.Array[ReactLane]
}
object BaseReactScheduleEvent {
  
  inline def apply(lanes: js.Array[ReactLane], timestamp: Milliseconds): BaseReactScheduleEvent = {
    val __obj = js.Dynamic.literal(lanes = lanes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.asInstanceOf[BaseReactScheduleEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseReactScheduleEvent] (val x: Self) extends AnyVal {
    
    inline def setLanes(value: js.Array[ReactLane]): Self = StObject.set(x, "lanes", value.asInstanceOf[js.Any])
    
    inline def setLanesVarargs(value: ReactLane*): Self = StObject.set(x, "lanes", js.Array(value*))
  }
}
