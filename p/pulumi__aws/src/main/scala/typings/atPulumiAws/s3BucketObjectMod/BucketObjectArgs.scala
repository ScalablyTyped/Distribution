package typings.atPulumiAws.s3BucketObjectMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.s3BucketMod.Bucket
import typings.atPulumiPulumi.atPulumiPulumiMod.assetNs.Asset
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketObjectArgs extends js.Object {
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".
    */
  val acl: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the bucket to put the file in.
    */
  val bucket: Input[String | Bucket]
  /**
    * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
    */
  val cacheControl: js.UndefOr[Input[String]] = js.undefined
  /**
    * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
    */
  val content: js.UndefOr[Input[String]] = js.undefined
  /**
    * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
    */
  val contentBase64: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
    */
  val contentDisposition: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
    */
  val contentEncoding: js.UndefOr[Input[String]] = js.undefined
  /**
    * The language the content is in e.g. en-US or en-GB.
    */
  val contentLanguage: js.UndefOr[Input[String]] = js.undefined
  /**
    * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
    */
  val contentType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}` (this provider 0.11.12 or later) or `${md5(file("path/to/file"))}` (this provider 0.11.11 or earlier).
    * This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"`.
    */
  val etag: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the object once it is in the bucket.
    */
  val key: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the AWS KMS Key ARN to use for object encryption.
    * This value is a fully qualified **ARN** of the KMS Key. If using `aws.kms.Key`,
    * use the exported `arn` attribute:
    * `kmsKeyId = "${aws_kms_key.foo.arn}"`
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
    */
  val metadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Specifies server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
    */
  val serverSideEncryption: js.UndefOr[Input[String]] = js.undefined
  /**
    * The path to a file that will be read and uploaded as raw bytes for the object content.
    */
  val source: js.UndefOr[Input[Asset]] = js.undefined
  /**
    * Specifies the desired [Storage Class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html)
    * for the object. Can be either "`STANDARD`", "`REDUCED_REDUNDANCY`", "`ONEZONE_IA`", "`INTELLIGENT_TIERING`", "`GLACIER`", "`DEEP_ARCHIVE`", or "`STANDARD_IA`". Defaults to "`STANDARD`".
    */
  val storageClass: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
    */
  val websiteRedirect: js.UndefOr[Input[String]] = js.undefined
}

object BucketObjectArgs {
  @scala.inline
  def apply(
    bucket: Input[String | Bucket],
    acl: Input[String] = null,
    cacheControl: Input[String] = null,
    content: Input[String] = null,
    contentBase64: Input[String] = null,
    contentDisposition: Input[String] = null,
    contentEncoding: Input[String] = null,
    contentLanguage: Input[String] = null,
    contentType: Input[String] = null,
    etag: Input[String] = null,
    key: Input[String] = null,
    kmsKeyId: Input[String] = null,
    metadata: Input[StringDictionary[Input[String]]] = null,
    serverSideEncryption: Input[String] = null,
    source: Input[Asset] = null,
    storageClass: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    websiteRedirect: Input[String] = null
  ): BucketObjectArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentBase64 != null) __obj.updateDynamic("contentBase64")(contentBase64.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (websiteRedirect != null) __obj.updateDynamic("websiteRedirect")(websiteRedirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectArgs]
  }
}

