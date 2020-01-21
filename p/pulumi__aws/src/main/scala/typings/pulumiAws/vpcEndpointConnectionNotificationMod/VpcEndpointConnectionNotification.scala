package typings.pulumiAws.vpcEndpointConnectionNotificationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification")
@js.native
class VpcEndpointConnectionNotification protected () extends CustomResource {
  /**
    * Create a VpcEndpointConnectionNotification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointConnectionNotificationArgs) = this()
  def this(name: String, args: VpcEndpointConnectionNotificationArgs, opts: CustomResourceOptions) = this()
  /**
    * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
    */
  val connectionEvents: Output_[js.Array[String]] = js.native
  /**
    * The ARN of the SNS topic for the notifications.
    */
  val connectionNotificationArn: Output_[String] = js.native
  /**
    * The type of notification.
    */
  val notificationType: Output_[String] = js.native
  /**
    * The state of the notification.
    */
  val state: Output_[String] = js.native
  /**
    * The ID of the VPC Endpoint to receive notifications for.
    */
  val vpcEndpointId: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID of the VPC Endpoint Service to receive notifications for.
    */
  val vpcEndpointServiceId: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification")
@js.native
object VpcEndpointConnectionNotification extends js.Object {
  /**
    * Get an existing VpcEndpointConnectionNotification resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpcEndpointConnectionNotification = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointConnectionNotificationState): VpcEndpointConnectionNotification = js.native
  def get(
    name: String,
    id: Input[ID],
    state: VpcEndpointConnectionNotificationState,
    opts: CustomResourceOptions
  ): VpcEndpointConnectionNotification = js.native
  /**
    * Returns true if the given object is an instance of VpcEndpointConnectionNotification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointConnectionNotification.VpcEndpointConnectionNotification */ Boolean = js.native
}

