package typings.revalidator.RevalidatorNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchema[T] extends js.Object {
  /**If false, the value must not be an empty string */
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  /**Value must conform to constraint denoted by expected value */
  var conform: js.UndefOr[js.Function2[/* value */ js.Any, /* data */ js.UndefOr[T], Boolean]] = js.undefined
  /**Default value */
  var default: js.UndefOr[js.Any] = js.undefined
  /**Value is valid only if the dependent value is valid */
  var dependencies: js.UndefOr[String] = js.undefined
  /**Description for this object */
  var description: js.UndefOr[String] = js.undefined
  /**Value must be divisible by expected value */
  var divisibleBy: js.UndefOr[Double] = js.undefined
  /**Value must be present in the array of expected values */
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  /**Value must be lesser than expected value */
  var exclusiveMaximum: js.UndefOr[Double] = js.undefined
  /**Value must be greater than expected value */
  var exclusiveMinimum: js.UndefOr[Double] = js.undefined
  /**Value must be a valid format */
  var format: js.UndefOr[Formats] = js.undefined
  /**Property to describe items for type: 'array' */
  var items: js.UndefOr[ISchema[T] | JSONSchema[T]] = js.undefined
  /**Value must contain fewer than expected number of items */
  var maxItems: js.UndefOr[Double] = js.undefined
  /**The length of value must be greater than or equal to expected value */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**Value must be lesser than or equal to the expected value */
  var maximum: js.UndefOr[Double] = js.undefined
  /**Custom messages for different constraints */
  var message: js.UndefOr[String] = js.undefined
  /**Custom messages for different constraints */
  var messages: js.UndefOr[StringDictionary[String]] = js.undefined
  /**Value must contain more than expected number of items */
  var minItems: js.UndefOr[Double] = js.undefined
  /**The length of value must be lesser than or equal to expected value */
  var minLength: js.UndefOr[Double] = js.undefined
  /**Value must be greater than or equal to the expected value */
  var minimum: js.UndefOr[Double] = js.undefined
  /**The expected value regex needs to be satisfied by the value */
  var pattern: js.UndefOr[RegExp | String] = js.undefined
  /**If true, the value should not be undefined */
  var required: js.UndefOr[Boolean] = js.undefined
  /**The type of value should be equal to the expected value */
  var `type`: Types | js.Array[Types]
  /**Value must hold a unique set of values */
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}

object ISchema {
  @scala.inline
  def apply[T](
    `type`: Types | js.Array[Types],
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    conform: (/* value */ js.Any, /* data */ js.UndefOr[T]) => Boolean = null,
    default: js.Any = null,
    dependencies: String = null,
    description: String = null,
    divisibleBy: Int | Double = null,
    enum: js.Array[_] = null,
    exclusiveMaximum: Int | Double = null,
    exclusiveMinimum: Int | Double = null,
    format: Formats = null,
    items: ISchema[T] | JSONSchema[T] = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maximum: Int | Double = null,
    message: String = null,
    messages: StringDictionary[String] = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minimum: Int | Double = null,
    pattern: RegExp | String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    uniqueItems: js.UndefOr[Boolean] = js.undefined
  ): ISchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (conform != null) __obj.updateDynamic("conform")(js.Any.fromFunction2(conform))
    if (default != null) __obj.updateDynamic("default")(default)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (divisibleBy != null) __obj.updateDynamic("divisibleBy")(divisibleBy.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (exclusiveMaximum != null) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.asInstanceOf[js.Any])
    if (exclusiveMinimum != null) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
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

