package typings
package atPulumiAwsLib.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", "MaintenanceWindow")
@js.native
class MaintenanceWindow protected ()
  extends atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow {
  /**
    * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowState
  ): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
}

