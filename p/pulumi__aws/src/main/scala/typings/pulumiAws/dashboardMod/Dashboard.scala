package typings.pulumiAws.dashboardMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/dashboard", "Dashboard")
@js.native
class Dashboard protected () extends CustomResource {
  /**
    * Create a Dashboard resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DashboardArgs) = this()
  def this(name: String, args: DashboardArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  val dashboardArn: Output_[String] = js.native
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
    */
  val dashboardBody: Output_[String] = js.native
  /**
    * The name of the dashboard.
    */
  val dashboardName: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/dashboard", "Dashboard")
@js.native
object Dashboard extends js.Object {
  /**
    * Get an existing Dashboard resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Dashboard = js.native
  def get(name: String, id: Input[ID], state: DashboardState): Dashboard = js.native
  def get(name: String, id: Input[ID], state: DashboardState, opts: CustomResourceOptions): Dashboard = js.native
  /**
    * Returns true if the given object is an instance of Dashboard.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/dashboard.Dashboard */ Boolean = js.native
}

