package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleFirehose extends StObject {
  
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: String
  
  /**
    * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
    */
  var roleArn: String
  
  /**
    * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[String] = js.undefined
}
object TopicRuleFirehose {
  
  @scala.inline
  def apply(deliveryStreamName: String, roleArn: String): TopicRuleFirehose = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleFirehose]
  }
  
  @scala.inline
  implicit class TopicRuleFirehoseMutableBuilder[Self <: TopicRuleFirehose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamName(value: String): Self = StObject.set(x, "deliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
