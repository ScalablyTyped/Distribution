package typings.pulumiAws.mod.iam

import typings.pulumiAws.userPolicyAttachmentMod.UserPolicyAttachmentArgs
import typings.pulumiAws.userPolicyAttachmentMod.UserPolicyAttachmentState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "iam.UserPolicyAttachment")
@js.native
class UserPolicyAttachment protected ()
  extends typings.pulumiAws.iamMod.UserPolicyAttachment {
  /**
    * Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserPolicyAttachmentArgs) = this()
  def this(name: String, args: UserPolicyAttachmentArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object UserPolicyAttachment {
  
  /**
    * Get an existing UserPolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "iam.UserPolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.userPolicyAttachmentMod.UserPolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.UserPolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.userPolicyAttachmentMod.UserPolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.UserPolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: UserPolicyAttachmentState): typings.pulumiAws.userPolicyAttachmentMod.UserPolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.UserPolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: UserPolicyAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.userPolicyAttachmentMod.UserPolicyAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of UserPolicyAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "iam.UserPolicyAttachment.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userPolicyAttachment.UserPolicyAttachment */ Boolean = js.native
}
