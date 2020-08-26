package typings.pulumiAws.baiduChannelMod

import typings.pulumiPulumi.outputMod.Input
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
  def apply(): BaiduChannelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaiduChannelState]
  }
  @scala.inline
  implicit class BaiduChannelStateOps[Self <: BaiduChannelState] (val x: Self) extends AnyVal {
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
    def setApiKey(value: Input[String]): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setSecretKey(value: Input[String]): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
  }
  
}

