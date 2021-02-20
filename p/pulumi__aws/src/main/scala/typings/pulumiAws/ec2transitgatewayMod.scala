package typings.pulumiAws

import typings.pulumiAws.ec2transitgatewayRouteMod.RouteArgs
import typings.pulumiAws.ec2transitgatewayRouteMod.RouteState
import typings.pulumiAws.getDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentArgs
import typings.pulumiAws.getDirectConnectGatewayAttachmentMod.GetDirectConnectGatewayAttachmentResult
import typings.pulumiAws.getPeeringAttachmentMod.GetPeeringAttachmentArgs
import typings.pulumiAws.getPeeringAttachmentMod.GetPeeringAttachmentResult
import typings.pulumiAws.getRouteTableMod.GetRouteTableArgs
import typings.pulumiAws.getRouteTableMod.GetRouteTableResult
import typings.pulumiAws.getTransitGatewayMod.GetTransitGatewayArgs
import typings.pulumiAws.getTransitGatewayMod.GetTransitGatewayResult
import typings.pulumiAws.getVpcAttachmentMod.GetVpcAttachmentArgs
import typings.pulumiAws.getVpcAttachmentMod.GetVpcAttachmentResult
import typings.pulumiAws.getVpnAttachmentMod.GetVpnAttachmentArgs
import typings.pulumiAws.getVpnAttachmentMod.GetVpnAttachmentResult
import typings.pulumiAws.peeringAttachmentMod.PeeringAttachmentArgs
import typings.pulumiAws.peeringAttachmentMod.PeeringAttachmentState
import typings.pulumiAws.routeTableAssociationMod.RouteTableAssociationArgs
import typings.pulumiAws.routeTableAssociationMod.RouteTableAssociationState
import typings.pulumiAws.routeTableMod.RouteTableArgs
import typings.pulumiAws.routeTableMod.RouteTableState
import typings.pulumiAws.routeTablePropagationMod.RouteTablePropagationArgs
import typings.pulumiAws.routeTablePropagationMod.RouteTablePropagationState
import typings.pulumiAws.transitGatewayMod.TransitGatewayArgs
import typings.pulumiAws.transitGatewayMod.TransitGatewayState
import typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepterArgs
import typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepterState
import typings.pulumiAws.vpcAttachmentMod.VpcAttachmentArgs
import typings.pulumiAws.vpcAttachmentMod.VpcAttachmentState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2transitgatewayMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment")
  @js.native
  class PeeringAttachment protected ()
    extends typings.pulumiAws.peeringAttachmentMod.PeeringAttachment {
    /**
      * Create a PeeringAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PeeringAttachmentArgs) = this()
    def this(name: String, args: PeeringAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PeeringAttachment {
    
    /**
      * Get an existing PeeringAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PeeringAttachmentState): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PeeringAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of PeeringAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "PeeringAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "Route")
  @js.native
  class Route protected ()
    extends typings.pulumiAws.ec2transitgatewayRouteMod.Route {
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
  /* static members */
  object Route {
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState): typings.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.pulumiAws.ec2transitgatewayRouteMod.Route = js.native
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "Route.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable")
  @js.native
  class RouteTable protected ()
    extends typings.pulumiAws.routeTableMod.RouteTable {
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
  /* static members */
  object RouteTable {
    
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTableMod.RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.routeTableMod.RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableState): typings.pulumiAws.routeTableMod.RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): typings.pulumiAws.routeTableMod.RouteTable = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTable.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation")
  @js.native
  class RouteTableAssociation protected ()
    extends typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation {
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
  /* static members */
  object RouteTableAssociation {
    
    /**
      * Get an existing RouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState, opts: CustomResourceOptions): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTableAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTableAssociation.RouteTableAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation")
  @js.native
  class RouteTablePropagation protected ()
    extends typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation {
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
  /* static members */
  object RouteTablePropagation {
    
    /**
      * Get an existing RouteTablePropagation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTablePropagationState, opts: CustomResourceOptions): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTablePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "RouteTablePropagation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway")
  @js.native
  class TransitGateway protected ()
    extends typings.pulumiAws.transitGatewayMod.TransitGateway {
    /**
      * Create a TransitGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TransitGatewayArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TransitGatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TransitGateway {
    
    /**
      * Get an existing TransitGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.transitGatewayMod.TransitGateway = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.transitGatewayMod.TransitGateway = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState): typings.pulumiAws.transitGatewayMod.TransitGateway = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: TransitGatewayState, opts: CustomResourceOptions): typings.pulumiAws.transitGatewayMod.TransitGateway = js.native
    
    /**
      * Returns true if the given object is an instance of TransitGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "TransitGateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment")
  @js.native
  class VpcAttachment protected ()
    extends typings.pulumiAws.vpcAttachmentMod.VpcAttachment {
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
  /* static members */
  object VpcAttachment {
    
    /**
      * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of VpcAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter")
  @js.native
  class VpcAttachmentAccepter protected ()
    extends typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter {
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
  /* static members */
  object VpcAttachmentAccepter {
    
    /**
      * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway", "VpcAttachmentAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getDirectConnectGatewayAttachment")
  @js.native
  def getDirectConnectGatewayAttachment(): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getDirectConnectGatewayAttachment")
  @js.native
  def getDirectConnectGatewayAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getDirectConnectGatewayAttachment")
  @js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getDirectConnectGatewayAttachment")
  @js.native
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: GetPeeringAttachmentArgs): js.Promise[GetPeeringAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getPeeringAttachment")
  @js.native
  def getPeeringAttachment(args: GetPeeringAttachmentArgs, opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getRouteTable")
  @js.native
  def getRouteTable(): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getRouteTable")
  @js.native
  def getRouteTable(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getRouteTable")
  @js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getRouteTable")
  @js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getTransitGateway")
  @js.native
  def getTransitGateway(): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getTransitGateway")
  @js.native
  def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpcAttachment")
  @js.native
  def getVpcAttachment(): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs): js.Promise[GetVpcAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpcAttachment")
  @js.native
  def getVpcAttachment(args: GetVpcAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = js.native
  
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpnAttachment")
  @js.native
  def getVpnAttachment(): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] = js.native
  @JSImport("@pulumi/aws/ec2transitgateway", "getVpnAttachment")
  @js.native
  def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = js.native
}
