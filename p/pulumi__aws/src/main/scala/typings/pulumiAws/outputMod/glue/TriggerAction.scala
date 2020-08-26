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
  var arguments: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The name of the crawler to be executed. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[String] = js.native
  /**
    * The name of a job to be executed. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[String] = js.native
  /**
    * The job run timeout in minutes. It overrides the timeout value of the job.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object TriggerAction {
  @scala.inline
  def apply(): TriggerAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerAction]
  }
  @scala.inline
  implicit class TriggerActionOps[Self <: TriggerAction] (val x: Self) extends AnyVal {
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
    def setArguments(value: StringDictionary[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setCrawlerName(value: String): Self = this.set("crawlerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlerName: Self = this.set("crawlerName", js.undefined)
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("jobName", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

