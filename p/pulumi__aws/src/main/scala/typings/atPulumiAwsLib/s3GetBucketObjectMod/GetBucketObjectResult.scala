package typings
package atPulumiAwsLib.s3GetBucketObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketObjectResult extends js.Object {
  /**
    * Object data (see **limitations above** to understand cases in which this field is actually available)
    */
  val body: java.lang.String
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  val cacheControl: java.lang.String
  /**
    * Specifies presentational information for the object.
    */
  val contentDisposition: java.lang.String
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  val contentEncoding: java.lang.String
  /**
    * The language the content is in.
    */
  val contentLanguage: java.lang.String
  /**
    * Size of the body in bytes.
    */
  val contentLength: scala.Double
  /**
    * A standard MIME type describing the format of the object data.
    */
  val contentType: java.lang.String
  /**
    * [ETag](https://en.wikipedia.org/wiki/HTTP_ETag) generated for the object (an MD5 sum of the object content in case it's not encrypted)
    */
  val etag: java.lang.String
  /**
    * If the object expiration is configured (see [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)), the field includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
    */
  val expiration: java.lang.String
  /**
    * The date and time at which the object is no longer cacheable.
    */
  val expires: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Last modified date of the object in RFC1123 format (e.g. `Mon, 02 Jan 2006 15:04:05 MST`)
    */
  val lastModified: java.lang.String
  /**
    * A map of metadata stored with the object in S3
    */
  val metadata: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * If the object is stored using server-side encryption (KMS or Amazon S3-managed encryption key), this field includes the chosen encryption and algorithm used.
    */
  val serverSideEncryption: java.lang.String
  /**
    * If present, specifies the ID of the Key Management Service (KMS) master encryption key that was used for the object.
    */
  val sseKmsKeyId: java.lang.String
  /**
    * [Storage class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html) information of the object. Available for all objects except for `Standard` storage class objects.
    */
  val storageClass: java.lang.String
  /**
    * A mapping of tags assigned to the object.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The latest version ID of the object returned.
    */
  val versionId: java.lang.String
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  val websiteRedirectLocation: java.lang.String
}

object GetBucketObjectResult {
  @scala.inline
  def apply(
    body: java.lang.String,
    cacheControl: java.lang.String,
    contentDisposition: java.lang.String,
    contentEncoding: java.lang.String,
    contentLanguage: java.lang.String,
    contentLength: scala.Double,
    contentType: java.lang.String,
    etag: java.lang.String,
    expiration: java.lang.String,
    expires: java.lang.String,
    id: java.lang.String,
    lastModified: java.lang.String,
    metadata: org.scalablytyped.runtime.StringDictionary[js.Any],
    serverSideEncryption: java.lang.String,
    sseKmsKeyId: java.lang.String,
    storageClass: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    versionId: java.lang.String,
    websiteRedirectLocation: java.lang.String
  ): GetBucketObjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("cacheControl")(cacheControl)
    __obj.updateDynamic("contentDisposition")(contentDisposition)
    __obj.updateDynamic("contentEncoding")(contentEncoding)
    __obj.updateDynamic("contentLanguage")(contentLanguage)
    __obj.updateDynamic("contentLength")(contentLength)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("expiration")(expiration)
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lastModified")(lastModified)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("serverSideEncryption")(serverSideEncryption)
    __obj.updateDynamic("sseKmsKeyId")(sseKmsKeyId)
    __obj.updateDynamic("storageClass")(storageClass)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("versionId")(versionId)
    __obj.updateDynamic("websiteRedirectLocation")(websiteRedirectLocation)
    __obj.asInstanceOf[GetBucketObjectResult]
  }
}

