package typings.rcMenu.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var domEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  
  var key: typings.react.mod.Key
}
object Key {
  
  inline def apply(domEvent: MouseEvent[HTMLElement, NativeMouseEvent], key: typings.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setDomEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
