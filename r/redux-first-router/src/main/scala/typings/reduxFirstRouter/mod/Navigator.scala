package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator[TState] extends StObject {
  
  var router: Router[TState]
}
object Navigator {
  
  inline def apply[TState](router: Router[TState]): Navigator[TState] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator[TState]]
  }
  
  extension [Self <: Navigator[?], TState](x: Self & Navigator[TState]) {
    
    inline def setRouter(value: Router[TState]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
