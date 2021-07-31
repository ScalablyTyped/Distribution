package typings.semanticUiCheckbox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplInput extends StObject {
  
  var input: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplInput {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplInput]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplInputMutableBuilder[Self <: PartialPickImplkeyofImplInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
