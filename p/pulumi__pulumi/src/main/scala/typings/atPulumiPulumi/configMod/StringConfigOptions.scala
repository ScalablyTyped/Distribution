package typings.atPulumiPulumi.configMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StringConfigOptions may be used to constrain the set of legal values a string config value may contain.
  */
trait StringConfigOptions[K /* <: String */] extends js.Object {
  /**
    * The legal enum values. If it does not match, a ConfigEnumError is thrown.
    */
  var allowedValues: js.UndefOr[js.Array[K]] = js.undefined
  /**
    * The maximum string length. If the string is longer than this, a ConfigRangeError is thrown.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * The minimum string length. If the string is not this long, a ConfigRangeError is thrown.
    */
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * A regular expression the string must match. If it does not match, a ConfigPatternError is thrown.
    */
  var pattern: js.UndefOr[String | RegExp] = js.undefined
}

object StringConfigOptions {
  @scala.inline
  def apply[K /* <: String */](
    allowedValues: js.Array[K] = null,
    maxLength: Int | Double = null,
    minLength: Int | Double = null,
    pattern: String | RegExp = null
  ): StringConfigOptions[K] = {
    val __obj = js.Dynamic.literal()
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringConfigOptions[K]]
  }
}

