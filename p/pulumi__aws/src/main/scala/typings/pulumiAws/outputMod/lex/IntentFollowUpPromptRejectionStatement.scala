package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentFollowUpPromptRejectionStatement extends StObject {
  
  /**
    * A set of messages, each of which provides a message string and its type.
    * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
    * Attributes are documented under message. Must contain between 1 and 15 messages.
    */
  var messages: js.Array[IntentFollowUpPromptRejectionStatementMessage] = js.native
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
    */
  var responseCard: js.UndefOr[String] = js.native
}
object IntentFollowUpPromptRejectionStatement {
  
  @scala.inline
  def apply(messages: js.Array[IntentFollowUpPromptRejectionStatementMessage]): IntentFollowUpPromptRejectionStatement = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFollowUpPromptRejectionStatement]
  }
  
  @scala.inline
  implicit class IntentFollowUpPromptRejectionStatementMutableBuilder[Self <: IntentFollowUpPromptRejectionStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[IntentFollowUpPromptRejectionStatementMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: IntentFollowUpPromptRejectionStatementMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setResponseCard(value: String): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
  }
}
