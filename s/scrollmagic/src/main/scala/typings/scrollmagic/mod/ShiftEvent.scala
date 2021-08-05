package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.shift
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShiftEvent
  extends StObject
     with Event[shift] {
  
  val reason: String
}
object ShiftEvent {
  
  inline def apply(
    currentTarget: Scene,
    namespace: String,
    reason: String,
    target: Scene,
    timeStamp: Date,
    timestamp: Date
  ): ShiftEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("shift")
    __obj.asInstanceOf[ShiftEvent]
  }
  
  extension [Self <: ShiftEvent](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
