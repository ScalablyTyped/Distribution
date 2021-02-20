package typings.reachRouter.mod

import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationContext extends StObject {
  
  var location: WindowLocation[LocationState] = js.native
  
  var navigate: NavigateFn = js.native
}
object LocationContext {
  
  @scala.inline
  def apply(location: WindowLocation[LocationState], navigate: NavigateFn): LocationContext = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationContext]
  }
  
  @scala.inline
  implicit class LocationContextMutableBuilder[Self <: LocationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
  }
}
