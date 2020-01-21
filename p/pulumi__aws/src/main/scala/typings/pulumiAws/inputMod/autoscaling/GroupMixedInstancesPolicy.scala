package typings.pulumiAws.inputMod.autoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicy extends js.Object {
  /**
    * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
    */
  var instancesDistribution: js.UndefOr[Input[GroupMixedInstancesPolicyInstancesDistribution]] = js.native
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  var launchTemplate: Input[GroupMixedInstancesPolicyLaunchTemplate] = js.native
}

object GroupMixedInstancesPolicy {
  @scala.inline
  def apply(
    launchTemplate: Input[GroupMixedInstancesPolicyLaunchTemplate],
    instancesDistribution: Input[GroupMixedInstancesPolicyInstancesDistribution] = null
  ): GroupMixedInstancesPolicy = {
    val __obj = js.Dynamic.literal(launchTemplate = launchTemplate.asInstanceOf[js.Any])
    if (instancesDistribution != null) __obj.updateDynamic("instancesDistribution")(instancesDistribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicy]
  }
}

