package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the fields to show.
  */
@js.native
trait IFieldListDef extends js.Object {
  
  /**
    * Shows the fields defined on the fly if set to true.
    */
  var qShowDefinitionOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows the fields and derived fields if set to true.
    */
  var qShowDerivedFields: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows the hidden fields if set to true.
    */
  var qShowHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows the Direct Discovery measure fields if set to true.
    */
  var qShowImplicit: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the semantic fields if set to true.
    */
  var qShowSemantic: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows the tables and fields present in the data model viewer if set to true.
    */
  var qShowSrcTables: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows the system tables if set to true.
    */
  var qShowSystem: js.UndefOr[Boolean] = js.native
}
object IFieldListDef {
  
  @scala.inline
  def apply(): IFieldListDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldListDef]
  }
  
  @scala.inline
  implicit class IFieldListDefOps[Self <: IFieldListDef] (val x: Self) extends AnyVal {
    
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
    def setQShowDefinitionOnly(value: Boolean): Self = this.set("qShowDefinitionOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQShowDefinitionOnly: Self = this.set("qShowDefinitionOnly", js.undefined)
    
    @scala.inline
    def setQShowDerivedFields(value: Boolean): Self = this.set("qShowDerivedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQShowDerivedFields: Self = this.set("qShowDerivedFields", js.undefined)
    
    @scala.inline
    def setQShowHidden(value: Boolean): Self = this.set("qShowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQShowHidden: Self = this.set("qShowHidden", js.undefined)
    
    @scala.inline
    def setQShowImplicit(value: Boolean): Self = this.set("qShowImplicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQShowImplicit: Self = this.set("qShowImplicit", js.undefined)
    
    @scala.inline
    def setQShowSemantic(value: Boolean): Self = this.set("qShowSemantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQShowSemantic: Self = this.set("qShowSemantic", js.undefined)
    
    @scala.inline
    def setQShowSrcTables(value: Boolean): Self = this.set("qShowSrcTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQShowSrcTables: Self = this.set("qShowSrcTables", js.undefined)
    
    @scala.inline
    def setQShowSystem(value: Boolean): Self = this.set("qShowSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQShowSystem: Self = this.set("qShowSystem", js.undefined)
  }
}
