package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.polymorphicsMod.PolymorphicRequest
import typings.sentryTypes.transactionMod.TransactionNameChange
import typings.sentryTypes.transactionMod.TransactionSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/types.@sentry/types/types/transaction.TransactionMetadata> */
trait PartialTransactionMetadat extends StObject {
  
  var changes: js.UndefOr[js.Array[TransactionNameChange]] = js.undefined
  
  var dynamicSamplingContext: js.UndefOr[PartialDynamicSamplingCon] = js.undefined
  
  var propagations: js.UndefOr[Double] = js.undefined
  
  var request: js.UndefOr[PolymorphicRequest] = js.undefined
  
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
  
  extension [Self <: PartialTransactionMetadat](x: Self) {
    
    inline def setChanges(value: js.Array[TransactionNameChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: TransactionNameChange*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setDynamicSamplingContext(value: PartialDynamicSamplingCon): Self = StObject.set(x, "dynamicSamplingContext", value.asInstanceOf[js.Any])
    
    inline def setDynamicSamplingContextUndefined: Self = StObject.set(x, "dynamicSamplingContext", js.undefined)
    
    inline def setPropagations(value: Double): Self = StObject.set(x, "propagations", value.asInstanceOf[js.Any])
    
    inline def setPropagationsUndefined: Self = StObject.set(x, "propagations", js.undefined)
    
    inline def setRequest(value: PolymorphicRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
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
