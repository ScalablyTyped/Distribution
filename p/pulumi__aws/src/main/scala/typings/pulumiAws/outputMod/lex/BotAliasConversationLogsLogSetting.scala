package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAliasConversationLogsLogSetting extends StObject {
  
  /**
    * The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
    */
  var destination: String
  
  /**
    * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  
  /**
    * The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
    */
  var logType: String
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
    */
  var resourceArn: String
  
  /**
    * The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
    */
  var resourcePrefix: String
}
object BotAliasConversationLogsLogSetting {
  
  inline def apply(destination: String, logType: String, resourceArn: String, resourcePrefix: String): BotAliasConversationLogsLogSetting = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourcePrefix = resourcePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasConversationLogsLogSetting]
  }
  
  extension [Self <: BotAliasConversationLogsLogSetting](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourcePrefix(value: String): Self = StObject.set(x, "resourcePrefix", value.asInstanceOf[js.Any])
  }
}
