package typings.pulumiAws

import typings.pulumiAws.outputMod.s3.BucketMetricFilter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketMetricMod {
  
  @JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric")
  @js.native
  class BucketMetric protected () extends CustomResource {
    /**
      * Create a BucketMetric resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketMetricArgs) = this()
    def this(name: String, args: BucketMetricArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the bucket to put metric configuration.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: Output_[js.UndefOr[BucketMetricFilter]] = js.native
    
    /**
      * Unique identifier of the metrics configuration for the bucket.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object BucketMetric {
    
    @JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketMetric resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): BucketMetric = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[BucketMetric]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): BucketMetric = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BucketMetric]
    @scala.inline
    def get(name: String, id: Input[ID], state: BucketMetricState): BucketMetric = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[BucketMetric]
    @scala.inline
    def get(name: String, id: Input[ID], state: BucketMetricState, opts: CustomResourceOptions): BucketMetric = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BucketMetric]
    
    /**
      * Returns true if the given object is an instance of BucketMetric.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean]
  }
  
  trait BucketMetricArgs extends StObject {
    
    /**
      * The name of the bucket to put metric configuration.
      */
    val bucket: Input[String]
    
    /**
      * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketMetricFilter]] = js.undefined
    
    /**
      * Unique identifier of the metrics configuration for the bucket.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object BucketMetricArgs {
    
    @scala.inline
    def apply(bucket: Input[String]): BucketMetricArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketMetricArgs]
    }
    
    @scala.inline
    implicit class BucketMetricArgsMutableBuilder[Self <: BucketMetricArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: Input[typings.pulumiAws.inputMod.s3.BucketMetricFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait BucketMetricState extends StObject {
    
    /**
      * The name of the bucket to put metric configuration.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketMetricFilter]] = js.undefined
    
    /**
      * Unique identifier of the metrics configuration for the bucket.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object BucketMetricState {
    
    @scala.inline
    def apply(): BucketMetricState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketMetricState]
    }
    
    @scala.inline
    implicit class BucketMetricStateMutableBuilder[Self <: BucketMetricState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setFilter(value: Input[typings.pulumiAws.inputMod.s3.BucketMetricFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
