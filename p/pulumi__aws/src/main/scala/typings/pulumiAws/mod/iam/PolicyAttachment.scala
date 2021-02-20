package typings.pulumiAws.mod.iam

import typings.pulumiAws.policyAttachmentMod.PolicyAttachmentArgs
import typings.pulumiAws.policyAttachmentMod.PolicyAttachmentState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "iam.PolicyAttachment")
@js.native
class PolicyAttachment protected ()
  extends typings.pulumiAws.iamMod.PolicyAttachment {
  /**
    * Create a PolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PolicyAttachmentArgs) = this()
  def this(name: String, args: PolicyAttachmentArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object PolicyAttachment {
  
  /**
    * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "iam.PolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.policyAttachmentMod.PolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.PolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.policyAttachmentMod.PolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.PolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: PolicyAttachmentState): typings.pulumiAws.policyAttachmentMod.PolicyAttachment = js.native
  @JSImport("@pulumi/aws", "iam.PolicyAttachment.get")
  @js.native
  def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.policyAttachmentMod.PolicyAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "iam.PolicyAttachment.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policyAttachment.PolicyAttachment */ Boolean = js.native
}
