package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleRepublish extends StObject {
  
  /**
    * The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0.
    */
  var qos: js.UndefOr[Double] = js.undefined
  
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
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleRepublish]
  }
  
  @scala.inline
  implicit class TopicRuleRepublishMutableBuilder[Self <: TopicRuleRepublish] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQos(value: Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
