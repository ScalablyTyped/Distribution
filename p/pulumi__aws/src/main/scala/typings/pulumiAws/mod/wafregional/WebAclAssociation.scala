package typings.pulumiAws.mod.wafregional

import typings.pulumiAws.webAclAssociationMod.WebAclAssociationArgs
import typings.pulumiAws.webAclAssociationMod.WebAclAssociationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "wafregional.WebAclAssociation")
@js.native
class WebAclAssociation protected ()
  extends typings.pulumiAws.wafregionalMod.WebAclAssociation {
  /**
    * Create a WebAclAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: WebAclAssociationArgs) = this()
  def this(name: String, args: WebAclAssociationArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "wafregional.WebAclAssociation")
@js.native
object WebAclAssociation extends js.Object {
  
  /**
    * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
  def get(name: String, id: Input[ID], state: WebAclAssociationState): typings.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
  def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): typings.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAclAssociation.WebAclAssociation */ Boolean = js.native
}
