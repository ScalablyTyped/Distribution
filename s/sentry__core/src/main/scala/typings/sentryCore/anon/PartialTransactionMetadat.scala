package typings.sentryCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.anon.PartialDynamicSamplingCon
import typings.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import typings.sentryTypes.typesTransactionMod.TransactionSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/types.@sentry/types.TransactionMetadata> */
trait PartialTransactionMetadat extends StObject {
  
  var dynamicSamplingContext: js.UndefOr[PartialDynamicSamplingCon] = js.undefined
  
  var request: js.UndefOr[PolymorphicRequest] = js.undefined
  
  var requestDataOptionsFromExpressHandler: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var requestPath: js.UndefOr[String] = js.undefined
  
  var sampleRate: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[TransactionSource] = js.undefined
  
  var spanMetadata: js.UndefOr[StringDictionary[StringDictionary[Any]]] = js.undefined
}
object PartialTransactionMetadat {
  
  inline def apply(): PartialTransactionMetadat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTransactionMetadat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTransactionMetadat] (val x: Self) extends AnyVal {
    
    inline def setDynamicSamplingContext(value: PartialDynamicSamplingCon): Self = StObject.set(x, "dynamicSamplingContext", value.asInstanceOf[js.Any])
    
    inline def setDynamicSamplingContextUndefined: Self = StObject.set(x, "dynamicSamplingContext", js.undefined)
    
    inline def setRequest(value: PolymorphicRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestDataOptionsFromExpressHandler(value: StringDictionary[Any]): Self = StObject.set(x, "requestDataOptionsFromExpressHandler", value.asInstanceOf[js.Any])
    
    inline def setRequestDataOptionsFromExpressHandlerUndefined: Self = StObject.set(x, "requestDataOptionsFromExpressHandler", js.undefined)
    
    inline def setRequestPath(value: String): Self = StObject.set(x, "requestPath", value.asInstanceOf[js.Any])
    
    inline def setRequestPathUndefined: Self = StObject.set(x, "requestPath", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setSource(value: TransactionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSpanMetadata(value: StringDictionary[StringDictionary[Any]]): Self = StObject.set(x, "spanMetadata", value.asInstanceOf[js.Any])
    
    inline def setSpanMetadataUndefined: Self = StObject.set(x, "spanMetadata", js.undefined)
  }
}
