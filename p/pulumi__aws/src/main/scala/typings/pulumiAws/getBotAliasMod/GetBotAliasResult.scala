package typings.pulumiAws.getBotAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotAliasResult extends js.Object {
  
  /**
    * The ARN of the bot alias.
    */
  val arn: String = js.native
  
  /**
    * The name of the bot.
    */
  val botName: String = js.native
  
  /**
    * The version of the bot that the alias points to.
    */
  val botVersion: String = js.native
  
  /**
    * Checksum of the bot alias.
    */
  val checksum: String = js.native
  
  /**
    * The date that the bot alias was created.
    */
  val createdDate: String = js.native
  
  /**
    * A description of the alias.
    */
  val description: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
    */
  val lastUpdatedDate: String = js.native
  
  /**
    * The name of the alias. The name is not case sensitive.
    */
  val name: String = js.native
}
object GetBotAliasResult {
  
  @scala.inline
  def apply(
    arn: String,
    botName: String,
    botVersion: String,
    checksum: String,
    createdDate: String,
    description: String,
    id: String,
    lastUpdatedDate: String,
    name: String
  ): GetBotAliasResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotAliasResult]
  }
  
  @scala.inline
  implicit class GetBotAliasResultOps[Self <: GetBotAliasResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotName(value: String): Self = this.set("botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotVersion(value: String): Self = this.set("botVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: String): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
