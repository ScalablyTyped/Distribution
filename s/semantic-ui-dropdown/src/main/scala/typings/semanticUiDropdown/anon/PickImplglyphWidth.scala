package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'glyphWidth'> */
trait PickImplglyphWidth extends StObject {
  
  var glyphWidth: Double
}
object PickImplglyphWidth {
  
  inline def apply(glyphWidth: Double): PickImplglyphWidth = {
    val __obj = js.Dynamic.literal(glyphWidth = glyphWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplglyphWidth]
  }
  
  extension [Self <: PickImplglyphWidth](x: Self) {
    
    inline def setGlyphWidth(value: Double): Self = StObject.set(x, "glyphWidth", value.asInstanceOf[js.Any])
  }
}
