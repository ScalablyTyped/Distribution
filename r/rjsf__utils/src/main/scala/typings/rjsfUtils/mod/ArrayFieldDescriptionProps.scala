package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a `ArrayFieldDescriptionTemplate` implementation */
/* Inlined std.Pick<@rjsf/utils.@rjsf/utils.DescriptionFieldProps<T, F>, 'description' | 'registry'> & {  idSchema :@rjsf/utils.@rjsf/utils.IdSchema<T>,   uiSchema :@rjsf/utils.@rjsf/utils.UiSchema<T, F> | undefined} */
trait ArrayFieldDescriptionProps[T, F] extends StObject {
  
  var description: String | ReactElement
  
  /** The idSchema of the field in the hierarchy */
  var idSchema: IdSchema[T]
  
  var registry: Registry[T, F]
  
  /** The uiSchema object for this description field */
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object ArrayFieldDescriptionProps {
  
  inline def apply[T, F](description: String | ReactElement, idSchema: IdSchema[T], registry: Registry[T, F]): ArrayFieldDescriptionProps[T, F] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldDescriptionProps[T, F]]
  }
  
  extension [Self <: ArrayFieldDescriptionProps[?, ?], T, F](x: Self & (ArrayFieldDescriptionProps[T, F])) {
    
    inline def setDescription(value: String | ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
