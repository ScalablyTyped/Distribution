package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAliasConversationLogs extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket. Must be between 20 and 2048 characters in length.
    */
  var iamRoleArn: Input[String]
  
  /**
    * The settings for your conversation logs. You can log text, audio, or both. Attributes are documented under log_settings.
    */
  var logSettings: js.UndefOr[Input[js.Array[Input[BotAliasConversationLogsLogSetting]]]] = js.undefined
}
object BotAliasConversationLogs {
  
  inline def apply(iamRoleArn: Input[String]): BotAliasConversationLogs = {
    val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasConversationLogs]
  }
  
  extension [Self <: BotAliasConversationLogs](x: Self) {
    
    inline def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setLogSettings(value: Input[js.Array[Input[BotAliasConversationLogsLogSetting]]]): Self = StObject.set(x, "logSettings", value.asInstanceOf[js.Any])
    
    inline def setLogSettingsUndefined: Self = StObject.set(x, "logSettings", js.undefined)
    
    inline def setLogSettingsVarargs(value: Input[BotAliasConversationLogsLogSetting]*): Self = StObject.set(x, "logSettings", js.Array(value :_*))
  }
}
