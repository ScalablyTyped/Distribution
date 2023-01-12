package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiSchema
  extends StObject
     with /* name */ StringDictionary[Any] {
  
  @JSName("ui:ArrayFieldTemplate")
  var uiColonArrayFieldTemplate: js.UndefOr[FunctionComponent[ArrayFieldTemplateProps[Any]]] = js.undefined
  
  @JSName("ui:FieldTemplate")
  var uiColonFieldTemplate: js.UndefOr[FunctionComponent[FieldTemplateProps]] = js.undefined
  
  @JSName("ui:ObjectFieldTemplate")
  var uiColonObjectFieldTemplate: js.UndefOr[FunctionComponent[ObjectFieldTemplateProps[Any]]] = js.undefined
  
  @JSName("ui:field")
  var uiColonfield: js.UndefOr[Field | String] = js.undefined
  
  @JSName("ui:options")
  var uiColonoptions: js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[Any] | Null]] = js.undefined
  
  @JSName("ui:order")
  var uiColonorder: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("ui:widget")
  var uiColonwidget: js.UndefOr[Widget | String] = js.undefined
}
object UiSchema {
  
  inline def apply(): UiSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UiSchema] (val x: Self) extends AnyVal {
    
    inline def setUiColonArrayFieldTemplate(value: FunctionComponent[ArrayFieldTemplateProps[Any]]): Self = StObject.set(x, "ui:ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setUiColonArrayFieldTemplateUndefined: Self = StObject.set(x, "ui:ArrayFieldTemplate", js.undefined)
    
    inline def setUiColonFieldTemplate(value: FunctionComponent[FieldTemplateProps]): Self = StObject.set(x, "ui:FieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setUiColonFieldTemplateUndefined: Self = StObject.set(x, "ui:FieldTemplate", js.undefined)
    
    inline def setUiColonObjectFieldTemplate(value: FunctionComponent[ObjectFieldTemplateProps[Any]]): Self = StObject.set(x, "ui:ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setUiColonObjectFieldTemplateUndefined: Self = StObject.set(x, "ui:ObjectFieldTemplate", js.undefined)
    
    inline def setUiColonfield(value: Field | String): Self = StObject.set(x, "ui:field", value.asInstanceOf[js.Any])
    
    inline def setUiColonfieldUndefined: Self = StObject.set(x, "ui:field", js.undefined)
    
    inline def setUiColonoptions(value: StringDictionary[Boolean | Double | String | js.Object | js.Array[Any] | Null]): Self = StObject.set(x, "ui:options", value.asInstanceOf[js.Any])
    
    inline def setUiColonoptionsUndefined: Self = StObject.set(x, "ui:options", js.undefined)
    
    inline def setUiColonorder(value: js.Array[String]): Self = StObject.set(x, "ui:order", value.asInstanceOf[js.Any])
    
    inline def setUiColonorderUndefined: Self = StObject.set(x, "ui:order", js.undefined)
    
    inline def setUiColonorderVarargs(value: String*): Self = StObject.set(x, "ui:order", js.Array(value*))
    
    inline def setUiColonwidget(value: Widget | String): Self = StObject.set(x, "ui:widget", value.asInstanceOf[js.Any])
    
    inline def setUiColonwidgetUndefined: Self = StObject.set(x, "ui:widget", js.undefined)
  }
}
