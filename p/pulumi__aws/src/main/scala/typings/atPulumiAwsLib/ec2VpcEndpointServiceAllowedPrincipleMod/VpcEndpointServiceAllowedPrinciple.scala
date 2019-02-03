package typings
package atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple")
@js.native
class VpcEndpointServiceAllowedPrinciple protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpcEndpointServiceAllowedPrinciple resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcEndpointServiceAllowedPrincipleArgs) = this()
  def this(name: java.lang.String, args: VpcEndpointServiceAllowedPrincipleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the principal to allow permissions.
    */
  val principalArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the VPC endpoint service to allow permission.
    */
  val vpcEndpointServiceId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple")
@js.native
object VpcEndpointServiceAllowedPrinciple extends js.Object {
  /**
    * Get an existing VpcEndpointServiceAllowedPrinciple resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrinciple = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrincipleState
  ): atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrinciple = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrincipleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod.VpcEndpointServiceAllowedPrinciple = js.native
}

