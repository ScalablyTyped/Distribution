package typings.atPulumiAws.ramResourceShareAccepterMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ram/resourceShareAccepter", "ResourceShareAccepter")
@js.native
class ResourceShareAccepter protected () extends CustomResource {
  /**
    * Create a ResourceShareAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceShareAccepterArgs) = this()
  def this(name: String, args: ResourceShareAccepterArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the resource share invitation.
    */
  val invitationArn: Output[String] = js.native
  /**
    * The account ID of the receiver account which accepts the invitation.
    */
  val receiverAccountId: Output[String] = js.native
  /**
    * A list of the resource ARNs shared via the resource share.
    */
  val resources: Output[js.Array[String]] = js.native
  /**
    * The account ID of the sender account which extends the invitation.
    */
  val senderAccountId: Output[String] = js.native
  /**
    * The ARN of the resource share.
    */
  val shareArn: Output[String] = js.native
  /**
    * The ID of the resource share as displayed in the console.
    */
  val shareId: Output[String] = js.native
  /**
    * The name of the resource share.
    */
  val shareName: Output[String] = js.native
  /**
    * The status of the invitation (e.g., ACCEPTED, REJECTED).
    */
  val status: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ram/resourceShareAccepter", "ResourceShareAccepter")
@js.native
object ResourceShareAccepter extends js.Object {
  /**
    * Get an existing ResourceShareAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ResourceShareAccepter = js.native
  def get(name: String, id: Input[ID], state: ResourceShareAccepterState): ResourceShareAccepter = js.native
  def get(name: String, id: Input[ID], state: ResourceShareAccepterState, opts: CustomResourceOptions): ResourceShareAccepter = js.native
  /**
    * Returns true if the given object is an instance of ResourceShareAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShareAccepter.ResourceShareAccepter */ Boolean = js.native
}

