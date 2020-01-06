package typings.atPulumiAws.cloudfrontDistributionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.cloudfront.DistributionCustomErrorResponse
import typings.atPulumiAws.typesInputMod.cloudfront.DistributionDefaultCacheBehavior
import typings.atPulumiAws.typesInputMod.cloudfront.DistributionLoggingConfig
import typings.atPulumiAws.typesInputMod.cloudfront.DistributionOrderedCacheBehavior
import typings.atPulumiAws.typesInputMod.cloudfront.DistributionOrigin
import typings.atPulumiAws.typesInputMod.cloudfront.DistributionOriginGroup
import typings.atPulumiAws.typesInputMod.cloudfront.DistributionRestrictions
import typings.atPulumiAws.typesInputMod.cloudfront.DistributionViewerCertificate
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionArgs extends js.Object {
  /**
    * Extra CNAMEs (alternate domain names), if any, for
    * this distribution.
    */
  val aliases: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Any comments you want to include about the
    * distribution.
    */
  val comment: js.UndefOr[Input[String]] = js.native
  /**
    * One or more custom error response elements (multiples allowed).
    */
  val customErrorResponses: js.UndefOr[Input[js.Array[Input[DistributionCustomErrorResponse]]]] = js.native
  /**
    * The default cache behavior for this distribution (maximum
    * one).
    */
  val defaultCacheBehavior: Input[DistributionDefaultCacheBehavior] = js.native
  /**
    * The object that you want CloudFront to
    * return (for example, index.html) when an end user requests the root URL.
    */
  val defaultRootObject: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  val enabled: Input[Boolean] = js.native
  /**
    * The maximum HTTP version to support on the
    * distribution. Allowed values are `http1.1` and `http2`. The default is
    * `http2`.
    */
  val httpVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the IPv6 is enabled for the distribution.
    */
  val isIpv6Enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The logging
    * configuration that controls how logs are written
    * to your distribution (maximum one).
    */
  val loggingConfig: js.UndefOr[Input[DistributionLoggingConfig]] = js.native
  /**
    * An ordered list of cache behaviors
    * resource for this distribution. List from top to bottom
    * in order of precedence. The topmost cache behavior will have precedence 0.
    */
  val orderedCacheBehaviors: js.UndefOr[Input[js.Array[Input[DistributionOrderedCacheBehavior]]]] = js.native
  /**
    * One or more originGroup for this
    * distribution (multiples allowed).
    */
  val originGroups: js.UndefOr[Input[js.Array[Input[DistributionOriginGroup]]]] = js.native
  /**
    * One or more origins for this
    * distribution (multiples allowed).
    */
  val origins: Input[js.Array[Input[DistributionOrigin]]] = js.native
  /**
    * The price class for this distribution. One of
    * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
    */
  val priceClass: js.UndefOr[Input[String]] = js.native
  /**
    * The restriction
    * configuration for this distribution (maximum one).
    */
  val restrictions: Input[DistributionRestrictions] = js.native
  /**
    * Disables the distribution instead of
    * deleting it when destroying the resource. If this is set,
    * the distribution needs to be deleted manually afterwards. Default: `false`.
    */
  val retainOnDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The SSL
    * configuration for this distribution (maximum
    * one).
    */
  val viewerCertificate: Input[DistributionViewerCertificate] = js.native
  /**
    * If enabled, the resource will wait for
    * the distribution status to change from `InProgress` to `Deployed`. Setting
    * this to`false` will skip the process. Default: `true`.
    */
  val waitForDeployment: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If you're using AWS WAF to filter CloudFront
    * requests, the Id of the AWS WAF web ACL that is associated with the
    * distribution. The WAF Web ACL must exist in the WAF Global (CloudFront)
    * region and the credentials configuring this argument must have
    * `waf:GetWebACL` permissions assigned.
    */
  val webAclId: js.UndefOr[Input[String]] = js.native
}

object DistributionArgs {
  @scala.inline
  def apply(
    defaultCacheBehavior: Input[DistributionDefaultCacheBehavior],
    enabled: Input[Boolean],
    origins: Input[js.Array[Input[DistributionOrigin]]],
    restrictions: Input[DistributionRestrictions],
    viewerCertificate: Input[DistributionViewerCertificate],
    aliases: Input[js.Array[Input[String]]] = null,
    comment: Input[String] = null,
    customErrorResponses: Input[js.Array[Input[DistributionCustomErrorResponse]]] = null,
    defaultRootObject: Input[String] = null,
    httpVersion: Input[String] = null,
    isIpv6Enabled: Input[Boolean] = null,
    loggingConfig: Input[DistributionLoggingConfig] = null,
    orderedCacheBehaviors: Input[js.Array[Input[DistributionOrderedCacheBehavior]]] = null,
    originGroups: Input[js.Array[Input[DistributionOriginGroup]]] = null,
    priceClass: Input[String] = null,
    retainOnDelete: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    waitForDeployment: Input[Boolean] = null,
    webAclId: Input[String] = null
  ): DistributionArgs = {
    val __obj = js.Dynamic.literal(defaultCacheBehavior = defaultCacheBehavior.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], viewerCertificate = viewerCertificate.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (customErrorResponses != null) __obj.updateDynamic("customErrorResponses")(customErrorResponses.asInstanceOf[js.Any])
    if (defaultRootObject != null) __obj.updateDynamic("defaultRootObject")(defaultRootObject.asInstanceOf[js.Any])
    if (httpVersion != null) __obj.updateDynamic("httpVersion")(httpVersion.asInstanceOf[js.Any])
    if (isIpv6Enabled != null) __obj.updateDynamic("isIpv6Enabled")(isIpv6Enabled.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (orderedCacheBehaviors != null) __obj.updateDynamic("orderedCacheBehaviors")(orderedCacheBehaviors.asInstanceOf[js.Any])
    if (originGroups != null) __obj.updateDynamic("originGroups")(originGroups.asInstanceOf[js.Any])
    if (priceClass != null) __obj.updateDynamic("priceClass")(priceClass.asInstanceOf[js.Any])
    if (retainOnDelete != null) __obj.updateDynamic("retainOnDelete")(retainOnDelete.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (waitForDeployment != null) __obj.updateDynamic("waitForDeployment")(waitForDeployment.asInstanceOf[js.Any])
    if (webAclId != null) __obj.updateDynamic("webAclId")(webAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionArgs]
  }
}

