package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayResponsePayload extends StObject {
  
  val errors: js.UndefOr[js.Array[PayloadError] | Null] = js.undefined
  
  val fieldPayloads: js.UndefOr[js.Array[HandleFieldPayload] | Null] = js.undefined
  
  val incrementalPlaceholders: js.UndefOr[js.Array[IncrementalDataPlaceholder] | Null] = js.undefined
  
  val isFinal: Boolean
  
  val moduleImportPayloads: js.UndefOr[js.Array[ModuleImportPayload] | Null] = js.undefined
  
  val source: MutableRecordSource
}
object RelayResponsePayload {
  
  inline def apply(isFinal: Boolean, source: MutableRecordSource): RelayResponsePayload = {
    val __obj = js.Dynamic.literal(isFinal = isFinal.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayResponsePayload]
  }
  
  extension [Self <: RelayResponsePayload](x: Self) {
    
    inline def setErrors(value: js.Array[PayloadError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: PayloadError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setFieldPayloads(value: js.Array[HandleFieldPayload]): Self = StObject.set(x, "fieldPayloads", value.asInstanceOf[js.Any])
    
    inline def setFieldPayloadsNull: Self = StObject.set(x, "fieldPayloads", null)
    
    inline def setFieldPayloadsUndefined: Self = StObject.set(x, "fieldPayloads", js.undefined)
    
    inline def setFieldPayloadsVarargs(value: HandleFieldPayload*): Self = StObject.set(x, "fieldPayloads", js.Array(value :_*))
    
    inline def setIncrementalPlaceholders(value: js.Array[IncrementalDataPlaceholder]): Self = StObject.set(x, "incrementalPlaceholders", value.asInstanceOf[js.Any])
    
    inline def setIncrementalPlaceholdersNull: Self = StObject.set(x, "incrementalPlaceholders", null)
    
    inline def setIncrementalPlaceholdersUndefined: Self = StObject.set(x, "incrementalPlaceholders", js.undefined)
    
    inline def setIncrementalPlaceholdersVarargs(value: IncrementalDataPlaceholder*): Self = StObject.set(x, "incrementalPlaceholders", js.Array(value :_*))
    
    inline def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
    
    inline def setModuleImportPayloads(value: js.Array[ModuleImportPayload]): Self = StObject.set(x, "moduleImportPayloads", value.asInstanceOf[js.Any])
    
    inline def setModuleImportPayloadsNull: Self = StObject.set(x, "moduleImportPayloads", null)
    
    inline def setModuleImportPayloadsUndefined: Self = StObject.set(x, "moduleImportPayloads", js.undefined)
    
    inline def setModuleImportPayloadsVarargs(value: ModuleImportPayload*): Self = StObject.set(x, "moduleImportPayloads", js.Array(value :_*))
    
    inline def setSource(value: MutableRecordSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
