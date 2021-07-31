package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderContextFieldInForm
  extends StObject
     with RenderContextForm {
  
  var CurrentFieldSchema: FieldSchemaInForm
  
  var CurrentFieldValue: js.Any
  
  var CurrentGroup: Group
  
  var CurrentGroupIdx: Double
  
  var CurrentItems: js.Array[Item]
}
object RenderContextFieldInForm {
  
  @scala.inline
  def apply(
    CurrentFieldSchema: FieldSchemaInForm,
    CurrentFieldValue: js.Any,
    CurrentGroup: Group,
    CurrentGroupIdx: Double,
    CurrentItem: Item,
    CurrentItems: js.Array[Item],
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm
  ): RenderContextFieldInForm = {
    val __obj = js.Dynamic.literal(CurrentFieldSchema = CurrentFieldSchema.asInstanceOf[js.Any], CurrentFieldValue = CurrentFieldValue.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], CurrentGroupIdx = CurrentGroupIdx.asInstanceOf[js.Any], CurrentItem = CurrentItem.asInstanceOf[js.Any], CurrentItems = CurrentItems.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextFieldInForm]
  }
  
  @scala.inline
  implicit class RenderContextFieldInFormMutableBuilder[Self <: RenderContextFieldInForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentFieldSchema(value: FieldSchemaInForm): Self = StObject.set(x, "CurrentFieldSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFieldValue(value: js.Any): Self = StObject.set(x, "CurrentFieldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGroup(value: Group): Self = StObject.set(x, "CurrentGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGroupIdx(value: Double): Self = StObject.set(x, "CurrentGroupIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentItems(value: js.Array[Item]): Self = StObject.set(x, "CurrentItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentItemsVarargs(value: Item*): Self = StObject.set(x, "CurrentItems", js.Array(value :_*))
  }
}
