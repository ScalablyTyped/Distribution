package typings.atPulumiAws.typesInputMod.iot

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleRepublish extends js.Object {
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String]
  /**
    * The name of the MQTT topic the message should be republished to.
    */
  var topic: Input[String]
}

object TopicRuleRepublish {
  @scala.inline
  def apply(roleArn: Input[String], topic: Input[String]): TopicRuleRepublish = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicRuleRepublish]
  }
}

