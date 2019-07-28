package typings.atPulumiAws.ssmMod

import typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindowArgs
import typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindowState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", "MaintenanceWindow")
@js.native
class MaintenanceWindow protected ()
  extends typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindow {
  /**
    * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MaintenanceWindowArgs) = this()
  def this(name: String, args: MaintenanceWindowArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ssm", "MaintenanceWindow")
@js.native
object MaintenanceWindow extends js.Object {
  /**
    * Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowState): typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowState, opts: CustomResourceOptions): typings.atPulumiAws.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
  /**
    * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindow.MaintenanceWindow */ Boolean = js.native
}

