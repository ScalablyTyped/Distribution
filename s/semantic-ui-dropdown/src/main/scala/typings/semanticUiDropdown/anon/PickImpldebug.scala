package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'debug'> */
@js.native
trait PickImpldebug extends StObject {
  
  var debug: Boolean = js.native
}
object PickImpldebug {
  
  @scala.inline
  def apply(debug: Boolean): PickImpldebug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldebug]
  }
  
  @scala.inline
  implicit class PickImpldebugMutableBuilder[Self <: PickImpldebug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
  }
}
