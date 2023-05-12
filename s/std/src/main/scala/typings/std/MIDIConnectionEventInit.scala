package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIConnectionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var port: js.UndefOr[MIDIPort] = js.undefined
}
object MIDIConnectionEventInit {
  
  inline def apply(): MIDIConnectionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MIDIConnectionEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIDIConnectionEventInit] (val x: Self) extends AnyVal {
    
    inline def setPort(value: MIDIPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
