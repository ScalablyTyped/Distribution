package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentRejectionStatementMessage extends StObject {
  
  /**
    * The text of the message. Must be less than or equal to 1000 characters in length.
    */
  var content: String = js.native
  
  /**
    * The content type of the message string.
    */
  var contentType: String = js.native
  
  /**
    * Identifies the message group that the message belongs to. When a group
    * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
    */
  var groupNumber: js.UndefOr[Double] = js.native
}
object IntentRejectionStatementMessage {
  
  @scala.inline
  def apply(content: String, contentType: String): IntentRejectionStatementMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentRejectionStatementMessage]
  }
  
  @scala.inline
  implicit class IntentRejectionStatementMessageMutableBuilder[Self <: IntentRejectionStatementMessage] (val x: Self) extends AnyVal {
    
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
