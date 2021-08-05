package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReconnectServerEventsOptions extends StObject {
  
  var errorArgs: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var onerror: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  
  var onmessage: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ReconnectServerEventsOptions {
  
  inline def apply(): ReconnectServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconnectServerEventsOptions]
  }
  
  extension [Self <: ReconnectServerEventsOptions](x: Self) {
    
    inline def setErrorArgs(value: js.Array[js.Any]): Self = StObject.set(x, "errorArgs", value.asInstanceOf[js.Any])
    
    inline def setErrorArgsUndefined: Self = StObject.set(x, "errorArgs", js.undefined)
    
    inline def setErrorArgsVarargs(value: js.Any*): Self = StObject.set(x, "errorArgs", js.Array(value :_*))
    
    inline def setOnerror(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnmessage(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
    
    inline def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
