package typings.semanticUiApi.anon

import typings.semanticUiApi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'stateContext'> */
trait PickImplstateContext extends StObject {
  
  var stateContext: String | JQuery
}
object PickImplstateContext {
  
  inline def apply(stateContext: String | JQuery): PickImplstateContext = {
    val __obj = js.Dynamic.literal(stateContext = stateContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstateContext]
  }
  
  extension [Self <: PickImplstateContext](x: Self) {
    
    inline def setStateContext(value: String | JQuery): Self = StObject.set(x, "stateContext", value.asInstanceOf[js.Any])
  }
}
