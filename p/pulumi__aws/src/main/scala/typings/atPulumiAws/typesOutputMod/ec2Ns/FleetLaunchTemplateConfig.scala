package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetLaunchTemplateConfig extends js.Object {
  /**
    * Nested argument containing EC2 Launch Template to use. Defined below.
    */
  var launchTemplateSpecification: FleetLaunchTemplateConfigLaunchTemplateSpecification
  /**
    * Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
    */
  var overrides: js.UndefOr[js.Array[FleetLaunchTemplateConfigOverride]] = js.undefined
}

object FleetLaunchTemplateConfig {
  @scala.inline
  def apply(
    launchTemplateSpecification: FleetLaunchTemplateConfigLaunchTemplateSpecification,
    overrides: js.Array[FleetLaunchTemplateConfigOverride] = null
  ): FleetLaunchTemplateConfig = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[FleetLaunchTemplateConfig]
  }
}

