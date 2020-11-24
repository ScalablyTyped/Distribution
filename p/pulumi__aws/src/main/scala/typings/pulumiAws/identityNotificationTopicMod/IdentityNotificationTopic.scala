package typings.pulumiAws.identityNotificationTopicMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ses/identityNotificationTopic", "IdentityNotificationTopic")
@js.native
class IdentityNotificationTopic protected () extends CustomResource {
  /**
    * Create a IdentityNotificationTopic resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IdentityNotificationTopicArgs) = this()
  def this(name: String, args: IdentityNotificationTopicArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
    */
  val identity: Output_[String] = js.native
  
  /**
    * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
    */
  val includeOriginalHeaders: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
    */
  val notificationType: Output_[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
    */
  val topicArn: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ses/identityNotificationTopic", "IdentityNotificationTopic")
@js.native
object IdentityNotificationTopic extends js.Object {
  
  /**
    * Get an existing IdentityNotificationTopic resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): IdentityNotificationTopic = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IdentityNotificationTopic = js.native
  def get(name: String, id: Input[ID], state: IdentityNotificationTopicState): IdentityNotificationTopic = js.native
  def get(name: String, id: Input[ID], state: IdentityNotificationTopicState, opts: CustomResourceOptions): IdentityNotificationTopic = js.native
  
  /**
    * Returns true if the given object is an instance of IdentityNotificationTopic.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityNotificationTopic.IdentityNotificationTopic */ Boolean = js.native
}
