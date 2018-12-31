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

