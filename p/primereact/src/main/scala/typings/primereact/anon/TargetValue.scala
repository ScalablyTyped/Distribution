package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetValue extends StObject {
  
  var originalEvent: typings.std.Event
  
  var target: IdName
  
  var value: Boolean
}
object TargetValue {
  
  @scala.inline
  def apply(originalEvent: typings.std.Event, target: IdName, value: Boolean): TargetValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetValue]
  }
  
  @scala.inline
  implicit class TargetValueMutableBuilder[Self <: TargetValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: IdName): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
