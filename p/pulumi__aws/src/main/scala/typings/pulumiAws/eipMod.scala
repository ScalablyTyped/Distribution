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

object eipMod {
  
  @JSImport("@pulumi/aws/ec2/eip", "Eip")
  @js.native
  class Eip protected () extends CustomResource {
    /**
      * Create a Eip resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EipArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: EipArgs, opts: CustomResourceOptions) = this()
    
    val allocationId: Output_[String] = js.native
    
    /**
      * A user specified primary or secondary private IP address to
      * associate with the Elastic IP address. If no private IP address is specified,
      * the Elastic IP address is associated with the primary private IP address.
      */
    val associateWithPrivateIp: Output_[js.UndefOr[String]] = js.native
    
    val associationId: Output_[String] = js.native
    
    /**
      * Customer owned IP.
      */
    val customerOwnedIp: Output_[String] = js.native
    
    /**
      * The  ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
      */
    val customerOwnedIpv4Pool: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
      */
    val domain: Output_[String] = js.native
    
    /**
      * EC2 instance ID.
      */
    val instance: Output_[String] = js.native
    
    /**
      * The location from which the IP address is advertised. Use this parameter to limit the address to this location.
      */
    val networkBorderGroup: Output_[String] = js.native
    
    /**
      * Network interface ID to associate with.
      */
    val networkInterface: Output_[String] = js.native
    
    /**
      * The Private DNS associated with the Elastic IP address (if in VPC).
      */
    val privateDns: Output_[String] = js.native
    
    /**
      * Contains the private IP address (if in VPC).
      */
    val privateIp: Output_[String] = js.native
    
    /**
      * Public DNS associated with the Elastic IP address.
      */
    val publicDns: Output_[String] = js.native
    
    /**
      * Contains the public IP address.
      */
    val publicIp: Output_[String] = js.native
    
    /**
      * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
      */
    val publicIpv4Pool: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Boolean if the EIP is in a VPC or not.
      */
    val vpc: Output_[Boolean] = js.native
  }
  /* static members */
  object Eip {
    
