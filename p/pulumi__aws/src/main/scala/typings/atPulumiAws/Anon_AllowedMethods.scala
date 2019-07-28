package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedMethods extends js.Object {
  var allowedMethods: js.Array[String]
  var cachedMethods: js.Array[String]
  var compress: js.UndefOr[Boolean] = js.undefined
  var defaultTtl: js.UndefOr[Double] = js.undefined
  var fieldLevelEncryptionId: js.UndefOr[String] = js.undefined
  var forwardedValues: Anon_Cookies
  var lambdaFunctionAssociations: js.UndefOr[js.Array[Anon_EventType]] = js.undefined
  var maxTtl: js.UndefOr[Double] = js.undefined
  var minTtl: js.UndefOr[Double] = js.undefined
  var smoothStreaming: js.UndefOr[Boolean] = js.undefined
  var targetOriginId: String
  var trustedSigners: js.UndefOr[js.Array[String]] = js.undefined
  var viewerProtocolPolicy: String
}

object Anon_AllowedMethods {
  @scala.inline
  def apply(
    allowedMethods: js.Array[String],
    cachedMethods: js.Array[String],
    forwardedValues: Anon_Cookies,
    targetOriginId: String,
    viewerProtocolPolicy: String,
    compress: js.UndefOr[Boolean] = js.undefined,
    defaultTtl: Int | Double = null,
    fieldLevelEncryptionId: String = null,
    lambdaFunctionAssociations: js.Array[Anon_EventType] = null,
    maxTtl: Int | Double = null,
    minTtl: Int | Double = null,
    smoothStreaming: js.UndefOr[Boolean] = js.undefined,
    trustedSigners: js.Array[String] = null
  ): Anon_AllowedMethods = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods, cachedMethods = cachedMethods, forwardedValues = forwardedValues, targetOriginId = targetOriginId, viewerProtocolPolicy = viewerProtocolPolicy)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (defaultTtl != null) __obj.updateDynamic("defaultTtl")(defaultTtl.asInstanceOf[js.Any])
    if (fieldLevelEncryptionId != null) __obj.updateDynamic("fieldLevelEncryptionId")(fieldLevelEncryptionId)
    if (lambdaFunctionAssociations != null) __obj.updateDynamic("lambdaFunctionAssociations")(lambdaFunctionAssociations)
    if (maxTtl != null) __obj.updateDynamic("maxTtl")(maxTtl.asInstanceOf[js.Any])
    if (minTtl != null) __obj.updateDynamic("minTtl")(minTtl.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothStreaming)) __obj.updateDynamic("smoothStreaming")(smoothStreaming)
    if (trustedSigners != null) __obj.updateDynamic("trustedSigners")(trustedSigners)
    __obj.asInstanceOf[Anon_AllowedMethods]
  }
}

