package typings
package atPulumiAwsLib.awsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2transitgateway")
@js.native
object ec2transitgatewayNs extends js.Object {
  @js.native
  class Route protected ()
    extends atPulumiAwsLib.ec2transitgatewayMod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayRouteMod.RouteArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayRouteMod.RouteArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTable protected ()
    extends atPulumiAwsLib.ec2transitgatewayMod.RouteTable {
    /**
      * Create a RouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayRouteTableMod.RouteTableArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayRouteTableMod.RouteTableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTableAssociation protected ()
    extends atPulumiAwsLib.ec2transitgatewayMod.RouteTableAssociation {
    /**
      * Create a RouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTablePropagation protected ()
    extends atPulumiAwsLib.ec2transitgatewayMod.RouteTablePropagation {
    /**
      * Create a RouteTablePropagation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TransitGateway protected ()
    extends atPulumiAwsLib.ec2transitgatewayMod.TransitGateway {
    /**
      * Create a TransitGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayTransitGatewayMod.TransitGatewayArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayTransitGatewayMod.TransitGatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcAttachment protected ()
    extends atPulumiAwsLib.ec2transitgatewayMod.VpcAttachment {
    /**
      * Create a VpcAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getRouteTable(): js.Promise[atPulumiAwsLib.ec2transitgatewayGetRouteTableMod.GetRouteTableResult] = js.native
  def getRouteTable(args: atPulumiAwsLib.ec2transitgatewayGetRouteTableMod.GetRouteTableArgs): js.Promise[atPulumiAwsLib.ec2transitgatewayGetRouteTableMod.GetRouteTableResult] = js.native
  def getRouteTable(
    args: atPulumiAwsLib.ec2transitgatewayGetRouteTableMod.GetRouteTableArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2transitgatewayGetRouteTableMod.GetRouteTableResult] = js.native
  def getTransitGateway(): js.Promise[atPulumiAwsLib.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayResult] = js.native
  def getTransitGateway(args: atPulumiAwsLib.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayArgs): js.Promise[atPulumiAwsLib.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayResult] = js.native
  def getTransitGateway(
    args: atPulumiAwsLib.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayResult] = js.native
  def getVpcAttachment(): js.Promise[atPulumiAwsLib.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentResult] = js.native
  def getVpcAttachment(args: atPulumiAwsLib.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentArgs): js.Promise[atPulumiAwsLib.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentResult] = js.native
  def getVpcAttachment(
    args: atPulumiAwsLib.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentResult] = js.native
  @js.native
  object Route extends js.Object {
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayRouteMod.Route = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayRouteMod.RouteState
    ): atPulumiAwsLib.ec2transitgatewayRouteMod.Route = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayRouteMod.RouteState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2transitgatewayRouteMod.Route = js.native
  }
  
  @js.native
  object RouteTable extends js.Object {
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayRouteTableMod.RouteTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayRouteTableMod.RouteTableState
    ): atPulumiAwsLib.ec2transitgatewayRouteTableMod.RouteTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayRouteTableMod.RouteTableState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2transitgatewayRouteTableMod.RouteTable = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociationState
    ): atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
  }
  
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
  
  @js.native
  object TransitGateway extends js.Object {
    /**
      * Get an existing TransitGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayTransitGatewayMod.TransitGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayTransitGatewayMod.TransitGatewayState
    ): atPulumiAwsLib.ec2transitgatewayTransitGatewayMod.TransitGateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayTransitGatewayMod.TransitGatewayState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2transitgatewayTransitGatewayMod.TransitGateway = js.native
  }
  
  @js.native
  object VpcAttachment extends js.Object {
    /**
      * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachmentState
    ): atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
  }
  
}

