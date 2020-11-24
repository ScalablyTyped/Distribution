package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'mockResponse'> */
@js.native
trait PickImplmockResponse extends js.Object {
  
  var mockResponse: js.Any | `false` = js.native
}
object PickImplmockResponse {
  
  @scala.inline
  def apply(mockResponse: js.Any | `false`): PickImplmockResponse = {
    val __obj = js.Dynamic.literal(mockResponse = mockResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmockResponse]
  }
  
  @scala.inline
  implicit class PickImplmockResponseOps[Self <: PickImplmockResponse] (val x: Self) extends AnyVal {
    
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
    def setMockResponse(value: js.Any | `false`): Self = this.set("mockResponse", value.asInstanceOf[js.Any])
  }
}
