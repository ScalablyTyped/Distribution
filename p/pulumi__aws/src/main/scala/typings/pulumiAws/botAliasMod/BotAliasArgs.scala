package typings.pulumiAws.botAliasMod

import typings.pulumiAws.inputMod.lex.BotAliasConversationLogs
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotAliasArgs extends js.Object {
  
  /**
    * The name of the bot.
    */
  val botName: Input[String] = js.native
  
  /**
    * The name of the bot.
    */
  val botVersion: Input[String] = js.native
  
  /**
    * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
    */
  val conversationLogs: js.UndefOr[Input[BotAliasConversationLogs]] = js.native
  
  /**
    * A description of the alias. Must be less than or equal to 200 characters in length.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object BotAliasArgs {
  
  @scala.inline
  def apply(botName: Input[String], botVersion: Input[String]): BotAliasArgs = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasArgs]
  }
  
  @scala.inline
  implicit class BotAliasArgsOps[Self <: BotAliasArgs] (val x: Self) extends AnyVal {
    
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
    def setBotName(value: Input[String]): Self = this.set("botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotVersion(value: Input[String]): Self = this.set("botVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationLogs(value: Input[BotAliasConversationLogs]): Self = this.set("conversationLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversationLogs: Self = this.set("conversationLogs", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
