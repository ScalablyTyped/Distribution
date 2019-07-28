package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedMethodsCachedMethodsCompressDefaultTtl extends js.Object {
  var allowedMethods: Input[js.Array[Input[String]]]
  var cachedMethods: Input[js.Array[Input[String]]]
  var compress: js.UndefOr[Input[Boolean]] = js.undefined
  var defaultTtl: js.UndefOr[Input[Double]] = js.undefined
  var fieldLevelEncryptionId: js.UndefOr[Input[String]] = js.undefined
  var forwardedValues: Input[Anon_CookiesHeaders]
  var lambdaFunctionAssociations: js.UndefOr[Input[js.Array[Input[Anon_EventTypeIncludeBody]]]] = js.undefined
  var maxTtl: js.UndefOr[Input[Double]] = js.undefined
  var minTtl: js.UndefOr[Input[Double]] = js.undefined
  var pathPattern: Input[String]
  var smoothStreaming: js.UndefOr[Input[Boolean]] = js.undefined
  var targetOriginId: Input[String]
  var trustedSigners: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var viewerProtocolPolicy: Input[String]
}

object Anon_AllowedMethodsCachedMethodsCompressDefaultTtl {
  @scala.inline
  def apply(
    allowedMethods: Input[js.Array[Input[String]]],
    cachedMethods: Input[js.Array[Input[String]]],
    forwardedValues: Input[Anon_CookiesHeaders],
    pathPattern: Input[String],
    targetOriginId: Input[String],
    viewerProtocolPolicy: Input[String],
    compress: Input[Boolean] = null,
    defaultTtl: Input[Double] = null,
    fieldLevelEncryptionId: Input[String] = null,
    lambdaFunctionAssociations: Input[js.Array[Input[Anon_EventTypeIncludeBody]]] = null,
    maxTtl: Input[Double] = null,
    minTtl: Input[Double] = null,
    smoothStreaming: Input[Boolean] = null,
    trustedSigners: Input[js.Array[Input[String]]] = null
  ): Anon_AllowedMethodsCachedMethodsCompressDefaultTtl = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], cachedMethods = cachedMethods.asInstanceOf[js.Any], forwardedValues = forwardedValues.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any], targetOriginId = targetOriginId.asInstanceOf[js.Any], viewerProtocolPolicy = viewerProtocolPolicy.asInstanceOf[js.Any])
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (defaultTtl != null) __obj.updateDynamic("defaultTtl")(defaultTtl.asInstanceOf[js.Any])
    if (fieldLevelEncryptionId != null) __obj.updateDynamic("fieldLevelEncryptionId")(fieldLevelEncryptionId.asInstanceOf[js.Any])
    if (lambdaFunctionAssociations != null) __obj.updateDynamic("lambdaFunctionAssociations")(lambdaFunctionAssociations.asInstanceOf[js.Any])
    if (maxTtl != null) __obj.updateDynamic("maxTtl")(maxTtl.asInstanceOf[js.Any])
    if (minTtl != null) __obj.updateDynamic("minTtl")(minTtl.asInstanceOf[js.Any])
    if (smoothStreaming != null) __obj.updateDynamic("smoothStreaming")(smoothStreaming.asInstanceOf[js.Any])
    if (trustedSigners != null) __obj.updateDynamic("trustedSigners")(trustedSigners.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedMethodsCachedMethodsCompressDefaultTtl]
  }
}

