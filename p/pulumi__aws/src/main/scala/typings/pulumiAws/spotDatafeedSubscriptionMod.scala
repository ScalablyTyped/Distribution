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
    
    /**
      * Get an existing SpotDatafeedSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): SpotDatafeedSubscription = js.native
    @JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SpotDatafeedSubscription = js.native
    @JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: SpotDatafeedSubscriptionState): SpotDatafeedSubscription = js.native
    @JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: SpotDatafeedSubscriptionState, opts: CustomResourceOptions): SpotDatafeedSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of SpotDatafeedSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotDatafeedSubscription.SpotDatafeedSubscription */ Boolean = js.native
  }
  
  @js.native
  trait SpotDatafeedSubscriptionArgs extends StObject {
    
    /**
      * The Amazon S3 bucket in which to store the Spot instance data feed.
      */
    val bucket: Input[String] = js.native
    
    /**
      * Path of folder inside bucket to place spot pricing data.
      */
    val prefix: js.UndefOr[Input[String]] = js.native
  }
  object SpotDatafeedSubscriptionArgs {
    
    @scala.inline
    def apply(bucket: Input[String]): SpotDatafeedSubscriptionArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpotDatafeedSubscriptionArgs]
    }
    
    @scala.inline
    implicit class SpotDatafeedSubscriptionArgsMutableBuilder[Self <: SpotDatafeedSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait SpotDatafeedSubscriptionState extends StObject {
    
    /**
      * The Amazon S3 bucket in which to store the Spot instance data feed.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * Path of folder inside bucket to place spot pricing data.
      */
    val prefix: js.UndefOr[Input[String]] = js.native
  }
  object SpotDatafeedSubscriptionState {
    
    @scala.inline
    def apply(): SpotDatafeedSubscriptionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpotDatafeedSubscriptionState]
    }
    
    @scala.inline
    implicit class SpotDatafeedSubscriptionStateMutableBuilder[Self <: SpotDatafeedSubscriptionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
