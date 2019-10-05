package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainLogPublishingOption extends js.Object {
  /**
    * ARN of the Cloudwatch log group to which log needs to be published.
    */
  var cloudwatchLogGroupArn: String
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A type of Elasticsearch log. Valid values: INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS
    */
  var logType: String
}

object DomainLogPublishingOption {
  @scala.inline
  def apply(cloudwatchLogGroupArn: String, logType: String, enabled: js.UndefOr[Boolean] = js.undefined): DomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn, logType = logType)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[DomainLogPublishingOption]
  }
}

