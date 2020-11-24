package typings.pulumiAws.outputMod.lex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotAliasConversationLogs extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket. Must be between 20 and 2048 characters in length.
    */
  var iamRoleArn: String = js.native
  
  /**
    * The settings for your conversation logs. You can log text, audio, or both. Attributes are documented under log_settings.
    */
  var logSettings: js.UndefOr[js.Array[BotAliasConversationLogsLogSetting]] = js.native
}
object BotAliasConversationLogs {
  
  @scala.inline
  def apply(iamRoleArn: String): BotAliasConversationLogs = {
    val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasConversationLogs]
  }
  
  @scala.inline
  implicit class BotAliasConversationLogsOps[Self <: BotAliasConversationLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIamRoleArn(value: String): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSettingsVarargs(value: BotAliasConversationLogsLogSetting*): Self = this.set("logSettings", js.Array(value :_*))
    
    @scala.inline
    def setLogSettings(value: js.Array[BotAliasConversationLogsLogSetting]): Self = this.set("logSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogSettings: Self = this.set("logSettings", js.undefined)
  }
}
