package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type for error produced by RJSF schema validation */
trait RJSFValidationError extends StObject {
  
  /** Message, for example, "is a required property" or "should NOT be shorter than 3 characters" */
  var message: js.UndefOr[String] = js.undefined
  
  /** Name of the error, for example, "required" or "minLength" */
  var name: js.UndefOr[String] = js.undefined
  
  /** An object with the error params returned by ajv
    * ([see doc](https://github.com/ajv-validator/ajv/tree/6a671057ea6aae690b5967ee26a0ddf8452c6297#error-parameters)
    * for more info)
    */
  var params: js.UndefOr[Any] = js.undefined
  
  /** A string in Javascript property accessor notation to the data path of the field with the error. For example,
    * `.name` or `['first-name']`
    */
  var property: js.UndefOr[String] = js.undefined
  
  /** JSON pointer to the schema of the keyword that failed validation. For example, `#/fields/firstName/required`.
    * (Note: this may sometimes be wrong due to a [bug in ajv](https://github.com/ajv-validator/ajv/issues/512))
    */
  var schemaPath: js.UndefOr[String] = js.undefined
  
  /** Full error name, for example ".name is a required property" */
  var stack: String
}
object RJSFValidationError {
  
  inline def apply(stack: String): RJSFValidationError = {
    val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RJSFValidationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RJSFValidationError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
    
    inline def setSchemaPathUndefined: Self = StObject.set(x, "schemaPath", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
