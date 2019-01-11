package typings
package atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification")
@js.native
class VpcEndpointConnectionNotification protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpcEndpointConnectionNotification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcEndpointConnectionNotificationArgs) = this()
  def this(name: java.lang.String, args: VpcEndpointConnectionNotificationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
    */
  val connectionEvents: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The ARN of the SNS topic for the notifications.
    */
  val connectionNotificationArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The type of notification.
    */
  val notificationType: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The state of the notification.
    */
  val state: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the VPC Endpoint to receive notifications for.
    */
  val vpcEndpointId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID of the VPC Endpoint Service to receive notifications for.
    */
  val vpcEndpointServiceId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotificationState
  ): atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotificationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
}

