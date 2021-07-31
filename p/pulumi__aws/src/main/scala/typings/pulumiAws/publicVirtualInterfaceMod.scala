package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicVirtualInterfaceMod {
  
  @JSImport("@pulumi/aws/directconnect/publicVirtualInterface", "PublicVirtualInterface")
  @js.native
  class PublicVirtualInterface protected () extends CustomResource {
    /**
      * Create a PublicVirtualInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublicVirtualInterfaceArgs) = this()
    def this(name: String, args: PublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
    
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
      * The name for the virtual interface.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of routes to be advertised to the AWS network in this region.
      */
    val routeFilterPrefixes: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VLAN ID.
      */
    val vlan: Output_[Double] = js.native
  }
  /* static members */
  object PublicVirtualInterface {
    
    @JSImport("@pulumi/aws/directconnect/publicVirtualInterface", "PublicVirtualInterface")
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
    def get(name: String, id: Input[ID]): PublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState): PublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PublicVirtualInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState, opts: CustomResourceOptions): PublicVirtualInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PublicVirtualInterface]
    
    /**
      * Returns true if the given object is an instance of PublicVirtualInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean]
  }
  
  trait PublicVirtualInterfaceArgs extends StObject {
    
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
      * The name for the virtual interface.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of routes to be advertised to the AWS network in this region.
      */
    val routeFilterPrefixes: Input[js.Array[Input[String]]]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VLAN ID.
      */
    val vlan: Input[Double]
  }
  object PublicVirtualInterfaceArgs {
    
    @scala.inline
    def apply(
      addressFamily: Input[String],
      bgpAsn: Input[Double],
      connectionId: Input[String],
      routeFilterPrefixes: Input[js.Array[Input[String]]],
      vlan: Input[Double]
    ): PublicVirtualInterfaceArgs = {
      val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], routeFilterPrefixes = routeFilterPrefixes.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicVirtualInterfaceArgs]
    }
    
    @scala.inline
    implicit class PublicVirtualInterfaceArgsMutableBuilder[Self <: PublicVirtualInterfaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
      @scala.inline
      def setBgpAsn(value: Input[Double]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAuthKey(value: Input[String]): Self = StObject.set(x, "bgpAuthKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAuthKeyUndefined: Self = StObject.set(x, "bgpAuthKey", js.undefined)
      
      @scala.inline
      def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRouteFilterPrefixes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "routeFilterPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteFilterPrefixesVarargs(value: Input[String]*): Self = StObject.set(x, "routeFilterPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVlan(value: Input[Double]): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublicVirtualInterfaceState extends StObject {
    
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
      * The name for the virtual interface.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of routes to be advertised to the AWS network in this region.
      */
    val routeFilterPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VLAN ID.
      */
    val vlan: js.UndefOr[Input[Double]] = js.undefined
  }
  object PublicVirtualInterfaceState {
    
    @scala.inline
    def apply(): PublicVirtualInterfaceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicVirtualInterfaceState]
    }
    
    @scala.inline
    implicit class PublicVirtualInterfaceStateMutableBuilder[Self <: PublicVirtualInterfaceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressFamily(value: Input[String]): Self = StObject.set(x, "addressFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressFamilyUndefined: Self = StObject.set(x, "addressFamily", js.undefined)
      
      @scala.inline
      def setAmazonAddress(value: Input[String]): Self = StObject.set(x, "amazonAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonAddressUndefined: Self = StObject.set(x, "amazonAddress", js.undefined)
      
      @scala.inline
      def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAwsDevice(value: Input[String]): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
      
      @scala.inline
      def setBgpAsn(value: Input[Double]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAsnUndefined: Self = StObject.set(x, "bgpAsn", js.undefined)
      
      @scala.inline
      def setBgpAuthKey(value: Input[String]): Self = StObject.set(x, "bgpAuthKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAuthKeyUndefined: Self = StObject.set(x, "bgpAuthKey", js.undefined)
      
      @scala.inline
      def setConnectionId(value: Input[String]): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      @scala.inline
      def setCustomerAddress(value: Input[String]): Self = StObject.set(x, "customerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerAddressUndefined: Self = StObject.set(x, "customerAddress", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRouteFilterPrefixes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "routeFilterPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteFilterPrefixesUndefined: Self = StObject.set(x, "routeFilterPrefixes", js.undefined)
      
      @scala.inline
      def setRouteFilterPrefixesVarargs(value: Input[String]*): Self = StObject.set(x, "routeFilterPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVlan(value: Input[Double]): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVlanUndefined: Self = StObject.set(x, "vlan", js.undefined)
    }
  }
}
