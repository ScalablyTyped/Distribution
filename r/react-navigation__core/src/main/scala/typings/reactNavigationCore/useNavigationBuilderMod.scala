package typings.reactNavigationCore

import typings.reactNavigationCore.anon.Descriptors
import typings.reactNavigationCore.typesMod.DefaultNavigatorOptions
import typings.reactNavigationRouters.typesMod.DefaultRouterOptions
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.RouterFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationBuilderMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, js.Any] */](
    createRouter: RouterFactory[State, js.Any, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) & RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createRouter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
}
