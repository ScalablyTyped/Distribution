package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, 'input'> & std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl>> */
trait PickImplinputPartialPickI
  extends StObject
     with Param {
  
  var input: String
  
  var label: js.UndefOr[String] = js.undefined
}
object PickImplinputPartialPickI {
  
  inline def apply(input: String): PickImplinputPartialPickI = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinputPartialPickI]
  }
  
  extension [Self <: PickImplinputPartialPickI](x: Self) {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
