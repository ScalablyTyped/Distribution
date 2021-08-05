package typings.rollup.anon

import typings.rollup.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: ChangeEvent
}
object Event {
  
  inline def apply(event: ChangeEvent): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: ChangeEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
