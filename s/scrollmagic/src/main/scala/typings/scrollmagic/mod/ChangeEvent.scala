package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEvent
  extends StObject
     with Event[change] {
  
  val newval: Any
  
  val what: String
}
object ChangeEvent {
  
  inline def apply(
    currentTarget: Scene,
    namespace: String,
    newval: Any,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date,
    what: String
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], newval = newval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("change")
    __obj.asInstanceOf[ChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setNewval(value: Any): Self = StObject.set(x, "newval", value.asInstanceOf[js.Any])
    
    inline def setWhat(value: String): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
  }
}
