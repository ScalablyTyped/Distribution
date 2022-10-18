package typings.reactNavigationNative.anon

import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var path: String
  
  var state: NavigationState[ParamListBase]
}
object State {
  
  inline def apply(path: String, state: NavigationState[ParamListBase]): State = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setState(value: NavigationState[ParamListBase]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
