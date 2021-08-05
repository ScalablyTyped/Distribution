package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'expires'> */
trait PickImplexpires extends StObject {
  
  var expires: Double
}
object PickImplexpires {
  
  inline def apply(expires: Double): PickImplexpires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexpires]
  }
  
  extension [Self <: PickImplexpires](x: Self) {
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
  }
}
