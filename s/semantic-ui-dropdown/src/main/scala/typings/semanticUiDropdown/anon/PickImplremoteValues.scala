package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'remoteValues'> */
@js.native
trait PickImplremoteValues extends js.Object {
  
  var remoteValues: String = js.native
}
object PickImplremoteValues {
  
  @scala.inline
  def apply(remoteValues: String): PickImplremoteValues = {
    val __obj = js.Dynamic.literal(remoteValues = remoteValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplremoteValues]
  }
  
  @scala.inline
  implicit class PickImplremoteValuesOps[Self <: PickImplremoteValues] (val x: Self) extends AnyVal {
    
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
    def setRemoteValues(value: String): Self = this.set("remoteValues", value.asInstanceOf[js.Any])
  }
}
