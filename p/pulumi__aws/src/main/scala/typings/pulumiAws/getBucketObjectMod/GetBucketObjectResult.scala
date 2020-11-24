package typings.pulumiAws.getBucketObjectMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketObjectResult extends js.Object {
  
  /**
    * Object data (see **limitations above** to understand cases in which this field is actually available)
    */
  val body: String = js.native
  
  val bucket: String = js.native
  
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  val cacheControl: String = js.native
  
  /**
    * Specifies presentational information for the object.
    */
  val contentDisposition: String = js.native
  
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  val contentEncoding: String = js.native
  
  /**
    * The language the content is in.
    */
  val contentLanguage: String = js.native
  
  /**
    * Size of the body in bytes.
    */
  val contentLength: Double = js.native
  
  /**
    * A standard MIME type describing the format of the object data.
    */
  val contentType: String = js.native
  
  /**
    * [ETag](https://en.wikipedia.org/wiki/HTTP_ETag) generated for the object (an MD5 sum of the object content in case it's not encrypted)
    */
  val etag: String = js.native
  
  /**
    * If the object expiration is configured (see [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)), the field includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
    */
  val expiration: String = js.native
  
  /**
    * The date and time at which the object is no longer cacheable.
    */
  val expires: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val key: String = js.native
  
  /**
    * Last modified date of the object in RFC1123 format (e.g. `Mon, 02 Jan 2006 15:04:05 MST`)
    */
  val lastModified: String = js.native
  
  /**
    * A map of metadata stored with the object in S3
    */
  val metadata: StringDictionary[String] = js.native
  
  /**
    * Indicates whether this object has an active [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds). This field is only returned if you have permission to view an object's legal hold status.
    */
  val objectLockLegalHoldStatus: String = js.native
  
  /**
    * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) currently in place for this object.
    */
  val objectLockMode: String = js.native
  
  /**
    * The date and time when this object's object lock will expire.
    */
  val objectLockRetainUntilDate: String = js.native
  
  val range: js.UndefOr[String] = js.native
  
  /**
    * If the object is stored using server-side encryption (KMS or Amazon S3-managed encryption key), this field includes the chosen encryption and algorithm used.
    */
  val serverSideEncryption: String = js.native
  
  /**
    * If present, specifies the ID of the Key Management Service (KMS) master encryption key that was used for the object.
    */
  val sseKmsKeyId: String = js.native
  
  /**
    * [Storage class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html) information of the object. Available for all objects except for `Standard` storage class objects.
    */
  val storageClass: String = js.native
  
  /**
    * A map of tags assigned to the object.
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * The latest version ID of the object returned.
    */
  val versionId: String = js.native
  
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  val websiteRedirectLocation: String = js.native
}
object GetBucketObjectResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GetBucketObjectResultOps[Self <: GetBucketObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControl(value: String): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockLegalHoldStatus(value: String): Self = this.set("objectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockMode(value: String): Self = this.set("objectLockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockRetainUntilDate(value: String): Self = this.set("objectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryption(value: String): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseKmsKeyId(value: String): Self = this.set("sseKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClass(value: String): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteRedirectLocation(value: String): Self = this.set("websiteRedirectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
