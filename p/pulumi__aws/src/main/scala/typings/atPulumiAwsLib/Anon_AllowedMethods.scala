package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedMethods extends js.Object {
  var allowedMethods: js.Array[java.lang.String]
  var cachedMethods: js.Array[java.lang.String]
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var defaultTtl: js.UndefOr[scala.Double] = js.undefined
  var fieldLevelEncryptionId: js.UndefOr[java.lang.String] = js.undefined
  var forwardedValues: Anon_Cookies
  var lambdaFunctionAssociations: js.UndefOr[js.Array[Anon_EventType]] = js.undefined
  var maxTtl: js.UndefOr[scala.Double] = js.undefined
  var minTtl: js.UndefOr[scala.Double] = js.undefined
  var smoothStreaming: js.UndefOr[scala.Boolean] = js.undefined
  var targetOriginId: java.lang.String
  var trustedSigners: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var viewerProtocolPolicy: java.lang.String
}

object Anon_AllowedMethods {
  @scala.inline
  def apply(
    allowedMethods: js.Array[java.lang.String],
    cachedMethods: js.Array[java.lang.String],
    forwardedValues: Anon_Cookies,
    targetOriginId: java.lang.String,
    viewerProtocolPolicy: java.lang.String,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    defaultTtl: scala.Int | scala.Double = null,
    fieldLevelEncryptionId: java.lang.String = null,
    lambdaFunctionAssociations: js.Array[Anon_EventType] = null,
    maxTtl: scala.Int | scala.Double = null,
    minTtl: scala.Int | scala.Double = null,
    smoothStreaming: js.UndefOr[scala.Boolean] = js.undefined,
    trustedSigners: js.Array[java.lang.String] = null
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

