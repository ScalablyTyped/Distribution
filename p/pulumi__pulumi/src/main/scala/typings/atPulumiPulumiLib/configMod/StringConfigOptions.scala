package typings
package atPulumiPulumiLib.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * StringConfigOptions may be used to constrain the set of legal values a string config value may contain.
 */

trait StringConfigOptions extends js.Object {
  /**
       * The legal enum values. If it does not match, a ConfigEnumError is thrown.
       */
  var allowedValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * The maximum string length. If the string is longer than this, a ConfigRangeError is thrown.
       */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
       * The minimum string length. If the string is not this long, a ConfigRangeError is thrown.
       */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /**
       * A regular expression the string must match. If it does not match, a ConfigPatternError is thrown.
       */
  var pattern: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
}

