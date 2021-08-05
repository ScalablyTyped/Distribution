package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[ValidateMessage] = js.undefined
  
  var invalid: js.UndefOr[ValidateMessage] = js.undefined
  
  var parse: js.UndefOr[ValidateMessage] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: ValidateMessage): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction0(value: () => String): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInvalid(value: ValidateMessage): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidFunction0(value: () => String): Self = StObject.set(x, "invalid", js.Any.fromFunction0(value))
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setParse(value: ValidateMessage): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseFunction0(value: () => String): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
