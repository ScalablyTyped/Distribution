package typings.semanticUiForm.anon

import typings.semanticUiForm.SemanticUI.Form.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'submit'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl>> */
trait PickImplsubmitPartialPick
  extends StObject
     with Param {
  
  var field: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var input: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var submit: String & js.UndefOr[String]
}
object PickImplsubmitPartialPick {
  
  inline def apply(submit: String & js.UndefOr[String]): PickImplsubmitPartialPick = {
    val __obj = js.Dynamic.literal(submit = submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsubmitPartialPick]
  }
  
  extension [Self <: PickImplsubmitPartialPick](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setSubmit(value: String & js.UndefOr[String]): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
  }
}
