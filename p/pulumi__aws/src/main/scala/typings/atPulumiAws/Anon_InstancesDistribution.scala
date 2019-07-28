package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstancesDistribution extends js.Object {
  var instancesDistribution: js.UndefOr[Anon_OnDemandAllocationStrategy] = js.undefined
  var launchTemplate: Anon_LaunchTemplateSpecification
}

object Anon_InstancesDistribution {
  @scala.inline
  def apply(
    launchTemplate: Anon_LaunchTemplateSpecification,
    instancesDistribution: Anon_OnDemandAllocationStrategy = null
  ): Anon_InstancesDistribution = {
    val __obj = js.Dynamic.literal(launchTemplate = launchTemplate)
    if (instancesDistribution != null) __obj.updateDynamic("instancesDistribution")(instancesDistribution)
    __obj.asInstanceOf[Anon_InstancesDistribution]
  }
}

