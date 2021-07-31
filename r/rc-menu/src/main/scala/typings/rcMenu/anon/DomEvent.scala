package typings.rcMenu.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomEvent extends StObject {
  
  var domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]
  
  var key: typings.react.mod.Key
}
object DomEvent {
  
  @scala.inline
  def apply(
    domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement],
    key: typings.react.mod.Key
  ): DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
  
  @scala.inline
  implicit class DomEventMutableBuilder[Self <: DomEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomEvent(value: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
