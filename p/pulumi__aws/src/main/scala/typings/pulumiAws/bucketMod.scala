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

object bucketMod {
  
  @JSImport("@pulumi/aws/s3control/bucket", "Bucket")
  @js.native
  class Bucket protected () extends CustomResource {
    /**
      * Create a Bucket resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketArgs) = this()
    def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Name of the bucket.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * UTC creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    val creationDate: Output_[String] = js.native
    
    /**
      * Identifier of the Outpost to contain this bucket.
      */
    val outpostId: Output_[String] = js.native
    
    /**
      * Boolean whether Public Access Block is enabled.
      */
    val publicAccessBlockEnabled: Output_[Boolean] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Bucket {
    
    /**
      * Get an existing Bucket resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3control/bucket", "Bucket.get")
    @js.native
    def get(name: String, id: Input[ID]): Bucket = js.native
    @JSImport("@pulumi/aws/s3control/bucket", "Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Bucket = js.native
    @JSImport("@pulumi/aws/s3control/bucket", "Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketState): Bucket = js.native
    @JSImport("@pulumi/aws/s3control/bucket", "Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): Bucket = js.native
    
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3control/bucket", "Bucket.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucket.Bucket */ Boolean = js.native
  }
  
  @js.native
  trait BucketArgs extends StObject {
    
    /**
      * Name of the bucket.
      */
    val bucket: Input[String] = js.native
    
    /**
      * Identifier of the Outpost to contain this bucket.
      */
    val outpostId: Input[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object BucketArgs {
    
    @scala.inline
    def apply(bucket: Input[String], outpostId: Input[String]): BucketArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], outpostId = outpostId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketArgs]
    }
    
    @scala.inline
    implicit class BucketArgsMutableBuilder[Self <: BucketArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait BucketState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the bucket.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * UTC creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    val creationDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the Outpost to contain this bucket.
      */
    val outpostId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean whether Public Access Block is enabled.
      */
    val publicAccessBlockEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object BucketState {
    
    @scala.inline
    def apply(): BucketState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketState]
    }
    
    @scala.inline
    implicit class BucketStateMutableBuilder[Self <: BucketState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setCreationDate(value: Input[String]): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostIdUndefined: Self = StObject.set(x, "outpostId", js.undefined)
      
      @scala.inline
      def setPublicAccessBlockEnabled(value: Input[Boolean]): Self = StObject.set(x, "publicAccessBlockEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicAccessBlockEnabledUndefined: Self = StObject.set(x, "publicAccessBlockEnabled", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
