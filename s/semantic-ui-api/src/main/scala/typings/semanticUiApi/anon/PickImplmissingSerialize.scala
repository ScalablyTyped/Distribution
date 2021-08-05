package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'missingSerialize'> */
trait PickImplmissingSerialize extends StObject {
  
  var missingSerialize: String
}
object PickImplmissingSerialize {
  
  inline def apply(missingSerialize: String): PickImplmissingSerialize = {
    val __obj = js.Dynamic.literal(missingSerialize = missingSerialize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingSerialize]
  }
  
  extension [Self <: PickImplmissingSerialize](x: Self) {
    
    inline def setMissingSerialize(value: String): Self = StObject.set(x, "missingSerialize", value.asInstanceOf[js.Any])
  }
}
