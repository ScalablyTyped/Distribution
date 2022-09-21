package typings.reactNavigationNative

import typings.reactNavigationNative.anon.BackIndex
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMemoryHistoryMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/createMemoryHistory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): BackIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[BackIndex]
  
  trait HistoryRecord extends StObject {
    
    var id: String
    
    var path: String
    
    var state: NavigationState[ParamListBase]
  }
  object HistoryRecord {
    
    inline def apply(id: String, path: String, state: NavigationState[ParamListBase]): HistoryRecord = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryRecord]
    }
    
    extension [Self <: HistoryRecord](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setState(value: NavigationState[ParamListBase]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
