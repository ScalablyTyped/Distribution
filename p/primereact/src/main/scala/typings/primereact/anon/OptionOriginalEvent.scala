package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionOriginalEvent extends StObject {
  
  var option: js.Any = js.native
  
  var originalEvent: typings.std.Event = js.native
}
object OptionOriginalEvent {
  
  @scala.inline
  def apply(option: js.Any, originalEvent: typings.std.Event): OptionOriginalEvent = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionOriginalEvent]
  }
  
  @scala.inline
  implicit class OptionOriginalEventMutableBuilder[Self <: OptionOriginalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: js.Any): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
