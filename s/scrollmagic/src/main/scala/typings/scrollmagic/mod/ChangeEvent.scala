package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.change
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEvent
  extends StObject
     with Event[change] {
  
  val newval: js.Any
  
  val what: String
}
object ChangeEvent {
  
  inline def apply(
    currentTarget: Scene,
    namespace: String,
    newval: js.Any,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    what: String
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], newval = newval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("change")
    __obj.asInstanceOf[ChangeEvent]
  }
  
  extension [Self <: ChangeEvent](x: Self) {
    
    inline def setNewval(value: js.Any): Self = StObject.set(x, "newval", value.asInstanceOf[js.Any])
    
    inline def setWhat(value: String): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
  }
}
