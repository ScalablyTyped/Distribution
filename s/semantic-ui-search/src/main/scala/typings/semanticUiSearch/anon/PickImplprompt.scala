package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'prompt'> */
@js.native
trait PickImplprompt extends StObject {
  
  var prompt: String = js.native
}
object PickImplprompt {
  
  @scala.inline
  def apply(prompt: String): PickImplprompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprompt]
  }
  
  @scala.inline
  implicit class PickImplpromptMutableBuilder[Self <: PickImplprompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
  }
}
