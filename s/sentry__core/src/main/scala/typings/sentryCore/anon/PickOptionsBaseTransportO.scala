package typings.sentryCore.anon

import typings.sentryTypes.typesTransactionMod.SamplingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@sentry/types.@sentry/types.Options<@sentry/types.@sentry/types/types/transport.BaseTransportOptions>, 'tracesSampleRate' | 'tracesSampler' | 'enableTracing'> */
trait PickOptionsBaseTransportO extends StObject {
  
  var enableTracing: js.UndefOr[Boolean] = js.undefined
  
  var tracesSampleRate: js.UndefOr[Double] = js.undefined
  
  var tracesSampler: js.UndefOr[js.Function1[/* samplingContext */ SamplingContext, Double | Boolean]] = js.undefined
}
object PickOptionsBaseTransportO {
  
  inline def apply(): PickOptionsBaseTransportO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionsBaseTransportO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickOptionsBaseTransportO] (val x: Self) extends AnyVal {
    
    inline def setEnableTracing(value: Boolean): Self = StObject.set(x, "enableTracing", value.asInstanceOf[js.Any])
    
    inline def setEnableTracingUndefined: Self = StObject.set(x, "enableTracing", js.undefined)
    
    inline def setTracesSampleRate(value: Double): Self = StObject.set(x, "tracesSampleRate", value.asInstanceOf[js.Any])
    
    inline def setTracesSampleRateUndefined: Self = StObject.set(x, "tracesSampleRate", js.undefined)
    
    inline def setTracesSampler(value: /* samplingContext */ SamplingContext => Double | Boolean): Self = StObject.set(x, "tracesSampler", js.Any.fromFunction1(value))
    
    inline def setTracesSamplerUndefined: Self = StObject.set(x, "tracesSampler", js.undefined)
  }
}
