package typings.pulumiAws.outputMod.lex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentConclusionStatementMessage extends js.Object {
  
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
object IntentConclusionStatementMessage {
  
  @scala.inline
  def apply(content: String, contentType: String): IntentConclusionStatementMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentConclusionStatementMessage]
  }
  
  @scala.inline
  implicit class IntentConclusionStatementMessageOps[Self <: IntentConclusionStatementMessage] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNumber(value: Double): Self = this.set("groupNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupNumber: Self = this.set("groupNumber", js.undefined)
  }
}
