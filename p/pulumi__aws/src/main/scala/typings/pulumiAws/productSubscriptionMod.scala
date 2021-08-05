package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productSubscriptionMod {
  
  @JSImport("@pulumi/aws/securityhub/productSubscription", "ProductSubscription")
  @js.native
  class ProductSubscription protected () extends CustomResource {
    /**
      * Create a ProductSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProductSubscriptionArgs) = this()
    def this(name: String, args: ProductSubscriptionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ARN of the product that generates findings that you want to import into Security Hub - see below.
      */
    val productArn: Output_[String] = js.native
  }
  /* static members */
  object ProductSubscription {
    
    @JSImport("@pulumi/aws/securityhub/productSubscription", "ProductSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ProductSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ProductSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ProductSubscription]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ProductSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProductSubscription]
    inline def get(name: String, id: Input[ID], state: ProductSubscriptionState): ProductSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ProductSubscription]
    inline def get(name: String, id: Input[ID], state: ProductSubscriptionState, opts: CustomResourceOptions): ProductSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProductSubscription]
    
    /**
      * Returns true if the given object is an instance of ProductSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/productSubscription.ProductSubscription */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/securityhub/productSubscription.ProductSubscription */ Boolean]
  }
  
  trait ProductSubscriptionArgs extends StObject {
    
    /**
      * The ARN of the product that generates findings that you want to import into Security Hub - see below.
      */
    val productArn: Input[String]
  }
  object ProductSubscriptionArgs {
    
    inline def apply(productArn: Input[String]): ProductSubscriptionArgs = {
      val __obj = js.Dynamic.literal(productArn = productArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductSubscriptionArgs]
    }
    
    extension [Self <: ProductSubscriptionArgs](x: Self) {
      
      inline def setProductArn(value: Input[String]): Self = StObject.set(x, "productArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProductSubscriptionState extends StObject {
    
    /**
      * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the product that generates findings that you want to import into Security Hub - see below.
      */
    val productArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ProductSubscriptionState {
    
    inline def apply(): ProductSubscriptionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductSubscriptionState]
    }
    
    extension [Self <: ProductSubscriptionState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setProductArn(value: Input[String]): Self = StObject.set(x, "productArn", value.asInstanceOf[js.Any])
      
      inline def setProductArnUndefined: Self = StObject.set(x, "productArn", js.undefined)
    }
  }
}
