package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIOptions extends StObject {
  
  /* standard dom */
  var software: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var sysex: js.UndefOr[scala.Boolean] = js.undefined
}
object MIDIOptions {
  
  inline def apply(): MIDIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MIDIOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIDIOptions] (val x: Self) extends AnyVal {
    
    inline def setSoftware(value: scala.Boolean): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    inline def setSysex(value: scala.Boolean): Self = StObject.set(x, "sysex", value.asInstanceOf[js.Any])
    
    inline def setSysexUndefined: Self = StObject.set(x, "sysex", js.undefined)
  }
}
