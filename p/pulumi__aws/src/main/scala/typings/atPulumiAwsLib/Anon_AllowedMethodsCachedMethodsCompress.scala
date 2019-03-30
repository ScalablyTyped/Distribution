package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedMethodsCachedMethodsCompress extends js.Object {
  var allowedMethods: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var cachedMethods: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var compress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var defaultTtl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var fieldLevelEncryptionId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var forwardedValues: atPulumiPulumiLib.outputMod.Input[Anon_CookiesHeaders]
  var lambdaFunctionAssociations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_EventTypeIncludeBody]]]
  ] = js.undefined
  var maxTtl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var minTtl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var smoothStreaming: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var targetOriginId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var trustedSigners: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var viewerProtocolPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AllowedMethodsCachedMethodsCompress {
  @scala.inline
  def apply(
    allowedMethods: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    cachedMethods: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    forwardedValues: atPulumiPulumiLib.outputMod.Input[Anon_CookiesHeaders],
    targetOriginId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    viewerProtocolPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    compress: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    defaultTtl: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    fieldLevelEncryptionId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lambdaFunctionAssociations: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_EventTypeIncludeBody]]] = null,
    maxTtl: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    minTtl: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    smoothStreaming: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    trustedSigners: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_AllowedMethodsCachedMethodsCompress = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], cachedMethods = cachedMethods.asInstanceOf[js.Any], forwardedValues = forwardedValues.asInstanceOf[js.Any], targetOriginId = targetOriginId.asInstanceOf[js.Any], viewerProtocolPolicy = viewerProtocolPolicy.asInstanceOf[js.Any])
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (defaultTtl != null) __obj.updateDynamic("defaultTtl")(defaultTtl.asInstanceOf[js.Any])
    if (fieldLevelEncryptionId != null) __obj.updateDynamic("fieldLevelEncryptionId")(fieldLevelEncryptionId.asInstanceOf[js.Any])
    if (lambdaFunctionAssociations != null) __obj.updateDynamic("lambdaFunctionAssociations")(lambdaFunctionAssociations.asInstanceOf[js.Any])
    if (maxTtl != null) __obj.updateDynamic("maxTtl")(maxTtl.asInstanceOf[js.Any])
    if (minTtl != null) __obj.updateDynamic("minTtl")(minTtl.asInstanceOf[js.Any])
    if (smoothStreaming != null) __obj.updateDynamic("smoothStreaming")(smoothStreaming.asInstanceOf[js.Any])
    if (trustedSigners != null) __obj.updateDynamic("trustedSigners")(trustedSigners.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedMethodsCachedMethodsCompress]
  }
}

