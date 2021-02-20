package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'responseAsync'> */
@js.native
trait PickImplresponseAsync extends StObject {
  
  var responseAsync: (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
}
object PickImplresponseAsync {
  
  @scala.inline
  def apply(
    responseAsync: (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ): PickImplresponseAsync = {
    val __obj = js.Dynamic.literal(responseAsync = responseAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplresponseAsync]
  }
  
  @scala.inline
  implicit class PickImplresponseAsyncMutableBuilder[Self <: PickImplresponseAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = StObject.set(x, "responseAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = StObject.set(x, "responseAsync", js.Any.fromFunction2(value))
  }
}
