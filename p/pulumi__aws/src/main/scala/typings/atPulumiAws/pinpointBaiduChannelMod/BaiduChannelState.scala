package typings.atPulumiAws.pinpointBaiduChannelMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduChannelState extends js.Object {
  /**
    * Platform credential API key from Baidu.
    */
  val apiKey: js.UndefOr[Input[String]] = js.native
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Platform credential Secret key from Baidu.
    */
  val secretKey: js.UndefOr[Input[String]] = js.native
}

object BaiduChannelState {
  @scala.inline
  def apply(
    apiKey: Input[String] = null,
    applicationId: Input[String] = null,
    enabled: Input[Boolean] = null,
    secretKey: Input[String] = null
  ): BaiduChannelState = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelState]
  }
}

