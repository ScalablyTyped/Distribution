package typings.revalidate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("revalidate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineValidators(validators: Any): ConfiguredCombinedValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("combineValidators")(validators.asInstanceOf[js.Any]).asInstanceOf[ConfiguredCombinedValidator]
  inline def combineValidators(validators: Any, options: CombineValidatorsOptions): ConfiguredCombinedValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("combineValidators")(validators.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConfiguredCombinedValidator]
  
  inline def composeValidators(firstValidator: Any, validators: Validator*): ComposedCurryableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("composeValidators")(scala.List(firstValidator.asInstanceOf[js.Any]).`++`(validators.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ComposedCurryableValidator]
  inline def composeValidators(firstValidator: Validator, validators: Validator*): ComposedCurryableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("composeValidators")(scala.List(firstValidator.asInstanceOf[js.Any]).`++`(validators.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ComposedCurryableValidator]
  
  inline def createValidator(curriedDefinition: ValidatorImpl): ConfigurableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("createValidator")(curriedDefinition.asInstanceOf[js.Any]).asInstanceOf[ConfigurableValidator]
  inline def createValidator(curriedDefinition: ValidatorImpl, defaultMessageCreator: MessageCreator): ConfigurableValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidator")(curriedDefinition.asInstanceOf[js.Any], defaultMessageCreator.asInstanceOf[js.Any])).asInstanceOf[ConfigurableValidator]
  
  inline def hasLengthBetween(min: Double, max: Double): ConfigurableValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLengthBetween")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ConfigurableValidator]
  
  inline def hasLengthGreaterThan(min: Double): ConfigurableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("hasLengthGreaterThan")(min.asInstanceOf[js.Any]).asInstanceOf[ConfigurableValidator]
  
  inline def hasLengthLessThan(max: Double): ConfigurableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("hasLengthLessThan")(max.asInstanceOf[js.Any]).asInstanceOf[ConfigurableValidator]
  
  inline def isAlphaNumeric(): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")().asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: String): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: String, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: String, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: String, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: Unit, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: Unit, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: Unit, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: Config): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: Config, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: Config, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphaNumeric(config: Config, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  
  inline def isAlphabetic(): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")().asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: String): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: String, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: String, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: String, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: Unit, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: Unit, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: Unit, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: Config): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: Config, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: Config, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isAlphabetic(config: Config, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetic")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  
  inline def isNumeric(): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")().asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: String): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: String, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: String, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: String, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: Unit, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: Unit, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: Unit, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: Config): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: Config, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: Config, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isNumeric(config: Config, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  
  inline def isOneOf(): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")().asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: String): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: String, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: String, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: String, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: Unit, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: Unit, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: Unit, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: Config): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: Config, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: Config, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isOneOf(config: Config, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  
  inline def isRequired(): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")().asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: String): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: String, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: String, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: String, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: Unit, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: Unit, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: Unit, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: Config): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: Config, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: Config, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequired(config: Config, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  
  inline def isRequiredIf(): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")().asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: String): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: String, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: String, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: String, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: Unit, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: Unit, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: Unit, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: Config): ConfiguredValidator | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any]).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: Config, value: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: Config, value: Any, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  inline def isRequiredIf(config: Config, value: Unit, allValues: Any): ConfiguredValidator | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequiredIf")(config.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allValues.asInstanceOf[js.Any])).asInstanceOf[ConfiguredValidator | Any]
  
  inline def matchesField(otherField: String, otherFieldLabel: String): ConfigurableValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesField")(otherField.asInstanceOf[js.Any], otherFieldLabel.asInstanceOf[js.Any])).asInstanceOf[ConfigurableValidator]
  
  inline def matchesPattern(regex: js.RegExp): ConfigurableValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesPattern")(regex.asInstanceOf[js.Any]).asInstanceOf[ConfigurableValidator]
  
  trait CombineValidatorsOptions extends StObject {
    
    var serializeValues: js.UndefOr[js.Function1[/* values */ Any, Any]] = js.undefined
  }
  object CombineValidatorsOptions {
    
    inline def apply(): CombineValidatorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CombineValidatorsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CombineValidatorsOptions] (val x: Self) extends AnyVal {
      
      inline def setSerializeValues(value: /* values */ Any => Any): Self = StObject.set(x, "serializeValues", js.Any.fromFunction1(value))
      
      inline def setSerializeValuesUndefined: Self = StObject.set(x, "serializeValues", js.undefined)
    }
  }
  
  type Comparer = js.Function2[/* a */ Any, /* b */ Any, Boolean]
  
  trait ComposeConfig
    extends StObject
       with Config
       with Multiple
  object ComposeConfig {
    
    inline def apply(): ComposeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeConfig]
    }
  }
  
  type ComposedCurryableValidator = js.Function1[/* config */ js.UndefOr[String | ComposeConfig], ConfiguredValidator]
  
  trait Config extends StObject {
    
    var field: js.UndefOr[Any] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
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
      arg2: /* value */ js.UndefOr[Any],
      arg3: /* allValues */ js.UndefOr[Any]
    ): Any = js.native
  }
  
  type ConfiguredCombinedValidator = js.Function2[/* value */ js.UndefOr[Any], /* allValues */ js.UndefOr[Any], Any]
  
  type ConfiguredValidator = js.Function2[/* value */ js.UndefOr[Any], /* allValues */ js.UndefOr[Any], Any]
  
  type CurryableValidator = js.Function1[/* config */ js.UndefOr[String | Config], ConfiguredValidator]
  
  type MessageCreator = (js.Function1[/* field */ Any, Any]) | String
  
  trait Multiple extends StObject {
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object Multiple {
    
    inline def apply(): Multiple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multiple]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Multiple] (val x: Self) extends AnyVal {
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  trait ParsedField extends StObject {
    
    var baseName: String
    
    var fullName: String
    
    var isArray: Boolean
  }
  object ParsedField {
    
    inline def apply(baseName: String, fullName: String, isArray: Boolean): ParsedField = {
      val __obj = js.Dynamic.literal(baseName = baseName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedField] (val x: Self) extends AnyVal {
      
      inline def setBaseName(value: String): Self = StObject.set(x, "baseName", value.asInstanceOf[js.Any])
      
      inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    }
  }
  
  type UnconfiguredValidator = js.Function3[
    /* config */ js.UndefOr[String | Config], 
    /* value */ js.UndefOr[Any], 
    /* allValues */ js.UndefOr[Any], 
    Any
  ]
  
  @js.native
  trait Validator
    extends ConfiguredValidator
       with UnconfiguredValidator {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* value */ js.UndefOr[Any], arg2: /* allValues */ js.UndefOr[Any]): Any = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* config */ js.UndefOr[String | Config],
      arg2: /* value */ js.UndefOr[Any],
      arg3: /* allValues */ js.UndefOr[Any]
    ): Any = js.native
  }
  
  type ValidatorImpl = js.Function1[
    /* message */ Any, 
    js.Function2[/* value */ Any, /* allValues */ js.UndefOr[Any], Any]
  ]
}
