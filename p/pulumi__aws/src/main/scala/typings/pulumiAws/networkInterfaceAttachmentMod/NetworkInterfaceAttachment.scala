package typings.pulumiAws.networkInterfaceAttachmentMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment")
@js.native
class NetworkInterfaceAttachment protected () extends CustomResource {
  /**
    * Create a NetworkInterfaceAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkInterfaceAttachmentArgs) = this()
  def this(name: String, args: NetworkInterfaceAttachmentArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ENI Attachment ID.
    */
  val attachmentId: Output_[String] = js.native
  
  /**
    * Network interface index (int).
    */
  val deviceIndex: Output_[Double] = js.native
  
  /**
    * Instance ID to attach.
    */
  val instanceId: Output_[String] = js.native
  
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: Output_[String] = js.native
  
  /**
    * The status of the Network Interface Attachment.
    */
  val status: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/networkInterfaceAttachment", "NetworkInterfaceAttachment")
@js.native
object NetworkInterfaceAttachment extends js.Object {
  
  /**
    * Get an existing NetworkInterfaceAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NetworkInterfaceAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NetworkInterfaceAttachment = js.native
  def get(name: String, id: Input[ID], state: NetworkInterfaceAttachmentState): NetworkInterfaceAttachment = js.native
  def get(name: String, id: Input[ID], state: NetworkInterfaceAttachmentState, opts: CustomResourceOptions): NetworkInterfaceAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of NetworkInterfaceAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterfaceAttachment.NetworkInterfaceAttachment */ Boolean = js.native
}
