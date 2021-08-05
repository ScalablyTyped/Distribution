package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotClarificationPromptMessage extends StObject {
  
  /**
    * The text of the message.
    */
  var content: String
  
  /**
    * The content type of the message string.
    */
  var contentType: String
  
  /**
    * Identifies the message group that the message belongs to. When a group
    * is assigned to a message, Amazon Lex returns one message from each group in the response.
    */
  var groupNumber: js.UndefOr[Double] = js.undefined
}
object BotClarificationPromptMessage {
  
  inline def apply(content: String, contentType: String): BotClarificationPromptMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotClarificationPromptMessage]
  }
  
  extension [Self <: BotClarificationPromptMessage](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setGroupNumber(value: Double): Self = StObject.set(x, "groupNumber", value.asInstanceOf[js.Any])
    
    inline def setGroupNumberUndefined: Self = StObject.set(x, "groupNumber", js.undefined)
  }
}
