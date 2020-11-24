package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'upward'> */
@js.native
trait PickImplupward extends js.Object {
  
  var upward: String = js.native
}
object PickImplupward {
  
  @scala.inline
  def apply(upward: String): PickImplupward = {
    val __obj = js.Dynamic.literal(upward = upward.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplupward]
  }
  
  @scala.inline
  implicit class PickImplupwardOps[Self <: PickImplupward] (val x: Self) extends AnyVal {
    
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
    def setUpward(value: String): Self = this.set("upward", value.asInstanceOf[js.Any])
  }
}
