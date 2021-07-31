package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfigurationLoggingConfigurationLogDestinationConfig extends StObject {
  
  /**
    * A map describing the logging destination for the chosen `logDestinationType`.
    * * For an Amazon S3 bucket, specify the key `bucketName` with the URL of the bucket and optionally specify the key `prefix` with a path.
    * * For a CloudWatch log group, specify the key `logGroup` with the Amazon Resource Name (ARN) of the CloudWatch log group.
    * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the Amazon Resource Name (ARN) of the delivery stream.
    */
  var logDestination: StringDictionary[String]
  
  /**
    * The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
    */
  var logDestinationType: String
  
  /**
    * The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
    */
  var logType: String
}
object LoggingConfigurationLoggingConfigurationLogDestinationConfig {
  
  @scala.inline
  def apply(logDestination: StringDictionary[String], logDestinationType: String, logType: String): LoggingConfigurationLoggingConfigurationLogDestinationConfig = {
    val __obj = js.Dynamic.literal(logDestination = logDestination.asInstanceOf[js.Any], logDestinationType = logDestinationType.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfigurationLoggingConfigurationLogDestinationConfig]
  }
  
  @scala.inline
  implicit class LoggingConfigurationLoggingConfigurationLogDestinationConfigMutableBuilder[Self <: LoggingConfigurationLoggingConfigurationLogDestinationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogDestination(value: StringDictionary[String]): Self = StObject.set(x, "logDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDestinationType(value: String): Self = StObject.set(x, "logDestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
  }
}
