package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotClarificationPromptMessage extends js.Object {
  
  /**
    * The text of the message.
    */
  var content: Input[String] = js.native
  
  /**
    * The content type of the message string.
    */
  var contentType: Input[String] = js.native
  
  /**
    * Identifies the message group that the message belongs to. When a group
    * is assigned to a message, Amazon Lex returns one message from each group in the response.
    */
  var groupNumber: js.UndefOr[Input[Double]] = js.native
}
object BotClarificationPromptMessage {
  
  @scala.inline
  def apply(content: Input[String], contentType: Input[String]): BotClarificationPromptMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotClarificationPromptMessage]
  }
  
  @scala.inline
  implicit class BotClarificationPromptMessageOps[Self <: BotClarificationPromptMessage] (val x: Self) extends AnyVal {
    
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
    def setContent(value: Input[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: Input[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNumber(value: Input[Double]): Self = this.set("groupNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupNumber: Self = this.set("groupNumber", js.undefined)
  }
}
