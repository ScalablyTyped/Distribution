package typings
package atPulumiAwsLib.pinpointBaiduChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaiduChannelArgs extends js.Object {
  /**
    * Platform credential API key from Baidu.
    */
  val apiKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Platform credential Secret key from Baidu.
    */
  val secretKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object BaiduChannelArgs {
  @scala.inline
  def apply(
    apiKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    secretKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): BaiduChannelArgs = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelArgs]
  }
}

