package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: this.type
  
  var originalEvent: typings.std.Event
}
object Item {
  
  inline def apply(item: Item, originalEvent: typings.std.Event): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
