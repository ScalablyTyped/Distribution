package typings.reactNavigationCore

import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.RouteConfig
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/Screen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](_underscore: RouteConfig[ParamList, RouteName, State, ScreenOptions, EventMap]): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Null]
}
