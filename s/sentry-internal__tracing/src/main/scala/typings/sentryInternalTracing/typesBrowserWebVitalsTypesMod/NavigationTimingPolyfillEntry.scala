package typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@sentry-internal/tracing.@sentry-internal/tracing/types/browser/web-vitals/types.<global>.PerformanceNavigationTiming, 'initiatorType' | 'nextHopProtocol' | 'redirectCount' | 'transferSize' | 'encodedBodySize' | 'decodedBodySize' | 'toJSON'> */
trait NavigationTimingPolyfillEntry extends StObject {
  
  var activationStart: js.UndefOr[Double] = js.undefined
}
object NavigationTimingPolyfillEntry {
  
  inline def apply(): NavigationTimingPolyfillEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationTimingPolyfillEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationTimingPolyfillEntry] (val x: Self) extends AnyVal {
    
    inline def setActivationStart(value: Double): Self = StObject.set(x, "activationStart", value.asInstanceOf[js.Any])
    
    inline def setActivationStartUndefined: Self = StObject.set(x, "activationStart", js.undefined)
  }
}
