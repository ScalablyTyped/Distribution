package typings.reactNavigationCore

import typings.reactNavigationCore.anon.Name
import typings.reactNavigationCore.anon.PartialStateNavigationSta
import typings.reactNavigationCore.reactNavigationCoreStrings.NAVIGATE
import typings.reactNavigationCore.typesMod.PathConfigMap
import typings.reactNavigationRouters.commonActionsMod.Action
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getActionFromStateMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/getActionFromState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  inline def default(state: PartialStateNavigationSta, options: Options): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  
  trait NavigateAction[State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    var payload: Name[State]
    
    var `type`: NAVIGATE
  }
  object NavigateAction {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */](payload: Name[State]): NavigateAction[State] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NAVIGATE")
      __obj.asInstanceOf[NavigateAction[State]]
    }
    
    extension [Self <: NavigateAction[?], State /* <: NavigationState[ParamListBase] */](x: Self & NavigateAction[State]) {
      
      inline def setPayload(value: Name[State]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: NAVIGATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var initialRouteName: js.UndefOr[String] = js.undefined
    
    var screens: PathConfigMap
  }
  object Options {
    
    inline def apply(screens: PathConfigMap): Options = {
      val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      inline def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    }
  }
}
