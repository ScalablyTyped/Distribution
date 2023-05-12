package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a `ArrayFieldTitleTemplate` implementation */
/* Inlined std.Omit<@rjsf/utils.@rjsf/utils.TitleFieldProps<T, S, F>, 'id' | 'title'> & {  title :string | undefined,   idSchema :@rjsf/utils.@rjsf/utils.IdSchema<T>} */
trait ArrayFieldTitleProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The idSchema of the field in the hierarchy */
  var idSchema: IdSchema[T]
  
  var registry: Registry[T, S, F]
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var schema: S
  
  /** The title for the field being rendered */
  var title: js.UndefOr[String] = js.undefined
  
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object ArrayFieldTitleProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](idSchema: IdSchema[T], registry: Registry[T, S, F], schema: S): ArrayFieldTitleProps[T, S, F] = {
    val __obj = js.Dynamic.literal(idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldTitleProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayFieldTitleProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (ArrayFieldTitleProps[T, S, F])) extends AnyVal {
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
