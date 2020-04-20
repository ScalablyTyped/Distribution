package typings.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleRepublish extends js.Object {
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String = js.native
  /**
    * The name of the MQTT topic the message should be republished to.
    */
  var topic: String = js.native
}

object TopicRuleRepublish {
  @scala.inline
  def apply(roleArn: String, topic: String): TopicRuleRepublish = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleRepublish]
  }
}

