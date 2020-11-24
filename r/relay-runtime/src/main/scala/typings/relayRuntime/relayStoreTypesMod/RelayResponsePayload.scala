package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayResponsePayload extends js.Object {
  
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
  implicit class RelayResponsePayloadOps[Self <: RelayResponsePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsFinal(value: Boolean): Self = this.set("isFinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: MutableRecordSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: PayloadError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[PayloadError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setErrorsNull: Self = this.set("errors", null)
    
    @scala.inline
    def setFieldPayloadsVarargs(value: HandleFieldPayload*): Self = this.set("fieldPayloads", js.Array(value :_*))
    
    @scala.inline
    def setFieldPayloads(value: js.Array[HandleFieldPayload]): Self = this.set("fieldPayloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldPayloads: Self = this.set("fieldPayloads", js.undefined)
    
    @scala.inline
    def setFieldPayloadsNull: Self = this.set("fieldPayloads", null)
    
    @scala.inline
    def setIncrementalPlaceholdersVarargs(value: IncrementalDataPlaceholder*): Self = this.set("incrementalPlaceholders", js.Array(value :_*))
    
    @scala.inline
    def setIncrementalPlaceholders(value: js.Array[IncrementalDataPlaceholder]): Self = this.set("incrementalPlaceholders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementalPlaceholders: Self = this.set("incrementalPlaceholders", js.undefined)
    
    @scala.inline
    def setIncrementalPlaceholdersNull: Self = this.set("incrementalPlaceholders", null)
    
    @scala.inline
    def setModuleImportPayloadsVarargs(value: ModuleImportPayload*): Self = this.set("moduleImportPayloads", js.Array(value :_*))
    
    @scala.inline
    def setModuleImportPayloads(value: js.Array[ModuleImportPayload]): Self = this.set("moduleImportPayloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleImportPayloads: Self = this.set("moduleImportPayloads", js.undefined)
    
    @scala.inline
    def setModuleImportPayloadsNull: Self = this.set("moduleImportPayloads", null)
  }
}
