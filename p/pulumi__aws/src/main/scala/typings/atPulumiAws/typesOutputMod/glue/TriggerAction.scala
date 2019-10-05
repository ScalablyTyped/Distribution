package typings.atPulumiAws.typesOutputMod.glue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerAction extends js.Object {
  /**
    * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
    */
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The name of the job to watch.
    */
  var jobName: String
  /**
    * The job run timeout in minutes. It overrides the timeout value of the job.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object TriggerAction {
  @scala.inline
  def apply(jobName: String, arguments: StringDictionary[js.Any] = null, timeout: Int | Double = null): TriggerAction = {
    val __obj = js.Dynamic.literal(jobName = jobName)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerAction]
  }
}

