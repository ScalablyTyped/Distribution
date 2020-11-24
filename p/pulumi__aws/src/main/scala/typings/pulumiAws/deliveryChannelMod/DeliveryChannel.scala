package typings.pulumiAws.deliveryChannelMod

import typings.pulumiAws.outputMod.cfg.DeliveryChannelSnapshotDeliveryProperties
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel")
@js.native
class DeliveryChannel protected () extends CustomResource {
  /**
    * Create a DeliveryChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DeliveryChannelArgs) = this()
  def this(name: String, args: DeliveryChannelArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
    */
  val name: Output_[String] = js.native
  
  /**
    * The name of the S3 bucket used to store the configuration history.
    */
  val s3BucketName: Output_[String] = js.native
  
  /**
    * The prefix for the specified S3 bucket.
    */
  val s3KeyPrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Options for how AWS Config delivers configuration snapshots. See below
    */
  val snapshotDeliveryProperties: Output_[js.UndefOr[DeliveryChannelSnapshotDeliveryProperties]] = js.native
  
  /**
    * The ARN of the SNS topic that AWS Config delivers notifications to.
    */
  val snsTopicArn: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel")
@js.native
object DeliveryChannel extends js.Object {
  
  /**
    * Get an existing DeliveryChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DeliveryChannel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DeliveryChannel = js.native
  def get(name: String, id: Input[ID], state: DeliveryChannelState): DeliveryChannel = js.native
  def get(name: String, id: Input[ID], state: DeliveryChannelState, opts: CustomResourceOptions): DeliveryChannel = js.native
  
  /**
    * Returns true if the given object is an instance of DeliveryChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/deliveryChannel.DeliveryChannel */ Boolean = js.native
}
