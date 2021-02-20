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

object standardsSubscriptionMod {
  
  @JSImport("@pulumi/aws/securityhub/standardsSubscription", "StandardsSubscription")
  @js.native
  class StandardsSubscription protected () extends CustomResource {
    /**
      * Create a StandardsSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StandardsSubscriptionArgs) = this()
    def this(name: String, args: StandardsSubscriptionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of a standard - see below.
      */
    val standardsArn: Output_[String] = js.native
  }
  /* static members */
  object StandardsSubscription {
    
    /**
      * Get an existing StandardsSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/securityhub/standardsSubscription", "StandardsSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): StandardsSubscription = js.native
    @JSImport("@pulumi/aws/securityhub/standardsSubscription", "StandardsSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): StandardsSubscription = js.native
    @JSImport("@pulumi/aws/securityhub/standardsSubscription", "StandardsSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: StandardsSubscriptionState): StandardsSubscription = js.native
    @JSImport("@pulumi/aws/securityhub/standardsSubscription", "StandardsSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: StandardsSubscriptionState, opts: CustomResourceOptions): StandardsSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of StandardsSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/securityhub/standardsSubscription", "StandardsSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/standardsSubscription.StandardsSubscription */ Boolean = js.native
  }
  
  @js.native
  trait StandardsSubscriptionArgs extends StObject {
    
    /**
      * The ARN of a standard - see below.
      */
    val standardsArn: Input[String] = js.native
  }
  object StandardsSubscriptionArgs {
    
    @scala.inline
    def apply(standardsArn: Input[String]): StandardsSubscriptionArgs = {
      val __obj = js.Dynamic.literal(standardsArn = standardsArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandardsSubscriptionArgs]
    }
    
    @scala.inline
    implicit class StandardsSubscriptionArgsMutableBuilder[Self <: StandardsSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStandardsArn(value: Input[String]): Self = StObject.set(x, "standardsArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StandardsSubscriptionState extends StObject {
    
    /**
      * The ARN of a standard - see below.
      */
    val standardsArn: js.UndefOr[Input[String]] = js.native
  }
  object StandardsSubscriptionState {
    
    @scala.inline
    def apply(): StandardsSubscriptionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardsSubscriptionState]
    }
    
    @scala.inline
    implicit class StandardsSubscriptionStateMutableBuilder[Self <: StandardsSubscriptionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStandardsArn(value: Input[String]): Self = StObject.set(x, "standardsArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardsArnUndefined: Self = StObject.set(x, "standardsArn", js.undefined)
    }
  }
}
