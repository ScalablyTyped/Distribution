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

object defaultVpcMod {
  
  @JSImport("@pulumi/aws/ec2/defaultVpc", "DefaultVpc")
  @js.native
  class DefaultVpc protected () extends CustomResource {
    /**
      * Create a DefaultVpc resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DefaultVpcArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DefaultVpcArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of VPC
      */
    val arn: Output_[String] = js.native
    
    /**
      * Whether or not an Amazon-provided IPv6 CIDR
      * block with a /56 prefix length for the VPC was assigned
      */
    val assignGeneratedIpv6CidrBlock: Output_[Boolean] = js.native
    
    /**
      * The CIDR block of the VPC
      */
    val cidrBlock: Output_[String] = js.native
    
    /**
      * The ID of the network ACL created by default on VPC creation
      */
    val defaultNetworkAclId: Output_[String] = js.native
    
    /**
      * The ID of the route table created by default on VPC creation
      */
    val defaultRouteTableId: Output_[String] = js.native
    
    /**
      * The ID of the security group created by default on VPC creation
      */
    val defaultSecurityGroupId: Output_[String] = js.native
    
    val dhcpOptionsId: Output_[String] = js.native
    
    /**
      * A boolean flag to enable/disable ClassicLink
      * for the VPC. Only valid in regions and accounts that support EC2 Classic.
      * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
      */
    val enableClassiclink: Output_[Boolean] = js.native
    
    val enableClassiclinkDnsSupport: Output_[Boolean] = js.native
    
    /**
      * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
      */
    val enableDnsHostnames: Output_[Boolean] = js.native
    
    /**
      * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
      */
    val enableDnsSupport: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Tenancy of instances spin up within VPC.
      */
    val instanceTenancy: Output_[String] = js.native
    
    /**
      * The association ID for the IPv6 CIDR block of the VPC
      */
    val ipv6AssociationId: Output_[String] = js.native
    
    /**
      * The IPv6 CIDR block of the VPC
      */
    val ipv6CidrBlock: Output_[String] = js.native
    
    /**
      * The ID of the main route table associated with
      * this VPC. Note that you can change a VPC's main route table by using an
      * `aws.ec2.MainRouteTableAssociation`
      */
    val mainRouteTableId: Output_[String] = js.native
    
