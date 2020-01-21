package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfig extends js.Object {
  /**
    * Nested argument containing EC2 Launch Template to use. Defined below.
    */
  var launchTemplateSpecification: Input[FleetLaunchTemplateConfigLaunchTemplateSpecification] = js.native
  /**
    * Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
    */
  var overrides: js.UndefOr[Input[js.Array[Input[FleetLaunchTemplateConfigOverride]]]] = js.native
}

object FleetLaunchTemplateConfig {
  @scala.inline
  def apply(
    launchTemplateSpecification: Input[FleetLaunchTemplateConfigLaunchTemplateSpecification],
    overrides: Input[js.Array[Input[FleetLaunchTemplateConfigOverride]]] = null
  ): FleetLaunchTemplateConfig = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfig]
  }
}

