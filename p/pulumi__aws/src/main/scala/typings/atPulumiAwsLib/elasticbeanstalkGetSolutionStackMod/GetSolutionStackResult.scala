package typings
package atPulumiAwsLib.elasticbeanstalkGetSolutionStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSolutionStackResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The name of the solution stack.
    */
  val name: java.lang.String
}

object GetSolutionStackResult {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): GetSolutionStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetSolutionStackResult]
  }
}

