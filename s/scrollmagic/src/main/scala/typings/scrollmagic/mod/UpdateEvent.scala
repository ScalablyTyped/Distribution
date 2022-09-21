package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEvent
  extends StObject
     with Event[update] {
  
  val endPos: Double
  
  val scrollPos: Double
  
  val startPos: Double
}
object UpdateEvent {
  
  inline def apply(
    currentTarget: Scene,
    endPos: Double,
    namespace: String,
    scrollPos: Double,
    startPos: Double,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], endPos = endPos.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], scrollPos = scrollPos.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[UpdateEvent]
  }
  
  extension [Self <: UpdateEvent](x: Self) {
    
    inline def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
    
    inline def setScrollPos(value: Double): Self = StObject.set(x, "scrollPos", value.asInstanceOf[js.Any])
    
    inline def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
  }
}
