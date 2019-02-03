package typings
package atPulumiAwsLib.apigatewayVpcLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink")
@js.native
class VpcLink protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpcLink resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcLinkArgs) = this()
  def this(name: java.lang.String, args: VpcLinkArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The description of the VPC link.
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name used to label and identify the VPC link.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
    */
  val targetArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink")
@js.native
object VpcLink extends js.Object {
  /**
    * Get an existing VpcLink resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayVpcLinkMod.VpcLink = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayVpcLinkMod.VpcLinkState
  ): atPulumiAwsLib.apigatewayVpcLinkMod.VpcLink = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayVpcLinkMod.VpcLinkState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayVpcLinkMod.VpcLink = js.native
}

