package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersCustomOriginConfig extends js.Object {
  var customHeaders: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValue]]]
  ] = js.undefined
  var customOriginConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_HttpPortHttpsPort]] = js.undefined
  var domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var originId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var originPath: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var s3OriginConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_OriginAccessIdentityInput]] = js.undefined
}

object Anon_CustomHeadersCustomOriginConfig {
  @scala.inline
  def apply(
    domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    originId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    customHeaders: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValue]]] = null,
    customOriginConfig: atPulumiPulumiLib.outputMod.Input[Anon_HttpPortHttpsPort] = null,
    originPath: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3OriginConfig: atPulumiPulumiLib.outputMod.Input[Anon_OriginAccessIdentityInput] = null
  ): Anon_CustomHeadersCustomOriginConfig = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (customOriginConfig != null) __obj.updateDynamic("customOriginConfig")(customOriginConfig.asInstanceOf[js.Any])
    if (originPath != null) __obj.updateDynamic("originPath")(originPath.asInstanceOf[js.Any])
    if (s3OriginConfig != null) __obj.updateDynamic("s3OriginConfig")(s3OriginConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomHeadersCustomOriginConfig]
  }
}

