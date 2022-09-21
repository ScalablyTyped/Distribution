package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, 'label'> & std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl>> */
trait PickImpllabelPartialPickI
  extends StObject
     with Param {
  
  var input: js.UndefOr[String] = js.undefined
  
  var label: String & js.UndefOr[String]
}
object PickImpllabelPartialPickI {
  
  inline def apply(label: String & js.UndefOr[String]): PickImpllabelPartialPickI = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabelPartialPickI]
  }
  
  extension [Self <: PickImpllabelPartialPickI](x: Self) {
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: String & js.UndefOr[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
