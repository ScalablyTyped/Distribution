package typings.semanticUiForm.anon

import typings.semanticUiForm.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl>> */
trait PartialPickImplkeyofImplError extends StObject {
  
  var error: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.undefined
  
  var prompt: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.undefined
}
object PartialPickImplkeyofImplError {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplError]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplErrorMutableBuilder[Self <: PartialPickImplkeyofImplError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* errors */ js.Array[String] => JQuery): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setPrompt(value: /* errors */ js.Array[String] => JQuery): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
  }
}
