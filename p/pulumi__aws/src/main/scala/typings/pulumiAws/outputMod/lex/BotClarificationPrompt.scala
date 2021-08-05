package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotClarificationPrompt extends StObject {
  
  /**
    * The number of times to prompt the user for information.
    */
  var maxAttempts: Double
  
  /**
    * A set of messages, each of which provides a message string and its type. You
    * can specify the message string in plain text or in Speech Synthesis Markup Language (SSML). Attributes
    * are documented under message.
    */
  var messages: js.Array[BotClarificationPromptMessage]
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html).
    */
  var responseCard: js.UndefOr[String] = js.undefined
}
object BotClarificationPrompt {
  
  inline def apply(maxAttempts: Double, messages: js.Array[BotClarificationPromptMessage]): BotClarificationPrompt = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotClarificationPrompt]
  }
  
  extension [Self <: BotClarificationPrompt](x: Self) {
    
    inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[BotClarificationPromptMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: BotClarificationPromptMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setResponseCard(value: String): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    inline def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
  }
}
