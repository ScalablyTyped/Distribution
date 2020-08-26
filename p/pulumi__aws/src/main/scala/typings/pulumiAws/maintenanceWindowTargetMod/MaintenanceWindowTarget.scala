package typings.pulumiAws.maintenanceWindowTargetMod

import typings.pulumiAws.outputMod.ssm.MaintenanceWindowTargetTarget
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/maintenanceWindowTarget", "MaintenanceWindowTarget")
@js.native
class MaintenanceWindowTarget protected () extends CustomResource {
  /**
    * Create a MaintenanceWindowTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MaintenanceWindowTargetArgs) = this()
  def this(name: String, args: MaintenanceWindowTargetArgs, opts: CustomResourceOptions) = this()
  /**
    * The description of the maintenance window target.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the maintenance window target.
    */
  val name: Output_[String] = js.native
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: Output_[js.UndefOr[String]] = js.native
  /**
    * The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
    */
  val resourceType: Output_[String] = js.native
  /**
    * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
    * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
    */
  val targets: Output_[js.Array[MaintenanceWindowTargetTarget]] = js.native
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ssm/maintenanceWindowTarget", "MaintenanceWindowTarget")
@js.native
object MaintenanceWindowTarget extends js.Object {
  /**
    * Get an existing MaintenanceWindowTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): MaintenanceWindowTarget = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MaintenanceWindowTarget = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState): MaintenanceWindowTarget = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState, opts: CustomResourceOptions): MaintenanceWindowTarget = js.native
  /**
    * Returns true if the given object is an instance of MaintenanceWindowTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTarget.MaintenanceWindowTarget */ Boolean = js.native
}

