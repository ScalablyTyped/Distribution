package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'missingAction'> */
@js.native
trait PickImplmissingAction extends js.Object {
  
  var missingAction: String = js.native
}
object PickImplmissingAction {
  
  @scala.inline
  def apply(missingAction: String): PickImplmissingAction = {
    val __obj = js.Dynamic.literal(missingAction = missingAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingAction]
  }
  
  @scala.inline
  implicit class PickImplmissingActionOps[Self <: PickImplmissingAction] (val x: Self) extends AnyVal {
    
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
    def setMissingAction(value: String): Self = this.set("missingAction", value.asInstanceOf[js.Any])
  }
}
