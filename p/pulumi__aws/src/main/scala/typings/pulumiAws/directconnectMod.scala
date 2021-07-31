package typings.pulumiAws

import typings.pulumiAws.bgpPeerMod.BgpPeerArgs
import typings.pulumiAws.bgpPeerMod.BgpPeerState
import typings.pulumiAws.connectionAssociationMod.ConnectionAssociationArgs
import typings.pulumiAws.connectionAssociationMod.ConnectionAssociationState
import typings.pulumiAws.connectionMod.ConnectionArgs
import typings.pulumiAws.connectionMod.ConnectionState
import typings.pulumiAws.gatewayAssociationMod.GatewayAssociationArgs
import typings.pulumiAws.gatewayAssociationMod.GatewayAssociationState
import typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposalArgs
import typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposalState
import typings.pulumiAws.gatewayMod.GatewayArgs
import typings.pulumiAws.gatewayMod.GatewayState
import typings.pulumiAws.getGatewayMod.GetGatewayArgs
import typings.pulumiAws.getGatewayMod.GetGatewayResult
import typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterArgs
import typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterState
import typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceArgs
import typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceState
import typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterArgs
import typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterState
import typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceArgs
import typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceState
import typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptorArgs
import typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptorState
import typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterfaceArgs
import typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterfaceState
import typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroupArgs
import typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroupState
import typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterfaceArgs
import typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterfaceState
import typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterfaceArgs
import typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterfaceState
import typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterfaceArgs
import typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterfaceState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directconnectMod {
  
  @JSImport("@pulumi/aws/directconnect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/directconnect", "BgpPeer")
  @js.native
  class BgpPeer protected ()
    extends typings.pulumiAws.bgpPeerMod.BgpPeer {
    /**
      * Create a BgpPeer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BgpPeerArgs) = this()
    def this(name: String, args: BgpPeerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BgpPeer {
    
    @JSImport("@pulumi/aws/directconnect", "BgpPeer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BgpPeer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.bgpPeerMod.BgpPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bgpPeerMod.BgpPeer]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bgpPeerMod.BgpPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bgpPeerMod.BgpPeer]
    @scala.inline
    def get(name: String, id: Input[ID], state: BgpPeerState): typings.pulumiAws.bgpPeerMod.BgpPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bgpPeerMod.BgpPeer]
    @scala.inline
    def get(name: String, id: Input[ID], state: BgpPeerState, opts: CustomResourceOptions): typings.pulumiAws.bgpPeerMod.BgpPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bgpPeerMod.BgpPeer]
    
    /**
      * Returns true if the given object is an instance of BgpPeer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "Connection")
  @js.native
  class Connection protected ()
    extends typings.pulumiAws.connectionMod.Connection {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionArgs) = this()
    def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Connection {
    
    @JSImport("@pulumi/aws/directconnect", "Connection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.connectionMod.Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.connectionMod.Connection]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.connectionMod.Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.connectionMod.Connection]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConnectionState): typings.pulumiAws.connectionMod.Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.connectionMod.Connection]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typings.pulumiAws.connectionMod.Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.connectionMod.Connection]
    
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connection.Connection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/connection.Connection */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "ConnectionAssociation")
  @js.native
  class ConnectionAssociation protected ()
    extends typings.pulumiAws.connectionAssociationMod.ConnectionAssociation {
    /**
      * Create a ConnectionAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionAssociationArgs) = this()
    def this(name: String, args: ConnectionAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConnectionAssociation {
    
    @JSImport("@pulumi/aws/directconnect", "ConnectionAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConnectionAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.connectionAssociationMod.ConnectionAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.connectionAssociationMod.ConnectionAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.connectionAssociationMod.ConnectionAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.connectionAssociationMod.ConnectionAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConnectionAssociationState): typings.pulumiAws.connectionAssociationMod.ConnectionAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.connectionAssociationMod.ConnectionAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ConnectionAssociationState, opts: CustomResourceOptions): typings.pulumiAws.connectionAssociationMod.ConnectionAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.connectionAssociationMod.ConnectionAssociation]
    
    /**
      * Returns true if the given object is an instance of ConnectionAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connectionAssociation.ConnectionAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/connectionAssociation.ConnectionAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "Gateway")
  @js.native
  class Gateway protected ()
    extends typings.pulumiAws.gatewayMod.Gateway {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayArgs) = this()
    def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Gateway {
    
    @JSImport("@pulumi/aws/directconnect", "Gateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.gatewayMod.Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayMod.Gateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.gatewayMod.Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayMod.Gateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayState): typings.pulumiAws.gatewayMod.Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayMod.Gateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typings.pulumiAws.gatewayMod.Gateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayMod.Gateway]
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "GatewayAssociation")
  @js.native
  class GatewayAssociation protected ()
    extends typings.pulumiAws.gatewayAssociationMod.GatewayAssociation {
    /**
      * Create a GatewayAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayAssociationArgs) = this()
    def this(name: String, args: GatewayAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GatewayAssociation {
    
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GatewayAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.gatewayAssociationMod.GatewayAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayAssociationMod.GatewayAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.gatewayAssociationMod.GatewayAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayAssociationMod.GatewayAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayAssociationState): typings.pulumiAws.gatewayAssociationMod.GatewayAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayAssociationMod.GatewayAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayAssociationState, opts: CustomResourceOptions): typings.pulumiAws.gatewayAssociationMod.GatewayAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayAssociationMod.GatewayAssociation]
    
    /**
      * Returns true if the given object is an instance of GatewayAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal")
  @js.native
  class GatewayAssociationProposal protected ()
    extends typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal {
    /**
      * Create a GatewayAssociationProposal resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayAssociationProposalArgs) = this()
    def this(name: String, args: GatewayAssociationProposalArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GatewayAssociationProposal {
    
    @JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GatewayAssociationProposal resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayAssociationProposalState): typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayAssociationProposalState, opts: CustomResourceOptions): typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayAssociationProposalMod.GatewayAssociationProposal]
    
    /**
      * Returns true if the given object is an instance of GatewayAssociationProposal.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociationProposal.GatewayAssociationProposal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociationProposal.GatewayAssociationProposal */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterface")
  @js.native
  class HostedPrivateVirtualInterface protected ()
    extends typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface {
    /**
      * Create a HostedPrivateVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPrivateVirtualInterfaceArgs) = this()
    def this(name: String, args: HostedPrivateVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedPrivateVirtualInterface {
    
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HostedPrivateVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceState): typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: HostedPrivateVirtualInterfaceState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface]
    
    /**
      * Returns true if the given object is an instance of HostedPrivateVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterface.HostedPrivateVirtualInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterface.HostedPrivateVirtualInterface */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter")
  @js.native
  class HostedPrivateVirtualInterfaceAccepter protected ()
    extends typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter {
    /**
      * Create a HostedPrivateVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs) = this()
    def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedPrivateVirtualInterfaceAccepter {
    
    @JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HostedPrivateVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceAccepterState): typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: HostedPrivateVirtualInterfaceAccepterState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter]
    
    /**
      * Returns true if the given object is an instance of HostedPrivateVirtualInterfaceAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter.HostedPrivateVirtualInterfaceAccepter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter.HostedPrivateVirtualInterfaceAccepter */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterface")
  @js.native
  class HostedPublicVirtualInterface protected ()
    extends typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface {
    /**
      * Create a HostedPublicVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPublicVirtualInterfaceArgs) = this()
    def this(name: String, args: HostedPublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedPublicVirtualInterface {
    
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HostedPublicVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceState): typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceState, opts: CustomResourceOptions): typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface]
    
    /**
      * Returns true if the given object is an instance of HostedPublicVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterface.HostedPublicVirtualInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterface.HostedPublicVirtualInterface */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter")
  @js.native
  class HostedPublicVirtualInterfaceAccepter protected ()
    extends typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter {
    /**
      * Create a HostedPublicVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPublicVirtualInterfaceAccepterArgs) = this()
    def this(name: String, args: HostedPublicVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedPublicVirtualInterfaceAccepter {
    
    @JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HostedPublicVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceAccepterState): typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: HostedPublicVirtualInterfaceAccepterState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter]
    
    /**
      * Returns true if the given object is an instance of HostedPublicVirtualInterfaceAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter.HostedPublicVirtualInterfaceAccepter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter.HostedPublicVirtualInterfaceAccepter */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface")
  @js.native
  class HostedTransitVirtualInterface protected ()
    extends typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface {
    /**
      * Create a HostedTransitVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedTransitVirtualInterfaceArgs) = this()
    def this(name: String, args: HostedTransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedTransitVirtualInterface {
    
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HostedTransitVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceState): typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: HostedTransitVirtualInterfaceState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface]
    
    /**
      * Returns true if the given object is an instance of HostedTransitVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterface.HostedTransitVirtualInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterface.HostedTransitVirtualInterface */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor")
  @js.native
  class HostedTransitVirtualInterfaceAcceptor protected ()
    extends typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor {
    /**
      * Create a HostedTransitVirtualInterfaceAcceptor resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs) = this()
    def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object HostedTransitVirtualInterfaceAcceptor {
    
    @JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterfaceAcceptor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HostedTransitVirtualInterfaceAcceptor resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor]
    @scala.inline
    def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceAcceptorState): typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: HostedTransitVirtualInterfaceAcceptorState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod.HostedTransitVirtualInterfaceAcceptor]
    
    /**
      * Returns true if the given object is an instance of HostedTransitVirtualInterfaceAcceptor.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor.HostedTransitVirtualInterfaceAcceptor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor.HostedTransitVirtualInterfaceAcceptor */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "LinkAggregationGroup")
  @js.native
  class LinkAggregationGroup protected ()
    extends typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup {
    /**
      * Create a LinkAggregationGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LinkAggregationGroupArgs) = this()
    def this(name: String, args: LinkAggregationGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LinkAggregationGroup {
    
    @JSImport("@pulumi/aws/directconnect", "LinkAggregationGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LinkAggregationGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: LinkAggregationGroupState): typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: LinkAggregationGroupState, opts: CustomResourceOptions): typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.linkAggregationGroupMod.LinkAggregationGroup]
    
    /**
      * Returns true if the given object is an instance of LinkAggregationGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/linkAggregationGroup.LinkAggregationGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/linkAggregationGroup.LinkAggregationGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface")
  @js.native
  class PrivateVirtualInterface protected ()
    extends typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface {
    /**
      * Create a PrivateVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrivateVirtualInterfaceArgs) = this()
    def this(name: String, args: PrivateVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PrivateVirtualInterface {
    
    @JSImport("@pulumi/aws/directconnect", "PrivateVirtualInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PrivateVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: PrivateVirtualInterfaceState): typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: PrivateVirtualInterfaceState, opts: CustomResourceOptions): typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.privateVirtualInterfaceMod.PrivateVirtualInterface]
    
    /**
      * Returns true if the given object is an instance of PrivateVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/privateVirtualInterface.PrivateVirtualInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/privateVirtualInterface.PrivateVirtualInterface */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "PublicVirtualInterface")
  @js.native
  class PublicVirtualInterface protected ()
    extends typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface {
    /**
      * Create a PublicVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublicVirtualInterfaceArgs) = this()
    def this(name: String, args: PublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PublicVirtualInterface {
    
    @JSImport("@pulumi/aws/directconnect", "PublicVirtualInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PublicVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState): typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState, opts: CustomResourceOptions): typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface]
    
    /**
      * Returns true if the given object is an instance of PublicVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean]
  }
  
  @JSImport("@pulumi/aws/directconnect", "TransitVirtualInterface")
  @js.native
  class TransitVirtualInterface protected ()
    extends typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface {
    /**
      * Create a TransitVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TransitVirtualInterfaceArgs) = this()
    def this(name: String, args: TransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TransitVirtualInterface {
    
    @JSImport("@pulumi/aws/directconnect", "TransitVirtualInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TransitVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState): typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState, opts: CustomResourceOptions): typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface]
    
    /**
      * Returns true if the given object is an instance of TransitVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/transitVirtualInterface.TransitVirtualInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/transitVirtualInterface.TransitVirtualInterface */ Boolean]
  }
  
  @scala.inline
  def getGateway(args: GetGatewayArgs): js.Promise[GetGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetGatewayResult]]
  @scala.inline
  def getGateway(args: GetGatewayArgs, opts: InvokeOptions): js.Promise[GetGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetGatewayResult]]
}
