package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator[TState] extends StObject {
  
  var router: Router[TState] = js.native
}
object Navigator {
  
  @scala.inline
  def apply[TState](router: Router[TState]): Navigator[TState] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator[TState]]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator[_], TState] (val x: Self with Navigator[TState]) extends AnyVal {
    
    @scala.inline
    def setRouter(value: Router[TState]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
