package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'keepOnScreen'> */
@js.native
trait PickImplkeepOnScreen extends StObject {
  
  var keepOnScreen: Boolean = js.native
}
object PickImplkeepOnScreen {
  
  @scala.inline
  def apply(keepOnScreen: Boolean): PickImplkeepOnScreen = {
    val __obj = js.Dynamic.literal(keepOnScreen = keepOnScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeepOnScreen]
  }
  
  @scala.inline
  implicit class PickImplkeepOnScreenMutableBuilder[Self <: PickImplkeepOnScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepOnScreen(value: Boolean): Self = StObject.set(x, "keepOnScreen", value.asInstanceOf[js.Any])
  }
}
