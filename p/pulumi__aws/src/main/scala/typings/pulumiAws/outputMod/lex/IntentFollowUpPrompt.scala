package typings.pulumiAws.outputMod.lex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentFollowUpPrompt extends js.Object {
  
  /**
    * Prompts for information from the user. Attributes are documented under prompt.
    */
  var prompt: IntentFollowUpPromptPrompt = js.native
  
  /**
    * If the user answers "no" to the question defined in the prompt field,
    * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
    * documented below under statement.
    */
  var rejectionStatement: IntentFollowUpPromptRejectionStatement = js.native
}
object IntentFollowUpPrompt {
  
  @scala.inline
  def apply(prompt: IntentFollowUpPromptPrompt, rejectionStatement: IntentFollowUpPromptRejectionStatement): IntentFollowUpPrompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any], rejectionStatement = rejectionStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFollowUpPrompt]
  }
  
  @scala.inline
  implicit class IntentFollowUpPromptOps[Self <: IntentFollowUpPrompt] (val x: Self) extends AnyVal {
    
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
    def setPrompt(value: IntentFollowUpPromptPrompt): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionStatement(value: IntentFollowUpPromptRejectionStatement): Self = this.set("rejectionStatement", value.asInstanceOf[js.Any])
  }
}
