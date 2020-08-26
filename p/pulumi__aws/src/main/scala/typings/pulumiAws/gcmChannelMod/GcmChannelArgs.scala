package typings.pulumiAws.gcmChannelMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GcmChannelArgs extends js.Object {
  /**
    * Platform credential API key from Google.
    */
  val apiKey: Input[String] = js.native
  /**
    * The application ID.
    */
  val applicationId: Input[String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
}

object GcmChannelArgs {
  @scala.inline
  def apply(apiKey: Input[String], applicationId: Input[String]): GcmChannelArgs = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcmChannelArgs]
  }
  @scala.inline
  implicit class GcmChannelArgsOps[Self <: GcmChannelArgs] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

