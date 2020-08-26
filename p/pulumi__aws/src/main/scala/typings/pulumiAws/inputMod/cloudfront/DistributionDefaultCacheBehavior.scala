package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionDefaultCacheBehavior extends js.Object {
  /**
    * Controls which HTTP methods CloudFront
    * processes and forwards to your Amazon S3 bucket or your custom origin.
    */
  var allowedMethods: Input[js.Array[Input[String]]] = js.native
  /**
    * Controls whether CloudFront caches the
    * response to requests using the specified HTTP methods.
    */
  var cachedMethods: Input[js.Array[Input[String]]] = js.native
  /**
    * Whether you want CloudFront to automatically
    * compress content for web requests that include `Accept-Encoding: gzip` in
    * the request header (default: `false`).
    */
  var compress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The default amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * in the absence of an `Cache-Control max-age` or `Expires` header. Defaults to
    * 1 day.
    */
  var defaultTtl: js.UndefOr[Input[Double]] = js.native
  /**
    * Field level encryption configuration ID
    */
  var fieldLevelEncryptionId: js.UndefOr[Input[String]] = js.native
  /**
    * The forwarded values configuration that specifies how CloudFront
    * handles query strings, cookies and headers (maximum one).
    */
  var forwardedValues: Input[DistributionDefaultCacheBehaviorForwardedValues] = js.native
  /**
    * A config block that triggers a lambda function with
    * specific actions. Defined below, maximum 4.
    */
  var lambdaFunctionAssociations: js.UndefOr[
    Input[js.Array[Input[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]]]
  ] = js.native
  /**
    * The maximum amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * to your origin to determine whether the object has been updated. Only
    * effective in the presence of `Cache-Control max-age`, `Cache-Control
    * s-maxage`, and `Expires` headers. Defaults to 365 days.
    */
  var maxTtl: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum amount of time that you want objects to
    * stay in CloudFront caches before CloudFront queries your origin to see
    * whether the object has been updated. Defaults to 0 seconds.
    */
  var minTtl: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates whether you want to distribute
    * media files in Microsoft Smooth Streaming format using the origin that is
    * associated with this cache behavior.
    */
  var smoothStreaming: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The value of ID for the origin that you want
    * CloudFront to route requests to when a request matches the path pattern
    * either for a cache behavior or for the default cache behavior.
    */
  var targetOriginId: Input[String] = js.native
  /**
    * The AWS accounts, if any, that you want to
    * allow to create signed URLs for private content.
    */
  var trustedSigners: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Use this element to specify the
    * protocol that users can use to access the files in the origin specified by
    * TargetOriginId when a request matches the path pattern in PathPattern. One
    * of `allow-all`, `https-only`, or `redirect-to-https`.
    */
  var viewerProtocolPolicy: Input[String] = js.native
}

object DistributionDefaultCacheBehavior {
  @scala.inline
  def apply(
    allowedMethods: Input[js.Array[Input[String]]],
    cachedMethods: Input[js.Array[Input[String]]],
    forwardedValues: Input[DistributionDefaultCacheBehaviorForwardedValues],
    targetOriginId: Input[String],
    viewerProtocolPolicy: Input[String]
  ): DistributionDefaultCacheBehavior = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], cachedMethods = cachedMethods.asInstanceOf[js.Any], forwardedValues = forwardedValues.asInstanceOf[js.Any], targetOriginId = targetOriginId.asInstanceOf[js.Any], viewerProtocolPolicy = viewerProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehavior]
  }
  @scala.inline
  implicit class DistributionDefaultCacheBehaviorOps[Self <: DistributionDefaultCacheBehavior] (val x: Self) extends AnyVal {
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
    def setAllowedMethodsVarargs(value: Input[String]*): Self = this.set("allowedMethods", js.Array(value :_*))
    @scala.inline
    def setAllowedMethods(value: Input[js.Array[Input[String]]]): Self = this.set("allowedMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def setCachedMethodsVarargs(value: Input[String]*): Self = this.set("cachedMethods", js.Array(value :_*))
    @scala.inline
    def setCachedMethods(value: Input[js.Array[Input[String]]]): Self = this.set("cachedMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwardedValues(value: Input[DistributionDefaultCacheBehaviorForwardedValues]): Self = this.set("forwardedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetOriginId(value: Input[String]): Self = this.set("targetOriginId", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewerProtocolPolicy(value: Input[String]): Self = this.set("viewerProtocolPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompress(value: Input[Boolean]): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setDefaultTtl(value: Input[Double]): Self = this.set("defaultTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTtl: Self = this.set("defaultTtl", js.undefined)
    @scala.inline
    def setFieldLevelEncryptionId(value: Input[String]): Self = this.set("fieldLevelEncryptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLevelEncryptionId: Self = this.set("fieldLevelEncryptionId", js.undefined)
    @scala.inline
    def setLambdaFunctionAssociationsVarargs(value: Input[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]*): Self = this.set("lambdaFunctionAssociations", js.Array(value :_*))
    @scala.inline
    def setLambdaFunctionAssociations(value: Input[js.Array[Input[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]]]): Self = this.set("lambdaFunctionAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionAssociations: Self = this.set("lambdaFunctionAssociations", js.undefined)
    @scala.inline
    def setMaxTtl(value: Input[Double]): Self = this.set("maxTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTtl: Self = this.set("maxTtl", js.undefined)
    @scala.inline
    def setMinTtl(value: Input[Double]): Self = this.set("minTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTtl: Self = this.set("minTtl", js.undefined)
    @scala.inline
    def setSmoothStreaming(value: Input[Boolean]): Self = this.set("smoothStreaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothStreaming: Self = this.set("smoothStreaming", js.undefined)
    @scala.inline
    def setTrustedSignersVarargs(value: Input[String]*): Self = this.set("trustedSigners", js.Array(value :_*))
    @scala.inline
    def setTrustedSigners(value: Input[js.Array[Input[String]]]): Self = this.set("trustedSigners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustedSigners: Self = this.set("trustedSigners", js.undefined)
  }
  
}

