package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onLabelRemove'> */
trait PickImplonLabelRemove extends StObject {
  
  def onLabelRemove(value: js.Any): `false` | Unit
  @JSName("onLabelRemove")
  var onLabelRemove_Original: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]
}
object PickImplonLabelRemove {
  
  inline def apply(onLabelRemove: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]): PickImplonLabelRemove = {
    val __obj = js.Dynamic.literal(onLabelRemove = onLabelRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonLabelRemove]
  }
  
  extension [Self <: PickImplonLabelRemove](x: Self) {
    
    inline def setOnLabelRemove(value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]): Self = StObject.set(x, "onLabelRemove", value.asInstanceOf[js.Any])
  }
}
