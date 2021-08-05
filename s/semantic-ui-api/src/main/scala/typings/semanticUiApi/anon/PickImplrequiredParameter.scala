package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'requiredParameter'> */
trait PickImplrequiredParameter extends StObject {
  
  var requiredParameter: String
}
object PickImplrequiredParameter {
  
  inline def apply(requiredParameter: String): PickImplrequiredParameter = {
    val __obj = js.Dynamic.literal(requiredParameter = requiredParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrequiredParameter]
  }
  
  extension [Self <: PickImplrequiredParameter](x: Self) {
    
    inline def setRequiredParameter(value: String): Self = StObject.set(x, "requiredParameter", value.asInstanceOf[js.Any])
  }
}
