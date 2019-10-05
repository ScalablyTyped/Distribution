package typings.atPulumiAws.typesInputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerAction extends js.Object {
  /**
    * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
    */
  var arguments: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The name of the job to watch.
    */
  var jobName: Input[String]
  /**
    * The job run timeout in minutes. It overrides the timeout value of the job.
    */
  var timeout: js.UndefOr[Input[Double]] = js.undefined
}

object TriggerAction {
  @scala.inline
  def apply(
    jobName: Input[String],
    arguments: Input[StringDictionary[_]] = null,
    timeout: Input[Double] = null
  ): TriggerAction = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerAction]
  }
}

