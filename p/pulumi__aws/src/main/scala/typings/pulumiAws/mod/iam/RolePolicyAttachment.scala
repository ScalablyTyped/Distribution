package typings.pulumiAws.mod.iam

import typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachmentArgs
import typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachmentState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "iam.RolePolicyAttachment")
@js.native
class RolePolicyAttachment protected ()
  extends typings.pulumiAws.iamMod.RolePolicyAttachment {
  /**
    * Create a RolePolicyAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RolePolicyAttachmentArgs) = this()
  def this(name: String, args: RolePolicyAttachmentArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object RolePolicyAttachment {
  
  @JSImport("@pulumi/aws", "iam.RolePolicyAttachment")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get an existing RolePolicyAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @scala.inline
  def get(name: String, id: Input[ID]): typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment]
  @scala.inline
  def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment]
  @scala.inline
  def get(name: String, id: Input[ID], state: RolePolicyAttachmentState): typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment]
  @scala.inline
  def get(name: String, id: Input[ID], state: RolePolicyAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.rolePolicyAttachmentMod.RolePolicyAttachment]
  
  /**
    * Returns true if the given object is an instance of RolePolicyAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @scala.inline
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/rolePolicyAttachment.RolePolicyAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/rolePolicyAttachment.RolePolicyAttachment */ Boolean]
}
