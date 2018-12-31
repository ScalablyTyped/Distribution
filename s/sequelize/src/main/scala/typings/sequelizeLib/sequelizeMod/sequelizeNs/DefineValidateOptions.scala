package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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
    java.lang.String | (js.Array[java.lang.String | stdLib.RegExp]) | stdLib.RegExp | sequelizeLib.Anon_MsgArgs
  ] = js.undefined
  /**
    * only allow date strings after a specific date
    */
  var isAfter: js.UndefOr[java.lang.String | sequelizeLib.Anon_MsgArgsString] = js.undefined
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
  var isArray: js.UndefOr[scala.Boolean | sequelizeLib.Anon_Msg] = js.undefined
  /**
    * only allow date strings before a specific date
    */
  var isBefore: js.UndefOr[java.lang.String | sequelizeLib.Anon_MsgArgsString] = js.undefined
  /**
    * check for valid credit card numbers
    */
  var isCreditCard: js.UndefOr[scala.Boolean | sequelizeLib.Anon_Msg] = js.undefined
  /**
    * only allow date strings
    */
  var isDate: js.UndefOr[scala.Boolean | sequelizeLib.Anon_Msg] = js.undefined
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
  var isIn: js.UndefOr[
    js.Array[js.Array[java.lang.String]] | sequelizeLib.Anon_MsgArgsStringArray_1525276583
  ] = js.undefined
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
    sequelizeLib.sequelizeLibNumbers.`3` | sequelizeLib.sequelizeLibNumbers.`4` | sequelizeLib.sequelizeLibNumbers.`5` | sequelizeLib.sequelizeLibStrings.`3` | sequelizeLib.sequelizeLibStrings.`4` | sequelizeLib.sequelizeLibStrings.`5` | sequelizeLib.sequelizeLibStrings.all | sequelizeLib.Anon_MsgArgsStringNumber
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
  var len: js.UndefOr[
    (js.Tuple2[scala.Double, scala.Double]) | sequelizeLib.Anon_MsgArgsStringNumber_2144254094
  ] = js.undefined
  /**
    * only allow values
    */
  var max: js.UndefOr[scala.Double | sequelizeLib.Anon_MsgArgsStringNumber] = js.undefined
  /**
    * only allow values >= 23
    */
  var min: js.UndefOr[scala.Double | sequelizeLib.Anon_MsgArgsStringNumber] = js.undefined
  /**
    * not: ["[a-z]",'i']  // will not allow letters
    */
  var not: js.UndefOr[
    java.lang.String | (js.Array[java.lang.String | stdLib.RegExp]) | stdLib.RegExp | sequelizeLib.Anon_MsgArgs
  ] = js.undefined
  /**
    * don't allow specific substrings
    */
  var notContains: js.UndefOr[
    js.Array[java.lang.String] | java.lang.String | sequelizeLib.Anon_MsgArgsStringArray
  ] = js.undefined
  /**
    * don't allow empty strings
    */
  var notEmpty: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
  /**
    * check the value is not one of these
    */
  var notIn: js.UndefOr[
    js.Array[js.Array[java.lang.String]] | sequelizeLib.Anon_MsgArgsStringArray_1525276583
  ] = js.undefined
  /**
    * won't allow null
    */
  var notNull: js.UndefOr[scala.Boolean | sequelizeLib.Anon_MsgString] = js.undefined
}

