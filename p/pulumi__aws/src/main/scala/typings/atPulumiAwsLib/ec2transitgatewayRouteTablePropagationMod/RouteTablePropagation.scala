package typings
package atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway/routeTablePropagation", "RouteTablePropagation")
@js.native
class RouteTablePropagation protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a RouteTablePropagation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RouteTablePropagationArgs) = this()
  def this(name: java.lang.String, args: RouteTablePropagationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Identifier of the resource
    */
  val resourceId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Type of the resource
    */
  val resourceType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/ec2transitgateway/routeTablePropagation", "RouteTablePropagation")
@js.native
object RouteTablePropagation extends js.Object {
  /**
    * Get an existing RouteTablePropagation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagationState
  ): atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
}

