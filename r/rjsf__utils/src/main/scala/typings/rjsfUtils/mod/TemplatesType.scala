package typings.rjsfUtils.mod

import typings.react.mod.ComponentType
import typings.rjsfUtils.anon.AddButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The set of RJSF templates that can be overridden by themes or users */
trait TemplatesType[T, F] extends StObject {
  
  /** The template to use while rendering the description for an array field */
  var ArrayFieldDescriptionTemplate: ComponentType[ArrayFieldDescriptionProps[T, F]]
  
  /** The template to use while rendering an item in an array field */
  var ArrayFieldItemTemplate: ComponentType[ArrayFieldTemplateItemType[T, F]]
  
  /** The template to use while rendering normal or fixed array fields */
  var ArrayFieldTemplate: ComponentType[ArrayFieldTemplateProps[T, F]]
  
  /** The template to use while rendering the title for an array field */
  var ArrayFieldTitleTemplate: ComponentType[ArrayFieldTitleProps[T, F]]
  
  /** The template to use while rendering the standard html input */
  var BaseInputTemplate: ComponentType[WidgetProps[T, F]]
  
  /** The set of templates associated with buttons in the form */
  var ButtonTemplates: AddButton[T, F]
  
  /** The template to use for rendering the description of a field */
  var DescriptionFieldTemplate: ComponentType[DescriptionFieldProps[T, F]]
  
  /** The template to use while rendering the errors for the whole form */
  var ErrorListTemplate: ComponentType[ErrorListProps[T, F]]
  
  /** The template to use while rendering the errors for a single field */
  var FieldErrorTemplate: ComponentType[FieldErrorProps[T, F]]
  
  /** The template to use while rendering the errors for a single field */
  var FieldHelpTemplate: ComponentType[FieldHelpProps[T, F]]
  
  /** The template to use while rendering a field */
  var FieldTemplate: ComponentType[FieldTemplateProps[T, F]]
  
  /** The template to use while rendering an object */
  var ObjectFieldTemplate: ComponentType[ObjectFieldTemplateProps[T, F]]
  
  /** The template to use for rendering the title of a field */
  var TitleFieldTemplate: ComponentType[TitleFieldProps[T, F]]
  
  /** The template to use for rendering information about an unsupported field type in the schema */
  var UnsupportedFieldTemplate: ComponentType[UnsupportedFieldProps[T, F]]
  
  /** The template to use for rendering a field that allows a user to add additional properties */
  var WrapIfAdditionalTemplate: ComponentType[WrapIfAdditionalTemplateProps[T, F]]
}
object TemplatesType {
  
