package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'uncheckable'> */
trait PickImpluncheckable extends StObject {
  
  var uncheckable: auto | Boolean
}
object PickImpluncheckable {
  
  inline def apply(uncheckable: auto | Boolean): PickImpluncheckable = {
    val __obj = js.Dynamic.literal(uncheckable = uncheckable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluncheckable]
  }
  
  extension [Self <: PickImpluncheckable](x: Self) {
    
    inline def setUncheckable(value: auto | Boolean): Self = StObject.set(x, "uncheckable", value.asInstanceOf[js.Any])
  }
}
