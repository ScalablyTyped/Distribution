package typings.pulumiAws.bucketObjectMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.mod.asset.Archive
import typings.pulumiPulumi.mod.asset.Asset
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3/bucketObject", "BucketObject")
@js.native
class BucketObject protected () extends CustomResource {
  /**
    * Create a BucketObject resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketObjectArgs) = this()
  def this(name: String, args: BucketObjectArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Defaults to `private`.
    */
  val acl: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
    */
  val bucket: Output_[String] = js.native
  
  /**
    * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
    */
  val cacheControl: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
    */
  val content: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
    */
  val contentBase64: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
    */
  val contentDisposition: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
    */
  val contentEncoding: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The language the content is in e.g. en-US or en-GB.
    */
  val contentLanguage: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
    */
  val contentType: Output_[String] = js.native
  
  /**
    * Used to trigger updates. The only meaningful value is `${filemd5("path/to/file")}` (this provider 0.11.12 or later) or `${md5(file("path/to/file"))}` (this provider 0.11.11 or earlier).
    * This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"`.
    */
  val etag: Output_[String] = js.native
  
  /**
    * Allow the object to be deleted by removing any legal hold on any object version.
    * Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
    */
  val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The name of the object once it is in the bucket.
    */
  val key: Output_[String] = js.native
  
  val kmsKeyId: Output_[String] = js.native
  
  /**
    * A map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
    */
  val metadata: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
    */
  val objectLockLegalHoldStatus: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
    */
  val objectLockMode: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
    */
  val objectLockRetainUntilDate: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Specifies server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
    */
  val serverSideEncryption: Output_[String] = js.native
  
  /**
    * The path to a file that will be read and uploaded as raw bytes for the object content.
    */
  val source: Output_[js.UndefOr[Asset | Archive]] = js.native
  
  /**
    * Specifies the desired [Storage Class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html)
    * for the object. Can be either "`STANDARD`", "`REDUCED_REDUNDANCY`", "`ONEZONE_IA`", "`INTELLIGENT_TIERING`", "`GLACIER`", "`DEEP_ARCHIVE`", or "`STANDARD_IA`". Defaults to "`STANDARD`".
    */
  val storageClass: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the object.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A unique version ID value for the object, if bucket versioning
    * is enabled.
    */
  val versionId: Output_[String] = js.native
  
  /**
    * Specifies a target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
    */
  val websiteRedirect: Output_[js.UndefOr[String]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): BucketObject = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketObject = js.native
  def get(name: String, id: Input[ID], state: BucketObjectState): BucketObject = js.native
  def get(name: String, id: Input[ID], state: BucketObjectState, opts: CustomResourceOptions): BucketObject = js.native
  
  /**
    * Returns true if the given object is an instance of BucketObject.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketObject.BucketObject */ Boolean = js.native
}
