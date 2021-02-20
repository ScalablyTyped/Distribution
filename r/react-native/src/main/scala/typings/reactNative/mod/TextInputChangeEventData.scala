package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputChangeEventData extends TargetedEvent {
  
  var eventCount: Double = js.native
  
  var text: String = js.native
}
object TextInputChangeEventData {
  
  @scala.inline
  def apply(eventCount: Double, target: Double, text: String): TextInputChangeEventData = {
    val __obj = js.Dynamic.literal(eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputChangeEventData]
  }
  
  @scala.inline
  implicit class TextInputChangeEventDataMutableBuilder[Self <: TextInputChangeEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
