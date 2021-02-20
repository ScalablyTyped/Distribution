package typings.revalidator

import org.scalablytyped.runtime.StringDictionary
import typings.revalidator.revalidatorStrings.`object`
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Revalidator {
  
  /* Rewritten from type alias, can be one of: 
    - typings.revalidator.revalidatorStrings.url
    - typings.revalidator.revalidatorStrings.email
    - typings.revalidator.revalidatorStrings.`ip-address`
    - typings.revalidator.revalidatorStrings.ipv6
    - typings.revalidator.revalidatorStrings.`date-time`
    - typings.revalidator.revalidatorStrings.date
    - typings.revalidator.revalidatorStrings.time
    - typings.revalidator.revalidatorStrings.color
    - typings.revalidator.revalidatorStrings.`host-name`
    - typings.revalidator.revalidatorStrings.`utc-millisec`
    - typings.revalidator.revalidatorStrings.regex
  */
  trait Formats extends StObject
  object Formats {
    
    @scala.inline
    def color: typings.revalidator.revalidatorStrings.color = "color".asInstanceOf[typings.revalidator.revalidatorStrings.color]
    
    @scala.inline
    def date: typings.revalidator.revalidatorStrings.date = "date".asInstanceOf[typings.revalidator.revalidatorStrings.date]
    
    @scala.inline
    def `date-time`: typings.revalidator.revalidatorStrings.`date-time` = "date-time".asInstanceOf[typings.revalidator.revalidatorStrings.`date-time`]
    
    @scala.inline
    def email: typings.revalidator.revalidatorStrings.email = "email".asInstanceOf[typings.revalidator.revalidatorStrings.email]
    
    @scala.inline
    def `host-name`: typings.revalidator.revalidatorStrings.`host-name` = "host-name".asInstanceOf[typings.revalidator.revalidatorStrings.`host-name`]
    
    @scala.inline
    def `ip-address`: typings.revalidator.revalidatorStrings.`ip-address` = "ip-address".asInstanceOf[typings.revalidator.revalidatorStrings.`ip-address`]
    
    @scala.inline
    def ipv6: typings.revalidator.revalidatorStrings.ipv6 = "ipv6".asInstanceOf[typings.revalidator.revalidatorStrings.ipv6]
    
    @scala.inline
    def regex: typings.revalidator.revalidatorStrings.regex = "regex".asInstanceOf[typings.revalidator.revalidatorStrings.regex]
    
    @scala.inline
    def time: typings.revalidator.revalidatorStrings.time = "time".asInstanceOf[typings.revalidator.revalidatorStrings.time]
    
    @scala.inline
    def url: typings.revalidator.revalidatorStrings.url = "url".asInstanceOf[typings.revalidator.revalidatorStrings.url]
    
    @scala.inline
    def `utc-millisec`: typings.revalidator.revalidatorStrings.`utc-millisec` = "utc-millisec".asInstanceOf[typings.revalidator.revalidatorStrings.`utc-millisec`]
  }
  
  @js.native
  trait IErrrorProperty extends StObject {
    
    var message: String = js.native
    
    var property: String = js.native
  }
  object IErrrorProperty {
    
    @scala.inline
    def apply(message: String, property: String): IErrrorProperty = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[IErrrorProperty]
    }
    
    @scala.inline
    implicit class IErrrorPropertyMutableBuilder[Self <: IErrrorProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOptions extends StObject {
    
    /** When additionalProperties is true allow additional unvisited properties on the object. (default true) */
    var additionalProperties: js.UndefOr[Boolean] = js.native
    
    /** Enforce casting of some types (for integers/numbers are only supported) when it's possible, e.g. "42" => 42, but "forty2" => "forty2" for the integer type. */
    var cast: js.UndefOr[Boolean] = js.native
    
    /** When validateFormats is true also validate formats defined in validate.formatExtensions (default true) */
    var validateFormatExtensions: js.UndefOr[Boolean] = js.native
    
    /** Enforce format constraints (default true) */
    var validateFormats: js.UndefOr[Boolean] = js.native
    
    /** When validateFormats is true treat unrecognized formats as validation errors (default false) */
    var validateFormatsStrict: js.UndefOr[Boolean] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setCast(value: Boolean): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      @scala.inline
      def setValidateFormatExtensions(value: Boolean): Self = StObject.set(x, "validateFormatExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFormatExtensionsUndefined: Self = StObject.set(x, "validateFormatExtensions", js.undefined)
      
      @scala.inline
      def setValidateFormats(value: Boolean): Self = StObject.set(x, "validateFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFormatsStrict(value: Boolean): Self = StObject.set(x, "validateFormatsStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFormatsStrictUndefined: Self = StObject.set(x, "validateFormatsStrict", js.undefined)
      
      @scala.inline
      def setValidateFormatsUndefined: Self = StObject.set(x, "validateFormats", js.undefined)
    }
  }
  
  @js.native
  trait IReturnMessage extends StObject {
    
    var errors: js.Array[IErrrorProperty] = js.native
    
    var valid: Boolean = js.native
  }
  object IReturnMessage {
    
    @scala.inline
    def apply(errors: js.Array[IErrrorProperty], valid: Boolean): IReturnMessage = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReturnMessage]
    }
    
    @scala.inline
    implicit class IReturnMessageMutableBuilder[Self <: IReturnMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[IErrrorProperty]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: IErrrorProperty*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISchema[T] extends StObject {
    
    /**Default value */
    var default: js.UndefOr[js.Any] = js.native
    
    /**If false, the value must not be an empty string */
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    /**Value must conform to constraint denoted by expected value */
    var conform: js.UndefOr[js.Function2[/* value */ js.Any, /* data */ js.UndefOr[T], Boolean]] = js.native
    
    /**Value is valid only if the dependent value is valid */
    var dependencies: js.UndefOr[String] = js.native
    
    /**Description for this object */
    var description: js.UndefOr[String] = js.native
    
    /**Value must be divisible by expected value */
    var divisibleBy: js.UndefOr[Double] = js.native
    
    /**Value must be present in the array of expected values */
    var enum: js.UndefOr[js.Array[_]] = js.native
    
    /**Value must be lesser than expected value */
    var exclusiveMaximum: js.UndefOr[Double] = js.native
    
    /**Value must be greater than expected value */
    var exclusiveMinimum: js.UndefOr[Double] = js.native
    
    /**Value must be a valid format */
    var format: js.UndefOr[Formats] = js.native
    
    /**Property to describe items for type: 'array' */
    var items: js.UndefOr[ISchema[T] | JSONSchema[T]] = js.native
    
    /**Value must contain fewer than expected number of items */
    var maxItems: js.UndefOr[Double] = js.native
    
    /**The length of value must be greater than or equal to expected value */
    var maxLength: js.UndefOr[Double] = js.native
    
    /**Value must be lesser than or equal to the expected value */
    var maximum: js.UndefOr[Double] = js.native
    
    /**Custom messages for different constraints */
    var message: js.UndefOr[String] = js.native
    
    /**Custom messages for different constraints */
    var messages: js.UndefOr[StringDictionary[String]] = js.native
    
    /**Value must contain more than expected number of items */
    var minItems: js.UndefOr[Double] = js.native
    
    /**The length of value must be lesser than or equal to expected value */
    var minLength: js.UndefOr[Double] = js.native
    
    /**Value must be greater than or equal to the expected value */
    var minimum: js.UndefOr[Double] = js.native
    
    /**The expected value regex needs to be satisfied by the value */
    var pattern: js.UndefOr[RegExp | String] = js.native
    
    /**If true, the value should not be undefined */
    var required: js.UndefOr[Boolean] = js.native
    
    /**The type of value should be equal to the expected value */
    var `type`: Types | js.Array[Types] = js.native
    
    /**Value must hold a unique set of values */
    var uniqueItems: js.UndefOr[Boolean] = js.native
  }
  object ISchema {
    
    @scala.inline
    def apply[T](`type`: Types | js.Array[Types]): ISchema[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISchema[T]]
    }
    
    @scala.inline
    implicit class ISchemaMutableBuilder[Self <: ISchema[_], T] (val x: Self with ISchema[T]) extends AnyVal {
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setConform(value: (/* value */ js.Any, /* data */ js.UndefOr[T]) => Boolean): Self = StObject.set(x, "conform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConformUndefined: Self = StObject.set(x, "conform", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDivisibleBy(value: Double): Self = StObject.set(x, "divisibleBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisibleByUndefined: Self = StObject.set(x, "divisibleBy", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[_]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      @scala.inline
      def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      @scala.inline
      def setFormat(value: Formats): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setItems(value: ISchema[T] | JSONSchema[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setPattern(value: RegExp | String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setType(value: Types | js.Array[Types]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: Types*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  type ISchemas[T] = StringDictionary[ISchema[T] | JSONSchema[T]]
  
  @js.native
  trait JSONSchema[T] extends StObject {
    
    var patternProperties: js.UndefOr[ISchemas[T]] = js.native
    
    var properties: js.UndefOr[ISchemas[T]] = js.native
    
    var `type`: js.UndefOr[`object`] = js.native
  }
  object JSONSchema {
    
    @scala.inline
    def apply[T](): JSONSchema[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema[T]]
    }
    
    @scala.inline
    implicit class JSONSchemaMutableBuilder[Self <: JSONSchema[_], T] (val x: Self with JSONSchema[T]) extends AnyVal {
      
      @scala.inline
      def setPatternProperties(value: ISchemas[T]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setProperties(value: ISchemas[T]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RevalidatorStatic extends StObject {
    
    def validate[T](`object`: T, schema: JSONSchema[T]): IReturnMessage = js.native
    def validate[T](`object`: T, schema: JSONSchema[T], options: IOptions): IReturnMessage = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.revalidator.revalidatorStrings.string
    - typings.revalidator.revalidatorStrings.number
    - typings.revalidator.revalidatorStrings.integer
    - typings.revalidator.revalidatorStrings.array
    - typings.revalidator.revalidatorStrings.boolean
    - typings.revalidator.revalidatorStrings.`object`
    - typings.revalidator.revalidatorStrings.`null`
    - typings.revalidator.revalidatorStrings.any
  */
  trait Types extends StObject
  object Types {
    
    @scala.inline
    def any: typings.revalidator.revalidatorStrings.any = "any".asInstanceOf[typings.revalidator.revalidatorStrings.any]
    
    @scala.inline
    def array: typings.revalidator.revalidatorStrings.array = "array".asInstanceOf[typings.revalidator.revalidatorStrings.array]
    
    @scala.inline
    def boolean: typings.revalidator.revalidatorStrings.boolean = "boolean".asInstanceOf[typings.revalidator.revalidatorStrings.boolean]
    
    @scala.inline
    def integer: typings.revalidator.revalidatorStrings.integer = "integer".asInstanceOf[typings.revalidator.revalidatorStrings.integer]
    
    @scala.inline
    def `null`: typings.revalidator.revalidatorStrings.`null` = "null".asInstanceOf[typings.revalidator.revalidatorStrings.`null`]
    
    @scala.inline
    def number: typings.revalidator.revalidatorStrings.number = "number".asInstanceOf[typings.revalidator.revalidatorStrings.number]
    
    @scala.inline
    def `object`: typings.revalidator.revalidatorStrings.`object` = "object".asInstanceOf[typings.revalidator.revalidatorStrings.`object`]
    
    @scala.inline
    def string: typings.revalidator.revalidatorStrings.string = "string".asInstanceOf[typings.revalidator.revalidatorStrings.string]
  }
}
