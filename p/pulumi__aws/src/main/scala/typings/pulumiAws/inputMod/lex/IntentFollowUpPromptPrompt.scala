package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentFollowUpPromptPrompt extends StObject {
  
  /**
    * The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
    */
  var maxAttempts: Input[Double]
  
  /**
    * A set of messages, each of which provides a message string and its type.
    * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
    * Attributes are documented under message. Must contain between 1 and 15 messages.
    */
  var messages: Input[js.Array[Input[IntentFollowUpPromptPromptMessage]]]
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
    */
  var responseCard: js.UndefOr[Input[String]] = js.undefined
}
object IntentFollowUpPromptPrompt {
  
  @scala.inline
  def apply(maxAttempts: Input[Double], messages: Input[js.Array[Input[IntentFollowUpPromptPromptMessage]]]): IntentFollowUpPromptPrompt = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFollowUpPromptPrompt]
  }
  
  @scala.inline
  implicit class IntentFollowUpPromptPromptMutableBuilder[Self <: IntentFollowUpPromptPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAttempts(value: Input[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: Input[js.Array[Input[IntentFollowUpPromptPromptMessage]]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: Input[IntentFollowUpPromptPromptMessage]*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setResponseCard(value: Input[String]): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
  }
}
