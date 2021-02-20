package typings.sequelize.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sequelize.anon.Args
import typings.sequelize.anon.ArgsBoolean
import typings.sequelize.anon.ArgsMsg
import typings.sequelize.anon.ArgsMsgString
import typings.sequelize.anon.ArgsNumber
import typings.sequelize.anon.ArgsString
import typings.sequelize.anon.MsgString
import typings.sequelize.anon.`1`
import typings.sequelize.sequelizeNumbers.`3`
import typings.sequelize.sequelizeNumbers.`4`
import typings.sequelize.sequelizeNumbers.`5`
import typings.sequelize.sequelizeStrings.all
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Model validations, allow you to specify format/content/inheritance validations for each attribute of the
  * model.
  *
  * Validations are automatically run on create, update and save. You can also call validate() to manually
  * validate an instance.
  *
  * The validations are implemented by validator.js.
  */
@js.native
trait DefineValidateOptions
  extends /**
  * custom validations are also possible
  *
  * Implementation notes :
  *
  * We can't enforce any other method to be a function, so :
  *
  * ```typescript
  * [name: string] : ( value : any ) => boolean;
  * ```
  *
  * doesn't work in combination with the properties above
  *
  * @see https://github.com/Microsoft/TypeScript/issues/1889
  */
/* name */ StringDictionary[js.Any] {
  
  /**
    * force specific substrings
    */
  var contains: js.UndefOr[String | MsgString] = js.native
  
  /**
    * only allow a specific value
    */
  @JSName("equals")
  var equals_FDefineValidateOptions: js.UndefOr[String | MsgString] = js.native
  
  /**
    * is: ["^[a-z]+$",'i'] // will only allow letters
    * is: /^[a-z]+$/i      // same as the previous example using real RegExp
    */
  var is: js.UndefOr[String | (js.Array[String | RegExp]) | RegExp | Args] = js.native
  
  /**
    * only allow date strings after a specific date
    */
  var isAfter: js.UndefOr[String | ArgsString] = js.native
  
  /**
    * will only allow letters
    */
  var isAlpha: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * will only allow alphanumeric characters, so "_abc" will fail
    */
  var isAlphanumeric: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * only allow arrays
    */
  var isArray: js.UndefOr[Boolean | ArgsBoolean] = js.native
  
  /**
    * only allow date strings before a specific date
    */
  var isBefore: js.UndefOr[String | ArgsString] = js.native
  
  /**
    * check for valid credit card numbers
    */
  var isCreditCard: js.UndefOr[Boolean | ArgsBoolean] = js.native
  
  /**
    * only allow date strings
    */
  var isDate: js.UndefOr[Boolean | ArgsBoolean] = js.native
  
  /**
    * checks for any numbers
    */
  var isDecimal: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * checks for email format (foo@bar.com)
    */
  var isEmail: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * checks for valid floating point numbers
    */
  var isFloat: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * checks for IPv4 (129.89.23.1) or IPv6 format
    */
  var isIP: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * checks for IPv4 (129.89.23.1)
    */
  var isIPv4: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * checks for IPv6 format
    */
  var isIPv6: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * check the value is one of these
    */
  var isIn: js.UndefOr[js.Array[js.Array[String]] | ArgsMsg] = js.native
  
  /**
    * checks for valid integers
    */
  var isInt: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * checks for lowercase
    */
  var isLowercase: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * only allows null
    */
  var isNull: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * will only allow numbers
    */
  var isNumeric: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * only allow uuids
    */
  var isUUID: js.UndefOr[
    `3` | `4` | `5` | typings.sequelize.sequelizeStrings.`3` | typings.sequelize.sequelizeStrings.`4` | typings.sequelize.sequelizeStrings.`5` | all | ArgsNumber
  ] = js.native
  
  /**
    * checks for uppercase
    */
  var isUppercase: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * checks for url format (http://foo.com)
    */
  var isUrl: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * only allow values with length between 2 and 10
    */
  var len: js.UndefOr[(js.Tuple2[Double, Double]) | `1`] = js.native
  
  /**
    * only allow values
    */
  var max: js.UndefOr[Double | ArgsNumber] = js.native
  
  /**
    * only allow values >= 23
    */
  var min: js.UndefOr[Double | ArgsNumber] = js.native
  
  /**
    * not: ["[a-z]",'i']  // will not allow letters
    */
  var not: js.UndefOr[String | (js.Array[String | RegExp]) | RegExp | Args] = js.native
  
  /**
    * don't allow specific substrings
    */
  var notContains: js.UndefOr[js.Array[String] | String | ArgsMsgString] = js.native
  
  /**
    * don't allow empty strings
    */
  var notEmpty: js.UndefOr[Boolean | MsgString] = js.native
  
  /**
    * check the value is not one of these
    */
  var notIn: js.UndefOr[js.Array[js.Array[String]] | ArgsMsg] = js.native
  
  /**
    * won't allow null
    */
  var notNull: js.UndefOr[Boolean | MsgString] = js.native
}
object DefineValidateOptions {
  
  @scala.inline
  def apply(): DefineValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineValidateOptions]
  }
  
  @scala.inline
  implicit class DefineValidateOptionsMutableBuilder[Self <: DefineValidateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: String | MsgString): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setEquals_(value: String | MsgString): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    @scala.inline
    def setIs(value: String | (js.Array[String | RegExp]) | RegExp | Args): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAfter(value: String | ArgsString): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
    
    @scala.inline
    def setIsAlpha(value: Boolean | MsgString): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
    
    @scala.inline
    def setIsAlphanumeric(value: Boolean | MsgString): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
    
    @scala.inline
    def setIsArray(value: Boolean | ArgsBoolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    @scala.inline
    def setIsBefore(value: String | ArgsString): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
    
    @scala.inline
    def setIsCreditCard(value: Boolean | ArgsBoolean): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
    
    @scala.inline
    def setIsDate(value: Boolean | ArgsBoolean): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
    
    @scala.inline
    def setIsDecimal(value: Boolean | MsgString): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
    
    @scala.inline
    def setIsEmail(value: Boolean | MsgString): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
    
    @scala.inline
    def setIsFloat(value: Boolean | MsgString): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
    
    @scala.inline
    def setIsIP(value: Boolean | MsgString): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
    
    @scala.inline
    def setIsIPv4(value: Boolean | MsgString): Self = StObject.set(x, "isIPv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIPv4Undefined: Self = StObject.set(x, "isIPv4", js.undefined)
    
    @scala.inline
    def setIsIPv6(value: Boolean | MsgString): Self = StObject.set(x, "isIPv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIPv6Undefined: Self = StObject.set(x, "isIPv6", js.undefined)
    
    @scala.inline
    def setIsIn(value: js.Array[js.Array[String]] | ArgsMsg): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
    
    @scala.inline
    def setIsInVarargs(value: js.Array[String]*): Self = StObject.set(x, "isIn", js.Array(value :_*))
    
    @scala.inline
    def setIsInt(value: Boolean | MsgString): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
    
    @scala.inline
    def setIsLowercase(value: Boolean | MsgString): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
    
    @scala.inline
    def setIsNull(value: Boolean | MsgString): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullUndefined: Self = StObject.set(x, "isNull", js.undefined)
    
    @scala.inline
    def setIsNumeric(value: Boolean | MsgString): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
    
    @scala.inline
    def setIsUUID(
      value: `3` | `4` | `5` | typings.sequelize.sequelizeStrings.`3` | typings.sequelize.sequelizeStrings.`4` | typings.sequelize.sequelizeStrings.`5` | all | ArgsNumber
    ): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setIsUppercase(value: Boolean | MsgString): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
    
    @scala.inline
    def setIsUrl(value: Boolean | MsgString): Self = StObject.set(x, "isUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUrlUndefined: Self = StObject.set(x, "isUrl", js.undefined)
    
    @scala.inline
    def setIsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "is", js.Array(value :_*))
    
    @scala.inline
    def setLen(value: (js.Tuple2[Double, Double]) | `1`): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    @scala.inline
    def setMax(value: Double | ArgsNumber): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double | ArgsNumber): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setNot(value: String | (js.Array[String | RegExp]) | RegExp | Args): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotContains(value: js.Array[String] | String | ArgsMsgString): Self = StObject.set(x, "notContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotContainsUndefined: Self = StObject.set(x, "notContains", js.undefined)
    
    @scala.inline
    def setNotContainsVarargs(value: String*): Self = StObject.set(x, "notContains", js.Array(value :_*))
    
    @scala.inline
    def setNotEmpty(value: Boolean | MsgString): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
    
    @scala.inline
    def setNotIn(value: js.Array[js.Array[String]] | ArgsMsg): Self = StObject.set(x, "notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInUndefined: Self = StObject.set(x, "notIn", js.undefined)
    
    @scala.inline
    def setNotInVarargs(value: js.Array[String]*): Self = StObject.set(x, "notIn", js.Array(value :_*))
    
    @scala.inline
    def setNotNull(value: Boolean | MsgString): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setNotVarargs(value: (String | RegExp)*): Self = StObject.set(x, "not", js.Array(value :_*))
  }
}
