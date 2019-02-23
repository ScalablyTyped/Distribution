package typings
package atPulumiAwsLib.wafregionalWebAclAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/webAclAssociation", "WebAclAssociation")
@js.native
class WebAclAssociation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a WebAclAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: WebAclAssociationArgs) = this()
  def this(name: java.lang.String, args: WebAclAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Application Load Balancer ARN to associate with.
    */
  val resourceArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the WAF Regional WebACL to create an association.
    */
  val webAclId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/webAclAssociation", "WebAclAssociation")
@js.native
object WebAclAssociation extends js.Object {
  /**
    * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafregionalWebAclAssociationMod.WebAclAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafregionalWebAclAssociationMod.WebAclAssociationState
  ): atPulumiAwsLib.wafregionalWebAclAssociationMod.WebAclAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafregionalWebAclAssociationMod.WebAclAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.wafregionalWebAclAssociationMod.WebAclAssociation = js.native
}

