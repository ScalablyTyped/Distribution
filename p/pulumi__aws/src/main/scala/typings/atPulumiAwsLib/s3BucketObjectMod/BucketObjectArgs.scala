package typings
package atPulumiAwsLib.s3BucketObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketObjectArgs extends js.Object {
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".
    */
  val acl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the bucket to put the file in.
    */
  val bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.s3BucketMod.Bucket]
  /**
    * Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
    */
  val cacheControl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
    */
  val content: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
    */
  val contentBase64: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
    */
  val contentDisposition: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
    */
  val contentEncoding: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The language the content is in e.g. en-US or en-GB.
    */
  val contentLanguage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
    */
  val contentType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Used to trigger updates. The only meaningful value is `${md5(file("path/to/file"))}`.
    * This attribute is not compatible with KMS encryption, `kms_key_id` or `server_side_encryption = "aws:kms"`.
    */
  val etag: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the object once it is in the bucket.
    */
  val key: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the AWS KMS Key ARN to use for object encryption.
    * This value is a fully qualified **ARN** of the KMS Key. If using `aws_kms_key`,
    * use the exported `arn` attribute:
    * `kms_key_id = "${aws_kms_key.foo.arn}"`
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
    */
  val serverSideEncryption: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The path to a file that will be read and uploaded as raw bytes for the object content.
    */
  val source: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.atPulumiPulumiMod.assetNs.Asset]
  ] = js.undefined
  /**
    * Specifies the desired [Storage Class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html)
    * for the object. Can be either "`STANDARD`", "`REDUCED_REDUNDANCY`", "`ONEZONE_IA`", "`INTELLIGENT_TIERING`", "`GLACIER`", or "`STANDARD_IA`". Defaults to "`STANDARD`".
    */
  val storageClass: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
    */
  val websiteRedirect: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

