package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotClarificationPromptMessage extends StObject {
  
  /**
    * The text of the message.
    */
  var content: Input[String]
  
  /**
    * The content type of the message string.
    */
  var contentType: Input[String]
  
  /**
    * Identifies the message group that the message belongs to. When a group
    * is assigned to a message, Amazon Lex returns one message from each group in the response.
    */
  var groupNumber: js.UndefOr[Input[Double]] = js.undefined
}
object BotClarificationPromptMessage {
  
  @scala.inline
  def apply(content: Input[String], contentType: Input[String]): BotClarificationPromptMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotClarificationPromptMessage]
  }
  
  @scala.inline
  implicit class BotClarificationPromptMessageMutableBuilder[Self <: BotClarificationPromptMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Input[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNumber(value: Input[Double]): Self = StObject.set(x, "groupNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNumberUndefined: Self = StObject.set(x, "groupNumber", js.undefined)
  }
}
