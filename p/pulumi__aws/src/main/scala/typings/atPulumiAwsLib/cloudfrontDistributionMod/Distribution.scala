package typings
package atPulumiAwsLib.cloudfrontDistributionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront/distribution", "Distribution")
@js.native
class Distribution protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Distribution resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DistributionArgs) = this()
  def this(name: java.lang.String, args: DistributionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The key pair IDs that CloudFront is aware of for
    * each trusted signer, if the distribution is set up to serve private content
    * with signed URLs.
    */
  val activeTrustedSigners: atPulumiPulumiLib.outputMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * Extra CNAMEs (alternate domain names), if any, for
    * this distribution.
    */
  val aliases: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Internal value used by CloudFront to allow future
    * updates to the distribution configuration.
    */
  val callerReference: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Any comments you want to include about the
    * distribution.
    */
  val comment: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * One or more custom error response elements (multiples allowed).
    */
  val customErrorResponses: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ErrorCachingMinTtl]]] = js.native
  /**
    * The default cache behavior for this distribution (maximum
    * one).
    */
  val defaultCacheBehavior: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AllowedMethods] = js.native
  /**
    * The object that you want CloudFront to
    * return (for example, index.html) when an end user requests the root URL.
    */
  val defaultRootObject: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  val domainName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  val enabled: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The current version of the distribution's information. For example:
    * `E2QWRUHAPOMQZL`.
    */
  val etag: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The CloudFront Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][7] to. This attribute is simply an
    * alias for the zone ID `Z2FDTNDATAQYW2`.
    */
  val hostedZoneId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The maximum HTTP version to support on the
    * distribution. Allowed values are `http1.1` and `http2`. The default is
    * `http2`.
    */
  val httpVersion: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The number of invalidation batches
    * currently in progress.
    */
  val inProgressValidationBatches: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Whether the IPv6 is enabled for the distribution.
    */
  val isIpv6Enabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The date and time the distribution was last modified.
    */
  val lastModifiedTime: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The logging
    * configuration that controls how logs are written
    * to your distribution (maximum one).
    */
  val loggingConfig: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BucketIncludeCookies]] = js.native
  /**
    * An ordered list of cache behaviors
    * resource for this distribution. List from top to bottom
    * in order of precedence. The topmost cache behavior will have precedence 0.
    */
  val orderedCacheBehaviors: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_AllowedMethodsCachedMethods]]] = js.native
  /**
    * One or more origin_group for this
    * distribution (multiples allowed).
    */
  val originGroups: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_FailoverCriteria]]] = js.native
  /**
    * One or more origins for this
    * distribution (multiples allowed).
    */
  val origins: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_CustomHeaders]] = js.native
  /**
    * The price class for this distribution. One of
    * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
    */
  val priceClass: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The restriction
    * configuration for this distribution (maximum one).
    */
  val restrictions: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_GeoRestriction] = js.native
  /**
    * Disables the distribution instead of
    * deleting it when destroying the resource through Terraform. If this is set,
    * the distribution needs to be deleted manually afterwards. Default: `false`.
    */
  val retainOnDelete: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The current status of the distribution. `Deployed` if the
    * distribution's information is fully propagated throughout the Amazon
    * CloudFront system.
    */
  val status: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The SSL
    * configuration for this distribution (maximum
    * one).
    */
  val viewerCertificate: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AcmCertificateArn] = js.native
  /**
    * If enabled, the resource will wait for
    * the distribution status to change from `InProgress` to `Deployed`. Setting
    * this to`false` will skip the process. Default: `true`.
    */
  val waitForDeployment: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * If you're using AWS WAF to filter CloudFront
    * requests, the Id of the AWS WAF web ACL that is associated with the
    * distribution.
    */
  val webAclId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudfront/distribution", "Distribution")
@js.native
object Distribution extends js.Object {
  /**
    * Get an existing Distribution resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudfrontDistributionMod.Distribution = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudfrontDistributionMod.DistributionState
  ): atPulumiAwsLib.cloudfrontDistributionMod.Distribution = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudfrontDistributionMod.DistributionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudfrontDistributionMod.Distribution = js.native
  /**
    * Returns true if the given object is an instance of Distribution.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/distribution.Distribution */ scala.Boolean = js.native
}

