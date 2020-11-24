package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'keepOnScreen'> */
@js.native
trait PickImplkeepOnScreen extends js.Object {
  
  var keepOnScreen: Boolean = js.native
}
object PickImplkeepOnScreen {
  
  @scala.inline
  def apply(keepOnScreen: Boolean): PickImplkeepOnScreen = {
    val __obj = js.Dynamic.literal(keepOnScreen = keepOnScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeepOnScreen]
  }
  
  @scala.inline
  implicit class PickImplkeepOnScreenOps[Self <: PickImplkeepOnScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeepOnScreen(value: Boolean): Self = this.set("keepOnScreen", value.asInstanceOf[js.Any])
  }
}
