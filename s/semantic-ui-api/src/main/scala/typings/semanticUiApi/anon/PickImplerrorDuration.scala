package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'errorDuration'> */
trait PickImplerrorDuration extends StObject {
  
  var errorDuration: `true` | Double
}
object PickImplerrorDuration {
  
  inline def apply(errorDuration: `true` | Double): PickImplerrorDuration = {
    val __obj = js.Dynamic.literal(errorDuration = errorDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorDuration]
  }
  
  extension [Self <: PickImplerrorDuration](x: Self) {
    
    inline def setErrorDuration(value: `true` | Double): Self = StObject.set(x, "errorDuration", value.asInstanceOf[js.Any])
  }
}
