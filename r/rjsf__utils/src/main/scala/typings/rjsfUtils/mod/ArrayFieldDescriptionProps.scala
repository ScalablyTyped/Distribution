package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a `ArrayFieldDescriptionTemplate` implementation */
/* Inlined std.Omit<@rjsf/utils.@rjsf/utils.DescriptionFieldProps<T, S, F>, 'id' | 'description'> & {  description :string | react.react.ReactElement | undefined,   idSchema :@rjsf/utils.@rjsf/utils.IdSchema<T>} */
trait ArrayFieldDescriptionProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The description of the field being rendered */
  var description: js.UndefOr[String | ReactElement] = js.undefined
  
  /** The idSchema of the field in the hierarchy */
  var idSchema: IdSchema[T]
  
  var registry: Registry[T, S, F]
  
  var schema: S
  
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object ArrayFieldDescriptionProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](idSchema: IdSchema[T], registry: Registry[T, S, F], schema: S): ArrayFieldDescriptionProps[T, S, F] = {
    val __obj = js.Dynamic.literal(idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldDescriptionProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayFieldDescriptionProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (ArrayFieldDescriptionProps[T, S, F])) extends AnyVal {
    
    inline def setDescription(value: String | ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
