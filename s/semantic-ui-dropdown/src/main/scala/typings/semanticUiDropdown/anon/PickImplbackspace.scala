package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'backspace'> */
@js.native
trait PickImplbackspace extends js.Object {
  
  var backspace: Double = js.native
}
object PickImplbackspace {
  
  @scala.inline
  def apply(backspace: Double): PickImplbackspace = {
    val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbackspace]
  }
  
  @scala.inline
  implicit class PickImplbackspaceOps[Self <: PickImplbackspace] (val x: Self) extends AnyVal {
    
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
    def setBackspace(value: Double): Self = this.set("backspace", value.asInstanceOf[js.Any])
  }
}
