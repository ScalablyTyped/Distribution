package typings.pulumiAws.botAliasMod

import typings.pulumiAws.inputMod.lex.BotAliasConversationLogs
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotAliasState extends js.Object {
  
  /**
    * The ARN of the bot alias.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the bot.
    */
  val botName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the bot.
    */
  val botVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Checksum of the bot alias.
    */
  val checksum: js.UndefOr[Input[String]] = js.native
  
  /**
    * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
    */
  val conversationLogs: js.UndefOr[Input[BotAliasConversationLogs]] = js.native
  
  /**
    * The date that the bot alias was created.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * A description of the alias. Must be less than or equal to 200 characters in length.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object BotAliasState {
  
  @scala.inline
  def apply(): BotAliasState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotAliasState]
  }
  
  @scala.inline
  implicit class BotAliasStateOps[Self <: BotAliasState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBotName(value: Input[String]): Self = this.set("botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotName: Self = this.set("botName", js.undefined)
    
    @scala.inline
    def setBotVersion(value: Input[String]): Self = this.set("botVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotVersion: Self = this.set("botVersion", js.undefined)
    
    @scala.inline
    def setChecksum(value: Input[String]): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setConversationLogs(value: Input[BotAliasConversationLogs]): Self = this.set("conversationLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversationLogs: Self = this.set("conversationLogs", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Input[String]): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
