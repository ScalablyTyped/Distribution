package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoderOptions extends StObject {
  
  /* standard dom */
  var fatal: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var ignoreBOM: js.UndefOr[scala.Boolean] = js.undefined
}
object TextDecoderOptions {
  
  inline def apply(): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
    
    inline def setFatal(value: scala.Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
    
    inline def setIgnoreBOM(value: scala.Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
  }
}
