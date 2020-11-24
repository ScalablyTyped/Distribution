package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'throttleFirstRequest'> */
@js.native
trait PickImplthrottleFirstRequ extends js.Object {
  
  var throttleFirstRequest: Boolean = js.native
}
object PickImplthrottleFirstRequ {
  
  @scala.inline
  def apply(throttleFirstRequest: Boolean): PickImplthrottleFirstRequ = {
    val __obj = js.Dynamic.literal(throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplthrottleFirstRequ]
  }
  
  @scala.inline
  implicit class PickImplthrottleFirstRequOps[Self <: PickImplthrottleFirstRequ] (val x: Self) extends AnyVal {
    
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
    def setThrottleFirstRequest(value: Boolean): Self = this.set("throttleFirstRequest", value.asInstanceOf[js.Any])
  }
}
