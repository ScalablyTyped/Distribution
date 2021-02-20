package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayResponsePayload extends StObject {
  
  val errors: js.UndefOr[js.Array[PayloadError] | Null] = js.native
  
  val fieldPayloads: js.UndefOr[js.Array[HandleFieldPayload] | Null] = js.native
  
  val incrementalPlaceholders: js.UndefOr[js.Array[IncrementalDataPlaceholder] | Null] = js.native
  
  val isFinal: Boolean = js.native
  
  val moduleImportPayloads: js.UndefOr[js.Array[ModuleImportPayload] | Null] = js.native
  
  val source: MutableRecordSource = js.native
}
object RelayResponsePayload {
  
  @scala.inline
  def apply(isFinal: Boolean, source: MutableRecordSource): RelayResponsePayload = {
    val __obj = js.Dynamic.literal(isFinal = isFinal.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayResponsePayload]
  }
  
  @scala.inline
  implicit class RelayResponsePayloadMutableBuilder[Self <: RelayResponsePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[PayloadError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: PayloadError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setFieldPayloads(value: js.Array[HandleFieldPayload]): Self = StObject.set(x, "fieldPayloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPayloadsNull: Self = StObject.set(x, "fieldPayloads", null)
    
    @scala.inline
    def setFieldPayloadsUndefined: Self = StObject.set(x, "fieldPayloads", js.undefined)
    
    @scala.inline
    def setFieldPayloadsVarargs(value: HandleFieldPayload*): Self = StObject.set(x, "fieldPayloads", js.Array(value :_*))
    
    @scala.inline
    def setIncrementalPlaceholders(value: js.Array[IncrementalDataPlaceholder]): Self = StObject.set(x, "incrementalPlaceholders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementalPlaceholdersNull: Self = StObject.set(x, "incrementalPlaceholders", null)
    
    @scala.inline
    def setIncrementalPlaceholdersUndefined: Self = StObject.set(x, "incrementalPlaceholders", js.undefined)
    
    @scala.inline
    def setIncrementalPlaceholdersVarargs(value: IncrementalDataPlaceholder*): Self = StObject.set(x, "incrementalPlaceholders", js.Array(value :_*))
    
    @scala.inline
    def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleImportPayloads(value: js.Array[ModuleImportPayload]): Self = StObject.set(x, "moduleImportPayloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleImportPayloadsNull: Self = StObject.set(x, "moduleImportPayloads", null)
    
    @scala.inline
    def setModuleImportPayloadsUndefined: Self = StObject.set(x, "moduleImportPayloads", js.undefined)
    
    @scala.inline
    def setModuleImportPayloadsVarargs(value: ModuleImportPayload*): Self = StObject.set(x, "moduleImportPayloads", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: MutableRecordSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
