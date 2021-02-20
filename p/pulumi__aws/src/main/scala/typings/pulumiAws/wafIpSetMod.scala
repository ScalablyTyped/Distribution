package typings.pulumiAws

import typings.pulumiAws.outputMod.waf.IpSetIpSetDescriptor
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafIpSetMod {
  
  @JSImport("@pulumi/aws/waf/ipSet", "IpSet")
  @js.native
  class IpSet protected () extends CustomResource {
    /**
      * Create a IpSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IpSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the WAF IPSet.
      */
    val arn: Output_[String] = js.native
    
    /**
      * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
      */
    val ipSetDescriptors: Output_[js.UndefOr[js.Array[IpSetIpSetDescriptor]]] = js.native
    
    /**
      * The name or description of the IPSet.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object IpSet {
    
    /**
      * Get an existing IpSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/waf/ipSet", "IpSet.get")
    @js.native
    def get(name: String, id: Input[ID]): IpSet = js.native
    @JSImport("@pulumi/aws/waf/ipSet", "IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IpSet = js.native
    @JSImport("@pulumi/aws/waf/ipSet", "IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpSetState): IpSet = js.native
    @JSImport("@pulumi/aws/waf/ipSet", "IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): IpSet = js.native
    
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/waf/ipSet", "IpSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/ipSet.IpSet */ Boolean = js.native
  }
  
  @js.native
  trait IpSetArgs extends StObject {
    
    /**
      * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
      */
    val ipSetDescriptors: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.waf.IpSetIpSetDescriptor]]]] = js.native
    
    /**
      * The name or description of the IPSet.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object IpSetArgs {
    
    @scala.inline
    def apply(): IpSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpSetArgs]
    }
    
    @scala.inline
    implicit class IpSetArgsMutableBuilder[Self <: IpSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpSetDescriptors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.waf.IpSetIpSetDescriptor]]]): Self = StObject.set(x, "ipSetDescriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpSetDescriptorsUndefined: Self = StObject.set(x, "ipSetDescriptors", js.undefined)
      
      @scala.inline
      def setIpSetDescriptorsVarargs(value: Input[typings.pulumiAws.inputMod.waf.IpSetIpSetDescriptor]*): Self = StObject.set(x, "ipSetDescriptors", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait IpSetState extends StObject {
    
    /**
      * The ARN of the WAF IPSet.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
      */
    val ipSetDescriptors: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.waf.IpSetIpSetDescriptor]]]] = js.native
    
    /**
      * The name or description of the IPSet.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object IpSetState {
    
    @scala.inline
    def apply(): IpSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpSetState]
    }
    
    @scala.inline
    implicit class IpSetStateMutableBuilder[Self <: IpSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setIpSetDescriptors(value: Input[js.Array[Input[typings.pulumiAws.inputMod.waf.IpSetIpSetDescriptor]]]): Self = StObject.set(x, "ipSetDescriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpSetDescriptorsUndefined: Self = StObject.set(x, "ipSetDescriptors", js.undefined)
      
      @scala.inline
      def setIpSetDescriptorsVarargs(value: Input[typings.pulumiAws.inputMod.waf.IpSetIpSetDescriptor]*): Self = StObject.set(x, "ipSetDescriptors", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
