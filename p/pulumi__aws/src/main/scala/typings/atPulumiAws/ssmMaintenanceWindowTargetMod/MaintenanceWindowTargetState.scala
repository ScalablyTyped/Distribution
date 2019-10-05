package typings.atPulumiAws.ssmMaintenanceWindowTargetMod

import typings.atPulumiAws.typesInputMod.ssm.MaintenanceWindowTargetTarget
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTargetState extends js.Object {
  /**
    * The description of the maintenance window target.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the maintenance window target.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of target being registered with the Maintenance Window. Possible values `INSTANCE`.
    */
  val resourceType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The targets (either instances or tags). Instances are specified using Key=InstanceIds,Values=InstanceId1,InstanceId2. Tags are specified using Key=tag name,Values=tag value.
    */
  val targets: js.UndefOr[Input[js.Array[Input[MaintenanceWindowTargetTarget]]]] = js.undefined
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: js.UndefOr[Input[String]] = js.undefined
}

object MaintenanceWindowTargetState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    name: Input[String] = null,
    ownerInformation: Input[String] = null,
    resourceType: Input[String] = null,
    targets: Input[js.Array[Input[MaintenanceWindowTargetTarget]]] = null,
    windowId: Input[String] = null
  ): MaintenanceWindowTargetState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerInformation != null) __obj.updateDynamic("ownerInformation")(ownerInformation.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTargetState]
  }
}

