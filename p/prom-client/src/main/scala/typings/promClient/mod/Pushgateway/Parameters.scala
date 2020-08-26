package typings.promClient.mod.Pushgateway

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  /**
  		 * Label sets used in the url when making a request to the Pushgateway,
  		 */
  var groupings: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * Jobname that is pushing the metric
  		 */
  var jobName: String = js.native
}

object Parameters {
  @scala.inline
  def apply(jobName: String): Parameters = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
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
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupings(value: StringDictionary[String]): Self = this.set("groupings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupings: Self = this.set("groupings", js.undefined)
  }
  
}

