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
  implicit class DefineValidateOptionsOps[Self <: DefineValidateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContains(value: String | MsgString): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setEquals(value: String | MsgString): Self = this.set("equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setIsVarargs(value: (String | RegExp)*): Self = this.set("is", js.Array(value :_*))
    
    @scala.inline
    def setIs(value: String | (js.Array[String | RegExp]) | RegExp | Args): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setIsAfter(value: String | ArgsString): Self = this.set("isAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAfter: Self = this.set("isAfter", js.undefined)
    
    @scala.inline
    def setIsAlpha(value: Boolean | MsgString): Self = this.set("isAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlpha: Self = this.set("isAlpha", js.undefined)
    
    @scala.inline
    def setIsAlphanumeric(value: Boolean | MsgString): Self = this.set("isAlphanumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlphanumeric: Self = this.set("isAlphanumeric", js.undefined)
    
    @scala.inline
    def setIsArray(value: Boolean | ArgsBoolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArray: Self = this.set("isArray", js.undefined)
    
    @scala.inline
    def setIsBefore(value: String | ArgsString): Self = this.set("isBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBefore: Self = this.set("isBefore", js.undefined)
    
    @scala.inline
    def setIsCreditCard(value: Boolean | ArgsBoolean): Self = this.set("isCreditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCreditCard: Self = this.set("isCreditCard", js.undefined)
    
    @scala.inline
    def setIsDate(value: Boolean | ArgsBoolean): Self = this.set("isDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDate: Self = this.set("isDate", js.undefined)
    
    @scala.inline
    def setIsDecimal(value: Boolean | MsgString): Self = this.set("isDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDecimal: Self = this.set("isDecimal", js.undefined)
    
    @scala.inline
    def setIsEmail(value: Boolean | MsgString): Self = this.set("isEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEmail: Self = this.set("isEmail", js.undefined)
    
    @scala.inline
    def setIsFloat(value: Boolean | MsgString): Self = this.set("isFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFloat: Self = this.set("isFloat", js.undefined)
    
    @scala.inline
    def setIsIP(value: Boolean | MsgString): Self = this.set("isIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIP: Self = this.set("isIP", js.undefined)
    
    @scala.inline
    def setIsIPv4(value: Boolean | MsgString): Self = this.set("isIPv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIPv4: Self = this.set("isIPv4", js.undefined)
    
    @scala.inline
    def setIsIPv6(value: Boolean | MsgString): Self = this.set("isIPv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIPv6: Self = this.set("isIPv6", js.undefined)
    
    @scala.inline
    def setIsInVarargs(value: js.Array[String]*): Self = this.set("isIn", js.Array(value :_*))
    
    @scala.inline
    def setIsIn(value: js.Array[js.Array[String]] | ArgsMsg): Self = this.set("isIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIn: Self = this.set("isIn", js.undefined)
    
    @scala.inline
    def setIsInt(value: Boolean | MsgString): Self = this.set("isInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInt: Self = this.set("isInt", js.undefined)
    
    @scala.inline
    def setIsLowercase(value: Boolean | MsgString): Self = this.set("isLowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLowercase: Self = this.set("isLowercase", js.undefined)
    
    @scala.inline
    def setIsNull(value: Boolean | MsgString): Self = this.set("isNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNull: Self = this.set("isNull", js.undefined)
    
    @scala.inline
    def setIsNumeric(value: Boolean | MsgString): Self = this.set("isNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNumeric: Self = this.set("isNumeric", js.undefined)
    
    @scala.inline
    def setIsUUID(
      value: `3` | `4` | `5` | typings.sequelize.sequelizeStrings.`3` | typings.sequelize.sequelizeStrings.`4` | typings.sequelize.sequelizeStrings.`5` | all | ArgsNumber
    ): Self = this.set("isUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUUID: Self = this.set("isUUID", js.undefined)
    
    @scala.inline
    def setIsUppercase(value: Boolean | MsgString): Self = this.set("isUppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUppercase: Self = this.set("isUppercase", js.undefined)
    
    @scala.inline
    def setIsUrl(value: Boolean | MsgString): Self = this.set("isUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUrl: Self = this.set("isUrl", js.undefined)
    
    @scala.inline
    def setLen(value: (js.Tuple2[Double, Double]) | `1`): Self = this.set("len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLen: Self = this.set("len", js.undefined)
    
    @scala.inline
    def setMax(value: Double | ArgsNumber): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double | ArgsNumber): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNotVarargs(value: (String | RegExp)*): Self = this.set("not", js.Array(value :_*))
    
    @scala.inline
    def setNot(value: String | (js.Array[String | RegExp]) | RegExp | Args): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setNotContainsVarargs(value: String*): Self = this.set("notContains", js.Array(value :_*))
    
    @scala.inline
    def setNotContains(value: js.Array[String] | String | ArgsMsgString): Self = this.set("notContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotContains: Self = this.set("notContains", js.undefined)
    
    @scala.inline
    def setNotEmpty(value: Boolean | MsgString): Self = this.set("notEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotEmpty: Self = this.set("notEmpty", js.undefined)
    
    @scala.inline
    def setNotInVarargs(value: js.Array[String]*): Self = this.set("notIn", js.Array(value :_*))
    
    @scala.inline
    def setNotIn(value: js.Array[js.Array[String]] | ArgsMsg): Self = this.set("notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotIn: Self = this.set("notIn", js.undefined)
    
    @scala.inline
    def setNotNull(value: Boolean | MsgString): Self = this.set("notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotNull: Self = this.set("notNull", js.undefined)
  }
}
