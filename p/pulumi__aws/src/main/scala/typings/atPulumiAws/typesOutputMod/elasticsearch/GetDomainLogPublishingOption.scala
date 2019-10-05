package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainLogPublishingOption extends js.Object {
  /**
    * The CloudWatch Log Group where the logs are published.
    */
  var cloudwatchLogGroupArn: String
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
  /**
    * The type of Elasticsearch log being published.
    */
  var logType: String
}

object GetDomainLogPublishingOption {
  @scala.inline
  def apply(cloudwatchLogGroupArn: String, enabled: Boolean, logType: String): GetDomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn, enabled = enabled, logType = logType)
  
    __obj.asInstanceOf[GetDomainLogPublishingOption]
  }
}

