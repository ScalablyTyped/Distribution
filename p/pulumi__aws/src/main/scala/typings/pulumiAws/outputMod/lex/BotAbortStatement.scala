package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAbortStatement extends StObject {
  
  /**
    * A set of messages, each of which provides a message string and its type. You
    * can specify the message string in plain text or in Speech Synthesis Markup Language (SSML). Attributes
    * are documented under message.
    */
  var messages: js.Array[BotAbortStatementMessage]
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html).
    */
  var responseCard: js.UndefOr[String] = js.undefined
}
object BotAbortStatement {
  
  @scala.inline
  def apply(messages: js.Array[BotAbortStatementMessage]): BotAbortStatement = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAbortStatement]
  }
  
  @scala.inline
  implicit class BotAbortStatementMutableBuilder[Self <: BotAbortStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[BotAbortStatementMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: BotAbortStatementMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setResponseCard(value: String): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
  }
}
