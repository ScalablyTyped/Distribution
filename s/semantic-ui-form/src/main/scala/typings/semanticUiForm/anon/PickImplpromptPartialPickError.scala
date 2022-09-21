package typings.semanticUiForm.anon

import typings.semanticUiForm.JQuery
import typings.semanticUiForm.SemanticUI.Form.TemplatesSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, 'prompt'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl>> */
trait PickImplpromptPartialPickError
  extends StObject
     with Param {
  
  var error: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.undefined
  
  def prompt(errors: js.Array[String]): JQuery
  @JSName("prompt")
  var prompt_Original: (js.Function1[/* errors */ js.Array[String], JQuery]) & (js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]])
}
object PickImplpromptPartialPickError {
  
  inline def apply(
    prompt: (js.Function1[/* errors */ js.Array[String], JQuery]) & (js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]])
  ): PickImplpromptPartialPickError = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpromptPartialPickError]
  }
  
  extension [Self <: PickImplpromptPartialPickError](x: Self) {
    
    inline def setError(value: /* errors */ js.Array[String] => JQuery): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPrompt(
      value: (js.Function1[/* errors */ js.Array[String], JQuery]) & (js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]])
    ): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
  }
}
