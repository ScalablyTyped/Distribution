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

object natGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/natGateway", "NatGateway")
  @js.native
  class NatGateway protected () extends CustomResource {
    /**
      * Create a NatGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NatGatewayArgs) = this()
    def this(name: String, args: NatGatewayArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Allocation ID of the Elastic IP address for the gateway.
      */
    val allocationId: Output_[String] = js.native
    
    /**
      * The ENI ID of the network interface created by the NAT gateway.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * The private IP address of the NAT Gateway.
      */
    val privateIp: Output_[String] = js.native
    
    /**
      * The public IP address of the NAT Gateway.
      */
    val publicIp: Output_[String] = js.native
    
    /**
      * The Subnet ID of the subnet in which to place the gateway.
      */
    val subnetId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object NatGateway {
    
    @JSImport("@pulumi/aws/ec2/natGateway", "NatGateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NatGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): NatGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NatGateway]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NatGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NatGateway]
    inline def get(name: String, id: Input[ID], state: NatGatewayState): NatGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NatGateway]
    inline def get(name: String, id: Input[ID], state: NatGatewayState, opts: CustomResourceOptions): NatGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NatGateway]
    
    /**
      * Returns true if the given object is an instance of NatGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/natGateway.NatGateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/natGateway.NatGateway */ Boolean]
  }
  
  trait NatGatewayArgs extends StObject {
    
    /**
      * The Allocation ID of the Elastic IP address for the gateway.
      */
    val allocationId: Input[String]
    
    /**
      * The Subnet ID of the subnet in which to place the gateway.
      */
    val subnetId: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object NatGatewayArgs {
    
    inline def apply(allocationId: Input[String], subnetId: Input[String]): NatGatewayArgs = {
      val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NatGatewayArgs]
    }
    
    extension [Self <: NatGatewayArgs](x: Self) {
      
      inline def setAllocationId(value: Input[String]): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait NatGatewayState extends StObject {
    
    /**
      * The Allocation ID of the Elastic IP address for the gateway.
      */
    val allocationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ENI ID of the network interface created by the NAT gateway.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private IP address of the NAT Gateway.
      */
    val privateIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public IP address of the NAT Gateway.
      */
    val publicIp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Subnet ID of the subnet in which to place the gateway.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object NatGatewayState {
    
    inline def apply(): NatGatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NatGatewayState]
    }
    
    extension [Self <: NatGatewayState](x: Self) {
      
      inline def setAllocationId(value: Input[String]): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
      
      inline def setAllocationIdUndefined: Self = StObject.set(x, "allocationId", js.undefined)
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      inline def setPrivateIp(value: Input[String]): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      inline def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
      
      inline def setPublicIp(value: Input[String]): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      inline def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
