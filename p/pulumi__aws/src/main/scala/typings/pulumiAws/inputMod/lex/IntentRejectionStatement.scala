package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentRejectionStatement extends StObject {
  
  /**
    * A set of messages, each of which provides a message string and its type.
    * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
    * Attributes are documented under message. Must contain between 1 and 15 messages.
    */
  var messages: Input[js.Array[Input[IntentRejectionStatementMessage]]]
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
    */
  var responseCard: js.UndefOr[Input[String]] = js.undefined
}
object IntentRejectionStatement {
  
  inline def apply(messages: Input[js.Array[Input[IntentRejectionStatementMessage]]]): IntentRejectionStatement = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentRejectionStatement]
  }
  
  extension [Self <: IntentRejectionStatement](x: Self) {
    
    inline def setMessages(value: Input[js.Array[Input[IntentRejectionStatementMessage]]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Input[IntentRejectionStatementMessage]*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setResponseCard(value: Input[String]): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    inline def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
  }
}
