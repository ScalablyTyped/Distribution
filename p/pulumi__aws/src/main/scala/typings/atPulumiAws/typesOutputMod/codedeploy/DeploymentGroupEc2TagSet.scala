package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupEc2TagSet extends js.Object {
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  var ec2TagFilters: js.UndefOr[js.Array[DeploymentGroupEc2TagSetEc2TagFilter]] = js.native
}

object DeploymentGroupEc2TagSet {
  @scala.inline
  def apply(ec2TagFilters: js.Array[DeploymentGroupEc2TagSetEc2TagFilter] = null): DeploymentGroupEc2TagSet = {
    val __obj = js.Dynamic.literal()
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupEc2TagSet]
  }
}

