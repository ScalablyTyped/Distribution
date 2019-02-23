package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect")
@js.native
object directconnectNs extends js.Object {
  @js.native
  class BgpPeer protected ()
    extends atPulumiAwsLib.directconnectMod.BgpPeer {
    /**
      * Create a BgpPeer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectBgpPeerMod.BgpPeerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectBgpPeerMod.BgpPeerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Connection protected ()
    extends atPulumiAwsLib.directconnectMod.Connection {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectConnectionMod.ConnectionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectConnectionMod.ConnectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ConnectionAssociation protected ()
    extends atPulumiAwsLib.directconnectMod.ConnectionAssociation {
    /**
      * Create a ConnectionAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Gateway protected ()
    extends atPulumiAwsLib.directconnectMod.Gateway {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectGatewayMod.GatewayArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectGatewayMod.GatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class GatewayAssociation protected ()
    extends atPulumiAwsLib.directconnectMod.GatewayAssociation {
    /**
      * Create a GatewayAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class HostedPrivateVirtualInterface protected ()
    extends atPulumiAwsLib.directconnectMod.HostedPrivateVirtualInterface {
    /**
      * Create a HostedPrivateVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class HostedPrivateVirtualInterfaceAccepter protected ()
    extends atPulumiAwsLib.directconnectMod.HostedPrivateVirtualInterfaceAccepter {
    /**
      * Create a HostedPrivateVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class HostedPublicVirtualInterface protected ()
    extends atPulumiAwsLib.directconnectMod.HostedPublicVirtualInterface {
    /**
      * Create a HostedPublicVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class HostedPublicVirtualInterfaceAccepter protected ()
    extends atPulumiAwsLib.directconnectMod.HostedPublicVirtualInterfaceAccepter {
    /**
      * Create a HostedPublicVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LinkAggregationGroup protected ()
    extends atPulumiAwsLib.directconnectMod.LinkAggregationGroup {
    /**
      * Create a LinkAggregationGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PrivateVirtualInterface protected ()
    extends atPulumiAwsLib.directconnectMod.PrivateVirtualInterface {
    /**
      * Create a PrivateVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PublicVirtualInterface protected ()
    extends atPulumiAwsLib.directconnectMod.PublicVirtualInterface {
    /**
      * Create a PublicVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectPublicVirtualInterfaceMod.PublicVirtualInterfaceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.directconnectPublicVirtualInterfaceMod.PublicVirtualInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getGateway(args: atPulumiAwsLib.directconnectGetGatewayMod.GetGatewayArgs): js.Promise[atPulumiAwsLib.directconnectGetGatewayMod.GetGatewayResult] = js.native
  def getGateway(
    args: atPulumiAwsLib.directconnectGetGatewayMod.GetGatewayArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.directconnectGetGatewayMod.GetGatewayResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectBgpPeerMod.BgpPeer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectBgpPeerMod.BgpPeerState
    ): atPulumiAwsLib.directconnectBgpPeerMod.BgpPeer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectBgpPeerMod.BgpPeerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectBgpPeerMod.BgpPeer = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectConnectionMod.Connection = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectConnectionMod.ConnectionState
    ): atPulumiAwsLib.directconnectConnectionMod.Connection = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectConnectionMod.ConnectionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectConnectionMod.Connection = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociationState
    ): atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectConnectionAssociationMod.ConnectionAssociation = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectGatewayMod.Gateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectGatewayMod.GatewayState
    ): atPulumiAwsLib.directconnectGatewayMod.Gateway = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectGatewayMod.GatewayState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectGatewayMod.Gateway = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationState
    ): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceState
    ): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterState
    ): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceState
    ): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterState
    ): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroupState
    ): atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectLinkAggregationGroupMod.LinkAggregationGroup = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceState
    ): atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterfaceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectPrivateVirtualInterfaceMod.PrivateVirtualInterface = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectPublicVirtualInterfaceMod.PublicVirtualInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectPublicVirtualInterfaceMod.PublicVirtualInterfaceState
    ): atPulumiAwsLib.directconnectPublicVirtualInterfaceMod.PublicVirtualInterface = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.directconnectPublicVirtualInterfaceMod.PublicVirtualInterfaceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.directconnectPublicVirtualInterfaceMod.PublicVirtualInterface = js.native
  }
  
}

