package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'noReturnedValue'> */
@js.native
trait PickImplnoReturnedValue extends js.Object {
  
  var noReturnedValue: String = js.native
}
object PickImplnoReturnedValue {
  
  @scala.inline
  def apply(noReturnedValue: String): PickImplnoReturnedValue = {
    val __obj = js.Dynamic.literal(noReturnedValue = noReturnedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoReturnedValue]
  }
  
  @scala.inline
  implicit class PickImplnoReturnedValueOps[Self <: PickImplnoReturnedValue] (val x: Self) extends AnyVal {
    
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
    def setNoReturnedValue(value: String): Self = this.set("noReturnedValue", value.asInstanceOf[js.Any])
  }
}
