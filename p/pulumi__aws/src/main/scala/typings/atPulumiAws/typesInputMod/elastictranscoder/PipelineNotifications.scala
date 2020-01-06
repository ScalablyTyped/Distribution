package typings.atPulumiAws.typesInputMod.elastictranscoder

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineNotifications extends js.Object {
  /**
    * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing a job in this pipeline.
    */
  var completed: js.UndefOr[Input[String]] = js.native
  /**
    * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition while processing a job in this pipeline.
    */
  var error: js.UndefOr[Input[String]] = js.native
  /**
    * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process a job in this pipeline.
    */
  var progressing: js.UndefOr[Input[String]] = js.native
  /**
    * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition while processing a job in this pipeline.
    */
  var warning: js.UndefOr[Input[String]] = js.native
}

object PipelineNotifications {
  @scala.inline
  def apply(
    completed: Input[String] = null,
    error: Input[String] = null,
    progressing: Input[String] = null,
    warning: Input[String] = null
  ): PipelineNotifications = {
    val __obj = js.Dynamic.literal()
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (progressing != null) __obj.updateDynamic("progressing")(progressing.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineNotifications]
  }
}

