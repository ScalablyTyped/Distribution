package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIInputEventMap
  extends StObject
     with MIDIPortEventMap {
  
  /* standard dom */
  var midimessage: Event
}
object MIDIInputEventMap {
  
  inline def apply(midimessage: Event, statechange: Event): MIDIInputEventMap = {
    val __obj = js.Dynamic.literal(midimessage = midimessage.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIInputEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIDIInputEventMap] (val x: Self) extends AnyVal {
    
    inline def setMidimessage(value: Event): Self = StObject.set(x, "midimessage", value.asInstanceOf[js.Any])
  }
}
