package typings.pulumiAws.maintenanceWindowTargetMod

import typings.pulumiAws.inputMod.ssm.MaintenanceWindowTargetTarget
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTargetState extends js.Object {
  
  /**
    * The description of the maintenance window target.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the maintenance window target.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
    */
  val resourceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
    * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
    */
  val targets: js.UndefOr[Input[js.Array[Input[MaintenanceWindowTargetTarget]]]] = js.native
  
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: js.UndefOr[Input[String]] = js.native
}
object MaintenanceWindowTargetState {
  
  @scala.inline
  def apply(): MaintenanceWindowTargetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTargetState]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTargetStateOps[Self <: MaintenanceWindowTargetState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerInformation(value: Input[String]): Self = this.set("ownerInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerInformation: Self = this.set("ownerInformation", js.undefined)
    
    @scala.inline
    def setResourceType(value: Input[String]): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Input[MaintenanceWindowTargetTarget]*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Input[js.Array[Input[MaintenanceWindowTargetTarget]]]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setWindowId(value: Input[String]): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
}
