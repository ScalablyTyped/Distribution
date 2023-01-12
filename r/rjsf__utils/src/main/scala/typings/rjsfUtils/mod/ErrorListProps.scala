package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to an `ErrorListTemplate` implementation */
trait ErrorListProps[T, F] extends StObject {
  
  /** The errorSchema constructed by `Form` */
  var errorSchema: ErrorSchema[T]
  
  /** An array of the errors */
  var errors: js.Array[RJSFValidationError]
  
  /** The `formContext` object that was passed to `Form` */
  var formContext: js.UndefOr[F] = js.undefined
  
  /** The schema that was passed to `Form` */
  var schema: RJSFSchema
  
  /** The uiSchema that was passed to `Form` */
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object ErrorListProps {
  
  inline def apply[T, F](errorSchema: ErrorSchema[T], errors: js.Array[RJSFValidationError], schema: RJSFSchema): ErrorListProps[T, F] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorListProps[T, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorListProps[?, ?], T, F] (val x: Self & (ErrorListProps[T, F])) extends AnyVal {
    
    inline def setErrorSchema(value: ErrorSchema[T]): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[RJSFValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: RJSFValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFormContext(value: F): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setFormContextUndefined: Self = StObject.set(x, "formContext", js.undefined)
    
    inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
