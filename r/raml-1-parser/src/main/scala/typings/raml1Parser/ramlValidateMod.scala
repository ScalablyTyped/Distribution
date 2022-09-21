package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ramlValidateMod {
  
  @JSImport("raml-1-parser/dist/util/raml-validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validate(): Validate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")().asInstanceOf[Validate_]
  
  type CheckFunction = js.Function3[
    /* check */ Any, 
    /* key */ js.UndefOr[String], 
    /* src */ js.UndefOr[ParameterValueMap], 
    Boolean
  ]
  
  type ParameterValueMap = StringDictionary[Any]
  
  type RuleFunction = js.Function2[/* rule */ Any, /* key */ String, CheckFunction]
  
  type RulesObject = StringDictionary[RuleFunction]
  
  type TypesObject = StringDictionary[CheckFunction]
  
  @js.native
  trait Validate_ extends StObject {
    
    def apply(
      parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Raml08Parser.NamedParameterMap */ Any
    ): js.Function1[/* check */ ParameterValueMap, ValidationsResult] = js.native
    
    var RULES: RulesObject = js.native
    
    var TYPES: TypesObject = js.native
    
    def rule(
      parameter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Raml08Parser.NamedParameter */ Any
    ): ValidationFunction = js.native
  }
  
  type ValidationFunction = js.Function3[/* check */ Any, /* key */ String, /* src */ ParameterValueMap, ValidationResult]
  
  trait ValidationResult extends StObject {
    
    var attr: Any
    
    var key: String
    
    var rule: String
    
    var valid: Boolean
    
    var value: Any
  }
  object ValidationResult {
    
    inline def apply(attr: Any, key: String, rule: String, valid: Boolean, value: Any): ValidationResult = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResult]
    }
    
    extension [Self <: ValidationResult](x: Self) {
      
      inline def setAttr(value: Any): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationsResult extends StObject {
    
    var errors: js.Array[ValidationResult]
    
    var valid: Boolean
  }
  object ValidationsResult {
    
    inline def apply(errors: js.Array[ValidationResult], valid: Boolean): ValidationsResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationsResult]
    }
    
    extension [Self <: ValidationsResult](x: Self) {
      
      inline def setErrors(value: js.Array[ValidationResult]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ValidationResult*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
