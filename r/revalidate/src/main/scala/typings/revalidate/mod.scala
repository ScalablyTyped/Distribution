package typings.revalidate

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("revalidate", "combineValidators")
  @js.native
  def combineValidators(validators: js.Any): ConfiguredCombinedValidator = js.native
  @JSImport("revalidate", "combineValidators")
  @js.native
  def combineValidators(validators: js.Any, options: CombineValidatorsOptions): ConfiguredCombinedValidator = js.native
  
  @JSImport("revalidate", "composeValidators")
  @js.native
  def composeValidators(firstValidator: js.Any, validators: Validator*): ComposedCurryableValidator = js.native
  @JSImport("revalidate", "composeValidators")
  @js.native
  def composeValidators(firstValidator: Validator, validators: Validator*): ComposedCurryableValidator = js.native
  
  @JSImport("revalidate", "createValidator")
  @js.native
  def createValidator(curriedDefinition: ValidatorImpl): ConfigurableValidator = js.native
  @JSImport("revalidate", "createValidator")
  @js.native
  def createValidator(curriedDefinition: ValidatorImpl, defaultMessageCreator: MessageCreator): ConfigurableValidator = js.native
  
  @JSImport("revalidate", "hasLengthBetween")
  @js.native
  def hasLengthBetween(min: Double, max: Double): ConfigurableValidator = js.native
  
  @JSImport("revalidate", "hasLengthGreaterThan")
  @js.native
  def hasLengthGreaterThan(min: Double): ConfigurableValidator = js.native
  
  @JSImport("revalidate", "hasLengthLessThan")
  @js.native
  def hasLengthLessThan(max: Double): ConfigurableValidator = js.native
  
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: js.UndefOr[scala.Nothing], value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: js.UndefOr[scala.Nothing], value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: String): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: String, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: Config): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: Config, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphaNumeric")
  @js.native
  def isAlphaNumeric(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: js.UndefOr[scala.Nothing], value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: js.UndefOr[scala.Nothing], value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: String): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: String, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: Config): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: Config, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isAlphabetic")
  @js.native
  def isAlphabetic(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: js.UndefOr[scala.Nothing], value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: js.UndefOr[scala.Nothing], value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: String): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: String, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: Config): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: Config, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isNumeric")
  @js.native
  def isNumeric(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: js.UndefOr[scala.Nothing], value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: js.UndefOr[scala.Nothing], value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: String): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: String, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: Config): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: Config, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isOneOf")
  @js.native
  def isOneOf(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: js.UndefOr[scala.Nothing], value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: js.UndefOr[scala.Nothing], value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: String): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: String, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: Config): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: Config, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequired")
  @js.native
  def isRequired(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: js.UndefOr[scala.Nothing], value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: js.UndefOr[scala.Nothing], value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: String): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: String, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: String, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: Config): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: Config, value: js.UndefOr[scala.Nothing], allValues: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: Config, value: js.Any): ConfiguredValidator | js.Any = js.native
  @JSImport("revalidate", "isRequiredIf")
  @js.native
  def isRequiredIf(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = js.native
  
  @JSImport("revalidate", "matchesField")
  @js.native
  def matchesField(otherField: String, otherFieldLabel: String): ConfigurableValidator = js.native
  
  @JSImport("revalidate", "matchesPattern")
  @js.native
  def matchesPattern(regex: RegExp): ConfigurableValidator = js.native
  
  @js.native
  trait CombineValidatorsOptions extends StObject {
    
    var serializeValues: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.native
  }
  object CombineValidatorsOptions {
    
    @scala.inline
    def apply(): CombineValidatorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CombineValidatorsOptions]
    }
    
    @scala.inline
    implicit class CombineValidatorsOptionsMutableBuilder[Self <: CombineValidatorsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSerializeValues(value: /* values */ js.Any => _): Self = StObject.set(x, "serializeValues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeValuesUndefined: Self = StObject.set(x, "serializeValues", js.undefined)
    }
  }
  
  type Comparer = js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  
  type ComposeConfig = Config with Multiple
  
  type ComposedCurryableValidator = js.Function1[/* config */ js.UndefOr[String | ComposeConfig], ConfiguredValidator]
  
  @js.native
  trait Config extends StObject {
    
    var field: js.UndefOr[js.Any] = js.native
    
    var message: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: js.Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  type ConfigurableValidator = UnconfiguredValidator with CurryableValidator
  
  type ConfiguredCombinedValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  
  type ConfiguredValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  
  type CurryableValidator = js.Function1[/* config */ js.UndefOr[String | Config], ConfiguredValidator]
  
  type MessageCreator = (js.Function1[/* field */ js.Any, js.Any]) | String
  
  @js.native
  trait Multiple extends StObject {
    
    var multiple: js.UndefOr[Boolean] = js.native
  }
  object Multiple {
    
    @scala.inline
    def apply(): Multiple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multiple]
    }
    
    @scala.inline
    implicit class MultipleMutableBuilder[Self <: Multiple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  @js.native
  trait ParsedField extends StObject {
    
    var baseName: String = js.native
    
    var fullName: String = js.native
    
    var isArray: Boolean = js.native
  }
  object ParsedField {
    
    @scala.inline
    def apply(baseName: String, fullName: String, isArray: Boolean): ParsedField = {
      val __obj = js.Dynamic.literal(baseName = baseName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedField]
    }
    
    @scala.inline
    implicit class ParsedFieldMutableBuilder[Self <: ParsedField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseName(value: String): Self = StObject.set(x, "baseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    }
  }
  
  type UnconfiguredValidator = js.Function3[
    /* config */ js.UndefOr[String | Config], 
    /* value */ js.UndefOr[js.Any], 
    /* allValues */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  type Validator = ConfiguredValidator with UnconfiguredValidator
  
  type ValidatorImpl = js.Function1[
    /* message */ js.Any, 
    js.Function2[/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], js.Any]
  ]
}
