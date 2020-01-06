package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainLogPublishingOption extends js.Object {
  /**
    * The CloudWatch Log Group where the logs are published.
    */
  var cloudwatchLogGroupArn: String = js.native
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
  /**
    * The type of Elasticsearch log being published.
    */
  var logType: String = js.native
}

object GetDomainLogPublishingOption {
  @scala.inline
  def apply(cloudwatchLogGroupArn: String, enabled: Boolean, logType: String): GetDomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainLogPublishingOption]
  }
}

