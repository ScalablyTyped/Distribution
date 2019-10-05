package typings.atPulumiAws.typesOutputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMixedInstancesPolicy extends js.Object {
  /**
    * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
    */
  var instancesDistribution: js.UndefOr[GroupMixedInstancesPolicyInstancesDistribution] = js.undefined
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types. Defined below.
    */
  var launchTemplate: GroupMixedInstancesPolicyLaunchTemplate
}

object GroupMixedInstancesPolicy {
  @scala.inline
  def apply(
    launchTemplate: GroupMixedInstancesPolicyLaunchTemplate,
    instancesDistribution: GroupMixedInstancesPolicyInstancesDistribution = null
  ): GroupMixedInstancesPolicy = {
    val __obj = js.Dynamic.literal(launchTemplate = launchTemplate)
    if (instancesDistribution != null) __obj.updateDynamic("instancesDistribution")(instancesDistribution)
    __obj.asInstanceOf[GroupMixedInstancesPolicy]
  }
}

