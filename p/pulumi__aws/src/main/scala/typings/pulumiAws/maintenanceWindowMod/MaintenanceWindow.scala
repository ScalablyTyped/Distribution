package typings.pulumiAws.maintenanceWindowMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow")
@js.native
class MaintenanceWindow protected () extends CustomResource {
  /**
    * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MaintenanceWindowArgs) = this()
  def this(name: String, args: MaintenanceWindowArgs, opts: CustomResourceOptions) = this()
  /**
    * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
    */
  val allowUnassociatedTargets: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
    */
  val cutoff: Output_[Double] = js.native
  /**
    * A description for the maintenance window.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The duration of the Maintenance Window in hours.
    */
  val duration: Output_[Double] = js.native
  /**
    * Whether the maintenance window is enabled. Default: `true`.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
    */
  val endDate: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the maintenance window.
    */
  val name: Output_[String] = js.native
  /**
    * The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
    */
  val schedule: Output_[String] = js.native
  /**
    * Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
    */
  val scheduleTimezone: Output_[js.UndefOr[String]] = js.native
  /**
    * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
    */
  val startDate: Output_[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): MaintenanceWindow = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowState): MaintenanceWindow = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowState, opts: CustomResourceOptions): MaintenanceWindow = js.native
  /**
    * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindow.MaintenanceWindow */ Boolean = js.native
}

