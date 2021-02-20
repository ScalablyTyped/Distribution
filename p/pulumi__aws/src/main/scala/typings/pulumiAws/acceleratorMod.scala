package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.globalaccelerator.AcceleratorAttributes
import typings.pulumiAws.outputMod.globalaccelerator.AcceleratorIpSet
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acceleratorMod {
  
  @JSImport("@pulumi/aws/globalaccelerator/accelerator", "Accelerator")
  @js.native
  class Accelerator protected () extends CustomResource {
    /**
      * Create a Accelerator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AcceleratorArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AcceleratorArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The attributes of the accelerator. Fields documented below.
      */
    val attributes: Output_[js.UndefOr[AcceleratorAttributes]] = js.native
    
    /**
      * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
      * * `hostedZoneId` --  The Global Accelerator Route 53 zone ID that can be used to
      * route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
      * is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
      */
    val dnsName: Output_[String] = js.native
    
    /**
      * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    val hostedZoneId: Output_[String] = js.native
    
    /**
      * The value for the address type must be `IPV4`.
      */
    val ipAddressType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * IP address set associated with the accelerator.
      */
    val ipSets: Output_[js.Array[AcceleratorIpSet]] = js.native
    
    /**
      * The name of the accelerator.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Accelerator {
    
    /**
      * Get an existing Accelerator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/globalaccelerator/accelerator", "Accelerator.get")
    @js.native
    def get(name: String, id: Input[ID]): Accelerator = js.native
    @JSImport("@pulumi/aws/globalaccelerator/accelerator", "Accelerator.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Accelerator = js.native
    @JSImport("@pulumi/aws/globalaccelerator/accelerator", "Accelerator.get")
    @js.native
    def get(name: String, id: Input[ID], state: AcceleratorState): Accelerator = js.native
    @JSImport("@pulumi/aws/globalaccelerator/accelerator", "Accelerator.get")
    @js.native
    def get(name: String, id: Input[ID], state: AcceleratorState, opts: CustomResourceOptions): Accelerator = js.native
    
    /**
      * Returns true if the given object is an instance of Accelerator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/globalaccelerator/accelerator", "Accelerator.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean = js.native
  }
  
  @js.native
  trait AcceleratorArgs extends StObject {
    
    /**
      * The attributes of the accelerator. Fields documented below.
      */
    val attributes: js.UndefOr[Input[typings.pulumiAws.inputMod.globalaccelerator.AcceleratorAttributes]] = js.native
    
    /**
      * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The value for the address type must be `IPV4`.
      */
    val ipAddressType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the accelerator.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AcceleratorArgs {
    
    @scala.inline
    def apply(): AcceleratorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceleratorArgs]
    }
    
    @scala.inline
    implicit class AcceleratorArgsMutableBuilder[Self <: AcceleratorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Input[typings.pulumiAws.inputMod.globalaccelerator.AcceleratorAttributes]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setIpAddressType(value: Input[String]): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait AcceleratorState extends StObject {
    
    /**
      * The attributes of the accelerator. Fields documented below.
      */
    val attributes: js.UndefOr[Input[typings.pulumiAws.inputMod.globalaccelerator.AcceleratorAttributes]] = js.native
    
    /**
      * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
      * * `hostedZoneId` --  The Global Accelerator Route 53 zone ID that can be used to
      * route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
      * is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
      */
    val dnsName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    val hostedZoneId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The value for the address type must be `IPV4`.
      */
    val ipAddressType: js.UndefOr[Input[String]] = js.native
    
    /**
      * IP address set associated with the accelerator.
      */
    val ipSets: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.AcceleratorIpSet]]]
      ] = js.native
    
    /**
      * The name of the accelerator.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AcceleratorState {
    
    @scala.inline
    def apply(): AcceleratorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceleratorState]
    }
    
    @scala.inline
    implicit class AcceleratorStateMutableBuilder[Self <: AcceleratorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Input[typings.pulumiAws.inputMod.globalaccelerator.AcceleratorAttributes]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
      
      @scala.inline
      def setIpAddressType(value: Input[String]): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
      
      @scala.inline
      def setIpSets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.AcceleratorIpSet]]]): Self = StObject.set(x, "ipSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpSetsUndefined: Self = StObject.set(x, "ipSets", js.undefined)
      
      @scala.inline
      def setIpSetsVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.AcceleratorIpSet]*): Self = StObject.set(x, "ipSets", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
