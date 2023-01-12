package typings.sentryUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/types.@sentry/types.DynamicSamplingContext> */
trait PartialDynamicSamplingCon extends StObject {
  
  var environment: js.UndefOr[String] = js.undefined
  
  var public_key: js.UndefOr[String] = js.undefined
  
  var release: js.UndefOr[String] = js.undefined
  
  var sample_rate: js.UndefOr[String] = js.undefined
  
  var trace_id: js.UndefOr[String] = js.undefined
  
  var transaction: js.UndefOr[String] = js.undefined
  
  var user_segment: js.UndefOr[String] = js.undefined
}
object PartialDynamicSamplingCon {
  
  inline def apply(): PartialDynamicSamplingCon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDynamicSamplingCon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialDynamicSamplingCon] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setSample_rate(value: String): Self = StObject.set(x, "sample_rate", value.asInstanceOf[js.Any])
    
    inline def setSample_rateUndefined: Self = StObject.set(x, "sample_rate", js.undefined)
    
    inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
    
    inline def setTrace_idUndefined: Self = StObject.set(x, "trace_id", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    inline def setUser_segment(value: String): Self = StObject.set(x, "user_segment", value.asInstanceOf[js.Any])
    
    inline def setUser_segmentUndefined: Self = StObject.set(x, "user_segment", js.undefined)
  }
}
