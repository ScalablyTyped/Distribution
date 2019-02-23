package typings
package atPulumiAwsLib.cloudfrontDistributionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionState extends js.Object {
  /**
    * The key pair IDs that CloudFront is aware of for
    * each trusted signer, if the distribution is set up to serve private content
    * with signed URLs.
    */
  val activeTrustedSigners: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Extra CNAMEs (alternate domain names), if any, for
    * this distribution.
    */
  val aliases: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * **Deprecated**, use `ordered_cache_behavior` instead.
    */
  val cacheBehaviors: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompress]
      ]
    ]
  ] = js.undefined
  /**
    * Internal value used by CloudFront to allow future
    * updates to the distribution configuration.
    */
  val callerReference: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Any comments you want to include about the
    * distribution.
    */
  val comment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * One or more custom error response elements (multiples allowed).
    */
  val customErrorResponses: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ErrorCachingMinTtlErrorCode]
      ]
    ]
  ] = js.undefined
  /**
    * The default cache behavior for this distribution (maximum
    * one).
    */
  val defaultCacheBehavior: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompressDefaultTtl]
  ] = js.undefined
  /**
    * The object that you want CloudFront to
    * return (for example, index.html) when an end user requests the root URL.
    */
  val defaultRootObject: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The DNS domain name of either the S3 bucket, or
    * web site of your custom origin.
    */
  val domainName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The current version of the distribution's information. For example:
    * `E2QWRUHAPOMQZL`.
    */
  val etag: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The CloudFront Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set][7] to. This attribute is simply an
    * alias for the zone ID `Z2FDTNDATAQYW2`.
    */
  val hostedZoneId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The maximum HTTP version to support on the
    * distribution. Allowed values are `http1.1` and `http2`. The default is
    * `http2`.
    */
  val httpVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of invalidation batches
    * currently in progress.
    */
  val inProgressValidationBatches: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Whether the IPv6 is enabled for the distribution.
    */
  val isIpv6Enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The date and time the distribution was last modified.
    */
  val lastModifiedTime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The logging
    * configuration that controls how logs are written
    * to your distribution (maximum one).
    */
  val loggingConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketIncludeCookiesPrefix]
  ] = js.undefined
  /**
    * An ordered list of cache behaviors
    * resource for this distribution. List from top to bottom
    * +    in order of precedence. The topmost cache behavior will have precedence 0.
    */
  val orderedCacheBehaviors: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllowedMethodsCachedMethodsCompress]
      ]
    ]
  ] = js.undefined
  /**
    * One or more origins for this
    * distribution (multiples allowed).
    */
  val origins: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CustomHeadersCustomOriginConfig]
      ]
    ]
  ] = js.undefined
  /**
    * The price class for this distribution. One of
    * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
    */
  val priceClass: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The restriction
    * configuration for this distribution (maximum one).
    */
  val restrictions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_GeoRestrictionAnonLocationsRestrictionType]
  ] = js.undefined
  /**
    * Disables the distribution instead of
    * deleting it when destroying the resource through Terraform. If this is set,
    * the distribution needs to be deleted manually afterwards. Default: `false`.
    */
  val retainOnDelete: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The current status of the distribution. `Deployed` if the
    * distribution's information is fully propagated throughout the Amazon
    * CloudFront system.
    */
  val status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The SSL
    * configuration for this distribution (maximum
    * one).
    */
  val viewerCertificate: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AcmCertificateArnCloudfrontDefaultCertificate]
  ] = js.undefined
  /**
    * If you're using AWS WAF to filter CloudFront
    * requests, the Id of the AWS WAF web ACL that is associated with the
    * distribution.
    */
  val webAclId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

