package typings.revalidate

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("revalidate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def combineValidators(validators: js.Any): ConfiguredCombinedValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("combineValidators")(validators.asInstanceOf[js.Any]).asInstanceOf[ConfiguredCombinedValidator]
  @scala.inline
  def combineValidators(validators: js.Any, options: CombineValidatorsOptions): ConfiguredCombinedValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("combineValidators")(validators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConfiguredCombinedValidator]
  
  @scala.inline
  def composeValidators(firstValidator: js.Any, validators: Validator*): ComposedCurryableValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("composeValidators")(firstValidator.asInstanceOf[js.Any], validators.asInstanceOf[js.Any])).asInstanceOf[ComposedCurryableValidator]
  @scala.inline
  def composeValidators(firstValidator: Validator, validators: Validator*): ComposedCurryableValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("composeValidators")(firstValidator.asInstanceOf[js.Any], validators.asInstanceOf[js.Any])).asInstanceOf[ComposedCurryableValidator]
  
  @scala.inline
  def createValidator(curriedDefinition: ValidatorImpl): ConfigurableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("createValidator")(curriedDefinition.asInstanceOf[js.Any]).asInstanceOf[ConfigurableValidator]
  @scala.inline
  def createValidator(curriedDefinition: ValidatorImpl, defaultMessageCreator: MessageCreator): ConfigurableValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidator")(curriedDefinition.asInstanceOf[js.Any], defaultMessageCreator.asInstanceOf[js.Any])).asInstanceOf[ConfigurableValidator]
  
  @scala.inline
  def hasLengthBetween(min: Double, max: Double): ConfigurableValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLengthBetween")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ConfigurableValidator]
  
  @scala.inline
  def hasLengthGreaterThan(min: Double): ConfigurableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("hasLengthGreaterThan")(min.asInstanceOf[js.Any]).asInstanceOf[ConfigurableValidator]
  
  @scala.inline
  def hasLengthLessThan(max: Double): ConfigurableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("hasLengthLessThan")(max.asInstanceOf[js.Any]).asInstanceOf[ConfigurableValidator]
  
  @scala.inline
  def isAlphaNumeric(): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")().asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: String): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: String, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: String, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: Unit, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: Unit, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: Unit, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: Config): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: Config, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphaNumeric(config: Config, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  
  @scala.inline
  def isAlphabetic(): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")().asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: String): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: String, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: String, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: Unit, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: Unit, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: Unit, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: Config): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: Config, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isAlphabetic(config: Config, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  
  @scala.inline
  def isNumeric(): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")().asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: String): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: String, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: String, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: Unit, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: Unit, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: Unit, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: Config): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: Config, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isNumeric(config: Config, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  
  @scala.inline
  def isOneOf(): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")().asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: String): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: String, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: String, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: Unit, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: Unit, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: Unit, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: Config): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: Config, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isOneOf(config: Config, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  
  @scala.inline
  def isRequired(): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")().asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: String): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: String, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: String, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: Unit, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: Unit, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: Unit, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: Config): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: Config, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequired(config: Config, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  
  @scala.inline
  def isRequiredIf(): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")().asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: String): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: String, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: String, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: String, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: Unit, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: Unit, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: Unit, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: Config): ConfiguredValidator | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: Config, value: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: Config, value: js.Any, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  @scala.inline
  def isRequiredIf(config: Config, value: Unit, allValues: js.Any): ConfiguredValidator | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | js.Any]
  
  @scala.inline
  def matchesField(otherField: String, otherFieldLabel: String): ConfigurableValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesField")(otherField.asInstanceOf[js.Any], otherFieldLabel.asInstanceOf[js.Any])).asInstanceOf[ConfigurableValidator]
  
  @scala.inline
  def matchesPattern(regex: RegExp): ConfigurableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(regex.asInstanceOf[js.Any]).asInstanceOf[ConfigurableValidator]
  
  trait CombineValidatorsOptions extends StObject {
    
    var serializeValues: js.UndefOr[js.Function1[/* values */ js.Any, js.Any]] = js.undefined
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
      def setSerializeValues(value: /* values */ js.Any => js.Any): Self = StObject.set(x, "serializeValues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeValuesUndefined: Self = StObject.set(x, "serializeValues", js.undefined)
    }
  }
  
  type Comparer = js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  
  trait ComposeConfig
    extends StObject
       with Config
       with Multiple
  object ComposeConfig {
    
    @scala.inline
    def apply(): ComposeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeConfig]
    }
  }
  
  type ComposedCurryableValidator = js.Function1[/* config */ js.UndefOr[String | ComposeConfig], ConfiguredValidator]
  
  trait Config extends StObject {
    
    var field: js.UndefOr[js.Any] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
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
  
  @js.native
  trait ConfigurableValidator
    extends UnconfiguredValidator
       with CurryableValidator {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* config */ js.UndefOr[String | Config]): ConfiguredValidator = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* config */ js.UndefOr[String | Config],
      arg2: /* value */ js.UndefOr[js.Any],
      arg3: /* allValues */ js.UndefOr[js.Any]
    ): js.Any = js.native
  }
  
  type ConfiguredCombinedValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  
  type ConfiguredValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  
  type CurryableValidator = js.Function1[/* config */ js.UndefOr[String | Config], ConfiguredValidator]
  
  type MessageCreator = (js.Function1[/* field */ js.Any, js.Any]) | String
  
  trait Multiple extends StObject {
    
    var multiple: js.UndefOr[Boolean] = js.undefined
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
  
  trait ParsedField extends StObject {
    
    var baseName: String
    
    var fullName: String
    
    var isArray: Boolean
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
  
  @js.native
  trait Validator
    extends ConfiguredValidator
       with UnconfiguredValidator {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* value */ js.UndefOr[js.Any], arg2: /* allValues */ js.UndefOr[js.Any]): js.Any = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* config */ js.UndefOr[String | Config],
      arg2: /* value */ js.UndefOr[js.Any],
      arg3: /* allValues */ js.UndefOr[js.Any]
    ): js.Any = js.native
  }
  
  type ValidatorImpl = js.Function1[
    /* message */ js.Any, 
    js.Function2[/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], js.Any]
  ]
}
