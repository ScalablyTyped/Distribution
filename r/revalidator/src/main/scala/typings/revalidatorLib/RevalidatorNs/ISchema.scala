package typings
package revalidatorLib.RevalidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchema[T] extends js.Object {
  /**If false, the value must not be an empty string */
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**Value must conform to constraint denoted by expected value */
  var conform: js.UndefOr[js.Function2[/* value */ js.Any, /* data */ js.UndefOr[T], scala.Boolean]] = js.undefined
  /**Default value */
  var default: js.UndefOr[js.Any] = js.undefined
  /**Value is valid only if the dependent value is valid */
  var dependencies: js.UndefOr[java.lang.String] = js.undefined
  /**Description for this object */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**Value must be divisible by expected value */
  var divisibleBy: js.UndefOr[scala.Double] = js.undefined
  /**Value must be present in the array of expected values */
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  /**Value must be lesser than expected value */
  var exclusiveMaximum: js.UndefOr[scala.Double] = js.undefined
  /**Value must be greater than expected value */
  var exclusiveMinimum: js.UndefOr[scala.Double] = js.undefined
  /**Value must be a valid format */
  var format: js.UndefOr[Formats] = js.undefined
  /**Value must contain fewer than expected number of items */
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  /**The length of value must be greater than or equal to expected value */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**Value must be lesser than or equal to the expected value */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /**Custom messages for different constraints */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**Custom messages for different constraints */
  var messages: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**Value must contain more than expected number of items */
  var minItems: js.UndefOr[scala.Double] = js.undefined
  /**The length of value must be lesser than or equal to expected value */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /**Value must be greater than or equal to the expected value */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /**The expected value regex needs to be satisfied by the value */
  var pattern: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
  /**If true, the value should not be undefined */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**The type of value should be equal to the expected value */
  var `type`: Types | js.Array[Types]
  /**Value must hold a unique set of values */
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

object ISchema {
  @scala.inline
  def apply[T](
    `type`: Types | js.Array[Types],
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    conform: js.Function2[/* value */ js.Any, /* data */ js.UndefOr[T], scala.Boolean] = null,
    default: js.Any = null,
    dependencies: java.lang.String = null,
    description: java.lang.String = null,
    divisibleBy: scala.Int | scala.Double = null,
    enum: js.Array[_] = null,
    exclusiveMaximum: scala.Int | scala.Double = null,
    exclusiveMinimum: scala.Int | scala.Double = null,
    format: Formats = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    messages: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    pattern: stdLib.RegExp | java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  ): ISchema[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (conform != null) __obj.updateDynamic("conform")(conform)
    if (default != null) __obj.updateDynamic("default")(default)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (divisibleBy != null) __obj.updateDynamic("divisibleBy")(divisibleBy.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (exclusiveMaximum != null) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.asInstanceOf[js.Any])
    if (exclusiveMinimum != null) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[ISchema[T]]
  }
}

