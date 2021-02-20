package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionFirehose extends StObject {
  
  /**
    * The delivery stream name.
    */
  var deliveryStreamName: Input[String] = js.native
  
  /**
    * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
    */
  var separator: js.UndefOr[Input[String]] = js.native
}
object TopicRuleErrorActionFirehose {
  
  @scala.inline
  def apply(deliveryStreamName: Input[String], roleArn: Input[String]): TopicRuleErrorActionFirehose = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionFirehose]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionFirehoseMutableBuilder[Self <: TopicRuleErrorActionFirehose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamName(value: Input[String]): Self = StObject.set(x, "deliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: Input[String]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
