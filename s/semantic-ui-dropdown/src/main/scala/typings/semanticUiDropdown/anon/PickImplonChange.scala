package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'onChange'> */
trait PickImplonChange extends StObject {
  
  def onChange(value: js.Any, text: String, $choice: JQuery): Unit
  @JSName("onChange")
  var onChange_Original: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
}
object PickImplonChange {
  
  inline def apply(
    onChange: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ): PickImplonChange = {
    val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonChange]
  }
  
  extension [Self <: PickImplonChange](x: Self) {
    
    inline def setOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
