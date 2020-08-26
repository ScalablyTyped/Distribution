package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainLogPublishingOption extends js.Object {
  /**
    * ARN of the Cloudwatch log group to which log needs to be published.
    */
  var cloudwatchLogGroupArn: String = js.native
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * A type of Elasticsearch log. Valid values: INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS
    */
  var logType: String = js.native
}

object DomainLogPublishingOption {
  @scala.inline
  def apply(cloudwatchLogGroupArn: String, logType: String): DomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainLogPublishingOption]
  }
  @scala.inline
  implicit class DomainLogPublishingOptionOps[Self <: DomainLogPublishingOption] (val x: Self) extends AnyVal {
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
    def setCloudwatchLogGroupArn(value: String): Self = this.set("cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogType(value: String): Self = this.set("logType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

