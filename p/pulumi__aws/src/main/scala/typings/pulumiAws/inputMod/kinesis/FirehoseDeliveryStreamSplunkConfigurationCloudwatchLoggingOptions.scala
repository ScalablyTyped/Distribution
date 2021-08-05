package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions extends StObject {
  
  /**
    * Enables or disables the logging. Defaults to `false`.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The CloudWatch group name for logging. This value is required if `enabled` is true.
    */
  var logGroupName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
    */
  var logStreamName: js.UndefOr[Input[String]] = js.undefined
}
object FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions {
  
  inline def apply(): FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions]
  }
  
  extension [Self <: FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions](x: Self) {
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setLogStreamName(value: Input[String]): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
  }
}
