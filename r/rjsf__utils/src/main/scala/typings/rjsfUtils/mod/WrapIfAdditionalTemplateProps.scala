package typings.rjsfUtils.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a WrapIfAdditionalTemplate implementation */
/* Inlined {  children :react.react.ReactNode} & std.Pick<@rjsf/utils.@rjsf/utils.FieldTemplateProps<T, F>, 'id' | 'classNames' | 'label' | 'required' | 'readonly' | 'disabled' | 'schema' | 'uiSchema' | 'onKeyChange' | 'onDropPropertyClick' | 'registry'> */
trait WrapIfAdditionalTemplateProps[T, F] extends StObject {
  
  /** The field or widget component instance for this field row */
  var children: ReactNode
  
  var classNames: js.UndefOr[String] = js.undefined
  
  var disabled: Boolean
  
  var id: String
  
  var label: String
  
  var onDropPropertyClick: js.Function1[/* value */ String, js.Function0[Unit]]
  
  var onKeyChange: js.Function1[/* value */ String, js.Function0[Unit]]
  
  var readonly: Boolean
  
  var registry: Registry[T, F]
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var schema: RJSFSchema
  
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object WrapIfAdditionalTemplateProps {
  
  inline def apply[T, F](
    disabled: Boolean,
    id: String,
    label: String,
    onDropPropertyClick: /* value */ String => js.Function0[Unit],
    onKeyChange: /* value */ String => js.Function0[Unit],
    readonly: Boolean,
    registry: Registry[T, F],
    schema: RJSFSchema
  ): WrapIfAdditionalTemplateProps[T, F] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onDropPropertyClick = js.Any.fromFunction1(onDropPropertyClick), onKeyChange = js.Any.fromFunction1(onKeyChange), readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapIfAdditionalTemplateProps[T, F]]
  }
  
  extension [Self <: WrapIfAdditionalTemplateProps[?, ?], T, F](x: Self & (WrapIfAdditionalTemplateProps[T, F])) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassNames(value: String): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnDropPropertyClick(value: /* value */ String => js.Function0[Unit]): Self = StObject.set(x, "onDropPropertyClick", js.Any.fromFunction1(value))
    
    inline def setOnKeyChange(value: /* value */ String => js.Function0[Unit]): Self = StObject.set(x, "onKeyChange", js.Any.fromFunction1(value))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
