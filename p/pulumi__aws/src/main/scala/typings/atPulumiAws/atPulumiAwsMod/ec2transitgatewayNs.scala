package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.ec2transitgatewayGetDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentArgs
import typings.atPulumiAws.ec2transitgatewayGetDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentResult
import typings.atPulumiAws.ec2transitgatewayGetRouteTableMod.GetRouteTableArgs
import typings.atPulumiAws.ec2transitgatewayGetRouteTableMod.GetRouteTableResult
import typings.atPulumiAws.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayArgs
import typings.atPulumiAws.ec2transitgatewayGetTransitGatewayMod.GetTransitGatewayResult
import typings.atPulumiAws.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentArgs
import typings.atPulumiAws.ec2transitgatewayGetVpcAttachmentMod.GetVpcAttachmentResult
import typings.atPulumiAws.ec2transitgatewayGetVpnAttachmentMod.GetVpnAttachmentArgs
import typings.atPulumiAws.ec2transitgatewayGetVpnAttachmentMod.GetVpnAttachmentResult
import typings.atPulumiAws.ec2transitgatewayRouteMod.RouteArgs
import typings.atPulumiAws.ec2transitgatewayRouteMod.RouteState
import typings.atPulumiAws.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociationArgs
import typings.atPulumiAws.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociationState
import typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTableArgs
import typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTableState
import typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagationArgs
import typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagationState
import typings.atPulumiAws.ec2transitgatewayTransitGatewayMod.TransitGatewayArgs
import typings.atPulumiAws.ec2transitgatewayTransitGatewayMod.TransitGatewayState
import typings.atPulumiAws.ec2transitgatewayVpcAttachmentAccepterMod.VpcAttachmentAccepterArgs
import typings.atPulumiAws.ec2transitgatewayVpcAttachmentAccepterMod.VpcAttachmentAccepterState
import typings.atPulumiAws.ec2transitgatewayVpcAttachmentMod.VpcAttachmentArgs
import typings.atPulumiAws.ec2transitgatewayVpcAttachmentMod.VpcAttachmentState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2transitgateway")
@js.native
object ec2transitgatewayNs extends js.Object {
  @js.native
  class Route protected ()
    extends typings.atPulumiAws.ec2transitgatewayMod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTable protected ()
    extends typings.atPulumiAws.ec2transitgatewayMod.RouteTable {
    /**
      * Create a RouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableArgs) = this()
    def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTableAssociation protected ()
    extends typings.atPulumiAws.ec2transitgatewayMod.RouteTableAssociation {
    /**
      * Create a RouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableAssociationArgs) = this()
    def this(name: String, args: RouteTableAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RouteTablePropagation protected ()
    extends typings.atPulumiAws.ec2transitgatewayMod.RouteTablePropagation {
    /**
      * Create a RouteTablePropagation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTablePropagationArgs) = this()
    def this(name: String, args: RouteTablePropagationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TransitGateway protected ()
    extends typings.atPulumiAws.ec2transitgatewayMod.TransitGateway {
    /**
      * Create a TransitGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TransitGatewayArgs) = this()
    def this(name: String, args: TransitGatewayArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcAttachment protected ()
    extends typings.atPulumiAws.ec2transitgatewayMod.VpcAttachment {
    /**
      * Create a VpcAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentArgs) = this()
    def this(name: String, args: VpcAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class VpcAttachmentAccepter protected ()
    extends typings.atPulumiAws.ec2transitgatewayMod.VpcAttachmentAccepter {
    /**
      * Create a VpcAttachmentAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentAccepterArgs) = this()
    def this(name: String, args: VpcAttachmentAccepterArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs): js.Promise[GetDirectConnectGatewayAttachmentResult] with GetDirectConnectGatewayAttachmentResult = js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] with GetDirectConnectGatewayAttachmentResult = js.native
  def getRouteTable(): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getTransitGateway(): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] with GetTransitGatewayResult = js.native
  def getVpcAttachment(): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] with GetVpcAttachmentResult = js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] with GetVpnAttachmentResult = js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] with GetVpnAttachmentResult = js.native
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState): typings.atPulumiAws.ec2transitgatewayRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayRouteMod.Route = js.native
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTable = js.native
    def get(name: String, id: Input[ID], state: RouteTableState): typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTable = js.native
    def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayRouteTableMod.RouteTable = js.native
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState): typings.atPulumiAws.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayRouteTableAssociationMod.RouteTableAssociation = js.native
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTableAssociation.RouteTableAssociation */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState): typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod.RouteTablePropagation = js.native
    /**
      * Returns true if the given object is an instance of RouteTablePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayTransitGatewayMod.TransitGateway = js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState): typings.atPulumiAws.ec2transitgatewayTransitGatewayMod.TransitGateway = js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayTransitGatewayMod.TransitGateway = js.native
    /**
      * Returns true if the given object is an instance of TransitGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState): typings.atPulumiAws.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
    /**
      * Returns true if the given object is an instance of VpcAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VpcAttachmentAccepter extends js.Object {
    /**
      * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2transitgatewayVpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): typings.atPulumiAws.ec2transitgatewayVpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): typings.atPulumiAws.ec2transitgatewayVpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    /**
      * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = js.native
  }
  
}

