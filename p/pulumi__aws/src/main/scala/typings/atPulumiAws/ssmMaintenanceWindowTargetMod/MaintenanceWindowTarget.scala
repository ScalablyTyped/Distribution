package typings.atPulumiAws.ssmMaintenanceWindowTargetMod

import typings.atPulumiAws.Anon_KeyValues
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the maintenance window target.
    */
  val name: Output[String] = js.native
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
    */
  val ownerInformation: Output[js.UndefOr[String]] = js.native
  /**
    * The type of target being registered with the Maintenance Window. Possible values `INSTANCE`.
    */
  val resourceType: Output[String] = js.native
  /**
    * The targets (either instances or tags). Instances are specified using Key=InstanceIds,Values=InstanceId1,InstanceId2. Tags are specified using Key=tag name,Values=tag value.
    */
  val targets: Output[js.Array[Anon_KeyValues]] = js.native
  /**
    * The Id of the maintenance window to register the target with.
    */
  val windowId: Output[String] = js.native
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
    */
  def get(name: String, id: Input[ID]): MaintenanceWindowTarget = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState): MaintenanceWindowTarget = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState, opts: CustomResourceOptions): MaintenanceWindowTarget = js.native
  /**
    * Returns true if the given object is an instance of MaintenanceWindowTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTarget.MaintenanceWindowTarget */ Boolean = js.native
}

