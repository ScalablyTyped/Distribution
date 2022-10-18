package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStateState[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var data: StateState[State]
}
object DataStateState {
  
  inline def apply[State /* <: NavigationState[ParamListBase] */](data: StateState[State]): DataStateState[State] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStateState[State]]
  }
  
  extension [Self <: DataStateState[?], State /* <: NavigationState[ParamListBase] */](x: Self & DataStateState[State]) {
    
    inline def setData(value: StateState[State]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
