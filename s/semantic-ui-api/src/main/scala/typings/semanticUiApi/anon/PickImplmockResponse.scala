package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'mockResponse'> */
trait PickImplmockResponse extends StObject {
  
  var mockResponse: js.Any | `false`
}
object PickImplmockResponse {
  
  inline def apply(mockResponse: js.Any | `false`): PickImplmockResponse = {
    val __obj = js.Dynamic.literal(mockResponse = mockResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmockResponse]
  }
  
  extension [Self <: PickImplmockResponse](x: Self) {
    
    inline def setMockResponse(value: js.Any | `false`): Self = StObject.set(x, "mockResponse", value.asInstanceOf[js.Any])
  }
}
