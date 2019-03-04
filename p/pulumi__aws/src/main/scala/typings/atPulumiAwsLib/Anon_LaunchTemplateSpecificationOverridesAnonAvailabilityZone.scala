package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZone extends js.Object {
  var launchTemplateSpecification: Anon_LaunchTemplateIdLaunchTemplateNameVersion
  var overrides: js.UndefOr[js.Array[Anon_AvailabilityZone]] = js.undefined
}

object Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZone {
  @scala.inline
  def apply(
    launchTemplateSpecification: Anon_LaunchTemplateIdLaunchTemplateNameVersion,
    overrides: js.Array[Anon_AvailabilityZone] = null
  ): Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZone = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZone]
  }
}

