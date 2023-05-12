package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/browser.@sentry/browser/types/integrations/trycatch.TryCatchOptions> */
trait PartialTryCatchOptions extends StObject {
  
  var XMLHttpRequest: js.UndefOr[Boolean] = js.undefined
  
  var eventTarget: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var requestAnimationFrame: js.UndefOr[Boolean] = js.undefined
  
  var setInterval: js.UndefOr[Boolean] = js.undefined
  
  var setTimeout: js.UndefOr[Boolean] = js.undefined
}
object PartialTryCatchOptions {
  
  inline def apply(): PartialTryCatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTryCatchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTryCatchOptions] (val x: Self) extends AnyVal {
    
    inline def setEventTarget(value: Boolean | js.Array[String]): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setEventTargetUndefined: Self = StObject.set(x, "eventTarget", js.undefined)
    
    inline def setEventTargetVarargs(value: String*): Self = StObject.set(x, "eventTarget", js.Array(value*))
    
    inline def setRequestAnimationFrame(value: Boolean): Self = StObject.set(x, "requestAnimationFrame", value.asInstanceOf[js.Any])
    
    inline def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
    
    inline def setSetInterval(value: Boolean): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
    
    inline def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
    
    inline def setSetTimeout(value: Boolean): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    
    inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    inline def setXMLHttpRequest(value: Boolean): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
    
    inline def setXMLHttpRequestUndefined: Self = StObject.set(x, "XMLHttpRequest", js.undefined)
  }
}
