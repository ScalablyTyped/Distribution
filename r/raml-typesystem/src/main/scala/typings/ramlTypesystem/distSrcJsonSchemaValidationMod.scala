package typings.ramlTypesystem

import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.RangeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcJsonSchemaValidationMod {
  
  @JSImport("raml-typesystem/dist/src/jsonSchemaValidation", "Draft3Validator")
  @js.native
  open class Draft3Validator ()
    extends StObject
       with RecursiveValidator {
    
    /* protected */ /* CompleteClass */
    override def createError(entry: Any, params: Any, rootObj: Any, jsonPath: String, isWarning: Boolean): JSONSchemaError = js.native
    
    /* protected */ /* CompleteClass */
    override def doValidate(obj: Any, rootObj: Any, jsonPath: String): js.Array[JSONSchemaError] = js.native
    
    /* CompleteClass */
    override def validate(content: String): js.Array[IJSONSchemaError] = js.native
    
    /* private */ /* CompleteClass */
    var validateInternal: Any = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/jsonSchemaValidation", "Draft4Validator")
  @js.native
  open class Draft4Validator ()
    extends StObject
       with RecursiveValidator {
    
    /* protected */ /* CompleteClass */
    override def createError(entry: Any, params: Any, rootObj: Any, jsonPath: String, isWarning: Boolean): JSONSchemaError = js.native
    
    /* protected */ /* CompleteClass */
    override def doValidate(obj: Any, rootObj: Any, jsonPath: String): js.Array[JSONSchemaError] = js.native
    
    /* CompleteClass */
    override def validate(content: String): js.Array[IJSONSchemaError] = js.native
    
    /* private */ /* CompleteClass */
    var validateInternal: Any = js.native
  }
  
  trait IJSONSchemaError extends StObject {
    
    var entry: Any
    
    var isWarning: Boolean
    
    var params: Any
    
    var path: String
    
    var range: RangeObject
  }
  object IJSONSchemaError {
    
    inline def apply(entry: Any, isWarning: Boolean, params: Any, path: String, range: RangeObject): IJSONSchemaError = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], isWarning = isWarning.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJSONSchemaError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJSONSchemaError] (val x: Self) extends AnyVal {
      
      inline def setEntry(value: Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRange(value: RangeObject): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONSchemaError
    extends StObject
       with IJSONSchemaError
  object JSONSchemaError {
    
    inline def apply(entry: Any, isWarning: Boolean, params: Any, path: String, range: RangeObject): JSONSchemaError = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], isWarning = isWarning.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONSchemaError]
    }
  }
  
  trait JSONSchemaObjectValidator extends StObject {
    
    def validate(content: String): js.Array[IJSONSchemaError]
  }
  object JSONSchemaObjectValidator {
    
    inline def apply(validate: String => js.Array[IJSONSchemaError]): JSONSchemaObjectValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[JSONSchemaObjectValidator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONSchemaObjectValidator] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: String => js.Array[IJSONSchemaError]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  trait RecursiveValidator
    extends StObject
       with JSONSchemaObjectValidator {
    
    /* protected */ def createError(entry: Any, params: Any, rootObj: Any, jsonPath: String, isWarning: Boolean): JSONSchemaError
    
    /* protected */ def doValidate(obj: Any, rootObj: Any, jsonPath: String): js.Array[JSONSchemaError]
    
    /* private */ var validateInternal: Any
  }
  object RecursiveValidator {
    
    inline def apply(
      createError: (Any, Any, Any, String, Boolean) => JSONSchemaError,
      doValidate: (Any, Any, String) => js.Array[JSONSchemaError],
      validate: String => js.Array[IJSONSchemaError],
      validateInternal: Any
    ): RecursiveValidator = {
      val __obj = js.Dynamic.literal(createError = js.Any.fromFunction5(createError), doValidate = js.Any.fromFunction3(doValidate), validate = js.Any.fromFunction1(validate), validateInternal = validateInternal.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecursiveValidator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecursiveValidator] (val x: Self) extends AnyVal {
      
      inline def setCreateError(value: (Any, Any, Any, String, Boolean) => JSONSchemaError): Self = StObject.set(x, "createError", js.Any.fromFunction5(value))
      
      inline def setDoValidate(value: (Any, Any, String) => js.Array[JSONSchemaError]): Self = StObject.set(x, "doValidate", js.Any.fromFunction3(value))
      
      inline def setValidateInternal(value: Any): Self = StObject.set(x, "validateInternal", value.asInstanceOf[js.Any])
    }
  }
}
