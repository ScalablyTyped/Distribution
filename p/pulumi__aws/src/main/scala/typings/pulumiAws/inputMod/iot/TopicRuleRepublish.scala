package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleRepublish extends StObject {
  
  /**
    * The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0.
    */
  var qos: js.UndefOr[Input[Double]] = js.undefined
  
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
  
  inline def apply(roleArn: Input[String], topic: Input[String]): TopicRuleRepublish = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleRepublish]
  }
  
  extension [Self <: TopicRuleRepublish](x: Self) {
    
    inline def setQos(value: Input[Double]): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: Input[String]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
