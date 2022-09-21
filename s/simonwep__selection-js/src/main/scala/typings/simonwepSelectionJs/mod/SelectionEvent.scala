package typings.simonwepSelectionJs.mod

import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionEvent extends StObject {
  
  var event: MouseEvent | TouchEvent | Null
  
  var store: SelectionStore
}
object SelectionEvent {
  
  inline def apply(store: SelectionStore): SelectionEvent = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], event = null)
    __obj.asInstanceOf[SelectionEvent]
  }
  
  extension [Self <: SelectionEvent](x: Self) {
    
    inline def setEvent(value: MouseEvent | TouchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setStore(value: SelectionStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
