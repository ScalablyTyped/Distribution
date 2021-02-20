package typings.reactNavigationCore

import typings.reactNavigationCore.anon.NavigationRoute
import typings.reactNavigationCore.navigationBuilderContextMod.AddKeyedListener
import typings.reactNavigationCore.navigationBuilderContextMod.AddListener
import typings.reactNavigationCore.typesMod.Descriptor
import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationCore.typesMod.RouteConfig
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDescriptorsMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useDescriptors", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
    hasStateScreensNavigationScreenOptionsOnActionGetStateSetStateAddListenerAddKeyedListenerOnRouteFocusRouterEmitter: Options[State, ScreenOptions, EventMap]
  ): Record[
    String, 
    Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
  ] = js.native
  
  @js.native
  trait Options[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    var addKeyedListener: AddKeyedListener = js.native
    
    var addListener: AddListener = js.native
    
    var emitter: NavigationEventEmitter[_] = js.native
    
    def getState(): State = js.native
    
    var navigation: NavigationHelpers[ParamListBase, js.Object] = js.native
    
    def onAction(action: NavigationAction): Boolean = js.native
    def onAction(action: NavigationAction, visitedNavigators: Set[String]): Boolean = js.native
    
    def onRouteFocus(key: String): Unit = js.native
    
    var router: Router[State, NavigationAction] = js.native
    
    var screenOptions: js.UndefOr[ScreenOptions | (js.Function1[/* props */ NavigationRoute, ScreenOptions])] = js.native
    
    var screens: Record[String, RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]] = js.native
    
    def setState(state: State): Unit = js.native
    
    var state: State = js.native
  }
}
