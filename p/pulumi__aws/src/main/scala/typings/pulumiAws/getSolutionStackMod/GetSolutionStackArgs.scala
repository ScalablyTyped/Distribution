package typings.pulumiAws.getSolutionStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSolutionStackArgs extends js.Object {
  /**
    * If more than one result is returned, use the most
    * recent solution stack.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * A regex string to apply to the solution stack list returned
    * by AWS. See [Elastic Beanstalk Supported Platforms][beanstalk-platforms] from
    * AWS documentation for reference solution stack names.
    */
  val nameRegex: String = js.native
}

object GetSolutionStackArgs {
  @scala.inline
  def apply(nameRegex: String, mostRecent: js.UndefOr[Boolean] = js.undefined): GetSolutionStackArgs = {
    val __obj = js.Dynamic.literal(nameRegex = nameRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionStackArgs]
  }
}

