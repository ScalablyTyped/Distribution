package typings.pulumiKubernetes.outputMod.apiextensions.v1

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
  val description: String
  /**
    * format is an optional OpenAPI type definition for this column. The 'name' format is applied
    * to the primary identifier column to assist in clients identifying column is the resource
    * name. See
    * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
    * details.
    */
  val format: String
  /**
    * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each
    * custom resource to produce the value for this column.
    */
  val jsonPath: String
  /**
    * name is a human readable name for the column.
    */
  val name: String
  /**
    * priority is an integer defining the relative importance of this column compared to others.
    * Lower numbers are considered higher priority. Columns that may be omitted in limited space
    * scenarios should be given a priority greater than 0.
    */
  val priority: Double
  /**
    * type is an OpenAPI type definition for this column. See
    * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
    * details.
    */
  val `type`: String
}

object CustomResourceColumnDefinition {
  @scala.inline
  def apply(
    description: String,
    format: String,
    jsonPath: String,
    name: String,
    priority: Double,
    `type`: String
  ): CustomResourceColumnDefinition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], jsonPath = jsonPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceColumnDefinition]
  }
}

