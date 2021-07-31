package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAliasConversationLogsLogSetting extends StObject {
  
  /**
    * The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
    */
  var destination: Input[String]
  
  /**
    * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
    */
  var logType: Input[String]
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
    */
  var resourceArn: Input[String]
  
  /**
    * The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
    */
  var resourcePrefix: js.UndefOr[Input[String]] = js.undefined
}
object BotAliasConversationLogsLogSetting {
  
  @scala.inline
  def apply(destination: Input[String], logType: Input[String], resourceArn: Input[String]): BotAliasConversationLogsLogSetting = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasConversationLogsLogSetting]
  }
  
  @scala.inline
  implicit class BotAliasConversationLogsLogSettingMutableBuilder[Self <: BotAliasConversationLogsLogSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    @scala.inline
    def setLogType(value: Input[String]): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePrefix(value: Input[String]): Self = StObject.set(x, "resourcePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePrefixUndefined: Self = StObject.set(x, "resourcePrefix", js.undefined)
  }
}
