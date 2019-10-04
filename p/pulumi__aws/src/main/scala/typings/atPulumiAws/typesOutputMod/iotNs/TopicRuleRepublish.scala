package typings.atPulumiAws.typesOutputMod.iotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleRepublish extends js.Object {
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String
  /**
    * The name of the MQTT topic the message should be republished to.
    */
  var topic: String
}

object TopicRuleRepublish {
  @scala.inline
  def apply(roleArn: String, topic: String): TopicRuleRepublish = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, topic = topic)
  
    __obj.asInstanceOf[TopicRuleRepublish]
  }
}

