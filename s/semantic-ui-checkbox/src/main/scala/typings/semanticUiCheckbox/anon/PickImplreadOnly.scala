package typings.semanticUiCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'readOnly'> */
@js.native
trait PickImplreadOnly extends js.Object {
  
  var readOnly: String = js.native
}
object PickImplreadOnly {
  
  @scala.inline
  def apply(readOnly: String): PickImplreadOnly = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplreadOnly]
  }
  
  @scala.inline
  implicit class PickImplreadOnlyOps[Self <: PickImplreadOnly] (val x: Self) extends AnyVal {
    
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
    def setReadOnly(value: String): Self = this.set("readOnly", value.asInstanceOf[js.Any])
  }
}
