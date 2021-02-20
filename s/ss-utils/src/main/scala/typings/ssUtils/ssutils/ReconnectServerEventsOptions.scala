package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReconnectServerEventsOptions extends StObject {
  
  var errorArgs: js.UndefOr[js.Array[_]] = js.native
  
  var onerror: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var onmessage: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object ReconnectServerEventsOptions {
  
  @scala.inline
  def apply(): ReconnectServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconnectServerEventsOptions]
  }
  
  @scala.inline
  implicit class ReconnectServerEventsOptionsMutableBuilder[Self <: ReconnectServerEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorArgs(value: js.Array[_]): Self = StObject.set(x, "errorArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorArgsUndefined: Self = StObject.set(x, "errorArgs", js.undefined)
    
    @scala.inline
    def setErrorArgsVarargs(value: js.Any*): Self = StObject.set(x, "errorArgs", js.Array(value :_*))
    
    @scala.inline
    def setOnerror(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOnmessage(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
