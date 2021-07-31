package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'filtered'> */
trait PickImplfiltered extends StObject {
  
  var filtered: String
}
object PickImplfiltered {
  
  @scala.inline
  def apply(filtered: String): PickImplfiltered = {
    val __obj = js.Dynamic.literal(filtered = filtered.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfiltered]
  }
  
  @scala.inline
  implicit class PickImplfilteredMutableBuilder[Self <: PickImplfiltered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiltered(value: String): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
  }
}
