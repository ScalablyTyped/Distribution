package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.add
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEvent
  extends StObject
     with Event[add] {
  
  val controller: Controller
}
object AddEvent {
  
  @scala.inline
  def apply(
    controller: Controller,
    currentTarget: Scene,
    namespace: String,
    target: Scene,
    timeStamp: Date,
    timestamp: Date
  ): AddEvent = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[AddEvent]
  }
  
  @scala.inline
  implicit class AddEventMutableBuilder[Self <: AddEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: Controller): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
  }
}
