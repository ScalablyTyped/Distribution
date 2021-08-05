package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'interruptRequests'> */
trait PickImplinterruptRequests extends StObject {
  
  var interruptRequests: Boolean
}
object PickImplinterruptRequests {
  
  inline def apply(interruptRequests: Boolean): PickImplinterruptRequests = {
    val __obj = js.Dynamic.literal(interruptRequests = interruptRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinterruptRequests]
  }
  
  extension [Self <: PickImplinterruptRequests](x: Self) {
    
    inline def setInterruptRequests(value: Boolean): Self = StObject.set(x, "interruptRequests", value.asInstanceOf[js.Any])
  }
}