    @JSImport("@pulumi/aws/ec2/eip", "Eip")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Eip resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Eip = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Eip]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Eip = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Eip]
    inline def get(name: String, id: Input[ID], state: EipState): Eip = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Eip]
    inline def get(name: String, id: Input[ID], state: EipState, opts: CustomResourceOptions): Eip = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Eip]
    
    /**
      * Returns true if the given object is an instance of Eip.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/eip.Eip */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/eip.Eip */ Boolean]
  }
  
  trait EipArgs extends StObject {
    
    /**
      * A user specified primary or secondary private IP address to
      * associate with the Elastic IP address. If no private IP address is specified,
      * the Elastic IP address is associated with the primary private IP address.
      */
    val associateWithPrivateIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The  ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
      */
    val customerOwnedIpv4Pool: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * EC2 instance ID.
      */
    val instance: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The location from which the IP address is advertised. Use this parameter to limit the address to this location.
      */
    val networkBorderGroup: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Network interface ID to associate with.
      */
    val networkInterface: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
      */
    val publicIpv4Pool: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Boolean if the EIP is in a VPC or not.
      */
    val vpc: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object EipArgs {
    
    inline def apply(): EipArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EipArgs]
    }
    
    extension [Self <: EipArgs](x: Self) {
      
      inline def setAssociateWithPrivateIp(value: Input[String]): Self = StObject.set(x, "associateWithPrivateIp", value.asInstanceOf[js.Any])
      
      inline def setAssociateWithPrivateIpUndefined: Self = StObject.set(x, "associateWithPrivateIp", js.undefined)
      
      inline def setCustomerOwnedIpv4Pool(value: Input[String]): Self = StObject.set(x, "customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "customerOwnedIpv4Pool", js.undefined)
      
      inline def setInstance(value: Input[String]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setNetworkBorderGroup(value: Input[String]): Self = StObject.set(x, "networkBorderGroup", value.asInstanceOf[js.Any])
      
      inline def setNetworkBorderGroupUndefined: Self = StObject.set(x, "networkBorderGroup", js.undefined)
      
      inline def setNetworkInterface(value: Input[String]): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceUndefined: Self = StObject.set(x, "networkInterface", js.undefined)
      
      inline def setPublicIpv4Pool(value: Input[String]): Self = StObject.set(x, "publicIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setPublicIpv4PoolUndefined: Self = StObject.set(x, "publicIpv4Pool", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpc(value: Input[Boolean]): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
      
      inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    }
  }
  
  trait EipState extends StObject {
    
    val allocationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A user specified primary or secondary private IP address to
      * associate with the Elastic IP address. If no private IP address is specified,
      * the Elastic IP address is associated with the primary private IP address.
      */
    val associateWithPrivateIp: js.UndefOr[Input[String]] = js.undefined
    
    val associationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customer owned IP.
      */
    val customerOwnedIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The  ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
      */
    val customerOwnedIpv4Pool: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * EC2 instance ID.
      */
    val instance: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The location from which the IP address is advertised. Use this parameter to limit the address to this location.
      */
    val networkBorderGroup: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Network interface ID to associate with.
      */
    val networkInterface: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Private DNS associated with the Elastic IP address (if in VPC).
      */
    val privateDns: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Contains the private IP address (if in VPC).
      */
    val privateIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Public DNS associated with the Elastic IP address.
      */
    val publicDns: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Contains the public IP address.
      */
    val publicIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
      */
    val publicIpv4Pool: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Boolean if the EIP is in a VPC or not.
      */
    val vpc: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object EipState {
    
    inline def apply(): EipState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EipState]
    }
    
    extension [Self <: EipState](x: Self) {
      
      inline def setAllocationId(value: Input[String]): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
      
      inline def setAllocationIdUndefined: Self = StObject.set(x, "allocationId", js.undefined)
      
      inline def setAssociateWithPrivateIp(value: Input[String]): Self = StObject.set(x, "associateWithPrivateIp", value.asInstanceOf[js.Any])
      
      inline def setAssociateWithPrivateIpUndefined: Self = StObject.set(x, "associateWithPrivateIp", js.undefined)
      
      inline def setAssociationId(value: Input[String]): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
      
      inline def setAssociationIdUndefined: Self = StObject.set(x, "associationId", js.undefined)
      
      inline def setCustomerOwnedIp(value: Input[String]): Self = StObject.set(x, "customerOwnedIp", value.asInstanceOf[js.Any])
      
      inline def setCustomerOwnedIpUndefined: Self = StObject.set(x, "customerOwnedIp", js.undefined)
      
      inline def setCustomerOwnedIpv4Pool(value: Input[String]): Self = StObject.set(x, "customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "customerOwnedIpv4Pool", js.undefined)
      
      inline def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setInstance(value: Input[String]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setNetworkBorderGroup(value: Input[String]): Self = StObject.set(x, "networkBorderGroup", value.asInstanceOf[js.Any])
      
      inline def setNetworkBorderGroupUndefined: Self = StObject.set(x, "networkBorderGroup", js.undefined)
      
      inline def setNetworkInterface(value: Input[String]): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceUndefined: Self = StObject.set(x, "networkInterface", js.undefined)
      
      inline def setPrivateDns(value: Input[String]): Self = StObject.set(x, "privateDns", value.asInstanceOf[js.Any])
      
      inline def setPrivateDnsUndefined: Self = StObject.set(x, "privateDns", js.undefined)
      
      inline def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      inline def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      inline def setPublicDns(value: Input[String]): Self = StObject.set(x, "publicDns", value.asInstanceOf[js.Any])
      
      inline def setPublicDnsUndefined: Self = StObject.set(x, "publicDns", js.undefined)
      
      inline def setPublicIp(value: Input[String]): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      inline def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
      
      inline def setPublicIpv4Pool(value: Input[String]): Self = StObject.set(x, "publicIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setPublicIpv4PoolUndefined: Self = StObject.set(x, "publicIpv4Pool", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpc(value: Input[Boolean]): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
      
      inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    }
  }
}
