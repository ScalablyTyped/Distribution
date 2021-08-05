package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOptional extends StObject {
  
  var errorFilter: js.UndefOr[
    js.Function3[/* errorMsg */ String, /* errorCode */ String, /* type */ String, Unit]
  ] = js.undefined
  
  var messages: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var overrideMessages: js.UndefOr[Boolean] = js.undefined
}
object ValidationOptional {
  
  inline def apply(): ValidationOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptional]
  }
  
  extension [Self <: ValidationOptional](x: Self) {
    
    inline def setErrorFilter(value: (/* errorMsg */ String, /* errorCode */ String, /* type */ String) => Unit): Self = StObject.set(x, "errorFilter", js.Any.fromFunction3(value))
    
    inline def setErrorFilterUndefined: Self = StObject.set(x, "errorFilter", js.undefined)
    
    inline def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setOverrideMessages(value: Boolean): Self = StObject.set(x, "overrideMessages", value.asInstanceOf[js.Any])
    
    inline def setOverrideMessagesUndefined: Self = StObject.set(x, "overrideMessages", js.undefined)
  }
}
