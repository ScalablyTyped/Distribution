package typings.pulumiAws.outputMod.lex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotAliasConversationLogsLogSetting extends js.Object {
  
  /**
    * The destination where logs are delivered. Options are `CLOUDWATCH_LOGS` or `S3`.
    */
  var destination: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket. This can only be specified when `destination` is set to `S3`. Must be between 20 and 2048 characters in length.
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
  
  /**
    * The type of logging that is enabled. Options are `AUDIO` or `TEXT`.
    */
  var logType: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered. Must be less than or equal to 2048 characters in length.
    */
  var resourceArn: String = js.native
  
  /**
    * The prefix of the S3 object key for `AUDIO` logs or the log stream name for `TEXT` logs.
    */
  var resourcePrefix: String = js.native
}
object BotAliasConversationLogsLogSetting {
  
  @scala.inline
  def apply(destination: String, logType: String, resourceArn: String, resourcePrefix: String): BotAliasConversationLogsLogSetting = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourcePrefix = resourcePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasConversationLogsLogSetting]
  }
  
  @scala.inline
  implicit class BotAliasConversationLogsLogSettingOps[Self <: BotAliasConversationLogsLogSetting] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogType(value: String): Self = this.set("logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: String): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePrefix(value: String): Self = this.set("resourcePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
  }
}
