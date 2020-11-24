package typings.storybookAddonStoryshots.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModuleMetadata extends js.Object {
  
  var declarations: js.UndefOr[js.Array[_]] = js.native
  
  var entryComponents: js.UndefOr[js.Array[_]] = js.native
  
  var imports: js.UndefOr[js.Array[_]] = js.native
  
  var providers: js.UndefOr[js.Array[_]] = js.native
  
  var schemas: js.UndefOr[js.Array[_]] = js.native
}
object NgModuleMetadata {
  
  @scala.inline
  def apply(): NgModuleMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NgModuleMetadata]
  }
  
  @scala.inline
  implicit class NgModuleMetadataOps[Self <: NgModuleMetadata] (val x: Self) extends AnyVal {
    
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
    def setDeclarationsVarargs(value: js.Any*): Self = this.set("declarations", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[_]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
    
    @scala.inline
    def setEntryComponentsVarargs(value: js.Any*): Self = this.set("entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setEntryComponents(value: js.Array[_]): Self = this.set("entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryComponents: Self = this.set("entryComponents", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: js.Any*): Self = this.set("imports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[_]): Self = this.set("imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: js.Any*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[_]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: js.Any*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[_]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
  }
}
