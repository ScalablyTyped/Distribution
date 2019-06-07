package typings
package atPulumiAwsLib.s3BucketObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/bucketObject", "BucketObject")
@js.native
class BucketObject protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a BucketObject resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: BucketObjectArgs) = this()
  def this(name: java.lang.String, args: BucketObjectArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".
    */
  val acl: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the bucket to put the file in.
    */
  val bucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
    */
  val cacheControl: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
    */
  val content: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
    */
  val contentBase64: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
    */
  val contentDisposition: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
    */
  val contentEncoding: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The language the content is in e.g. en-US or en-GB.
    */
  val contentLanguage: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
    */
  val contentType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}` (Terraform 0.11.12 or later) or `${md5(file("path/to/file"))}` (Terraform 0.11.11 or earlier).
    * This attribute is not compatible with KMS encryption, `kms_key_id` or `server_side_encryption = "aws:kms"`.
    */
  val etag: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the object once it is in the bucket.
    */
  val key: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies the AWS KMS Key ARN to use for object encryption.
    * This value is a fully qualified **ARN** of the KMS Key. If using `aws_kms_key`,
    * use the exported `arn` attribute:
    * `kms_key_id = "${aws_kms_key.foo.arn}"`
    */
  val kmsKeyId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
    */
  val serverSideEncryption: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The path to a file that will be read and uploaded as raw bytes for the object content.
    */
  val source: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiPulumiLib.atPulumiPulumiMod.assetNs.Asset]] = js.native
  /**
    * Specifies the desired [Storage Class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html)
    * for the object. Can be either "`STANDARD`", "`REDUCED_REDUNDANCY`", "`ONEZONE_IA`", "`INTELLIGENT_TIERING`", "`GLACIER`", "`DEEP_ARCHIVE`", or "`STANDARD_IA`". Defaults to "`STANDARD`".
    */
  val storageClass: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * A unique version ID value for the object, if bucket versioning
    * is enabled.
    */
  val versionId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
    */
  val websiteRedirect: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/s3/bucketObject", "BucketObject")
@js.native
object BucketObject extends js.Object {
  /**
    * Get an existing BucketObject resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketObjectMod.BucketObject = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketObjectMod.BucketObjectState
  ): atPulumiAwsLib.s3BucketObjectMod.BucketObject = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketObjectMod.BucketObjectState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3BucketObjectMod.BucketObject = js.native
  /**
    * Returns true if the given object is an instance of BucketObject.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketObject.BucketObject */ scala.Boolean = js.native
}

