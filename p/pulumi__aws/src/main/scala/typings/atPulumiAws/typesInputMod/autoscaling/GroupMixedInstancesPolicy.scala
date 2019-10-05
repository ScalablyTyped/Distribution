package typings.atPulumiAws.typesInputMod.autoscaling

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMixedInstancesPolicy extends js.Object {
  /**
    * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
    */
  var instancesDistribution: js.UndefOr[Input[GroupMixedInstancesPolicyInstancesDistribution]] = js.undefined
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types. Defined below.
    */
  var launchTemplate: Input[GroupMixedInstancesPolicyLaunchTemplate]
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

