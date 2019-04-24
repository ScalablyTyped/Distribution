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
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the solution stack.
    */
  val name: java.lang.String
  val nameRegex: java.lang.String
}

object GetSolutionStackResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    nameRegex: java.lang.String,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  ): GetSolutionStackResult = {
    val __obj = js.Dynamic.literal(id = id, name = name, nameRegex = nameRegex)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    __obj.asInstanceOf[GetSolutionStackResult]
  }
}

