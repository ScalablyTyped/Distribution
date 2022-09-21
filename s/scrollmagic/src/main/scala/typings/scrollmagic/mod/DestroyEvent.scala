package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestroyEvent
  extends StObject
     with Event[destroy] {
  
  val reset: Boolean
}
object DestroyEvent {
  
  inline def apply(
    currentTarget: Scene,
    namespace: String,
    reset: Boolean,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date
  ): DestroyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("destroy")
    __obj.asInstanceOf[DestroyEvent]
  }
  
  extension [Self <: DestroyEvent](x: Self) {
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
