package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
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
  implicit class UiSchemaOps[Self <: UiSchema] (val x: Self) extends AnyVal {
    
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
    def setUiColonArrayFieldTemplate(value: StatelessComponent[ArrayFieldTemplateProps[_]]): Self = this.set("ui:ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiColonArrayFieldTemplate: Self = this.set("ui:ArrayFieldTemplate", js.undefined)
    
    @scala.inline
    def setUiColonFieldTemplate(value: StatelessComponent[FieldTemplateProps]): Self = this.set("ui:FieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiColonFieldTemplate: Self = this.set("ui:FieldTemplate", js.undefined)
    
    @scala.inline
    def setUiColonObjectFieldTemplate(value: StatelessComponent[ObjectFieldTemplateProps[_]]): Self = this.set("ui:ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiColonObjectFieldTemplate: Self = this.set("ui:ObjectFieldTemplate", js.undefined)
    
    @scala.inline
    def setUiColonfield(value: Field | String): Self = this.set("ui:field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiColonfield: Self = this.set("ui:field", js.undefined)
    
    @scala.inline
    def setUiColonoptions(value: StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]): Self = this.set("ui:options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiColonoptions: Self = this.set("ui:options", js.undefined)
    
    @scala.inline
    def setUiColonorderVarargs(value: String*): Self = this.set("ui:order", js.Array(value :_*))
    
    @scala.inline
    def setUiColonorder(value: js.Array[String]): Self = this.set("ui:order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiColonorder: Self = this.set("ui:order", js.undefined)
    
    @scala.inline
    def setUiColonwidget(value: Widget | String): Self = this.set("ui:widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiColonwidget: Self = this.set("ui:widget", js.undefined)
  }
}
