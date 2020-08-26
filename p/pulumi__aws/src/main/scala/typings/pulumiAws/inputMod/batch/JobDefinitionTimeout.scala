package typings.pulumiAws.inputMod.batch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionTimeout extends js.Object {
  /**
    * The time duration in seconds after which AWS Batch terminates your jobs if they have not finished. The minimum value for the timeout is `60` seconds.
    */
  var attemptDurationSeconds: js.UndefOr[Input[Double]] = js.native
}

object JobDefinitionTimeout {
  @scala.inline
  def apply(): JobDefinitionTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDefinitionTimeout]
  }
  @scala.inline
  implicit class JobDefinitionTimeoutOps[Self <: JobDefinitionTimeout] (val x: Self) extends AnyVal {
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
    def setAttemptDurationSeconds(value: Input[Double]): Self = this.set("attemptDurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptDurationSeconds: Self = this.set("attemptDurationSeconds", js.undefined)
  }
  
}

