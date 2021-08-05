package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'legacyParameters'> */
trait PickImpllegacyParameters extends StObject {
  
  var legacyParameters: String
}
object PickImpllegacyParameters {
  
  inline def apply(legacyParameters: String): PickImpllegacyParameters = {
    val __obj = js.Dynamic.literal(legacyParameters = legacyParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllegacyParameters]
  }
  
  extension [Self <: PickImpllegacyParameters](x: Self) {
    
    inline def setLegacyParameters(value: String): Self = StObject.set(x, "legacyParameters", value.asInstanceOf[js.Any])
  }
}
