package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.directconnectBgpPeerMod.BgpPeerArgs
import typings.atPulumiAws.directconnectBgpPeerMod.BgpPeerState
import typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociationArgs
import typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociationState
import typings.atPulumiAws.directconnectConnectionMod.ConnectionArgs
import typings.atPulumiAws.directconnectConnectionMod.ConnectionState
import typings.atPulumiAws.directconnectGatewayAssociationMod.GatewayAssociationArgs
import typings.atPulumiAws.directconnectGatewayAssociationMod.GatewayAssociationState
import typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposalArgs
import typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposalState
import typings.atPulumiAws.directconnectGatewayMod.GatewayArgs
import typings.atPulumiAws.directconnectGatewayMod.GatewayState
import typings.atPulumiAws.directconnectGetGatewayMod.GetGatewayArgs
import typings.atPulumiAws.directconnectGetGatewayMod.GetGatewayResult
import typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterArgs
import typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterState
import typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceArgs
import typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceState
import typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterArgs
import typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterState
import typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceArgs
import typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceState
import typings.atPulumiAws.directconnectLinkAggregationGroupMod.LinkAggregationGroupArgs
import typings.atPulumiAws.directconnectLinkAggregationGroupMod.LinkAggregationGroupState
import typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceArgs
import typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceState
import typings.atPulumiAws.directconnectPublicVirtualInterfaceMod.PublicVirtualInterfaceArgs
import typings.atPulumiAws.directconnectPublicVirtualInterfaceMod.PublicVirtualInterfaceState
import typings.atPulumiAws.directconnectTransitVirtualInterfaceMod.TransitVirtualInterfaceArgs
import typings.atPulumiAws.directconnectTransitVirtualInterfaceMod.TransitVirtualInterfaceState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect")
@js.native
object directconnectNs extends js.Object {
  @js.native
  class BgpPeer protected ()
    extends typings.atPulumiAws.directconnectMod.BgpPeer {
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
  
  @js.native
  class Connection protected ()
    extends typings.atPulumiAws.directconnectMod.Connection {
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
  
  @js.native
  class ConnectionAssociation protected ()
    extends typings.atPulumiAws.directconnectMod.ConnectionAssociation {
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
  
  @js.native
  class Gateway protected ()
    extends typings.atPulumiAws.directconnectMod.Gateway {
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
  
  @js.native
  class GatewayAssociation protected ()
    extends typings.atPulumiAws.directconnectMod.GatewayAssociation {
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
  
  @js.native
  class GatewayAssociationProposal protected ()
    extends typings.atPulumiAws.directconnectMod.GatewayAssociationProposal {
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
  
  @js.native
  class HostedPrivateVirtualInterface protected ()
    extends typings.atPulumiAws.directconnectMod.HostedPrivateVirtualInterface {
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
  
  @js.native
  class HostedPrivateVirtualInterfaceAccepter protected ()
    extends typings.atPulumiAws.directconnectMod.HostedPrivateVirtualInterfaceAccepter {
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
  
  @js.native
  class HostedPublicVirtualInterface protected ()
    extends typings.atPulumiAws.directconnectMod.HostedPublicVirtualInterface {
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
  
  @js.native
  class HostedPublicVirtualInterfaceAccepter protected ()
    extends typings.atPulumiAws.directconnectMod.HostedPublicVirtualInterfaceAccepter {
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
  
  @js.native
  class LinkAggregationGroup protected ()
    extends typings.atPulumiAws.directconnectMod.LinkAggregationGroup {
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
  
  @js.native
  class PrivateVirtualInterface protected ()
    extends typings.atPulumiAws.directconnectMod.PrivateVirtualInterface {
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
  
  @js.native
  class PublicVirtualInterface protected ()
    extends typings.atPulumiAws.directconnectMod.PublicVirtualInterface {
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
  
  @js.native
  class TransitVirtualInterface protected ()
    extends typings.atPulumiAws.directconnectMod.TransitVirtualInterface {
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
  
  def getGateway(args: GetGatewayArgs): js.Promise[GetGatewayResult] with GetGatewayResult = js.native
  def getGateway(args: GetGatewayArgs, opts: InvokeOptions): js.Promise[GetGatewayResult] with GetGatewayResult = js.native
  /* static members */
  @js.native
  object BgpPeer extends js.Object {
    /**
      * Get an existing BgpPeer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectBgpPeerMod.BgpPeer = js.native
    def get(name: String, id: Input[ID], state: BgpPeerState): typings.atPulumiAws.directconnectBgpPeerMod.BgpPeer = js.native
    def get(name: String, id: Input[ID], state: BgpPeerState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectBgpPeerMod.BgpPeer = js.native
    /**
      * Returns true if the given object is an instance of BgpPeer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Connection extends js.Object {
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectConnectionMod.Connection = js.native
    def get(name: String, id: Input[ID], state: ConnectionState): typings.atPulumiAws.directconnectConnectionMod.Connection = js.native
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectConnectionMod.Connection = js.native
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connection.Connection */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ConnectionAssociation extends js.Object {
    /**
      * Get an existing ConnectionAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
    def get(name: String, id: Input[ID], state: ConnectionAssociationState): typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
    def get(name: String, id: Input[ID], state: ConnectionAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
    /**
      * Returns true if the given object is an instance of ConnectionAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connectionAssociation.ConnectionAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Gateway extends js.Object {
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: GatewayState): typings.atPulumiAws.directconnectGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectGatewayMod.Gateway = js.native
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GatewayAssociation extends js.Object {
    /**
      * Get an existing GatewayAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectGatewayAssociationMod.GatewayAssociation = js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationState): typings.atPulumiAws.directconnectGatewayAssociationMod.GatewayAssociation = js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectGatewayAssociationMod.GatewayAssociation = js.native
    /**
      * Returns true if the given object is an instance of GatewayAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GatewayAssociationProposal extends js.Object {
    /**
      * Get an existing GatewayAssociationProposal resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposal = js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationProposalState): typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposal = js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationProposalState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposal = js.native
    /**
      * Returns true if the given object is an instance of GatewayAssociationProposal.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociationProposal.GatewayAssociationProposal */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HostedPrivateVirtualInterface extends js.Object {
    /**
      * Get an existing HostedPrivateVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceState): typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedPrivateVirtualInterfaceState,
      opts: CustomResourceOptions
    ): typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    /**
      * Returns true if the given object is an instance of HostedPrivateVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterface.HostedPrivateVirtualInterface */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HostedPrivateVirtualInterfaceAccepter extends js.Object {
    /**
      * Get an existing HostedPrivateVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceAccepterState): typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedPrivateVirtualInterfaceAccepterState,
      opts: CustomResourceOptions
    ): typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    /**
      * Returns true if the given object is an instance of HostedPrivateVirtualInterfaceAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter.HostedPrivateVirtualInterfaceAccepter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HostedPublicVirtualInterface extends js.Object {
    /**
      * Get an existing HostedPublicVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceState): typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    /**
      * Returns true if the given object is an instance of HostedPublicVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterface.HostedPublicVirtualInterface */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HostedPublicVirtualInterfaceAccepter extends js.Object {
    /**
      * Get an existing HostedPublicVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceAccepterState): typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    def get(
      name: String,
      id: Input[ID],
      state: HostedPublicVirtualInterfaceAccepterState,
      opts: CustomResourceOptions
    ): typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    /**
      * Returns true if the given object is an instance of HostedPublicVirtualInterfaceAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter.HostedPublicVirtualInterfaceAccepter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LinkAggregationGroup extends js.Object {
    /**
      * Get an existing LinkAggregationGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
    def get(name: String, id: Input[ID], state: LinkAggregationGroupState): typings.atPulumiAws.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
    def get(name: String, id: Input[ID], state: LinkAggregationGroupState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
    /**
      * Returns true if the given object is an instance of LinkAggregationGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/linkAggregationGroup.LinkAggregationGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PrivateVirtualInterface extends js.Object {
    /**
      * Get an existing PrivateVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: PrivateVirtualInterfaceState): typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: PrivateVirtualInterfaceState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    /**
      * Returns true if the given object is an instance of PrivateVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/privateVirtualInterface.PrivateVirtualInterface */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PublicVirtualInterface extends js.Object {
    /**
      * Get an existing PublicVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectPublicVirtualInterfaceMod.PublicVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState): typings.atPulumiAws.directconnectPublicVirtualInterfaceMod.PublicVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectPublicVirtualInterfaceMod.PublicVirtualInterface = js.native
    /**
      * Returns true if the given object is an instance of PublicVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TransitVirtualInterface extends js.Object {
    /**
      * Get an existing TransitVirtualInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectTransitVirtualInterfaceMod.TransitVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState): typings.atPulumiAws.directconnectTransitVirtualInterfaceMod.TransitVirtualInterface = js.native
    def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectTransitVirtualInterfaceMod.TransitVirtualInterface = js.native
    /**
      * Returns true if the given object is an instance of TransitVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/transitVirtualInterface.TransitVirtualInterface */ Boolean = js.native
  }
  
}

