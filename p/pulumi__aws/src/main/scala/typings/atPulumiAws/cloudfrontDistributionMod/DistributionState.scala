package typings.atPulumiAws.cloudfrontDistributionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AcmCertificateArnCloudfrontDefaultCertificate
import typings.atPulumiAws.Anon_AllowedMethodsCachedMethodsCompress
import typings.atPulumiAws.Anon_AllowedMethodsCachedMethodsCompressDefaultTtl
import typings.atPulumiAws.Anon_BucketIncludeCookiesPrefix
import typings.atPulumiAws.Anon_CustomHeadersCustomOriginConfig
import typings.atPulumiAws.Anon_ErrorCachingMinTtlErrorCode
import typings.atPulumiAws.Anon_FailoverCriteriaMembers
import typings.atPulumiAws.Anon_GeoRestrictionAnonLocationsRestrictionType
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionState extends js.Object {
  /**
    * The key pair IDs that CloudFront is aware of for
    * each trusted signer, if the distribution is set up to serve private content
    * with signed URLs.
    */
  val activeTrustedSigners: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Extra CNAMEs (alternate domain names), if any, for
    * this distribution.
    */
  val aliases: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Internal value used by CloudFront to allow future
    * updates to the distribution configuration.
    */
  val callerReference: js.UndefOr[Input[String]] = js.undefined
  /**
    * Any comments you want to include about the
    * distribution.
    */
  val comment: js.UndefOr[Input[String]] = js.undefined
  /**
    * One or more custom error response elements (multiples allowed).
    */
  val customErrorResponses: js.UndefOr[Input[js.Array[Input[Anon_ErrorCachingMinTtlErrorCode]]]] = js.undefined
  /**
    * The default cache behavior for this distribution (maximum
    * one).
    */
  val defaultCacheBehavior: js.UndefOr[Input[Anon_AllowedMethodsCachedMethodsCompress]] = js.undefined
  /**
    * The object that you want CloudFront to
    * return (for example, index.html) when an end user requests the root URL.
    */
  val defaultRootObject: js.UndefOr[Input[String]] = js.undefined
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  val domainName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The current version of the distribution's information. For example:
    * `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[Input[String]] = js.undefined
  /**
    * The CloudFront Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][7] to. This attribute is simply an
    * alias for the zone ID `Z2FDTNDATAQYW2`.
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The maximum HTTP version to support on the
    * distribution. Allowed values are `http1.1` and `http2`. The default is
    * `http2`.
    */
  val httpVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of invalidation batches
    * currently in progress.
    */
  val inProgressValidationBatches: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Whether the IPv6 is enabled for the distribution.
    */
  val isIpv6Enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The date and time the distribution was last modified.
    */
  val lastModifiedTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * The logging
    * configuration that controls how logs are written
    * to your distribution (maximum one).
    */
  val loggingConfig: js.UndefOr[Input[Anon_BucketIncludeCookiesPrefix]] = js.undefined
  /**
    * An ordered list of cache behaviors
    * resource for this distribution. List from top to bottom
    * in order of precedence. The topmost cache behavior will have precedence 0.
    */
  val orderedCacheBehaviors: js.UndefOr[Input[js.Array[Input[Anon_AllowedMethodsCachedMethodsCompressDefaultTtl]]]] = js.undefined
  /**
    * One or more origin_group for this
    * distribution (multiples allowed).
    */
  val originGroups: js.UndefOr[Input[js.Array[Input[Anon_FailoverCriteriaMembers]]]] = js.undefined
  /**
    * One or more origins for this
    * distribution (multiples allowed).
    */
  val origins: js.UndefOr[Input[js.Array[Input[Anon_CustomHeadersCustomOriginConfig]]]] = js.undefined
  /**
    * The price class for this distribution. One of
    * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
    */
  val priceClass: js.UndefOr[Input[String]] = js.undefined
  /**
    * The restriction
    * configuration for this distribution (maximum one).
    */
  val restrictions: js.UndefOr[Input[Anon_GeoRestrictionAnonLocationsRestrictionType]] = js.undefined
  val retainOnDelete: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The current status of the distribution. `Deployed` if the
    * distribution's information is fully propagated throughout the Amazon
    * CloudFront system.
    */
  val status: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The SSL
    * configuration for this distribution (maximum
    * one).
    */
  val viewerCertificate: js.UndefOr[Input[Anon_AcmCertificateArnCloudfrontDefaultCertificate]] = js.undefined
  /**
    * If enabled, the resource will wait for
    * the distribution status to change from `InProgress` to `Deployed`. Setting
    * this to`false` will skip the process. Default: `true`.
    */
  val waitForDeployment: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * If you're using AWS WAF to filter CloudFront
    * requests, the Id of the AWS WAF web ACL that is associated with the
    * distribution. The WAF Web ACL must exist in the WAF Global (CloudFront)
    * region and the credentials configuring this argument must have
    * `waf:GetWebACL` permissions assigned.
    */
  val webAclId: js.UndefOr[Input[String]] = js.undefined
}

object DistributionState {
  @scala.inline
  def apply(
    activeTrustedSigners: Input[StringDictionary[_]] = null,
    aliases: Input[js.Array[Input[String]]] = null,
    arn: Input[String] = null,
    callerReference: Input[String] = null,
    comment: Input[String] = null,
    customErrorResponses: Input[js.Array[Input[Anon_ErrorCachingMinTtlErrorCode]]] = null,
    defaultCacheBehavior: Input[Anon_AllowedMethodsCachedMethodsCompress] = null,
    defaultRootObject: Input[String] = null,
    domainName: Input[String] = null,
    enabled: Input[Boolean] = null,
    etag: Input[String] = null,
    hostedZoneId: Input[String] = null,
    httpVersion: Input[String] = null,
    inProgressValidationBatches: Input[Double] = null,
    isIpv6Enabled: Input[Boolean] = null,
    lastModifiedTime: Input[String] = null,
    loggingConfig: Input[Anon_BucketIncludeCookiesPrefix] = null,
    orderedCacheBehaviors: Input[js.Array[Input[Anon_AllowedMethodsCachedMethodsCompressDefaultTtl]]] = null,
    originGroups: Input[js.Array[Input[Anon_FailoverCriteriaMembers]]] = null,
    origins: Input[js.Array[Input[Anon_CustomHeadersCustomOriginConfig]]] = null,
    priceClass: Input[String] = null,
    restrictions: Input[Anon_GeoRestrictionAnonLocationsRestrictionType] = null,
    retainOnDelete: Input[Boolean] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    viewerCertificate: Input[Anon_AcmCertificateArnCloudfrontDefaultCertificate] = null,
    waitForDeployment: Input[Boolean] = null,
    webAclId: Input[String] = null
  ): DistributionState = {
    val __obj = js.Dynamic.literal()
    if (activeTrustedSigners != null) __obj.updateDynamic("activeTrustedSigners")(activeTrustedSigners.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (callerReference != null) __obj.updateDynamic("callerReference")(callerReference.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (customErrorResponses != null) __obj.updateDynamic("customErrorResponses")(customErrorResponses.asInstanceOf[js.Any])
    if (defaultCacheBehavior != null) __obj.updateDynamic("defaultCacheBehavior")(defaultCacheBehavior.asInstanceOf[js.Any])
    if (defaultRootObject != null) __obj.updateDynamic("defaultRootObject")(defaultRootObject.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    if (httpVersion != null) __obj.updateDynamic("httpVersion")(httpVersion.asInstanceOf[js.Any])
    if (inProgressValidationBatches != null) __obj.updateDynamic("inProgressValidationBatches")(inProgressValidationBatches.asInstanceOf[js.Any])
    if (isIpv6Enabled != null) __obj.updateDynamic("isIpv6Enabled")(isIpv6Enabled.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (orderedCacheBehaviors != null) __obj.updateDynamic("orderedCacheBehaviors")(orderedCacheBehaviors.asInstanceOf[js.Any])
    if (originGroups != null) __obj.updateDynamic("originGroups")(originGroups.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (priceClass != null) __obj.updateDynamic("priceClass")(priceClass.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (retainOnDelete != null) __obj.updateDynamic("retainOnDelete")(retainOnDelete.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (viewerCertificate != null) __obj.updateDynamic("viewerCertificate")(viewerCertificate.asInstanceOf[js.Any])
    if (waitForDeployment != null) __obj.updateDynamic("waitForDeployment")(waitForDeployment.asInstanceOf[js.Any])
    if (webAclId != null) __obj.updateDynamic("webAclId")(webAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionState]
  }
}

