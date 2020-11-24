package typings.pulumiAws.outputMod.lex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotAbortStatement extends js.Object {
  
  /**
    * A set of messages, each of which provides a message string and its type. You
    * can specify the message string in plain text or in Speech Synthesis Markup Language (SSML). Attributes
    * are documented under message.
    */
  var messages: js.Array[BotAbortStatementMessage] = js.native
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html).
    */
  var responseCard: js.UndefOr[String] = js.native
}
object BotAbortStatement {
  
  @scala.inline
  def apply(messages: js.Array[BotAbortStatementMessage]): BotAbortStatement = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAbortStatement]
  }
  
  @scala.inline
  implicit class BotAbortStatementOps[Self <: BotAbortStatement] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: BotAbortStatementMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[BotAbortStatementMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCard(value: String): Self = this.set("responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCard: Self = this.set("responseCard", js.undefined)
  }
}
