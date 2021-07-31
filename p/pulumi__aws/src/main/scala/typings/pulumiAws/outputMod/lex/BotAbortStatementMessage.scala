package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAbortStatementMessage extends StObject {
  
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
object BotAbortStatementMessage {
  
  @scala.inline
  def apply(content: String, contentType: String): BotAbortStatementMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAbortStatementMessage]
  }
  
  @scala.inline
  implicit class BotAbortStatementMessageMutableBuilder[Self <: BotAbortStatementMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNumber(value: Double): Self = StObject.set(x, "groupNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNumberUndefined: Self = StObject.set(x, "groupNumber", js.undefined)
  }
}
