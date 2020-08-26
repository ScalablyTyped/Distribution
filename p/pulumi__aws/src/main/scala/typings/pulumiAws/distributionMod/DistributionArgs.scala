package typings.pulumiAws.distributionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cloudfront.DistributionCustomErrorResponse
import typings.pulumiAws.inputMod.cloudfront.DistributionDefaultCacheBehavior
import typings.pulumiAws.inputMod.cloudfront.DistributionLoggingConfig
import typings.pulumiAws.inputMod.cloudfront.DistributionOrderedCacheBehavior
import typings.pulumiAws.inputMod.cloudfront.DistributionOrigin
import typings.pulumiAws.inputMod.cloudfront.DistributionOriginGroup
import typings.pulumiAws.inputMod.cloudfront.DistributionRestrictions
import typings.pulumiAws.inputMod.cloudfront.DistributionViewerCertificate
import typings.pulumiPulumi.outputMod.Input
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
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
    * `waf:GetWebACL` permissions assigned. If using WAFv2, provide the ARN of the web ACL.
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
    viewerCertificate: Input[DistributionViewerCertificate]
  ): DistributionArgs = {
    val __obj = js.Dynamic.literal(defaultCacheBehavior = defaultCacheBehavior.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], viewerCertificate = viewerCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionArgs]
  }
  @scala.inline
  implicit class DistributionArgsOps[Self <: DistributionArgs] (val x: Self) extends AnyVal {
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
    def setDefaultCacheBehavior(value: Input[DistributionDefaultCacheBehavior]): Self = this.set("defaultCacheBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginsVarargs(value: Input[DistributionOrigin]*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: Input[js.Array[Input[DistributionOrigin]]]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestrictions(value: Input[DistributionRestrictions]): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewerCertificate(value: Input[DistributionViewerCertificate]): Self = this.set("viewerCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliasesVarargs(value: Input[String]*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: Input[js.Array[Input[String]]]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    @scala.inline
    def setComment(value: Input[String]): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCustomErrorResponsesVarargs(value: Input[DistributionCustomErrorResponse]*): Self = this.set("customErrorResponses", js.Array(value :_*))
    @scala.inline
    def setCustomErrorResponses(value: Input[js.Array[Input[DistributionCustomErrorResponse]]]): Self = this.set("customErrorResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomErrorResponses: Self = this.set("customErrorResponses", js.undefined)
    @scala.inline
    def setDefaultRootObject(value: Input[String]): Self = this.set("defaultRootObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRootObject: Self = this.set("defaultRootObject", js.undefined)
    @scala.inline
    def setHttpVersion(value: Input[String]): Self = this.set("httpVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpVersion: Self = this.set("httpVersion", js.undefined)
    @scala.inline
    def setIsIpv6Enabled(value: Input[Boolean]): Self = this.set("isIpv6Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIpv6Enabled: Self = this.set("isIpv6Enabled", js.undefined)
    @scala.inline
    def setLoggingConfig(value: Input[DistributionLoggingConfig]): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    @scala.inline
    def setOrderedCacheBehaviorsVarargs(value: Input[DistributionOrderedCacheBehavior]*): Self = this.set("orderedCacheBehaviors", js.Array(value :_*))
    @scala.inline
    def setOrderedCacheBehaviors(value: Input[js.Array[Input[DistributionOrderedCacheBehavior]]]): Self = this.set("orderedCacheBehaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderedCacheBehaviors: Self = this.set("orderedCacheBehaviors", js.undefined)
    @scala.inline
    def setOriginGroupsVarargs(value: Input[DistributionOriginGroup]*): Self = this.set("originGroups", js.Array(value :_*))
    @scala.inline
    def setOriginGroups(value: Input[js.Array[Input[DistributionOriginGroup]]]): Self = this.set("originGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginGroups: Self = this.set("originGroups", js.undefined)
    @scala.inline
    def setPriceClass(value: Input[String]): Self = this.set("priceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceClass: Self = this.set("priceClass", js.undefined)
    @scala.inline
    def setRetainOnDelete(value: Input[Boolean]): Self = this.set("retainOnDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainOnDelete: Self = this.set("retainOnDelete", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setWaitForDeployment(value: Input[Boolean]): Self = this.set("waitForDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForDeployment: Self = this.set("waitForDeployment", js.undefined)
    @scala.inline
    def setWebAclId(value: Input[String]): Self = this.set("webAclId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebAclId: Self = this.set("webAclId", js.undefined)
  }
  
}

