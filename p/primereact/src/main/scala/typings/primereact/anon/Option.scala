package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  var option: js.Object
  
  var originalEvent: typings.std.Event
}
object Option {
  
  inline def apply(option: js.Object, originalEvent: typings.std.Event): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setOption(value: js.Object): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
