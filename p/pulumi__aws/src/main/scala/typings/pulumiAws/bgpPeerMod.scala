package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bgpPeerMod {
  
  @JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer")
  @js.native
  class BgpPeer protected () extends CustomResource {
    /**
      * Create a BgpPeer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BgpPeerArgs) = this()
    def this(name: String, args: BgpPeerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: Output_[String] = js.native
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val amazonAddress: Output_[String] = js.native
    
    /**
      * The Direct Connect endpoint on which the BGP peer terminates.
      */
    val awsDevice: Output_[String] = js.native
    
    /**
      * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
      */
    val bgpAsn: Output_[Double] = js.native
    
    /**
      * The authentication key for BGP configuration.
      */
    val bgpAuthKey: Output_[String] = js.native
    
    /**
      * The ID of the BGP peer.
      */
    val bgpPeerId: Output_[String] = js.native
    
    /**
      * The Up/Down state of the BGP peer.
      */
    val bgpStatus: Output_[String] = js.native
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val customerAddress: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect virtual interface on which to create the BGP peer.
      */
    val virtualInterfaceId: Output_[String] = js.native
  }
  /* static members */
  object BgpPeer {
    
    @JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer")
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
    inline def get(name: String, id: Input[ID]): BgpPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[BgpPeer]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): BgpPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BgpPeer]
    inline def get(name: String, id: Input[ID], state: BgpPeerState): BgpPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[BgpPeer]
    inline def get(name: String, id: Input[ID], state: BgpPeerState, opts: CustomResourceOptions): BgpPeer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BgpPeer]
    
    /**
      * Returns true if the given object is an instance of BgpPeer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean]
  }
  
  trait BgpPeerArgs extends StObject {
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: Input[String]
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val amazonAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
      */
    val bgpAsn: Input[Double]
    
    /**
      * The authentication key for BGP configuration.
      */
    val bgpAuthKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val customerAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Direct Connect virtual interface on which to create the BGP peer.
      */
    val virtualInterfaceId: Input[String]
  }
  object BgpPeerArgs {
    
    inline def apply(addressFamily: Input[String], bgpAsn: Input[Double], virtualInterfaceId: Input[String]): BgpPeerArgs = {
      val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BgpPeerArgs]
    }
    
    extension [Self <: BgpPeerArgs](x: Self) {
      
      inline def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      inline def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      inline def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
      inline def setBgpAsn(value: Input[Double]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      inline def setBgpAuthKey(value: Input[String]): Self = StObject.set(x, "bgpAuthKey", value.asInstanceOf[js.Any])
      
      inline def setBgpAuthKeyUndefined: Self = StObject.set(x, "bgpAuthKey", js.undefined)
      
      inline def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      inline def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      inline def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    }
  }
  
  trait BgpPeerState extends StObject {
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val amazonAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Direct Connect endpoint on which the BGP peer terminates.
      */
    val awsDevice: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
      */
    val bgpAsn: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The authentication key for BGP configuration.
      */
    val bgpAuthKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the BGP peer.
      */
    val bgpPeerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Up/Down state of the BGP peer.
      */
    val bgpStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic.
      * Required for IPv4 BGP peers on public virtual interfaces.
      */
    val customerAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Direct Connect virtual interface on which to create the BGP peer.
      */
    val virtualInterfaceId: js.UndefOr[Input[String]] = js.undefined
  }
  object BgpPeerState {
    
    inline def apply(): BgpPeerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BgpPeerState]
    }
    
    extension [Self <: BgpPeerState](x: Self) {
      
      inline def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      inline def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
      
      inline def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      inline def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
      inline def setAwsDevice(value: Input[String]): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
      
      inline def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
      
      inline def setBgpAsn(value: Input[Double]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      inline def setBgpAsnUndefined: Self = StObject.set(x, "bgpAsn", js.undefined)
      
      inline def setBgpAuthKey(value: Input[String]): Self = StObject.set(x, "bgpAuthKey", value.asInstanceOf[js.Any])
      
      inline def setBgpAuthKeyUndefined: Self = StObject.set(x, "bgpAuthKey", js.undefined)
      
      inline def setBgpPeerId(value: Input[String]): Self = StObject.set(x, "bgpPeerId", value.asInstanceOf[js.Any])
      
      inline def setBgpPeerIdUndefined: Self = StObject.set(x, "bgpPeerId", js.undefined)
      
      inline def setBgpStatus(value: Input[String]): Self = StObject.set(x, "bgpStatus", value.asInstanceOf[js.Any])
      
      inline def setBgpStatusUndefined: Self = StObject.set(x, "bgpStatus", js.undefined)
      
      inline def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      inline def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      inline def setVirtualInterfaceId(value: Input[String]): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    }
  }
}
