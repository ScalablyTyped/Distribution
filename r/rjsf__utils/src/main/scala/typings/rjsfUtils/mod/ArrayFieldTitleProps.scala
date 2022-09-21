package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a `ArrayFieldTitleTemplate` implementation */
/* Inlined std.Pick<@rjsf/utils.@rjsf/utils.TitleFieldProps<T, F>, 'title' | 'uiSchema' | 'required' | 'registry'> & {  idSchema :@rjsf/utils.@rjsf/utils.IdSchema<T>} */
trait ArrayFieldTitleProps[T, F] extends StObject {
  
  /** The idSchema of the field in the hierarchy */
  var idSchema: IdSchema[T]
  
  var registry: Registry[T, F]
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var title: String
  
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object ArrayFieldTitleProps {
  
  inline def apply[T, F](idSchema: IdSchema[T], registry: Registry[T, F], title: String): ArrayFieldTitleProps[T, F] = {
    val __obj = js.Dynamic.literal(idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldTitleProps[T, F]]
  }
  
  extension [Self <: ArrayFieldTitleProps[?, ?], T, F](x: Self & (ArrayFieldTitleProps[T, F])) {
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
