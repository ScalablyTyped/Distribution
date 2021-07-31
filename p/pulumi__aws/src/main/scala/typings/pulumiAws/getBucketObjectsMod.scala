package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBucketObjectsMod {
  
  @JSImport("@pulumi/aws/s3/getBucketObjects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBucketObjects(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBucketObjects")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBucketObjectsResult]]
  @scala.inline
  def getBucketObjects(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBucketObjects")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBucketObjectsResult]]
  
  trait GetBucketObjectsArgs extends StObject {
    
    /**
      * Lists object keys in this S3 bucket. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
      */
    val bucket: String
    
    /**
      * A character used to group keys (Default: none)
      */
    val delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Encodes keys using this method (Default: none; besides none, only "url" can be used)
      */
    val encodingType: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean specifying whether to populate the owner list (Default: false)
      */
    val fetchOwner: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum object keys to return (Default: 1000)
      */
    val maxKeys: js.UndefOr[Double] = js.undefined
    
    /**
      * Limits results to object keys with this prefix (Default: none)
      */
    val prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Returns key names lexicographically after a specific object key in your bucket (Default: none; S3 lists object keys in UTF-8 character encoding in lexicographical order)
      */
    val startAfter: js.UndefOr[String] = js.undefined
  }
  object GetBucketObjectsArgs {
    
    @scala.inline
    def apply(bucket: String): GetBucketObjectsArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketObjectsArgs]
    }
    
    @scala.inline
    implicit class GetBucketObjectsArgsMutableBuilder[Self <: GetBucketObjectsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
      
      @scala.inline
      def setFetchOwner(value: Boolean): Self = StObject.set(x, "fetchOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOwnerUndefined: Self = StObject.set(x, "fetchOwner", js.undefined)
      
      @scala.inline
      def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStartAfter(value: String): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    }
  }
  
  trait GetBucketObjectsResult extends StObject {
    
    val bucket: String
    
    /**
      * List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` "directory"); the list is only returned when you specify `delimiter`
      */
    val commonPrefixes: js.Array[String]
    
    val delimiter: js.UndefOr[String] = js.undefined
    
    val encodingType: js.UndefOr[String] = js.undefined
    
    val fetchOwner: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * List of strings representing object keys
      */
    val keys: js.Array[String]
    
    val maxKeys: js.UndefOr[Double] = js.undefined
    
    /**
      * List of strings representing object owner IDs (see `fetchOwner` above)
      */
    val owners: js.Array[String]
    
    val prefix: js.UndefOr[String] = js.undefined
    
    val startAfter: js.UndefOr[String] = js.undefined
  }
  object GetBucketObjectsResult {
    
    @scala.inline
    def apply(
      bucket: String,
      commonPrefixes: js.Array[String],
      id: String,
      keys: js.Array[String],
      owners: js.Array[String]
    ): GetBucketObjectsResult = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], commonPrefixes = commonPrefixes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketObjectsResult]
    }
    
    @scala.inline
    implicit class GetBucketObjectsResultMutableBuilder[Self <: GetBucketObjectsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonPrefixes(value: js.Array[String]): Self = StObject.set(x, "commonPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonPrefixesVarargs(value: String*): Self = StObject.set(x, "commonPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
      
      @scala.inline
      def setFetchOwner(value: Boolean): Self = StObject.set(x, "fetchOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOwnerUndefined: Self = StObject.set(x, "fetchOwner", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
      
      @scala.inline
      def setOwners(value: js.Array[String]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStartAfter(value: String): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    }
  }
}
