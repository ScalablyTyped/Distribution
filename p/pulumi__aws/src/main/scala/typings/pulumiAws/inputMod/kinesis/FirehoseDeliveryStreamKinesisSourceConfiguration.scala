package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamKinesisSourceConfiguration extends StObject {
  
  /**
    * The kinesis stream used as the source of the firehose delivery stream.
    */
  var kinesisStreamArn: Input[String]
  
  /**
    * The ARN of the role that provides access to the source Kinesis stream.
    */
  var roleArn: Input[String]
}
object FirehoseDeliveryStreamKinesisSourceConfiguration {
  
  @scala.inline
  def apply(kinesisStreamArn: Input[String], roleArn: Input[String]): FirehoseDeliveryStreamKinesisSourceConfiguration = {
    val __obj = js.Dynamic.literal(kinesisStreamArn = kinesisStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamKinesisSourceConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamKinesisSourceConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamKinesisSourceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinesisStreamArn(value: Input[String]): Self = StObject.set(x, "kinesisStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
