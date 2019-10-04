package typings.atPulumiAws.typesInputMod.elasticsearchNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainLogPublishingOption extends js.Object {
  /**
    * ARN of the Cloudwatch log group to which log needs to be published.
    */
  var cloudwatchLogGroupArn: Input[String]
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A type of Elasticsearch log. Valid values: INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS
    */
  var logType: Input[String]
}

object DomainLogPublishingOption {
  @scala.inline
  def apply(cloudwatchLogGroupArn: Input[String], logType: Input[String], enabled: Input[Boolean] = null): DomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainLogPublishingOption]
  }
}

