package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType extends js.Object {
  var launchTemplateSpecification: Input[Anon_LaunchTemplateIdLaunchTemplateNameVersionInput]
  var overrides: js.UndefOr[Input[js.Array[Input[Anon_AvailabilityZoneInstanceType]]]] = js.undefined
}

object Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType {
  @scala.inline
  def apply(
    launchTemplateSpecification: Input[Anon_LaunchTemplateIdLaunchTemplateNameVersionInput],
    overrides: Input[js.Array[Input[Anon_AvailabilityZoneInstanceType]]] = null
  ): Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType]
  }
}

