package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderContextForm
  extends StObject
     with RenderContext {
  
  var CSRCustomLayout: js.UndefOr[Boolean] = js.undefined
  
  var CurrentItem: Item
  
  var FieldControlModes: StringDictionary[ClientControlMode]
  
  var FormContext: ClientFormContext
  
  var FormUniqueId: String
  
  var ListData: ListDataInForm
  
  var ListSchema: ListSchemaInForm
}
object RenderContextForm {
  
  @scala.inline
  def apply(
    CurrentItem: Item,
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm
  ): RenderContextForm = {
    val __obj = js.Dynamic.literal(CurrentItem = CurrentItem.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextForm]
  }
  
  @scala.inline
  implicit class RenderContextFormMutableBuilder[Self <: RenderContextForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSRCustomLayout(value: Boolean): Self = StObject.set(x, "CSRCustomLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSRCustomLayoutUndefined: Self = StObject.set(x, "CSRCustomLayout", js.undefined)
    
    @scala.inline
    def setCurrentItem(value: Item): Self = StObject.set(x, "CurrentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldControlModes(value: StringDictionary[ClientControlMode]): Self = StObject.set(x, "FieldControlModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormContext(value: ClientFormContext): Self = StObject.set(x, "FormContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUniqueId(value: String): Self = StObject.set(x, "FormUniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListData(value: ListDataInForm): Self = StObject.set(x, "ListData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSchema(value: ListSchemaInForm): Self = StObject.set(x, "ListSchema", value.asInstanceOf[js.Any])
  }
}
