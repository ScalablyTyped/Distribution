package typings.atPulumiAws.pinpointBaiduChannelMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduChannelArgs extends js.Object {
  /**
    * Platform credential API key from Baidu.
    */
  val apiKey: Input[String] = js.native
  /**
    * The application ID.
    */
  val applicationId: Input[String] = js.native
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Platform credential Secret key from Baidu.
    */
  val secretKey: Input[String] = js.native
}

object BaiduChannelArgs {
  @scala.inline
  def apply(
    apiKey: Input[String],
    applicationId: Input[String],
    secretKey: Input[String],
    enabled: Input[Boolean] = null
  ): BaiduChannelArgs = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelArgs]
  }
}

