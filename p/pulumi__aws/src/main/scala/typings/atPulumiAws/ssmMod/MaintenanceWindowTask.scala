package typings.atPulumiAws.ssmMod

import typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskArgs
import typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", "MaintenanceWindowTask")
@js.native
class MaintenanceWindowTask protected ()
  extends typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask {
  /**
    * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MaintenanceWindowTaskArgs) = this()
  def this(name: String, args: MaintenanceWindowTaskArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ssm", "MaintenanceWindowTask")
@js.native
object MaintenanceWindowTask extends js.Object {
  /**
    * Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): typings.atPulumiAws.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
  /**
    * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = js.native
}

