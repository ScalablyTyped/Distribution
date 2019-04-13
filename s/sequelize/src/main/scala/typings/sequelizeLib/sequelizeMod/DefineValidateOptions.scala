package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Model validations, allow you to specify format/content/inheritance validations for each attribute of the
  * model.
  *
  * Validations are automatically run on create, update and save. You can also call validate() to manually
  * validate an instance.
  *
  * The validations are implemented by validator.js.
  */
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
/* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * force specific substrings
    */
  var contains: js.UndefOr[java.lang.String | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * only allow a specific value
    */
  @JSName("equals")
  var equals_FDefineValidateOptions: js.UndefOr[java.lang.String | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * is: ["^[a-z]+$",'i'] // will only allow letters
    * is: /^[a-z]+$/i      // same as the previous example using real RegExp
    */
  var is: js.UndefOr[
    java.lang.String | (js.Array[java.lang.String | stdLib.RegExp]) | stdLib.RegExp | sequelizeLib.Anon_Args
  ] = js.undefined
  /**
    * only allow date strings after a specific date
    */
  var isAfter: js.UndefOr[java.lang.String | sequelizeLib.Anon_ArgsMsgString] = js.undefined
  /**
    * will only allow letters
    */
  var isAlpha: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * will only allow alphanumeric characters, so "_abc" will fail
    */
  var isAlphanumeric: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * only allow arrays
    */
  var isArray: js.UndefOr[scala.Boolean | sequelizeLib.Anon_ArgsMsgBoolean] = js.undefined
  /**
    * only allow date strings before a specific date
    */
  var isBefore: js.UndefOr[java.lang.String | sequelizeLib.Anon_ArgsMsgString] = js.undefined
  /**
    * check for valid credit card numbers
    */
  var isCreditCard: js.UndefOr[scala.Boolean | sequelizeLib.Anon_ArgsMsgBoolean] = js.undefined
  /**
    * only allow date strings
    */
  var isDate: js.UndefOr[scala.Boolean | sequelizeLib.Anon_ArgsMsgBoolean] = js.undefined
  /**
    * checks for any numbers
    */
  var isDecimal: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * checks for email format (foo@bar.com)
    */
  var isEmail: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * checks for valid floating point numbers
    */
  var isFloat: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * checks for IPv4 (129.89.23.1) or IPv6 format
    */
  var isIP: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * checks for IPv4 (129.89.23.1)
    */
  var isIPv4: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * checks for IPv6 format
    */
  var isIPv6: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * check the value is one of these
    */
  var isIn: js.UndefOr[js.Array[js.Array[java.lang.String]] | sequelizeLib.Anon_ArgsMsg] = js.undefined
  /**
    * checks for valid integers
    */
  var isInt: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * checks for lowercase
    */
  var isLowercase: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * only allows null
    */
  var isNull: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * will only allow numbers
    */
  var isNumeric: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * only allow uuids
    */
  var isUUID: js.UndefOr[
    sequelizeLib.sequelizeLibNumbers.`3` | sequelizeLib.sequelizeLibNumbers.`4` | sequelizeLib.sequelizeLibNumbers.`5` | sequelizeLib.sequelizeLibStrings.`3` | sequelizeLib.sequelizeLibStrings.`4` | sequelizeLib.sequelizeLibStrings.`5` | sequelizeLib.sequelizeLibStrings.all | sequelizeLib.Anon_ArgsMsgNumberString
  ] = js.undefined
  /**
    * checks for uppercase
    */
  var isUppercase: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * checks for url format (http://foo.com)
    */
  var isUrl: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * only allow values with length between 2 and 10
    */
  var len: js.UndefOr[(js.Tuple2[scala.Double, scala.Double]) | sequelizeLib.Anon_ArgsMsgNumber] = js.undefined
  /**
    * only allow values
    */
  var max: js.UndefOr[scala.Double | sequelizeLib.Anon_ArgsMsgNumberString] = js.undefined
  /**
    * only allow values >= 23
    */
  var min: js.UndefOr[scala.Double | sequelizeLib.Anon_ArgsMsgNumberString] = js.undefined
  /**
    * not: ["[a-z]",'i']  // will not allow letters
    */
  var not: js.UndefOr[
    java.lang.String | (js.Array[java.lang.String | stdLib.RegExp]) | stdLib.RegExp | sequelizeLib.Anon_Args
  ] = js.undefined
  /**
    * don't allow specific substrings
    */
  var notContains: js.UndefOr[js.Array[java.lang.String] | java.lang.String | sequelizeLib.Anon_ArgsMsgArray] = js.undefined
  /**
    * don't allow empty strings
    */
  var notEmpty: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * check the value is not one of these
    */
  var notIn: js.UndefOr[js.Array[js.Array[java.lang.String]] | sequelizeLib.Anon_ArgsMsg] = js.undefined
  /**
    * won't allow null
    */
  var notNull: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
}

object DefineValidateOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
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
  /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    contains: java.lang.String | sequelizeLib.Anon_MsgString = null,
    equals: java.lang.String | sequelizeLib.Anon_MsgString = null,
    is: java.lang.String | (js.Array[java.lang.String | stdLib.RegExp]) | stdLib.RegExp | sequelizeLib.Anon_Args = null,
    isAfter: java.lang.String | sequelizeLib.Anon_ArgsMsgString = null,
    isAlpha: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isAlphanumeric: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isArray: scala.Boolean | sequelizeLib.Anon_ArgsMsgBoolean = null,
    isBefore: java.lang.String | sequelizeLib.Anon_ArgsMsgString = null,
    isCreditCard: scala.Boolean | sequelizeLib.Anon_ArgsMsgBoolean = null,
    isDate: scala.Boolean | sequelizeLib.Anon_ArgsMsgBoolean = null,
    isDecimal: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isEmail: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isFloat: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isIP: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isIPv4: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isIPv6: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isIn: js.Array[js.Array[java.lang.String]] | sequelizeLib.Anon_ArgsMsg = null,
    isInt: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isLowercase: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isNull: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isNumeric: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isUUID: sequelizeLib.sequelizeLibNumbers.`3` | sequelizeLib.sequelizeLibNumbers.`4` | sequelizeLib.sequelizeLibNumbers.`5` | sequelizeLib.sequelizeLibStrings.`3` | sequelizeLib.sequelizeLibStrings.`4` | sequelizeLib.sequelizeLibStrings.`5` | sequelizeLib.sequelizeLibStrings.all | sequelizeLib.Anon_ArgsMsgNumberString = null,
    isUppercase: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    isUrl: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    len: (js.Tuple2[scala.Double, scala.Double]) | sequelizeLib.Anon_ArgsMsgNumber = null,
    max: scala.Double | sequelizeLib.Anon_ArgsMsgNumberString = null,
    min: scala.Double | sequelizeLib.Anon_ArgsMsgNumberString = null,
    not: java.lang.String | (js.Array[java.lang.String | stdLib.RegExp]) | stdLib.RegExp | sequelizeLib.Anon_Args = null,
    notContains: js.Array[java.lang.String] | java.lang.String | sequelizeLib.Anon_ArgsMsgArray = null,
    notEmpty: scala.Boolean | sequelizeLib.Anon_MsgString = null,
    notIn: js.Array[js.Array[java.lang.String]] | sequelizeLib.Anon_ArgsMsg = null,
    notNull: scala.Boolean | sequelizeLib.Anon_MsgString = null
  ): DefineValidateOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(equals.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (isAfter != null) __obj.updateDynamic("isAfter")(isAfter.asInstanceOf[js.Any])
    if (isAlpha != null) __obj.updateDynamic("isAlpha")(isAlpha.asInstanceOf[js.Any])
    if (isAlphanumeric != null) __obj.updateDynamic("isAlphanumeric")(isAlphanumeric.asInstanceOf[js.Any])
    if (isArray != null) __obj.updateDynamic("isArray")(isArray.asInstanceOf[js.Any])
    if (isBefore != null) __obj.updateDynamic("isBefore")(isBefore.asInstanceOf[js.Any])
    if (isCreditCard != null) __obj.updateDynamic("isCreditCard")(isCreditCard.asInstanceOf[js.Any])
    if (isDate != null) __obj.updateDynamic("isDate")(isDate.asInstanceOf[js.Any])
    if (isDecimal != null) __obj.updateDynamic("isDecimal")(isDecimal.asInstanceOf[js.Any])
    if (isEmail != null) __obj.updateDynamic("isEmail")(isEmail.asInstanceOf[js.Any])
    if (isFloat != null) __obj.updateDynamic("isFloat")(isFloat.asInstanceOf[js.Any])
    if (isIP != null) __obj.updateDynamic("isIP")(isIP.asInstanceOf[js.Any])
    if (isIPv4 != null) __obj.updateDynamic("isIPv4")(isIPv4.asInstanceOf[js.Any])
    if (isIPv6 != null) __obj.updateDynamic("isIPv6")(isIPv6.asInstanceOf[js.Any])
    if (isIn != null) __obj.updateDynamic("isIn")(isIn.asInstanceOf[js.Any])
    if (isInt != null) __obj.updateDynamic("isInt")(isInt.asInstanceOf[js.Any])
    if (isLowercase != null) __obj.updateDynamic("isLowercase")(isLowercase.asInstanceOf[js.Any])
    if (isNull != null) __obj.updateDynamic("isNull")(isNull.asInstanceOf[js.Any])
    if (isNumeric != null) __obj.updateDynamic("isNumeric")(isNumeric.asInstanceOf[js.Any])
    if (isUUID != null) __obj.updateDynamic("isUUID")(isUUID.asInstanceOf[js.Any])
    if (isUppercase != null) __obj.updateDynamic("isUppercase")(isUppercase.asInstanceOf[js.Any])
    if (isUrl != null) __obj.updateDynamic("isUrl")(isUrl.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (notContains != null) __obj.updateDynamic("notContains")(notContains.asInstanceOf[js.Any])
    if (notEmpty != null) __obj.updateDynamic("notEmpty")(notEmpty.asInstanceOf[js.Any])
    if (notIn != null) __obj.updateDynamic("notIn")(notIn.asInstanceOf[js.Any])
    if (notNull != null) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineValidateOptions]
  }
}

