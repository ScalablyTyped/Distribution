package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'glyphWidth'> */
@js.native
trait PickImplglyphWidth extends StObject {
  
  var glyphWidth: Double = js.native
}
object PickImplglyphWidth {
  
  @scala.inline
  def apply(glyphWidth: Double): PickImplglyphWidth = {
    val __obj = js.Dynamic.literal(glyphWidth = glyphWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplglyphWidth]
  }
  
  @scala.inline
  implicit class PickImplglyphWidthMutableBuilder[Self <: PickImplglyphWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlyphWidth(value: Double): Self = StObject.set(x, "glyphWidth", value.asInstanceOf[js.Any])
  }
}
