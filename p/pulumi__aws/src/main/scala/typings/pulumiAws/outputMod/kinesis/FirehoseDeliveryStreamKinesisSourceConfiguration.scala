package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamKinesisSourceConfiguration extends StObject {
  
  /**
    * The kinesis stream used as the source of the firehose delivery stream.
    */
  var kinesisStreamArn: String
  
  /**
    * The ARN of the role that provides access to the source Kinesis stream.
    */
  var roleArn: String
}
object FirehoseDeliveryStreamKinesisSourceConfiguration {
  
  @scala.inline
  def apply(kinesisStreamArn: String, roleArn: String): FirehoseDeliveryStreamKinesisSourceConfiguration = {
    val __obj = js.Dynamic.literal(kinesisStreamArn = kinesisStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamKinesisSourceConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamKinesisSourceConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamKinesisSourceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinesisStreamArn(value: String): Self = StObject.set(x, "kinesisStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
