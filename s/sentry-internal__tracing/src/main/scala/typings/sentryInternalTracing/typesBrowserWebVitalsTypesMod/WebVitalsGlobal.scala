package typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod

import typings.sentryInternalTracing.typesBrowserWebVitalsTypesPolyfillsMod.FirstInputPolyfillCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebVitalsGlobal extends StObject {
  
  var firstHiddenTime: Double
  
  def firstInputPolyfill(onFirstInput: FirstInputPolyfillCallback): Unit
  
  def resetFirstInputPolyfill(): Unit
}
object WebVitalsGlobal {
  
  inline def apply(
    firstHiddenTime: Double,
    firstInputPolyfill: FirstInputPolyfillCallback => Unit,
    resetFirstInputPolyfill: () => Unit
  ): WebVitalsGlobal = {
    val __obj = js.Dynamic.literal(firstHiddenTime = firstHiddenTime.asInstanceOf[js.Any], firstInputPolyfill = js.Any.fromFunction1(firstInputPolyfill), resetFirstInputPolyfill = js.Any.fromFunction0(resetFirstInputPolyfill))
    __obj.asInstanceOf[WebVitalsGlobal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebVitalsGlobal] (val x: Self) extends AnyVal {
    
    inline def setFirstHiddenTime(value: Double): Self = StObject.set(x, "firstHiddenTime", value.asInstanceOf[js.Any])
    
    inline def setFirstInputPolyfill(value: FirstInputPolyfillCallback => Unit): Self = StObject.set(x, "firstInputPolyfill", js.Any.fromFunction1(value))
    
    inline def setResetFirstInputPolyfill(value: () => Unit): Self = StObject.set(x, "resetFirstInputPolyfill", js.Any.fromFunction0(value))
  }
}
