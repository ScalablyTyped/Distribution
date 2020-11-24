package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'deleteKey'> */
@js.native
trait PickImpldeleteKey extends js.Object {
  
  var deleteKey: Double = js.native
}
object PickImpldeleteKey {
  
  @scala.inline
  def apply(deleteKey: Double): PickImpldeleteKey = {
    val __obj = js.Dynamic.literal(deleteKey = deleteKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldeleteKey]
  }
  
  @scala.inline
  implicit class PickImpldeleteKeyOps[Self <: PickImpldeleteKey] (val x: Self) extends AnyVal {
    
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
    def setDeleteKey(value: Double): Self = this.set("deleteKey", value.asInstanceOf[js.Any])
  }
}
