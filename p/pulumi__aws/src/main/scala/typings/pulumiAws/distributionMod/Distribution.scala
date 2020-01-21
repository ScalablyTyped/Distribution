package typings.pulumiAws.distributionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cloudfront.DistributionCustomErrorResponse
import typings.pulumiAws.outputMod.cloudfront.DistributionDefaultCacheBehavior
import typings.pulumiAws.outputMod.cloudfront.DistributionLoggingConfig
import typings.pulumiAws.outputMod.cloudfront.DistributionOrderedCacheBehavior
import typings.pulumiAws.outputMod.cloudfront.DistributionOrigin
import typings.pulumiAws.outputMod.cloudfront.DistributionOriginGroup
import typings.pulumiAws.outputMod.cloudfront.DistributionRestrictions
import typings.pulumiAws.outputMod.cloudfront.DistributionViewerCertificate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront/distribution", "Distribution")
@js.native
class Distribution protected () extends CustomResource {
  /**
    * Create a Distribution resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DistributionArgs) = this()
  def this(name: String, args: DistributionArgs, opts: CustomResourceOptions) = this()
  /**
    * The key pair IDs that CloudFront is aware of for
    * each trusted signer, if the distribution is set up to serve private content
    * with signed URLs.
    */
  val activeTrustedSigners: Output_[StringDictionary[_]] = js.native
  /**
    * Extra CNAMEs (alternate domain names), if any, for
    * this distribution.
    */
  val aliases: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  val arn: Output_[String] = js.native
  /**
    * Internal value used by CloudFront to allow future
    * updates to the distribution configuration.
    */
  val callerReference: Output_[String] = js.native
  /**
    * Any comments you want to include about the
    * distribution.
    */
  val comment: Output_[js.UndefOr[String]] = js.native
  /**
    * One or more custom error response elements (multiples allowed).
    */
  val customErrorResponses: Output_[js.UndefOr[js.Array[DistributionCustomErrorResponse]]] = js.native
  /**
    * The default cache behavior for this distribution (maximum
    * one).
    */
  val defaultCacheBehavior: Output_[DistributionDefaultCacheBehavior] = js.native
  /**
    * The object that you want CloudFront to
    * return (for example, index.html) when an end user requests the root URL.
    */
  val defaultRootObject: Output_[js.UndefOr[String]] = js.native
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  val domainName: Output_[String] = js.native
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  val enabled: Output_[Boolean] = js.native
  /**
    * The current version of the distribution's information. For example:
    * `E2QWRUHAPOMQZL`.
    */
  val etag: Output_[String] = js.native
  /**
    * The CloudFront Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][7] to. This attribute is simply an
    * alias for the zone ID `Z2FDTNDATAQYW2`.
    */
  val hostedZoneId: Output_[String] = js.native
  /**
    * The maximum HTTP version to support on the
    * distribution. Allowed values are `http1.1` and `http2`. The default is
    * `http2`.
    */
  val httpVersion: Output_[js.UndefOr[String]] = js.native
  /**
    * The number of invalidation batches
    * currently in progress.
    */
  val inProgressValidationBatches: Output_[Double] = js.native
  /**
    * Whether the IPv6 is enabled for the distribution.
    */
  val isIpv6Enabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The date and time the distribution was last modified.
    */
  val lastModifiedTime: Output_[String] = js.native
  /**
    * The logging
    * configuration that controls how logs are written
    * to your distribution (maximum one).
    */
  val loggingConfig: Output_[js.UndefOr[DistributionLoggingConfig]] = js.native
  /**
    * An ordered list of cache behaviors
    * resource for this distribution. List from top to bottom
    * in order of precedence. The topmost cache behavior will have precedence 0.
    */
  val orderedCacheBehaviors: Output_[js.UndefOr[js.Array[DistributionOrderedCacheBehavior]]] = js.native
  /**
    * One or more originGroup for this
    * distribution (multiples allowed).
    */
  val originGroups: Output_[js.UndefOr[js.Array[DistributionOriginGroup]]] = js.native
  /**
    * One or more origins for this
    * distribution (multiples allowed).
    */
  val origins: Output_[js.Array[DistributionOrigin]] = js.native
  /**
    * The price class for this distribution. One of
    * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
    */
  val priceClass: Output_[js.UndefOr[String]] = js.native
  /**
    * The restriction
    * configuration for this distribution (maximum one).
    */
  val restrictions: Output_[DistributionRestrictions] = js.native
  /**
    * Disables the distribution instead of
    * deleting it when destroying the resource. If this is set,
    * the distribution needs to be deleted manually afterwards. Default: `false`.
    */
  val retainOnDelete: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The current status of the distribution. `Deployed` if the
    * distribution's information is fully propagated throughout the Amazon
    * CloudFront system.
    */
  val status: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The SSL
    * configuration for this distribution (maximum
    * one).
    */
  val viewerCertificate: Output_[DistributionViewerCertificate] = js.native
  /**
    * If enabled, the resource will wait for
    * the distribution status to change from `InProgress` to `Deployed`. Setting
    * this to`false` will skip the process. Default: `true`.
    */
  val waitForDeployment: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * If you're using AWS WAF to filter CloudFront
    * requests, the Id of the AWS WAF web ACL that is associated with the
    * distribution. The WAF Web ACL must exist in the WAF Global (CloudFront)
    * region and the credentials configuring this argument must have
    * `waf:GetWebACL` permissions assigned.
    */
  val webAclId: Output_[js.UndefOr[String]] = js.native
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
  def get(name: String, id: Input[ID]): Distribution = js.native
  def get(name: String, id: Input[ID], state: DistributionState): Distribution = js.native
  def get(name: String, id: Input[ID], state: DistributionState, opts: CustomResourceOptions): Distribution = js.native
  /**
    * Returns true if the given object is an instance of Distribution.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/distribution.Distribution */ Boolean = js.native
}

