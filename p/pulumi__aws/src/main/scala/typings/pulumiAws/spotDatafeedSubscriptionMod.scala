package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotDatafeedSubscriptionMod {
  
  @JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription")
  @js.native
  class SpotDatafeedSubscription protected () extends CustomResource {
    /**
      * Create a SpotDatafeedSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SpotDatafeedSubscriptionArgs) = this()
    def this(name: String, args: SpotDatafeedSubscriptionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon S3 bucket in which to store the Spot instance data feed.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * Path of folder inside bucket to place spot pricing data.
      */
    val prefix: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object SpotDatafeedSubscription {
    
    @JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SpotDatafeedSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SpotDatafeedSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SpotDatafeedSubscription]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SpotDatafeedSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SpotDatafeedSubscription]
    inline def get(name: String, id: Input[ID], state: SpotDatafeedSubscriptionState): SpotDatafeedSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SpotDatafeedSubscription]
    inline def get(name: String, id: Input[ID], state: SpotDatafeedSubscriptionState, opts: CustomResourceOptions): SpotDatafeedSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SpotDatafeedSubscription]
    
    /**
      * Returns true if the given object is an instance of SpotDatafeedSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotDatafeedSubscription.SpotDatafeedSubscription */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/spotDatafeedSubscription.SpotDatafeedSubscription */ Boolean]
  }
  
  trait SpotDatafeedSubscriptionArgs extends StObject {
    
    /**
      * The Amazon S3 bucket in which to store the Spot instance data feed.
      */
    val bucket: Input[String]
    
    /**
      * Path of folder inside bucket to place spot pricing data.
      */
    val prefix: js.UndefOr[Input[String]] = js.undefined
  }
  object SpotDatafeedSubscriptionArgs {
    
    inline def apply(bucket: Input[String]): SpotDatafeedSubscriptionArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpotDatafeedSubscriptionArgs]
    }
    
    extension [Self <: SpotDatafeedSubscriptionArgs](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait SpotDatafeedSubscriptionState extends StObject {
    
    /**
      * The Amazon S3 bucket in which to store the Spot instance data feed.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Path of folder inside bucket to place spot pricing data.
      */
    val prefix: js.UndefOr[Input[String]] = js.undefined
  }
  object SpotDatafeedSubscriptionState {
    
    inline def apply(): SpotDatafeedSubscriptionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpotDatafeedSubscriptionState]
    }
    
    extension [Self <: SpotDatafeedSubscriptionState](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
