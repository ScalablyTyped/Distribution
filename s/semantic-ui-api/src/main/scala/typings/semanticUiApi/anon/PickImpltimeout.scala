package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'timeout'> */
trait PickImpltimeout extends StObject {
  
  var timeout: String
}
object PickImpltimeout {
  
  inline def apply(timeout: String): PickImpltimeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltimeout]
  }
  
  extension [Self <: PickImpltimeout](x: Self) {
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
