package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostedPrivateVirtualInterfaceMod {
  
  @JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterface", "HostedPrivateVirtualInterface")
  @js.native
  class HostedPrivateVirtualInterface protected () extends CustomResource {
    /**
      * Create a HostedPrivateVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HostedPrivateVirtualInterfaceArgs) = this()
    def this(name: String, args: HostedPrivateVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: Output_[String] = js.native
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
      */
    val amazonAddress: Output_[String] = js.native
    
    val amazonSideAsn: Output_[String] = js.native
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Direct Connect endpoint on which the virtual interface terminates.
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
      * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
      */
    val connectionId: Output_[String] = js.native
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
      */
    val customerAddress: Output_[String] = js.native
    
    /**
      * Indicates whether jumbo frames (9001 MTU) are supported.
      */
    val jumboFrameCapable: Output_[Boolean] = js.native
    
    /**
      * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
      */
    val mtu: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The name for the virtual interface.
      */
    val name: Output_[String] = js.native
    
    /**
      * The AWS account that will own the new virtual interface.
      */
    val ownerAccountId: Output_[String] = js.native
    
    /**
      * The VLAN ID.
      */
    val vlan: Output_[Double] = js.native
  }
  /* static members */
  object HostedPrivateVirtualInterface {
    
    @JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterface", "HostedPrivateVirtualInterface")
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
    inline def get(name: String, id: Input[ID]): HostedPrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[HostedPrivateVirtualInterface]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): HostedPrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HostedPrivateVirtualInterface]
    inline def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceState): HostedPrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[HostedPrivateVirtualInterface]
    inline def get(
      name: String,
      id: Input[ID],
      state: HostedPrivateVirtualInterfaceState,
      opts: CustomResourceOptions
    ): HostedPrivateVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HostedPrivateVirtualInterface]
    
    /**
      * Returns true if the given object is an instance of HostedPrivateVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterface.HostedPrivateVirtualInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterface.HostedPrivateVirtualInterface */ Boolean]
  }
  
  trait HostedPrivateVirtualInterfaceArgs extends StObject {
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: Input[String]
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
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
      * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
      */
    val connectionId: Input[String]
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
      */
    val customerAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
      */
    val mtu: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name for the virtual interface.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS account that will own the new virtual interface.
      */
    val ownerAccountId: Input[String]
    
    /**
      * The VLAN ID.
      */
    val vlan: Input[Double]
  }
  object HostedPrivateVirtualInterfaceArgs {
    
    inline def apply(
      addressFamily: Input[String],
      bgpAsn: Input[Double],
      connectionId: Input[String],
      ownerAccountId: Input[String],
      vlan: Input[Double]
    ): HostedPrivateVirtualInterfaceArgs = {
      val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], ownerAccountId = ownerAccountId.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedPrivateVirtualInterfaceArgs]
    }
    
    extension [Self <: HostedPrivateVirtualInterfaceArgs](x: Self) {
      
      inline def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      inline def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      inline def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
      inline def setBgpAsn(value: Input[Double]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      inline def setBgpAuthKey(value: Input[String]): Self = StObject.set(x, "bgpAuthKey", value.asInstanceOf[js.Any])
      
      inline def setBgpAuthKeyUndefined: Self = StObject.set(x, "bgpAuthKey", js.undefined)
      
      inline def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      inline def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      inline def setMtu(value: Input[Double]): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
      
      inline def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOwnerAccountId(value: Input[String]): Self = StObject.set(x, "ownerAccountId", value.asInstanceOf[js.Any])
      
      inline def setVlan(value: Input[Double]): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedPrivateVirtualInterfaceState extends StObject {
    
    /**
      * The address family for the BGP peer. `ipv4 ` or `ipv6`.
      */
    val addressFamily: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
      */
    val amazonAddress: js.UndefOr[Input[String]] = js.undefined
    
    val amazonSideAsn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the virtual interface.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Direct Connect endpoint on which the virtual interface terminates.
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
      * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
      */
    val connectionId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
      */
    val customerAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether jumbo frames (9001 MTU) are supported.
      */
    val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
      */
    val mtu: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name for the virtual interface.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The AWS account that will own the new virtual interface.
      */
    val ownerAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The VLAN ID.
      */
    val vlan: js.UndefOr[Input[Double]] = js.undefined
  }
  object HostedPrivateVirtualInterfaceState {
    
    inline def apply(): HostedPrivateVirtualInterfaceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedPrivateVirtualInterfaceState]
    }
    
    extension [Self <: HostedPrivateVirtualInterfaceState](x: Self) {
      
      inline def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      inline def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
      
      inline def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      inline def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
      inline def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAwsDevice(value: Input[String]): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
      
      inline def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
      
      inline def setBgpAsn(value: Input[Double]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      inline def setBgpAsnUndefined: Self = StObject.set(x, "bgpAsn", js.undefined)
      
      inline def setBgpAuthKey(value: Input[String]): Self = StObject.set(x, "bgpAuthKey", value.asInstanceOf[js.Any])
      
      inline def setBgpAuthKeyUndefined: Self = StObject.set(x, "bgpAuthKey", js.undefined)
      
      inline def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      inline def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      inline def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      inline def setJumboFrameCapable(value: Input[Boolean]): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
      
      inline def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
      
      inline def setMtu(value: Input[Double]): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
      
      inline def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOwnerAccountId(value: Input[String]): Self = StObject.set(x, "ownerAccountId", value.asInstanceOf[js.Any])
      
      inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "ownerAccountId", js.undefined)
      
      inline def setVlan(value: Input[Double]): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
      
      inline def setVlanUndefined: Self = StObject.set(x, "vlan", js.undefined)
    }
  }
}
