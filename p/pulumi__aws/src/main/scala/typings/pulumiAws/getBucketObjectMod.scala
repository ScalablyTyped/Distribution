package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBucketObjectMod {
  
  @JSImport("@pulumi/aws/s3/getBucketObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBucketObject(args: GetBucketObjectArgs): js.Promise[GetBucketObjectResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBucketObject")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBucketObjectResult]]
  inline def getBucketObject(args: GetBucketObjectArgs, opts: InvokeOptions): js.Promise[GetBucketObjectResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBucketObject")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBucketObjectResult]]
  
  trait GetBucketObjectArgs extends StObject {
    
    /**
      * The name of the bucket to read the object from. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
      */
    val bucket: String
    
    /**
      * The full path to the object inside the bucket
      */
    val key: String
    
    val range: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags assigned to the object.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Specific version ID of the object returned (defaults to latest version)
      */
    val versionId: js.UndefOr[String] = js.undefined
  }
  object GetBucketObjectArgs {
    
    inline def apply(bucket: String, key: String): GetBucketObjectArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketObjectArgs]
    }
    
    extension [Self <: GetBucketObjectArgs](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    }
  }
  
  trait GetBucketObjectResult extends StObject {
    
    /**
      * Object data (see **limitations above** to understand cases in which this field is actually available)
      */
    val body: String
    
    val bucket: String
    
    /**
      * Specifies caching behavior along the request/reply chain.
      */
    val cacheControl: String
    
    /**
      * Specifies presentational information for the object.
      */
    val contentDisposition: String
    
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
      */
    val contentEncoding: String
    
    /**
      * The language the content is in.
      */
    val contentLanguage: String
    
    /**
      * Size of the body in bytes.
      */
    val contentLength: Double
    
    /**
      * A standard MIME type describing the format of the object data.
      */
    val contentType: String
    
    /**
      * [ETag](https://en.wikipedia.org/wiki/HTTP_ETag) generated for the object (an MD5 sum of the object content in case it's not encrypted)
      */
    val etag: String
    
    /**
      * If the object expiration is configured (see [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)), the field includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
      */
    val expiration: String
    
    /**
      * The date and time at which the object is no longer cacheable.
      */
    val expires: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val key: String
    
    /**
      * Last modified date of the object in RFC1123 format (e.g. `Mon, 02 Jan 2006 15:04:05 MST`)
      */
    val lastModified: String
    
    /**
      * A map of metadata stored with the object in S3
      */
    val metadata: StringDictionary[String]
    
    /**
      * Indicates whether this object has an active [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds). This field is only returned if you have permission to view an object's legal hold status.
      */
    val objectLockLegalHoldStatus: String
    
    /**
      * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) currently in place for this object.
      */
    val objectLockMode: String
    
    /**
      * The date and time when this object's object lock will expire.
      */
    val objectLockRetainUntilDate: String
    
    val range: js.UndefOr[String] = js.undefined
    
    /**
      * If the object is stored using server-side encryption (KMS or Amazon S3-managed encryption key), this field includes the chosen encryption and algorithm used.
      */
    val serverSideEncryption: String
    
    /**
      * If present, specifies the ID of the Key Management Service (KMS) master encryption key that was used for the object.
      */
    val sseKmsKeyId: String
    
    /**
      * [Storage class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html) information of the object. Available for all objects except for `Standard` storage class objects.
      */
    val storageClass: String
    
    /**
      * A map of tags assigned to the object.
      */
    val tags: StringDictionary[String]
    
    /**
      * The latest version ID of the object returned.
      */
    val versionId: String
    
    /**
      * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
      */
    val websiteRedirectLocation: String
  }
  object GetBucketObjectResult {
    
    inline def apply(
      body: String,
      bucket: String,
      cacheControl: String,
      contentDisposition: String,
      contentEncoding: String,
      contentLanguage: String,
      contentLength: Double,
      contentType: String,
      etag: String,
      expiration: String,
      expires: String,
      id: String,
      key: String,
      lastModified: String,
      metadata: StringDictionary[String],
      objectLockLegalHoldStatus: String,
      objectLockMode: String,
      objectLockRetainUntilDate: String,
      serverSideEncryption: String,
      sseKmsKeyId: String,
      storageClass: String,
      tags: StringDictionary[String],
      versionId: String,
      websiteRedirectLocation: String
    ): GetBucketObjectResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], cacheControl = cacheControl.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentEncoding = contentEncoding.asInstanceOf[js.Any], contentLanguage = contentLanguage.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], objectLockLegalHoldStatus = objectLockLegalHoldStatus.asInstanceOf[js.Any], objectLockMode = objectLockMode.asInstanceOf[js.Any], objectLockRetainUntilDate = objectLockRetainUntilDate.asInstanceOf[js.Any], serverSideEncryption = serverSideEncryption.asInstanceOf[js.Any], sseKmsKeyId = sseKmsKeyId.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any], websiteRedirectLocation = websiteRedirectLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketObjectResult]
    }
    
    extension [Self <: GetBucketObjectResult](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setObjectLockLegalHoldStatus(value: String): Self = StObject.set(x, "objectLockLegalHoldStatus", value.asInstanceOf[js.Any])
      
      inline def setObjectLockMode(value: String): Self = StObject.set(x, "objectLockMode", value.asInstanceOf[js.Any])
      
      inline def setObjectLockRetainUntilDate(value: String): Self = StObject.set(x, "objectLockRetainUntilDate", value.asInstanceOf[js.Any])
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setServerSideEncryption(value: String): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setSseKmsKeyId(value: String): Self = StObject.set(x, "sseKmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setWebsiteRedirectLocation(value: String): Self = StObject.set(x, "websiteRedirectLocation", value.asInstanceOf[js.Any])
    }
  }
}
