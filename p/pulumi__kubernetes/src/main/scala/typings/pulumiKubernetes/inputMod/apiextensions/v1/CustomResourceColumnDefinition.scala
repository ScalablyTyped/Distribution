package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceColumnDefinition specifies a column for server side printing.
  */
trait CustomResourceColumnDefinition extends js.Object {
  /**
    * description is a human readable description of this column.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  /**
    * format is an optional OpenAPI type definition for this column. The 'name' format is applied
    * to the primary identifier column to assist in clients identifying column is the resource
    * name. See
    * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
    * details.
    */
  var format: js.UndefOr[Input[String]] = js.undefined
  /**
    * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each
    * custom resource to produce the value for this column.
    */
  var jsonPath: Input[String]
  /**
    * name is a human readable name for the column.
    */
  var name: Input[String]
  /**
    * priority is an integer defining the relative importance of this column compared to others.
    * Lower numbers are considered higher priority. Columns that may be omitted in limited space
    * scenarios should be given a priority greater than 0.
    */
  var priority: js.UndefOr[Input[Double]] = js.undefined
  /**
    * type is an OpenAPI type definition for this column. See
    * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
    * details.
    */
  var `type`: Input[String]
}

object CustomResourceColumnDefinition {
  @scala.inline
  def apply(
    jsonPath: Input[String],
    name: Input[String],
    `type`: Input[String],
    description: Input[String] = null,
    format: Input[String] = null,
    priority: Input[Double] = null
  ): CustomResourceColumnDefinition = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceColumnDefinition]
  }
}

