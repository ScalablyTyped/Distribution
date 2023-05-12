package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIMessageEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object MIDIMessageEventInit {
  
  inline def apply(): MIDIMessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MIDIMessageEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIDIMessageEventInit] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
