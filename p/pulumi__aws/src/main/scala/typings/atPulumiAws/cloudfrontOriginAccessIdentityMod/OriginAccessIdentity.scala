package typings.atPulumiAws.cloudfrontOriginAccessIdentityMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront/originAccessIdentity", "OriginAccessIdentity")
@js.native
class OriginAccessIdentity protected () extends CustomResource {
  /**
    * Create a OriginAccessIdentity resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: OriginAccessIdentityArgs) = this()
  def this(name: String, args: OriginAccessIdentityArgs, opts: CustomResourceOptions) = this()
  /**
    * Internal value used by CloudFront to allow future
    * updates to the origin access identity.
    */
  val callerReference: Output[String] = js.native
  /**
    * A shortcut to the full path for the
    * origin access identity to use in CloudFront, see below.
    */
  val cloudfrontAccessIdentityPath: Output[String] = js.native
  /**
    * An optional comment for the origin access identity.
    */
  val comment: Output[js.UndefOr[String]] = js.native
  /**
    * The current version of the origin access identity's information.
    * For example: `E2QWRUHAPOMQZL`.
    */
  val etag: Output[String] = js.native
  /**
    * A pre-generated ARN for use in S3 bucket policies (see below).
    * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
    * E2QWRUHAPOMQZL`.
    */
  val iamArn: Output[String] = js.native
  /**
    * The Amazon S3 canonical user ID for the origin
    * access identity, which you use when giving the origin access identity read
    * permission to an object in Amazon S3.
    */
  val s3CanonicalUserId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudfront/originAccessIdentity", "OriginAccessIdentity")
@js.native
object OriginAccessIdentity extends js.Object {
  /**
    * Get an existing OriginAccessIdentity resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): OriginAccessIdentity = js.native
  def get(name: String, id: Input[ID], state: OriginAccessIdentityState): OriginAccessIdentity = js.native
  def get(name: String, id: Input[ID], state: OriginAccessIdentityState, opts: CustomResourceOptions): OriginAccessIdentity = js.native
  /**
    * Returns true if the given object is an instance of OriginAccessIdentity.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/originAccessIdentity.OriginAccessIdentity */ Boolean = js.native
}

