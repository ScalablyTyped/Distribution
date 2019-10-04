package typings.atPulumiAws.s3GetBucketObjectMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketObjectResult extends js.Object {
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
    * id is the provider-assigned unique ID for this managed resource.
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
  val metadata: StringDictionary[js.Any]
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
    * A mapping of tags assigned to the object.
    */
  val tags: StringDictionary[js.Any]
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
    metadata: StringDictionary[js.Any],
    objectLockLegalHoldStatus: String,
    objectLockMode: String,
    objectLockRetainUntilDate: String,
    serverSideEncryption: String,
    sseKmsKeyId: String,
    storageClass: String,
    tags: StringDictionary[js.Any],
    versionId: String,
    websiteRedirectLocation: String,
    range: String = null
  ): GetBucketObjectResult = {
    val __obj = js.Dynamic.literal(body = body, bucket = bucket, cacheControl = cacheControl, contentDisposition = contentDisposition, contentEncoding = contentEncoding, contentLanguage = contentLanguage, contentLength = contentLength, contentType = contentType, etag = etag, expiration = expiration, expires = expires, id = id, key = key, lastModified = lastModified, metadata = metadata, objectLockLegalHoldStatus = objectLockLegalHoldStatus, objectLockMode = objectLockMode, objectLockRetainUntilDate = objectLockRetainUntilDate, serverSideEncryption = serverSideEncryption, sseKmsKeyId = sseKmsKeyId, storageClass = storageClass, tags = tags, versionId = versionId, websiteRedirectLocation = websiteRedirectLocation)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[GetBucketObjectResult]
  }
}