  inline def apply[T, F](
    ArrayFieldDescriptionTemplate: ComponentType[ArrayFieldDescriptionProps[T, F]],
    ArrayFieldItemTemplate: ComponentType[ArrayFieldTemplateItemType[T, F]],
    ArrayFieldTemplate: ComponentType[ArrayFieldTemplateProps[T, F]],
    ArrayFieldTitleTemplate: ComponentType[ArrayFieldTitleProps[T, F]],
    BaseInputTemplate: ComponentType[WidgetProps[T, F]],
    ButtonTemplates: AddButton[T, F],
    DescriptionFieldTemplate: ComponentType[DescriptionFieldProps[T, F]],
    ErrorListTemplate: ComponentType[ErrorListProps[T, F]],
    FieldErrorTemplate: ComponentType[FieldErrorProps[T, F]],
    FieldHelpTemplate: ComponentType[FieldHelpProps[T, F]],
    FieldTemplate: ComponentType[FieldTemplateProps[T, F]],
    ObjectFieldTemplate: ComponentType[ObjectFieldTemplateProps[T, F]],
    TitleFieldTemplate: ComponentType[TitleFieldProps[T, F]],
    UnsupportedFieldTemplate: ComponentType[UnsupportedFieldProps[T, F]],
    WrapIfAdditionalTemplate: ComponentType[WrapIfAdditionalTemplateProps[T, F]]
  ): TemplatesType[T, F] = {
    val __obj = js.Dynamic.literal(ArrayFieldDescriptionTemplate = ArrayFieldDescriptionTemplate.asInstanceOf[js.Any], ArrayFieldItemTemplate = ArrayFieldItemTemplate.asInstanceOf[js.Any], ArrayFieldTemplate = ArrayFieldTemplate.asInstanceOf[js.Any], ArrayFieldTitleTemplate = ArrayFieldTitleTemplate.asInstanceOf[js.Any], BaseInputTemplate = BaseInputTemplate.asInstanceOf[js.Any], ButtonTemplates = ButtonTemplates.asInstanceOf[js.Any], DescriptionFieldTemplate = DescriptionFieldTemplate.asInstanceOf[js.Any], ErrorListTemplate = ErrorListTemplate.asInstanceOf[js.Any], FieldErrorTemplate = FieldErrorTemplate.asInstanceOf[js.Any], FieldHelpTemplate = FieldHelpTemplate.asInstanceOf[js.Any], FieldTemplate = FieldTemplate.asInstanceOf[js.Any], ObjectFieldTemplate = ObjectFieldTemplate.asInstanceOf[js.Any], TitleFieldTemplate = TitleFieldTemplate.asInstanceOf[js.Any], UnsupportedFieldTemplate = UnsupportedFieldTemplate.asInstanceOf[js.Any], WrapIfAdditionalTemplate = WrapIfAdditionalTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesType[T, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplatesType[?, ?], T, F] (val x: Self & (TemplatesType[T, F])) extends AnyVal {
    
    inline def setArrayFieldDescriptionTemplate(value: ComponentType[ArrayFieldDescriptionProps[T, F]]): Self = StObject.set(x, "ArrayFieldDescriptionTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldItemTemplate(value: ComponentType[ArrayFieldTemplateItemType[T, F]]): Self = StObject.set(x, "ArrayFieldItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldTemplate(value: ComponentType[ArrayFieldTemplateProps[T, F]]): Self = StObject.set(x, "ArrayFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setArrayFieldTitleTemplate(value: ComponentType[ArrayFieldTitleProps[T, F]]): Self = StObject.set(x, "ArrayFieldTitleTemplate", value.asInstanceOf[js.Any])
    
    inline def setBaseInputTemplate(value: ComponentType[WidgetProps[T, F]]): Self = StObject.set(x, "BaseInputTemplate", value.asInstanceOf[js.Any])
    
    inline def setButtonTemplates(value: AddButton[T, F]): Self = StObject.set(x, "ButtonTemplates", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFieldTemplate(value: ComponentType[DescriptionFieldProps[T, F]]): Self = StObject.set(x, "DescriptionFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setErrorListTemplate(value: ComponentType[ErrorListProps[T, F]]): Self = StObject.set(x, "ErrorListTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldErrorTemplate(value: ComponentType[FieldErrorProps[T, F]]): Self = StObject.set(x, "FieldErrorTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldHelpTemplate(value: ComponentType[FieldHelpProps[T, F]]): Self = StObject.set(x, "FieldHelpTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplate(value: ComponentType[FieldTemplateProps[T, F]]): Self = StObject.set(x, "FieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setObjectFieldTemplate(value: ComponentType[ObjectFieldTemplateProps[T, F]]): Self = StObject.set(x, "ObjectFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setTitleFieldTemplate(value: ComponentType[TitleFieldProps[T, F]]): Self = StObject.set(x, "TitleFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedFieldTemplate(value: ComponentType[UnsupportedFieldProps[T, F]]): Self = StObject.set(x, "UnsupportedFieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setWrapIfAdditionalTemplate(value: ComponentType[WrapIfAdditionalTemplateProps[T, F]]): Self = StObject.set(x, "WrapIfAdditionalTemplate", value.asInstanceOf[js.Any])
  }
}
