package typings.reactNavigationCore

import typings.react.mod.ComponentType
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventMapBase
import typings.reactNavigationCore.libTypescriptSrcTypesMod.TypedNavigator
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcCreateNavigatorFactoryMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/createNavigatorFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ComponentType[Any] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[ParamListBase, State, ScreenOptions, EventMap, NavigatorComponent]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Navigator.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    TypedNavigator[ParamListBase, State, ScreenOptions, EventMap, NavigatorComponent]
  ]]
}
