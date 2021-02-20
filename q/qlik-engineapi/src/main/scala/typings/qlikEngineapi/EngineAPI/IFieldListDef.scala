package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the fields to show.
  */
@js.native
trait IFieldListDef extends StObject {
  
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
  implicit class IFieldListDefMutableBuilder[Self <: IFieldListDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQShowDefinitionOnly(value: Boolean): Self = StObject.set(x, "qShowDefinitionOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowDefinitionOnlyUndefined: Self = StObject.set(x, "qShowDefinitionOnly", js.undefined)
    
    @scala.inline
    def setQShowDerivedFields(value: Boolean): Self = StObject.set(x, "qShowDerivedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowDerivedFieldsUndefined: Self = StObject.set(x, "qShowDerivedFields", js.undefined)
    
    @scala.inline
    def setQShowHidden(value: Boolean): Self = StObject.set(x, "qShowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowHiddenUndefined: Self = StObject.set(x, "qShowHidden", js.undefined)
    
    @scala.inline
    def setQShowImplicit(value: Boolean): Self = StObject.set(x, "qShowImplicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowImplicitUndefined: Self = StObject.set(x, "qShowImplicit", js.undefined)
    
    @scala.inline
    def setQShowSemantic(value: Boolean): Self = StObject.set(x, "qShowSemantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowSemanticUndefined: Self = StObject.set(x, "qShowSemantic", js.undefined)
    
    @scala.inline
    def setQShowSrcTables(value: Boolean): Self = StObject.set(x, "qShowSrcTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowSrcTablesUndefined: Self = StObject.set(x, "qShowSrcTables", js.undefined)
    
    @scala.inline
    def setQShowSystem(value: Boolean): Self = StObject.set(x, "qShowSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowSystemUndefined: Self = StObject.set(x, "qShowSystem", js.undefined)
  }
}
