package typings.pulumiAws.inputMod.pinpoint

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppLimits extends js.Object {
  /**
    * The maximum number of messages that the campaign can send daily.
    */
  var daily: js.UndefOr[Input[Double]] = js.native
  /**
    * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
    */
  var maximumDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
    */
  var messagesPerSecond: js.UndefOr[Input[Double]] = js.native
  /**
    * The maximum total number of messages that the campaign can send.
    */
  var total: js.UndefOr[Input[Double]] = js.native
}

object AppLimits {
  @scala.inline
  def apply(): AppLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppLimits]
  }
  @scala.inline
  implicit class AppLimitsOps[Self <: AppLimits] (val x: Self) extends AnyVal {
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
    def setDaily(value: Input[Double]): Self = this.set("daily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaily: Self = this.set("daily", js.undefined)
    @scala.inline
    def setMaximumDuration(value: Input[Double]): Self = this.set("maximumDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumDuration: Self = this.set("maximumDuration", js.undefined)
    @scala.inline
    def setMessagesPerSecond(value: Input[Double]): Self = this.set("messagesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesPerSecond: Self = this.set("messagesPerSecond", js.undefined)
    @scala.inline
    def setTotal(value: Input[Double]): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

