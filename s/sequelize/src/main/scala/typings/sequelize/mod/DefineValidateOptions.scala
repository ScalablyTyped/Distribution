package typings.sequelize.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sequelize.anon.Args
import typings.sequelize.anon.ArgsBoolean
import typings.sequelize.anon.ArgsMsg
import typings.sequelize.anon.ArgsMsgString
import typings.sequelize.anon.ArgsNumber
import typings.sequelize.anon.ArgsString
import typings.sequelize.anon.MsgString
import typings.sequelize.anon.`0`
import typings.sequelize.sequelizeNumbers.`3`
import typings.sequelize.sequelizeNumbers.`4`
import typings.sequelize.sequelizeNumbers.`5`
import typings.sequelize.sequelizeStrings.all
import typings.std.RegExp
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
/* name */ StringDictionary[js.Any] {
  /**
    * force specific substrings
    */
  var contains: js.UndefOr[String | MsgString] = js.undefined
  /**
    * only allow a specific value
    */
  @JSName("equals")
  var equals_FDefineValidateOptions: js.UndefOr[String | MsgString] = js.undefined
  /**
    * is: ["^[a-z]+$",'i'] // will only allow letters
    * is: /^[a-z]+$/i      // same as the previous example using real RegExp
    */
  var is: js.UndefOr[String | (js.Array[String | RegExp]) | RegExp | Args] = js.undefined
  /**
    * only allow date strings after a specific date
    */
  var isAfter: js.UndefOr[String | ArgsString] = js.undefined
  /**
    * will only allow letters
    */
  var isAlpha: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * will only allow alphanumeric characters, so "_abc" will fail
    */
  var isAlphanumeric: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * only allow arrays
    */
  var isArray: js.UndefOr[Boolean | ArgsBoolean] = js.undefined
  /**
    * only allow date strings before a specific date
    */
  var isBefore: js.UndefOr[String | ArgsString] = js.undefined
  /**
    * check for valid credit card numbers
    */
  var isCreditCard: js.UndefOr[Boolean | ArgsBoolean] = js.undefined
  /**
    * only allow date strings
    */
  var isDate: js.UndefOr[Boolean | ArgsBoolean] = js.undefined
  /**
    * checks for any numbers
    */
  var isDecimal: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * checks for email format (foo@bar.com)
    */
  var isEmail: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * checks for valid floating point numbers
    */
  var isFloat: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * checks for IPv4 (129.89.23.1) or IPv6 format
    */
  var isIP: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * checks for IPv4 (129.89.23.1)
    */
  var isIPv4: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * checks for IPv6 format
    */
  var isIPv6: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * check the value is one of these
    */
  var isIn: js.UndefOr[js.Array[js.Array[String]] | ArgsMsg] = js.undefined
  /**
    * checks for valid integers
    */
  var isInt: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * checks for lowercase
    */
  var isLowercase: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * only allows null
    */
  var isNull: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * will only allow numbers
    */
  var isNumeric: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * only allow uuids
    */
  var isUUID: js.UndefOr[
    `3` | `4` | `5` | typings.sequelize.sequelizeStrings.`3` | typings.sequelize.sequelizeStrings.`4` | typings.sequelize.sequelizeStrings.`5` | all | ArgsNumber
  ] = js.undefined
  /**
    * checks for uppercase
    */
  var isUppercase: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * checks for url format (http://foo.com)
    */
  var isUrl: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * only allow values with length between 2 and 10
    */
  var len: js.UndefOr[(js.Tuple2[Double, Double]) | `0`] = js.undefined
  /**
    * only allow values
    */
  var max: js.UndefOr[Double | ArgsNumber] = js.undefined
  /**
    * only allow values >= 23
    */
  var min: js.UndefOr[Double | ArgsNumber] = js.undefined
  /**
    * not: ["[a-z]",'i']  // will not allow letters
    */
  var not: js.UndefOr[String | (js.Array[String | RegExp]) | RegExp | Args] = js.undefined
  /**
    * don't allow specific substrings
    */
  var notContains: js.UndefOr[js.Array[String] | String | ArgsMsgString] = js.undefined
  /**
    * don't allow empty strings
    */
  var notEmpty: js.UndefOr[Boolean | MsgString] = js.undefined
  /**
    * check the value is not one of these
    */
  var notIn: js.UndefOr[js.Array[js.Array[String]] | ArgsMsg] = js.undefined
  /**
    * won't allow null
    */
  var notNull: js.UndefOr[Boolean | MsgString] = js.undefined
}

object DefineValidateOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    contains: String | MsgString = null,
    equals: String | MsgString = null,
    is: String | (js.Array[String | RegExp]) | RegExp | Args = null,
    isAfter: String | ArgsString = null,
    isAlpha: Boolean | MsgString = null,
    isAlphanumeric: Boolean | MsgString = null,
    isArray: Boolean | ArgsBoolean = null,
    isBefore: String | ArgsString = null,
    isCreditCard: Boolean | ArgsBoolean = null,
    isDate: Boolean | ArgsBoolean = null,
    isDecimal: Boolean | MsgString = null,
    isEmail: Boolean | MsgString = null,
    isFloat: Boolean | MsgString = null,
    isIP: Boolean | MsgString = null,
    isIPv4: Boolean | MsgString = null,
    isIPv6: Boolean | MsgString = null,
    isIn: js.Array[js.Array[String]] | ArgsMsg = null,
    isInt: Boolean | MsgString = null,
    isLowercase: Boolean | MsgString = null,
    isNull: Boolean | MsgString = null,
    isNumeric: Boolean | MsgString = null,
    isUUID: `3` | `4` | `5` | typings.sequelize.sequelizeStrings.`3` | typings.sequelize.sequelizeStrings.`4` | typings.sequelize.sequelizeStrings.`5` | all | ArgsNumber = null,
    isUppercase: Boolean | MsgString = null,
    isUrl: Boolean | MsgString = null,
    len: (js.Tuple2[Double, Double]) | `0` = null,
    max: Double | ArgsNumber = null,
    min: Double | ArgsNumber = null,
    not: String | (js.Array[String | RegExp]) | RegExp | Args = null,
    notContains: js.Array[String] | String | ArgsMsgString = null,
    notEmpty: Boolean | MsgString = null,
    notIn: js.Array[js.Array[String]] | ArgsMsg = null,
    notNull: Boolean | MsgString = null
  ): DefineValidateOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
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

