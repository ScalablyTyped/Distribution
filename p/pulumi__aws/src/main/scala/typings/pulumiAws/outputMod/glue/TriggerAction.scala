package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerAction extends js.Object {
  /**
    * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
    */
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The name of the crawler to watch. If this is specified, `crawlState` must also be specified. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[String] = js.native
  /**
    * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[String] = js.native
  /**
    * The job run timeout in minutes. It overrides the timeout value of the job.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object TriggerAction {
  @scala.inline
  def apply(
    arguments: StringDictionary[js.Any] = null,
    crawlerName: String = null,
    jobName: String = null,
    timeout: Int | Double = null
  ): TriggerAction = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (crawlerName != null) __obj.updateDynamic("crawlerName")(crawlerName.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerAction]
  }
}

