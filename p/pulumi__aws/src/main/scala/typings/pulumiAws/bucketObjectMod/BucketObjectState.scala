package typings.pulumiAws.bucketObjectMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.s3Mod.Bucket
import typings.pulumiPulumi.mod.asset.Archive
import typings.pulumiPulumi.mod.asset.Asset
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketObjectState extends js.Object {
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".
    */
  val acl: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
    */
  val bucket: js.UndefOr[Input[String | Bucket]] = js.native
  /**
    * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
    */
  val cacheControl: js.UndefOr[Input[String]] = js.native
  /**
    * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
    */
  val content: js.UndefOr[Input[String]] = js.native
  /**
    * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
    */
  val contentBase64: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
    */
  val contentDisposition: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
    */
  val contentEncoding: js.UndefOr[Input[String]] = js.native
  /**
    * The language the content is in e.g. en-US or en-GB.
    */
  val contentLanguage: js.UndefOr[Input[String]] = js.native
  /**
    * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
    */
  val contentType: js.UndefOr[Input[String]] = js.native
  /**
    * Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}` (this provider 0.11.12 or later) or `${md5(file("path/to/file"))}` (this provider 0.11.11 or earlier).
    * This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"`.
    */
  val etag: js.UndefOr[Input[String]] = js.native
  /**
    * Allow the object to be deleted by removing any legal hold on any object version.
    * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the object once it is in the bucket.
    */
  val key: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the AWS KMS Key ARN to use for object encryption.
    * This value is a fully qualified **ARN** of the KMS Key. If using `aws.kms.Key`,
    * use the exported `arn` attribute:
    * `kmsKeyId = "${aws_kms_key.foo.arn}"`
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
    */
  val metadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
    */
  val objectLockLegalHoldStatus: js.UndefOr[Input[String]] = js.native
  /**
    * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
    */
  val objectLockMode: js.UndefOr[Input[String]] = js.native
  /**
    * The date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
    */
  val objectLockRetainUntilDate: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
    */
  val serverSideEncryption: js.UndefOr[Input[String]] = js.native
  /**
    * The path to a file that will be read and uploaded as raw bytes for the object content.
    */
  val source: js.UndefOr[Input[Asset | Archive]] = js.native
  /**
    * Specifies the desired [Storage Class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html)
    * for the object. Can be either "`STANDARD`", "`REDUCED_REDUNDANCY`", "`ONEZONE_IA`", "`INTELLIGENT_TIERING`", "`GLACIER`", "`DEEP_ARCHIVE`", or "`STANDARD_IA`". Defaults to "`STANDARD`".
    */
  val storageClass: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A unique version ID value for the object, if bucket versioning
    * is enabled.
    */
  val versionId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
    */
  val websiteRedirect: js.UndefOr[Input[String]] = js.native
}

object BucketObjectState {
  @scala.inline
  def apply(): BucketObjectState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketObjectState]
  }
  @scala.inline
  implicit class BucketObjectStateOps[Self <: BucketObjectState] (val x: Self) extends AnyVal {
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
    def setAcl(value: Input[String]): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setBucket(value: Input[String | Bucket]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setCacheControl(value: Input[String]): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    @scala.inline
    def setContent(value: Input[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentBase64(value: Input[String]): Self = this.set("contentBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentBase64: Self = this.set("contentBase64", js.undefined)
    @scala.inline
    def setContentDisposition(value: Input[String]): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    @scala.inline
    def setContentEncoding(value: Input[String]): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    @scala.inline
    def setContentLanguage(value: Input[String]): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    @scala.inline
    def setContentType(value: Input[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setEtag(value: Input[String]): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setForceDestroy(value: Input[Boolean]): Self = this.set("forceDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDestroy: Self = this.set("forceDestroy", js.undefined)
    @scala.inline
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setMetadata(value: Input[StringDictionary[Input[String]]]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setObjectLockLegalHoldStatus(value: Input[String]): Self = this.set("objectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockLegalHoldStatus: Self = this.set("objectLockLegalHoldStatus", js.undefined)
    @scala.inline
    def setObjectLockMode(value: Input[String]): Self = this.set("objectLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockMode: Self = this.set("objectLockMode", js.undefined)
    @scala.inline
    def setObjectLockRetainUntilDate(value: Input[String]): Self = this.set("objectLockRetainUntilDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockRetainUntilDate: Self = this.set("objectLockRetainUntilDate", js.undefined)
    @scala.inline
    def setServerSideEncryption(value: Input[String]): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("serverSideEncryption", js.undefined)
    @scala.inline
    def setSource(value: Input[Asset | Archive]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStorageClass(value: Input[String]): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersionId(value: Input[String]): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
    @scala.inline
    def setWebsiteRedirect(value: Input[String]): Self = this.set("websiteRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteRedirect: Self = this.set("websiteRedirect", js.undefined)
  }
  
}

