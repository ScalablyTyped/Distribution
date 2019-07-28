package typings.atPulumiAws.elasticbeanstalkGetSolutionStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSolutionStackResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the solution stack.
    */
  val name: String
  val nameRegex: String
}

object GetSolutionStackResult {
  @scala.inline
  def apply(id: String, name: String, nameRegex: String, mostRecent: js.UndefOr[Boolean] = js.undefined): GetSolutionStackResult = {
    val __obj = js.Dynamic.literal(id = id, name = name, nameRegex = nameRegex)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    __obj.asInstanceOf[GetSolutionStackResult]
  }
}

