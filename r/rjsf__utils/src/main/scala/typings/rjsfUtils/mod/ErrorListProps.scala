package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to an `ErrorListTemplate` implementation */
trait ErrorListProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The errorSchema constructed by `Form` */
  var errorSchema: ErrorSchema[T]
  
  /** An array of the errors */
  var errors: js.Array[RJSFValidationError]
  
  /** The `formContext` object that was passed to `Form` */
  var formContext: js.UndefOr[F] = js.undefined
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** The schema that was passed to `Form` */
  var schema: S
  
  /** The uiSchema that was passed to `Form` */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object ErrorListProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
    errorSchema: ErrorSchema[T],
    errors: js.Array[RJSFValidationError],
    registry: Registry[T, S, F],
    schema: S
  ): ErrorListProps[T, S, F] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorListProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorListProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (ErrorListProps[T, S, F])) extends AnyVal {
    
    inline def setErrorSchema(value: ErrorSchema[T]): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[RJSFValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: RJSFValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFormContext(value: F): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setFormContextUndefined: Self = StObject.set(x, "formContext", js.undefined)
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
