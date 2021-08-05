package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetNameType extends StObject {
  
  var originalEvent: typings.std.Event
  
  var target: NameType
  
  var value: Boolean
}
object TargetNameType {
  
  inline def apply(originalEvent: typings.std.Event, target: NameType, value: Boolean): TargetNameType = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetNameType]
  }
  
  extension [Self <: TargetNameType](x: Self) {
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: NameType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
