package typings.pulumiAws.mod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2transitgateway {
  
  @JSImport("@pulumi/aws", "ec2transitgateway")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "ec2transitgateway.PeeringAttachment")
  @js.native
  class PeeringAttachment protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.PeeringAttachment {
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
    
    @JSImport("@pulumi/aws", "ec2transitgateway.PeeringAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PeeringAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.peeringAttachmentMod.PeeringAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.peeringAttachmentMod.PeeringAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: PeeringAttachmentState): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.peeringAttachmentMod.PeeringAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: PeeringAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.peeringAttachmentMod.PeeringAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.peeringAttachmentMod.PeeringAttachment]
    
    /**
      * Returns true if the given object is an instance of PeeringAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ec2transitgateway.Route")
  @js.native
  class Route protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.Route {
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
    
    @JSImport("@pulumi/aws", "ec2transitgateway.Route")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.ec2transitgatewayRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2transitgatewayRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ec2transitgatewayRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2transitgatewayRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState): typings.pulumiAws.ec2transitgatewayRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2transitgatewayRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.pulumiAws.ec2transitgatewayRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2transitgatewayRouteMod.Route]
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ec2transitgateway.RouteTable")
  @js.native
  class RouteTable protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.RouteTable {
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
    
    @JSImport("@pulumi/aws", "ec2transitgateway.RouteTable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTableMod.RouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTableMod.RouteTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.routeTableMod.RouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTableMod.RouteTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteTableState): typings.pulumiAws.routeTableMod.RouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTableMod.RouteTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): typings.pulumiAws.routeTableMod.RouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTableMod.RouteTable]
    
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ec2transitgateway.RouteTableAssociation")
  @js.native
  class RouteTableAssociation protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.RouteTableAssociation {
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
    
    @JSImport("@pulumi/aws", "ec2transitgateway.RouteTableAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteTableAssociationState): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteTableAssociationState, opts: CustomResourceOptions): typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTableAssociationMod.RouteTableAssociation]
    
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTableAssociation.RouteTableAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTableAssociation.RouteTableAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ec2transitgateway.RouteTablePropagation")
  @js.native
  class RouteTablePropagation protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.RouteTablePropagation {
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
    
    @JSImport("@pulumi/aws", "ec2transitgateway.RouteTablePropagation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RouteTablePropagation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteTablePropagationState): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteTablePropagationState, opts: CustomResourceOptions): typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.routeTablePropagationMod.RouteTablePropagation]
    
    /**
      * Returns true if the given object is an instance of RouteTablePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ec2transitgateway.TransitGateway")
  @js.native
  class TransitGateway protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.TransitGateway {
    /**
      * Create a TransitGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TransitGatewayArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TransitGatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TransitGateway {
    
    @JSImport("@pulumi/aws", "ec2transitgateway.TransitGateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TransitGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.transitGatewayMod.TransitGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transitGatewayMod.TransitGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.transitGatewayMod.TransitGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transitGatewayMod.TransitGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: TransitGatewayState): typings.pulumiAws.transitGatewayMod.TransitGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transitGatewayMod.TransitGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: TransitGatewayState, opts: CustomResourceOptions): typings.pulumiAws.transitGatewayMod.TransitGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transitGatewayMod.TransitGateway]
    
    /**
      * Returns true if the given object is an instance of TransitGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ec2transitgateway.VpcAttachment")
  @js.native
  class VpcAttachment protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.VpcAttachment {
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
    
    @JSImport("@pulumi/aws", "ec2transitgateway.VpcAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAttachmentMod.VpcAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAttachmentMod.VpcAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcAttachmentState): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAttachmentMod.VpcAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentMod.VpcAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAttachmentMod.VpcAttachment]
    
    /**
      * Returns true if the given object is an instance of VpcAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "ec2transitgateway.VpcAttachmentAccepter")
  @js.native
  class VpcAttachmentAccepter protected ()
    extends typings.pulumiAws.ec2transitgatewayMod.VpcAttachmentAccepter {
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
    
    @JSImport("@pulumi/aws", "ec2transitgateway.VpcAttachmentAccepter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAttachmentAccepterMod.VpcAttachmentAccepter]
    
    /**
      * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean]
  }
  
  @scala.inline
  def getDirectConnectGatewayAttachment(): js.Promise[GetDirectConnectGatewayAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnectGatewayAttachment")().asInstanceOf[js.Promise[GetDirectConnectGatewayAttachmentResult]]
  @scala.inline
  def getDirectConnectGatewayAttachment(args: Unit, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnectGatewayAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDirectConnectGatewayAttachmentResult]]
  @scala.inline
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs): js.Promise[GetDirectConnectGatewayAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnectGatewayAttachment")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDirectConnectGatewayAttachmentResult]]
  @scala.inline
  def getDirectConnectGatewayAttachment(args: GetDirectConnectGatewayAttachmentArgs, opts: InvokeOptions): js.Promise[GetDirectConnectGatewayAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnectGatewayAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDirectConnectGatewayAttachmentResult]]
  
  @scala.inline
  def getPeeringAttachment(): js.Promise[GetPeeringAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeeringAttachment")().asInstanceOf[js.Promise[GetPeeringAttachmentResult]]
  @scala.inline
  def getPeeringAttachment(args: Unit, opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPeeringAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPeeringAttachmentResult]]
  @scala.inline
  def getPeeringAttachment(args: GetPeeringAttachmentArgs): js.Promise[GetPeeringAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeeringAttachment")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPeeringAttachmentResult]]
  @scala.inline
  def getPeeringAttachment(args: GetPeeringAttachmentArgs, opts: InvokeOptions): js.Promise[GetPeeringAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPeeringAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPeeringAttachmentResult]]
  
  @scala.inline
  def getRouteTable(): js.Promise[GetRouteTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")().asInstanceOf[js.Promise[GetRouteTableResult]]
  @scala.inline
  def getRouteTable(args: Unit, opts: InvokeOptions): js.Promise[GetRouteTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteTableResult]]
  @scala.inline
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRouteTableResult]]
  @scala.inline
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteTableResult]]
  
  @scala.inline
  def getTransitGateway(): js.Promise[GetTransitGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitGateway")().asInstanceOf[js.Promise[GetTransitGatewayResult]]
  @scala.inline
  def getTransitGateway(args: Unit, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTransitGatewayResult]]
  @scala.inline
  def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTransitGatewayResult]]
  @scala.inline
  def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTransitGatewayResult]]
  
  @scala.inline
  def getVpcAttachment(): js.Promise[GetVpcAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpcAttachment")().asInstanceOf[js.Promise[GetVpcAttachmentResult]]
  @scala.inline
  def getVpcAttachment(args: Unit, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpcAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpcAttachmentResult]]
  @scala.inline
  def getVpcAttachment(args: GetVpcAttachmentArgs): js.Promise[GetVpcAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpcAttachment")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVpcAttachmentResult]]
  @scala.inline
  def getVpcAttachment(args: GetVpcAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpcAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpcAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpcAttachmentResult]]
  
  @scala.inline
  def getVpnAttachment(): js.Promise[GetVpnAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpnAttachment")().asInstanceOf[js.Promise[GetVpnAttachmentResult]]
  @scala.inline
  def getVpnAttachment(args: Unit, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpnAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpnAttachmentResult]]
  @scala.inline
  def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpnAttachment")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVpnAttachmentResult]]
  @scala.inline
  def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpnAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpnAttachmentResult]]
}
