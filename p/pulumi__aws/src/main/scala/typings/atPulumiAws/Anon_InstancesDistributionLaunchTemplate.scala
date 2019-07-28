package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstancesDistributionLaunchTemplate extends js.Object {
  var instancesDistribution: js.UndefOr[Input[Anon_OnDemandAllocationStrategyOnDemandBaseCapacity]] = js.undefined
  var launchTemplate: Input[Anon_LaunchTemplateSpecificationOverrides]
}

object Anon_InstancesDistributionLaunchTemplate {
  @scala.inline
  def apply(
    launchTemplate: Input[Anon_LaunchTemplateSpecificationOverrides],
    instancesDistribution: Input[Anon_OnDemandAllocationStrategyOnDemandBaseCapacity] = null
  ): Anon_InstancesDistributionLaunchTemplate = {
    val __obj = js.Dynamic.literal(launchTemplate = launchTemplate.asInstanceOf[js.Any])
    if (instancesDistribution != null) __obj.updateDynamic("instancesDistribution")(instancesDistribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InstancesDistributionLaunchTemplate]
  }
}

