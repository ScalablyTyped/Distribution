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

object defaultSubnetMod {
  
  @JSImport("@pulumi/aws/ec2/defaultSubnet", "DefaultSubnet")
  @js.native
  class DefaultSubnet protected () extends CustomResource {
    /**
      * Create a DefaultSubnet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DefaultSubnetArgs) = this()
    def this(name: String, args: DefaultSubnetArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    val assignIpv6AddressOnCreation: Output_[Boolean] = js.native
    
    val availabilityZone: Output_[String] = js.native
    
    val availabilityZoneId: Output_[String] = js.native
    
    /**
      * The CIDR block for the subnet.
      */
    val cidrBlock: Output_[String] = js.native
    
    /**
      * The IPv6 CIDR block.
      */
    val ipv6CidrBlock: Output_[String] = js.native
    
    val ipv6CidrBlockAssociationId: Output_[String] = js.native
    
    /**
      * Specify true to indicate
      * that instances launched into the subnet should be assigned
      * a public IP address.
      */
    val mapPublicIpOnLaunch: Output_[Boolean] = js.native
    
    val outpostArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the AWS account that owns the subnet.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object DefaultSubnet {
    
    @JSImport("@pulumi/aws/ec2/defaultSubnet", "DefaultSubnet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DefaultSubnet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DefaultSubnet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DefaultSubnet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DefaultSubnet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultSubnet]
    inline def get(name: String, id: Input[ID], state: DefaultSubnetState): DefaultSubnet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DefaultSubnet]
    inline def get(name: String, id: Input[ID], state: DefaultSubnetState, opts: CustomResourceOptions): DefaultSubnet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultSubnet]
    
    /**
      * Returns true if the given object is an instance of DefaultSubnet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSubnet.DefaultSubnet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/defaultSubnet.DefaultSubnet */ Boolean]
  }
  
  trait DefaultSubnetArgs extends StObject {
    
    val availabilityZone: Input[String]
    
    /**
      * Specify true to indicate
      * that instances launched into the subnet should be assigned
      * a public IP address.
      */
    val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.undefined
    
    val outpostArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DefaultSubnetArgs {
    
    inline def apply(availabilityZone: Input[String]): DefaultSubnetArgs = {
      val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSubnetArgs]
    }
    
    extension [Self <: DefaultSubnetArgs](x: Self) {
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setMapPublicIpOnLaunch(value: Input[Boolean]): Self = StObject.set(x, "mapPublicIpOnLaunch", value.asInstanceOf[js.Any])
      
      inline def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "mapPublicIpOnLaunch", js.undefined)
      
      inline def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      inline def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DefaultSubnetState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    val assignIpv6AddressOnCreation: js.UndefOr[Input[Boolean]] = js.undefined
    
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    val availabilityZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The CIDR block for the subnet.
      */
    val cidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv6 CIDR block.
      */
    val ipv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    val ipv6CidrBlockAssociationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify true to indicate
      * that instances launched into the subnet should be assigned
      * a public IP address.
      */
    val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.undefined
    
    val outpostArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the subnet.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object DefaultSubnetState {
    
    inline def apply(): DefaultSubnetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSubnetState]
    }
    
    extension [Self <: DefaultSubnetState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAssignIpv6AddressOnCreation(value: Input[Boolean]): Self = StObject.set(x, "assignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
      
      inline def setAssignIpv6AddressOnCreationUndefined: Self = StObject.set(x, "assignIpv6AddressOnCreation", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneId(value: Input[String]): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      inline def setIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      inline def setIpv6CidrBlockAssociationId(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlockAssociationId", value.asInstanceOf[js.Any])
      
      inline def setIpv6CidrBlockAssociationIdUndefined: Self = StObject.set(x, "ipv6CidrBlockAssociationId", js.undefined)
      
      inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
      
      inline def setMapPublicIpOnLaunch(value: Input[Boolean]): Self = StObject.set(x, "mapPublicIpOnLaunch", value.asInstanceOf[js.Any])
      
      inline def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "mapPublicIpOnLaunch", js.undefined)
      
      inline def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      inline def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      inline def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
