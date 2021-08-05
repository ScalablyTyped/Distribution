package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'mockResponseAsync'> */
trait PickImplmockResponseAsync extends StObject {
  
  var mockResponseAsync: (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false`
}
object PickImplmockResponseAsync {
  
  inline def apply(
    mockResponseAsync: (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ): PickImplmockResponseAsync = {
    val __obj = js.Dynamic.literal(mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmockResponseAsync]
  }
  
  extension [Self <: PickImplmockResponseAsync](x: Self) {
    
    inline def setMockResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = StObject.set(x, "mockResponseAsync", value.asInstanceOf[js.Any])
    
    inline def setMockResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = StObject.set(x, "mockResponseAsync", js.Any.fromFunction2(value))
  }
}
