package typings.reactNavigationCore

import typings.react.mod.ComponentType
import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.TypedNavigator
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createNavigatorFactoryMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/createNavigatorFactory", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ComponentType[_] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = js.native
}
