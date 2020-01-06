package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfig extends js.Object {
  /**
    * Nested argument containing EC2 Launch Template to use. Defined below.
    */
  var launchTemplateSpecification: FleetLaunchTemplateConfigLaunchTemplateSpecification = js.native
  /**
    * Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
    */
  var overrides: js.UndefOr[js.Array[FleetLaunchTemplateConfigOverride]] = js.native
}

object FleetLaunchTemplateConfig {
  @scala.inline
  def apply(
    launchTemplateSpecification: FleetLaunchTemplateConfigLaunchTemplateSpecification,
    overrides: js.Array[FleetLaunchTemplateConfigOverride] = null
  ): FleetLaunchTemplateConfig = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfig]
  }
}

