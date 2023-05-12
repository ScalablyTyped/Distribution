package typings.sentryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Partial<@sentry/types.@sentry/types.DynamicSamplingContext>> */
trait ReadonlyPartialDynamicSam extends StObject {
  
  val environment: js.UndefOr[String] = js.undefined
  
  val public_key: js.UndefOr[String] = js.undefined
  
  val release: js.UndefOr[String] = js.undefined
  
  val replay_id: js.UndefOr[String] = js.undefined
  
  val sample_rate: js.UndefOr[String] = js.undefined
  
  val trace_id: js.UndefOr[String] = js.undefined
  
  val transaction: js.UndefOr[String] = js.undefined
  
  val user_segment: js.UndefOr[String] = js.undefined
}
object ReadonlyPartialDynamicSam {
  
  inline def apply(): ReadonlyPartialDynamicSam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPartialDynamicSam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPartialDynamicSam] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setReplay_id(value: String): Self = StObject.set(x, "replay_id", value.asInstanceOf[js.Any])
    
    inline def setReplay_idUndefined: Self = StObject.set(x, "replay_id", js.undefined)
    
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
