package typings.atPulumiAws.typesOutputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicy extends js.Object {
  /**
    * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
    */
  var instancesDistribution: js.UndefOr[GroupMixedInstancesPolicyInstancesDistribution] = js.native
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  var launchTemplate: GroupMixedInstancesPolicyLaunchTemplate = js.native
}

object GroupMixedInstancesPolicy {
  @scala.inline
  def apply(
    launchTemplate: GroupMixedInstancesPolicyLaunchTemplate,
    instancesDistribution: GroupMixedInstancesPolicyInstancesDistribution = null
  ): GroupMixedInstancesPolicy = {
    val __obj = js.Dynamic.literal(launchTemplate = launchTemplate.asInstanceOf[js.Any])
    if (instancesDistribution != null) __obj.updateDynamic("instancesDistribution")(instancesDistribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicy]
  }
}

