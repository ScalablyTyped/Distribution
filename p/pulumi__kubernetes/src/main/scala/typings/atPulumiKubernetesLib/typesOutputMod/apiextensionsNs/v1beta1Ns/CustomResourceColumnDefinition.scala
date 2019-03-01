package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceColumnDefinition specifies a column for server side printing.
  */
trait CustomResourceColumnDefinition extends js.Object {
  /**
    * JSONPath is a simple JSON path, i.e. with array notation.
    */
  val JSONPath: java.lang.String
  /**
    * description is a human readable description of this column.
    */
  val description: java.lang.String
  /**
    * format is an optional OpenAPI type definition for this column. The 'name' format is applied
    * to the primary identifier column to assist in clients identifying column is the resource
    * name. See
    * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
    * more.
    */
  val format: java.lang.String
  /**
    * name is a human readable name for the column.
    */
  val name: java.lang.String
  /**
    * priority is an integer defining the relative importance of this column compared to others.
    * Lower numbers are considered higher priority. Columns that may be omitted in limited space
    * scenarios should be given a higher priority.
    */
  val priority: scala.Double
  /**
    * type is an OpenAPI type definition for this column. See
    * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
    * more.
    */
  val `type`: java.lang.String
}

object CustomResourceColumnDefinition {
  @scala.inline
  def apply(
    JSONPath: java.lang.String,
    description: java.lang.String,
    format: java.lang.String,
    name: java.lang.String,
    priority: scala.Double,
    `type`: java.lang.String
  ): CustomResourceColumnDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("JSONPath")(JSONPath)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("priority")(priority)
    __obj.asInstanceOf[CustomResourceColumnDefinition]
  }
}