    /**
      * The ID of the AWS account that owns the VPC.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object DefaultVpc {
    
    @JSImport("@pulumi/aws/ec2/defaultVpc", "DefaultVpc")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DefaultVpc resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DefaultVpc = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DefaultVpc]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DefaultVpc = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultVpc]
    inline def get(name: String, id: Input[ID], state: DefaultVpcState): DefaultVpc = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DefaultVpc]
    inline def get(name: String, id: Input[ID], state: DefaultVpcState, opts: CustomResourceOptions): DefaultVpc = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultVpc]
    
    /**
      * Returns true if the given object is an instance of DefaultVpc.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpc.DefaultVpc */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/defaultVpc.DefaultVpc */ Boolean]
  }
  
  trait DefaultVpcArgs extends StObject {
    
    /**
      * A boolean flag to enable/disable ClassicLink
      * for the VPC. Only valid in regions and accounts that support EC2 Classic.
      * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
      */
    val enableClassiclink: js.UndefOr[Input[Boolean]] = js.undefined
    
    val enableClassiclinkDnsSupport: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
      */
    val enableDnsHostnames: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
      */
    val enableDnsSupport: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DefaultVpcArgs {
    
    inline def apply(): DefaultVpcArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultVpcArgs]
    }
    
    extension [Self <: DefaultVpcArgs](x: Self) {
      
      inline def setEnableClassiclink(value: Input[Boolean]): Self = StObject.set(x, "enableClassiclink", value.asInstanceOf[js.Any])
      
      inline def setEnableClassiclinkDnsSupport(value: Input[Boolean]): Self = StObject.set(x, "enableClassiclinkDnsSupport", value.asInstanceOf[js.Any])
      
      inline def setEnableClassiclinkDnsSupportUndefined: Self = StObject.set(x, "enableClassiclinkDnsSupport", js.undefined)
      
      inline def setEnableClassiclinkUndefined: Self = StObject.set(x, "enableClassiclink", js.undefined)
      
      inline def setEnableDnsHostnames(value: Input[Boolean]): Self = StObject.set(x, "enableDnsHostnames", value.asInstanceOf[js.Any])
      
      inline def setEnableDnsHostnamesUndefined: Self = StObject.set(x, "enableDnsHostnames", js.undefined)
      
      inline def setEnableDnsSupport(value: Input[Boolean]): Self = StObject.set(x, "enableDnsSupport", value.asInstanceOf[js.Any])
      
      inline def setEnableDnsSupportUndefined: Self = StObject.set(x, "enableDnsSupport", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DefaultVpcState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of VPC
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether or not an Amazon-provided IPv6 CIDR
      * block with a /56 prefix length for the VPC was assigned
      */
    val assignGeneratedIpv6CidrBlock: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The CIDR block of the VPC
      */
    val cidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the network ACL created by default on VPC creation
      */
    val defaultNetworkAclId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the route table created by default on VPC creation
      */
    val defaultRouteTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the security group created by default on VPC creation
      */
    val defaultSecurityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    val dhcpOptionsId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A boolean flag to enable/disable ClassicLink
      * for the VPC. Only valid in regions and accounts that support EC2 Classic.
      * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
      */
    val enableClassiclink: js.UndefOr[Input[Boolean]] = js.undefined
    
    val enableClassiclinkDnsSupport: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
      */
    val enableDnsHostnames: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
      */
    val enableDnsSupport: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Tenancy of instances spin up within VPC.
      */
    val instanceTenancy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The association ID for the IPv6 CIDR block of the VPC
      */
    val ipv6AssociationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv6 CIDR block of the VPC
      */
    val ipv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the main route table associated with
      * this VPC. Note that you can change a VPC's main route table by using an
      * `aws.ec2.MainRouteTableAssociation`
      */
    val mainRouteTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the VPC.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DefaultVpcState {
    
    inline def apply(): DefaultVpcState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultVpcState]
    }
    
    extension [Self <: DefaultVpcState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAssignGeneratedIpv6CidrBlock(value: Input[Boolean]): Self = StObject.set(x, "assignGeneratedIpv6CidrBlock", value.asInstanceOf[js.Any])
      
      inline def setAssignGeneratedIpv6CidrBlockUndefined: Self = StObject.set(x, "assignGeneratedIpv6CidrBlock", js.undefined)
      
      inline def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      inline def setDefaultNetworkAclId(value: Input[String]): Self = StObject.set(x, "defaultNetworkAclId", value.asInstanceOf[js.Any])
      
      inline def setDefaultNetworkAclIdUndefined: Self = StObject.set(x, "defaultNetworkAclId", js.undefined)
      
      inline def setDefaultRouteTableId(value: Input[String]): Self = StObject.set(x, "defaultRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setDefaultRouteTableIdUndefined: Self = StObject.set(x, "defaultRouteTableId", js.undefined)
      
      inline def setDefaultSecurityGroupId(value: Input[String]): Self = StObject.set(x, "defaultSecurityGroupId", value.asInstanceOf[js.Any])
      
      inline def setDefaultSecurityGroupIdUndefined: Self = StObject.set(x, "defaultSecurityGroupId", js.undefined)
      
      inline def setDhcpOptionsId(value: Input[String]): Self = StObject.set(x, "dhcpOptionsId", value.asInstanceOf[js.Any])
      
      inline def setDhcpOptionsIdUndefined: Self = StObject.set(x, "dhcpOptionsId", js.undefined)
      
      inline def setEnableClassiclink(value: Input[Boolean]): Self = StObject.set(x, "enableClassiclink", value.asInstanceOf[js.Any])
      
      inline def setEnableClassiclinkDnsSupport(value: Input[Boolean]): Self = StObject.set(x, "enableClassiclinkDnsSupport", value.asInstanceOf[js.Any])
      
      inline def setEnableClassiclinkDnsSupportUndefined: Self = StObject.set(x, "enableClassiclinkDnsSupport", js.undefined)
      
      inline def setEnableClassiclinkUndefined: Self = StObject.set(x, "enableClassiclink", js.undefined)
      
      inline def setEnableDnsHostnames(value: Input[Boolean]): Self = StObject.set(x, "enableDnsHostnames", value.asInstanceOf[js.Any])
      
      inline def setEnableDnsHostnamesUndefined: Self = StObject.set(x, "enableDnsHostnames", js.undefined)
      
      inline def setEnableDnsSupport(value: Input[Boolean]): Self = StObject.set(x, "enableDnsSupport", value.asInstanceOf[js.Any])
      
      inline def setEnableDnsSupportUndefined: Self = StObject.set(x, "enableDnsSupport", js.undefined)
      
      inline def setInstanceTenancy(value: Input[String]): Self = StObject.set(x, "instanceTenancy", value.asInstanceOf[js.Any])
      
      inline def setInstanceTenancyUndefined: Self = StObject.set(x, "instanceTenancy", js.undefined)
      
      inline def setIpv6AssociationId(value: Input[String]): Self = StObject.set(x, "ipv6AssociationId", value.asInstanceOf[js.Any])
      
      inline def setIpv6AssociationIdUndefined: Self = StObject.set(x, "ipv6AssociationId", js.undefined)
      
      inline def setIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
      
      inline def setMainRouteTableId(value: Input[String]): Self = StObject.set(x, "mainRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setMainRouteTableIdUndefined: Self = StObject.set(x, "mainRouteTableId", js.undefined)
      
      inline def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
