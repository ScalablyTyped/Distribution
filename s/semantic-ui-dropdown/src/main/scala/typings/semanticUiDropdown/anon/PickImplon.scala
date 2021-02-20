package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'on'> */
@js.native
trait PickImplon extends StObject {
  
  var on: String = js.native
}
object PickImplon {
  
  @scala.inline
  def apply(on: String): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplon]
  }
  
  @scala.inline
  implicit class PickImplonMutableBuilder[Self <: PickImplon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
