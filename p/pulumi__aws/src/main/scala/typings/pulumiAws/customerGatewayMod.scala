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

object customerGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway")
  @js.native
  class CustomerGateway protected () extends CustomResource {
    /**
      * Create a CustomerGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CustomerGatewayArgs) = this()
    def this(name: String, args: CustomerGatewayArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the customer gateway.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
      */
    val bgpAsn: Output_[String] = js.native
    
    /**
      * The IP address of the gateway's Internet-routable external interface.
      */
    val ipAddress: Output_[String] = js.native
    
    /**
      * Tags to apply to the gateway.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The type of customer gateway. The only type AWS
      * supports at this time is "ipsec.1".
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object CustomerGateway {
    
    /**
      * Get an existing CustomerGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway.get")
    @js.native
    def get(name: String, id: Input[ID]): CustomerGateway = js.native
    @JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CustomerGateway = js.native
    @JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: CustomerGatewayState): CustomerGateway = js.native
    @JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: CustomerGatewayState, opts: CustomResourceOptions): CustomerGateway = js.native
    
    /**
      * Returns true if the given object is an instance of CustomerGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/customerGateway.CustomerGateway */ Boolean = js.native
  }
  
  @js.native
  trait CustomerGatewayArgs extends StObject {
    
    /**
      * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
      */
    val bgpAsn: Input[String] = js.native
    
    /**
      * The IP address of the gateway's Internet-routable external interface.
      */
    val ipAddress: Input[String] = js.native
    
    /**
      * Tags to apply to the gateway.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of customer gateway. The only type AWS
      * supports at this time is "ipsec.1".
      */
    val `type`: Input[String] = js.native
  }
  object CustomerGatewayArgs {
    
    @scala.inline
    def apply(bgpAsn: Input[String], ipAddress: Input[String], `type`: Input[String]): CustomerGatewayArgs = {
      val __obj = js.Dynamic.literal(bgpAsn = bgpAsn.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerGatewayArgs]
    }
    
    @scala.inline
    implicit class CustomerGatewayArgsMutableBuilder[Self <: CustomerGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgpAsn(value: Input[String]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomerGatewayState extends StObject {
    
    /**
      * The ARN of the customer gateway.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
      */
    val bgpAsn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IP address of the gateway's Internet-routable external interface.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * Tags to apply to the gateway.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of customer gateway. The only type AWS
      * supports at this time is "ipsec.1".
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object CustomerGatewayState {
    
    @scala.inline
    def apply(): CustomerGatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerGatewayState]
    }
    
    @scala.inline
    implicit class CustomerGatewayStateMutableBuilder[Self <: CustomerGatewayState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBgpAsn(value: Input[String]): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAsnUndefined: Self = StObject.set(x, "bgpAsn", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
