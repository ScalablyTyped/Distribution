package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/s3control/bucket", "Bucket")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Bucket resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Bucket]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Bucket]
    inline def get(name: String, id: Input[ID], state: BucketState): Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Bucket]
    inline def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Bucket]
    
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucket.Bucket */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3control/bucket.Bucket */ Boolean]
  }
  
  trait BucketArgs extends StObject {
    
    /**
      * Name of the bucket.
      */
    val bucket: Input[String]
    
    /**
      * Identifier of the Outpost to contain this bucket.
      */
    val outpostId: Input[String]
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object BucketArgs {
    
    inline def apply(bucket: Input[String], outpostId: Input[String]): BucketArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], outpostId = outpostId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketArgs]
    }
    
    extension [Self <: BucketArgs](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait BucketState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the bucket.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * UTC creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    val creationDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the Outpost to contain this bucket.
      */
    val outpostId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean whether Public Access Block is enabled.
      */
    val publicAccessBlockEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object BucketState {
    
    inline def apply(): BucketState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketState]
    }
    
    extension [Self <: BucketState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setCreationDate(value: Input[String]): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      inline def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      inline def setOutpostIdUndefined: Self = StObject.set(x, "outpostId", js.undefined)
      
      inline def setPublicAccessBlockEnabled(value: Input[Boolean]): Self = StObject.set(x, "publicAccessBlockEnabled", value.asInstanceOf[js.Any])
      
      inline def setPublicAccessBlockEnabledUndefined: Self = StObject.set(x, "publicAccessBlockEnabled", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
