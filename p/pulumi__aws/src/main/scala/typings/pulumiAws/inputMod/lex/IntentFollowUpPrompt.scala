package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentFollowUpPrompt extends StObject {
  
  /**
    * Prompts for information from the user. Attributes are documented under prompt.
    */
  var prompt: Input[IntentFollowUpPromptPrompt] = js.native
  
  /**
    * If the user answers "no" to the question defined in the prompt field,
    * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
    * documented below under statement.
    */
  var rejectionStatement: Input[IntentFollowUpPromptRejectionStatement] = js.native
}
object IntentFollowUpPrompt {
  
  @scala.inline
  def apply(
    prompt: Input[IntentFollowUpPromptPrompt],
    rejectionStatement: Input[IntentFollowUpPromptRejectionStatement]
  ): IntentFollowUpPrompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any], rejectionStatement = rejectionStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFollowUpPrompt]
  }
  
  @scala.inline
  implicit class IntentFollowUpPromptMutableBuilder[Self <: IntentFollowUpPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrompt(value: Input[IntentFollowUpPromptPrompt]): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionStatement(value: Input[IntentFollowUpPromptRejectionStatement]): Self = StObject.set(x, "rejectionStatement", value.asInstanceOf[js.Any])
  }
}
