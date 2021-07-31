package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.NetworkInterfaceAttachment
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkInterfaceMod {
  
  @JSImport("@pulumi/aws/ec2/networkInterface", "NetworkInterface")
  @js.native
  class NetworkInterface protected () extends CustomResource {
    /**
      * Create a NetworkInterface resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkInterfaceArgs) = this()
    def this(name: String, args: NetworkInterfaceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Block to define the attachment of the ENI. Documented below.
      */
    val attachments: Output_[js.Array[NetworkInterfaceAttachment]] = js.native
    
    /**
      * A description for the network interface.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The number of IPv6 addresses to assign to a network interface. You can't use this option if specifying specific `ipv6Addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
      */
    val ipv6AddressCount: Output_[Double] = js.native
    
    /**
      * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if you're specifying `ipv6AddressCount`.
      */
    val ipv6Addresses: Output_[js.Array[String]] = js.native
    
    /**
      * The MAC address of the network interface.
      */
    val macAddress: Output_[String] = js.native
    
    val outpostArn: Output_[String] = js.native
    
    /**
      * The private DNS name of the network interface (IPv4).
      */
    val privateDnsName: Output_[String] = js.native
    
    val privateIp: Output_[String] = js.native
    
    /**
      * List of private IPs to assign to the ENI.
      */
    val privateIps: Output_[js.Array[String]] = js.native
    
    /**
      * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
      */
    val privateIpsCount: Output_[Double] = js.native
    
    /**
      * List of security group IDs to assign to the ENI.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * Whether to enable source destination checking for the ENI. Default true.
      */
    val sourceDestCheck: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Subnet ID to create the ENI in.
      */
    val subnetId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object NetworkInterface {
    
    @JSImport("@pulumi/aws/ec2/networkInterface", "NetworkInterface")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NetworkInterface resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): NetworkInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NetworkInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NetworkInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: NetworkInterfaceState): NetworkInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NetworkInterface]
    @scala.inline
    def get(name: String, id: Input[ID], state: NetworkInterfaceState, opts: CustomResourceOptions): NetworkInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkInterface]
    
    /**
      * Returns true if the given object is an instance of NetworkInterface.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ Boolean]
  }
  
  trait NetworkInterfaceArgs extends StObject {
    
    /**
      * Block to define the attachment of the ENI. Documented below.
      */
    val attachments: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkInterfaceAttachment]]]
      ] = js.undefined
    
    /**
      * A description for the network interface.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of IPv6 addresses to assign to a network interface. You can't use this option if specifying specific `ipv6Addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
      */
    val ipv6AddressCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if you're specifying `ipv6AddressCount`.
      */
    val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val privateIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of private IPs to assign to the ENI.
      */
    val privateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
      */
    val privateIpsCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of security group IDs to assign to the ENI.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Whether to enable source destination checking for the ENI. Default true.
      */
    val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Subnet ID to create the ENI in.
      */
    val subnetId: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object NetworkInterfaceArgs {
    
    @scala.inline
    def apply(subnetId: Input[String]): NetworkInterfaceArgs = {
      val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterfaceArgs]
    }
    
    @scala.inline
    implicit class NetworkInterfaceArgsMutableBuilder[Self <: NetworkInterfaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkInterfaceAttachment]]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      @scala.inline
      def setAttachmentsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.NetworkInterfaceAttachment]*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIpv6AddressCount(value: Input[Double]): Self = StObject.set(x, "ipv6AddressCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressCountUndefined: Self = StObject.set(x, "ipv6AddressCount", js.undefined)
      
      @scala.inline
      def setIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
      
      @scala.inline
      def setIpv6AddressesVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
      
      @scala.inline
      def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      @scala.inline
      def setPrivateIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "privateIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpsCount(value: Input[Double]): Self = StObject.set(x, "privateIpsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpsCountUndefined: Self = StObject.set(x, "privateIpsCount", js.undefined)
      
      @scala.inline
      def setPrivateIpsUndefined: Self = StObject.set(x, "privateIps", js.undefined)
      
      @scala.inline
      def setPrivateIpsVarargs(value: Input[String]*): Self = StObject.set(x, "privateIps", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSourceDestCheck(value: Input[Boolean]): Self = StObject.set(x, "sourceDestCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDestCheckUndefined: Self = StObject.set(x, "sourceDestCheck", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait NetworkInterfaceState extends StObject {
    
    /**
      * Block to define the attachment of the ENI. Documented below.
      */
    val attachments: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkInterfaceAttachment]]]
      ] = js.undefined
    
    /**
      * A description for the network interface.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of IPv6 addresses to assign to a network interface. You can't use this option if specifying specific `ipv6Addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
      */
    val ipv6AddressCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if you're specifying `ipv6AddressCount`.
      */
    val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The MAC address of the network interface.
      */
    val macAddress: js.UndefOr[Input[String]] = js.undefined
    
    val outpostArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private DNS name of the network interface (IPv4).
      */
    val privateDnsName: js.UndefOr[Input[String]] = js.undefined
    
    val privateIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of private IPs to assign to the ENI.
      */
    val privateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
      */
    val privateIpsCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of security group IDs to assign to the ENI.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Whether to enable source destination checking for the ENI. Default true.
      */
    val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Subnet ID to create the ENI in.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object NetworkInterfaceState {
    
    @scala.inline
    def apply(): NetworkInterfaceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInterfaceState]
    }
    
    @scala.inline
    implicit class NetworkInterfaceStateMutableBuilder[Self <: NetworkInterfaceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkInterfaceAttachment]]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      @scala.inline
      def setAttachmentsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.NetworkInterfaceAttachment]*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIpv6AddressCount(value: Input[Double]): Self = StObject.set(x, "ipv6AddressCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressCountUndefined: Self = StObject.set(x, "ipv6AddressCount", js.undefined)
      
      @scala.inline
      def setIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
      
      @scala.inline
      def setIpv6AddressesVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
      
      @scala.inline
      def setMacAddress(value: Input[String]): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
      
      @scala.inline
      def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      @scala.inline
      def setPrivateDnsName(value: Input[String]): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDnsNameUndefined: Self = StObject.set(x, "privateDnsName", js.undefined)
      
      @scala.inline
      def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      @scala.inline
      def setPrivateIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "privateIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpsCount(value: Input[Double]): Self = StObject.set(x, "privateIpsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpsCountUndefined: Self = StObject.set(x, "privateIpsCount", js.undefined)
      
      @scala.inline
      def setPrivateIpsUndefined: Self = StObject.set(x, "privateIps", js.undefined)
      
      @scala.inline
      def setPrivateIpsVarargs(value: Input[String]*): Self = StObject.set(x, "privateIps", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSourceDestCheck(value: Input[Boolean]): Self = StObject.set(x, "sourceDestCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDestCheckUndefined: Self = StObject.set(x, "sourceDestCheck", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
