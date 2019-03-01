package typings
package atPulumiAwsLib.ssmMaintenanceWindowTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTargetArgs extends js.Object {
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of target being registered with the Maintenance Window. Possible values `INSTANCE`.
    */
  val resourceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=instanceid1,instanceid2. Tags are specified using Key=tag name,Values=tag value.
    */
  val targets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]]
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object MaintenanceWindowTargetArgs {
  @scala.inline
  def apply(
    resourceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    targets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]],
    windowId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ownerInformation: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): MaintenanceWindowTargetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    if (ownerInformation != null) __obj.updateDynamic("ownerInformation")(ownerInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTargetArgs]
  }
}

