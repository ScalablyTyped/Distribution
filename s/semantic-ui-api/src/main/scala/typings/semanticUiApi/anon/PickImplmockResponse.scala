package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'mockResponse'> */
@js.native
trait PickImplmockResponse extends StObject {
  
  var mockResponse: js.Any | `false` = js.native
}
object PickImplmockResponse {
  
  @scala.inline
  def apply(mockResponse: js.Any | `false`): PickImplmockResponse = {
    val __obj = js.Dynamic.literal(mockResponse = mockResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmockResponse]
  }
  
  @scala.inline
  implicit class PickImplmockResponseMutableBuilder[Self <: PickImplmockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMockResponse(value: js.Any | `false`): Self = StObject.set(x, "mockResponse", value.asInstanceOf[js.Any])
  }
}
