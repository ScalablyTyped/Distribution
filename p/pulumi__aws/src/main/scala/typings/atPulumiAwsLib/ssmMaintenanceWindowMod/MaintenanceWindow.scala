package typings
package atPulumiAwsLib.ssmMaintenanceWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow")
@js.native
class MaintenanceWindow protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: MaintenanceWindowArgs) = this()
  def this(name: java.lang.String, args: MaintenanceWindowArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
    */
  val allowUnassociatedTargets: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
    */
  val cutoff: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * The duration of the Maintenance Window in hours.
    */
  val duration: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  val enabled: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The name of the maintenance window.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
    */
  val schedule: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowState
  ): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindowState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ssmMaintenanceWindowMod.MaintenanceWindow = js.native
}

