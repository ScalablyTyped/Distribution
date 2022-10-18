package typings.reactNavigationCore

import typings.reactNavigationCore.anon.OmitPartialStateNavigatio
import typings.reactNavigationCore.libTypescriptSrcTypesMod.PathConfigMap
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcGetPathFromStateMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/getPathFromState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: js.Object */](state: State): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default[ParamList /* <: js.Object */](state: State, options: Options[ParamList]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options[ParamList] extends StObject {
    
    var initialRouteName: js.UndefOr[String] = js.undefined
    
    var screens: PathConfigMap[ParamList]
  }
  object Options {
    
    inline def apply[ParamList](screens: PathConfigMap[ParamList]): Options[ParamList] = {
      val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[ParamList]]
    }
    
    extension [Self <: Options[?], ParamList](x: Self & Options[ParamList]) {
      
      inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      inline def setScreens(value: PathConfigMap[ParamList]): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    }
  }
  
  type State = NavigationState[ParamListBase] | OmitPartialStateNavigatio
}
