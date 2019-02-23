package typings
package atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway/routeTableAssociation", "RouteTableAssociation")
@js.native
class RouteTableAssociation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a RouteTableAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RouteTableAssociationArgs) = this()
  def this(name: java.lang.String, args: RouteTableAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Identifier of the resource
    */
  val resourceId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Type of the resource
    */
  val resourceType: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway/routeTableAssociation", "RouteTableAssociation")
@js.native
object RouteTableAssociation extends js.Object {
  /**
    * Get an existing RouteTableAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociationState
  ): atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
}

