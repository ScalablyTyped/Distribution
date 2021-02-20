package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpnGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/vpnGateway", "VpnGateway")
  @js.native
  class VpnGateway protected () extends CustomResource {
    /**
      * Create a VpnGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VpnGatewayArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: VpnGatewayArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
      */
    val amazonSideAsn: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the VPN Gateway.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Availability Zone for the virtual private gateway.
      */
    val availabilityZone: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object VpnGateway {
    
    /**
      * Get an existing VpnGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpnGateway", "VpnGateway.get")
    @js.native
    def get(name: String, id: Input[ID]): VpnGateway = js.native
    @JSImport("@pulumi/aws/ec2/vpnGateway", "VpnGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpnGateway = js.native
    @JSImport("@pulumi/aws/ec2/vpnGateway", "VpnGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpnGatewayState): VpnGateway = js.native
    @JSImport("@pulumi/aws/ec2/vpnGateway", "VpnGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpnGatewayState, opts: CustomResourceOptions): VpnGateway = js.native
    
    /**
      * Returns true if the given object is an instance of VpnGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpnGateway", "VpnGateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGateway.VpnGateway */ Boolean = js.native
  }
  
  @js.native
  trait VpnGatewayArgs extends StObject {
    
    /**
      * The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
      */
    val amazonSideAsn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Availability Zone for the virtual private gateway.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object VpnGatewayArgs {
    
    @scala.inline
    def apply(): VpnGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpnGatewayArgs]
    }
    
    @scala.inline
    implicit class VpnGatewayArgsMutableBuilder[Self <: VpnGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait VpnGatewayState extends StObject {
    
    /**
      * The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
      */
    val amazonSideAsn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the VPN Gateway.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Availability Zone for the virtual private gateway.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object VpnGatewayState {
    
    @scala.inline
    def apply(): VpnGatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpnGatewayState]
    }
    
    @scala.inline
    implicit class VpnGatewayStateMutableBuilder[Self <: VpnGatewayState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonSideAsn(value: Input[String]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
