package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIAccessEventMap extends StObject {
  
  /* standard dom */
  var statechange: Event
}
object MIDIAccessEventMap {
  
  inline def apply(statechange: Event): MIDIAccessEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIAccessEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIDIAccessEventMap] (val x: Self) extends AnyVal {
    
    inline def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
