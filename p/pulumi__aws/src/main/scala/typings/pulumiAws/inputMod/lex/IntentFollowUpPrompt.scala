package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentFollowUpPrompt extends StObject {
  
  /**
    * Prompts for information from the user. Attributes are documented under prompt.
    */
  var prompt: Input[IntentFollowUpPromptPrompt]
  
  /**
    * If the user answers "no" to the question defined in the prompt field,
    * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
    * documented below under statement.
    */
  var rejectionStatement: Input[IntentFollowUpPromptRejectionStatement]
}
object IntentFollowUpPrompt {
  
  inline def apply(
    prompt: Input[IntentFollowUpPromptPrompt],
    rejectionStatement: Input[IntentFollowUpPromptRejectionStatement]
  ): IntentFollowUpPrompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any], rejectionStatement = rejectionStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFollowUpPrompt]
  }
  
  extension [Self <: IntentFollowUpPrompt](x: Self) {
    
    inline def setPrompt(value: Input[IntentFollowUpPromptPrompt]): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setRejectionStatement(value: Input[IntentFollowUpPromptRejectionStatement]): Self = StObject.set(x, "rejectionStatement", value.asInstanceOf[js.Any])
  }
}
