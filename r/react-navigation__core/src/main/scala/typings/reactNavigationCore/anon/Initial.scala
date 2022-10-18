package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initial[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var initial: js.UndefOr[scala.Nothing] = js.undefined
  
  var params: js.UndefOr[scala.Nothing] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var screen: js.UndefOr[scala.Nothing] = js.undefined
  
  var state: js.UndefOr[PartialState[State] | State] = js.undefined
}
object Initial {
  
  inline def apply[State /* <: NavigationState[ParamListBase] */](): Initial[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initial[State]]
  }
  
  extension [Self <: Initial[?], State /* <: NavigationState[ParamListBase] */](x: Self & Initial[State]) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setState(value: PartialState[State] | State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
