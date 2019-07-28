package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersCustomOriginConfig extends js.Object {
  var customHeaders: js.UndefOr[Input[js.Array[Input[Anon_NameValue]]]] = js.undefined
  var customOriginConfig: js.UndefOr[Input[Anon_HttpPortHttpsPort]] = js.undefined
  var domainName: Input[String]
  var originId: Input[String]
  var originPath: js.UndefOr[Input[String]] = js.undefined
  var s3OriginConfig: js.UndefOr[Input[Anon_OriginAccessIdentityInput]] = js.undefined
}

object Anon_CustomHeadersCustomOriginConfig {
  @scala.inline
  def apply(
    domainName: Input[String],
    originId: Input[String],
    customHeaders: Input[js.Array[Input[Anon_NameValue]]] = null,
    customOriginConfig: Input[Anon_HttpPortHttpsPort] = null,
    originPath: Input[String] = null,
    s3OriginConfig: Input[Anon_OriginAccessIdentityInput] = null
  ): Anon_CustomHeadersCustomOriginConfig = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (customOriginConfig != null) __obj.updateDynamic("customOriginConfig")(customOriginConfig.asInstanceOf[js.Any])
    if (originPath != null) __obj.updateDynamic("originPath")(originPath.asInstanceOf[js.Any])
    if (s3OriginConfig != null) __obj.updateDynamic("s3OriginConfig")(s3OriginConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomHeadersCustomOriginConfig]
  }
}

