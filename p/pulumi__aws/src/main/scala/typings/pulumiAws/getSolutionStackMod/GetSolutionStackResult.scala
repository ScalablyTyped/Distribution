package typings.pulumiAws.getSolutionStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSolutionStackResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * The name of the solution stack.
    */
  val name: String = js.native
  val nameRegex: String = js.native
}

object GetSolutionStackResult {
  @scala.inline
  def apply(id: String, name: String, nameRegex: String, mostRecent: js.UndefOr[Boolean] = js.undefined): GetSolutionStackResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRegex = nameRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionStackResult]
  }
}

