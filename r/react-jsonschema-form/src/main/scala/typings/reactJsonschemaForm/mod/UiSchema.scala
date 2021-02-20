package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UiSchema
  extends /* name */ StringDictionary[js.Any] {
  
  @JSName("ui:ArrayFieldTemplate")
  var uiColonArrayFieldTemplate: js.UndefOr[StatelessComponent[ArrayFieldTemplateProps[_]]] = js.native
  
  @JSName("ui:FieldTemplate")
  var uiColonFieldTemplate: js.UndefOr[StatelessComponent[FieldTemplateProps]] = js.native
  
  @JSName("ui:ObjectFieldTemplate")
  var uiColonObjectFieldTemplate: js.UndefOr[StatelessComponent[ObjectFieldTemplateProps[_]]] = js.native
  
  @JSName("ui:field")
  var uiColonfield: js.UndefOr[Field | String] = js.native
  
  @JSName("ui:options")
  var uiColonoptions: js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]] = js.native
  
  @JSName("ui:order")
  var uiColonorder: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("ui:widget")
  var uiColonwidget: js.UndefOr[Widget | String] = js.native
}
object UiSchema {
  
  @scala.inline
  def apply(): UiSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiSchema]
  }
  
  @scala.inline
  implicit class UiSchemaMutableBuilder[Self <: UiSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUiColonArrayFieldTemplate(value: StatelessComponent[ArrayFieldTemplateProps[_]]): Self = StObject.set(x, "ui:ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiColonArrayFieldTemplateUndefined: Self = StObject.set(x, "ui:ArrayFieldTemplate", js.undefined)
    
    @scala.inline
    def setUiColonFieldTemplate(value: StatelessComponent[FieldTemplateProps]): Self = StObject.set(x, "ui:FieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiColonFieldTemplateUndefined: Self = StObject.set(x, "ui:FieldTemplate", js.undefined)
    
    @scala.inline
    def setUiColonObjectFieldTemplate(value: StatelessComponent[ObjectFieldTemplateProps[_]]): Self = StObject.set(x, "ui:ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiColonObjectFieldTemplateUndefined: Self = StObject.set(x, "ui:ObjectFieldTemplate", js.undefined)
    
    @scala.inline
    def setUiColonfield(value: Field | String): Self = StObject.set(x, "ui:field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiColonfieldUndefined: Self = StObject.set(x, "ui:field", js.undefined)
    
    @scala.inline
    def setUiColonoptions(value: StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]): Self = StObject.set(x, "ui:options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiColonoptionsUndefined: Self = StObject.set(x, "ui:options", js.undefined)
    
    @scala.inline
    def setUiColonorder(value: js.Array[String]): Self = StObject.set(x, "ui:order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiColonorderUndefined: Self = StObject.set(x, "ui:order", js.undefined)
    
    @scala.inline
    def setUiColonorderVarargs(value: String*): Self = StObject.set(x, "ui:order", js.Array(value :_*))
    
    @scala.inline
    def setUiColonwidget(value: Widget | String): Self = StObject.set(x, "ui:widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiColonwidgetUndefined: Self = StObject.set(x, "ui:widget", js.undefined)
  }
}
