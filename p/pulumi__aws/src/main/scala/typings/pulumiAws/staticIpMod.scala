package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticIpMod {
  
  @JSImport("@pulumi/aws/lightsail/staticIp", "StaticIp")
  @js.native
  class StaticIp protected () extends CustomResource {
    /**
      * Create a StaticIp resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StaticIpArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StaticIpArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Lightsail static IP
      */
    val arn: Output_[String] = js.native
    
    /**
      * The allocated static IP address
      */
    val ipAddress: Output_[String] = js.native
    
    /**
      * The name for the allocated static IP
      */
    val name: Output_[String] = js.native
    
    /**
      * The support code.
      */
    val supportCode: Output_[String] = js.native
  }
  /* static members */
  object StaticIp {
    
    /**
      * Get an existing StaticIp resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lightsail/staticIp", "StaticIp.get")
    @js.native
    def get(name: String, id: Input[ID]): StaticIp = js.native
    @JSImport("@pulumi/aws/lightsail/staticIp", "StaticIp.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): StaticIp = js.native
    @JSImport("@pulumi/aws/lightsail/staticIp", "StaticIp.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticIpState): StaticIp = js.native
    @JSImport("@pulumi/aws/lightsail/staticIp", "StaticIp.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticIpState, opts: CustomResourceOptions): StaticIp = js.native
    
    /**
      * Returns true if the given object is an instance of StaticIp.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lightsail/staticIp", "StaticIp.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIp.StaticIp */ Boolean = js.native
  }
  
  @js.native
  trait StaticIpArgs extends StObject {
    
    /**
      * The name for the allocated static IP
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object StaticIpArgs {
    
    @scala.inline
    def apply(): StaticIpArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticIpArgs]
    }
    
    @scala.inline
    implicit class StaticIpArgsMutableBuilder[Self <: StaticIpArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait StaticIpState extends StObject {
    
    /**
      * The ARN of the Lightsail static IP
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The allocated static IP address
      */
    val ipAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name for the allocated static IP
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The support code.
      */
    val supportCode: js.UndefOr[Input[String]] = js.native
  }
  object StaticIpState {
    
    @scala.inline
    def apply(): StaticIpState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticIpState]
    }
    
    @scala.inline
    implicit class StaticIpStateMutableBuilder[Self <: StaticIpState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSupportCode(value: Input[String]): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    }
  }
}
