package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAliasConversationLogs extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket. Must be between 20 and 2048 characters in length.
    */
  var iamRoleArn: String
  
  /**
    * The settings for your conversation logs. You can log text, audio, or both. Attributes are documented under log_settings.
    */
  var logSettings: js.UndefOr[js.Array[BotAliasConversationLogsLogSetting]] = js.undefined
}
object BotAliasConversationLogs {
  
  @scala.inline
  def apply(iamRoleArn: String): BotAliasConversationLogs = {
    val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasConversationLogs]
  }
  
  @scala.inline
  implicit class BotAliasConversationLogsMutableBuilder[Self <: BotAliasConversationLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamRoleArn(value: String): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSettings(value: js.Array[BotAliasConversationLogsLogSetting]): Self = StObject.set(x, "logSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSettingsUndefined: Self = StObject.set(x, "logSettings", js.undefined)
    
    @scala.inline
    def setLogSettingsVarargs(value: BotAliasConversationLogsLogSetting*): Self = StObject.set(x, "logSettings", js.Array(value :_*))
  }
}
