package typings.semanticUiNag.anon

import typings.semanticUiNag.SemanticUI.Nag.ErrorSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'error'> */
trait PickImplerror extends StObject {
  
  var error: ErrorSettings
}
object PickImplerror {
  
  inline def apply(error: ErrorSettings): PickImplerror = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerror]
  }
  
  extension [Self <: PickImplerror](x: Self) {
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
