package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions extends StObject {
  
  /**
    * Enables or disables the logging. Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The CloudWatch group name for logging. This value is required if `enabled` is true.
    */
  var logGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
    */
  var logStreamName: js.UndefOr[String] = js.undefined
}
object FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsMutableBuilder[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: String): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: String): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
  }
}
