package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to an `FieldErrorTemplate` implementation */
trait FieldErrorProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The errorSchema constructed by `Form` */
  var errorSchema: js.UndefOr[ErrorSchema[T]] = js.undefined
  
  /** An array of the errors */
  var errors: js.UndefOr[js.Array[String | ReactElement]] = js.undefined
  
  /** The tree of unique ids for every child field */
  var idSchema: IdSchema[T]
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** The schema that was passed to field */
  var schema: S
  
  /** The uiSchema that was passed to field */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object FieldErrorProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](idSchema: IdSchema[T], registry: Registry[T, S, F], schema: S): FieldErrorProps[T, S, F] = {
    val __obj = js.Dynamic.literal(idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldErrorProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldErrorProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (FieldErrorProps[T, S, F])) extends AnyVal {
    
    inline def setErrorSchema(value: ErrorSchema[T]): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
    
    inline def setErrorSchemaUndefined: Self = StObject.set(x, "errorSchema", js.undefined)
    
    inline def setErrors(value: js.Array[String | ReactElement]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: (String | ReactElement)*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
