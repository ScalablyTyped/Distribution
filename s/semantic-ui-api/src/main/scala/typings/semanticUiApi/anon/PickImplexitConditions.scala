package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'exitConditions'> */
trait PickImplexitConditions extends StObject {
  
  var exitConditions: String
}
object PickImplexitConditions {
  
  inline def apply(exitConditions: String): PickImplexitConditions = {
    val __obj = js.Dynamic.literal(exitConditions = exitConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexitConditions]
  }
  
  extension [Self <: PickImplexitConditions](x: Self) {
    
    inline def setExitConditions(value: String): Self = StObject.set(x, "exitConditions", value.asInstanceOf[js.Any])
  }
}
