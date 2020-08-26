package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudwatchLog extends js.Object {
  var filter: String = js.native
  var logGroup: String = js.native
}

object CloudwatchLog {
  @scala.inline
  def apply(filter: String, logGroup: String): CloudwatchLog = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchLog]
  }
  @scala.inline
  implicit class CloudwatchLogOps[Self <: CloudwatchLog] (val x: Self) extends AnyVal {
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogGroup(value: String): Self = this.set("logGroup", value.asInstanceOf[js.Any])
  }
  
}

