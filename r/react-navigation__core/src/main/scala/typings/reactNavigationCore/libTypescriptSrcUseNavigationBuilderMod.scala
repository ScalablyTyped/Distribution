package typings.reactNavigationCore

import typings.reactNavigationCore.anon.Descriptors
import typings.reactNavigationCore.libTypescriptSrcTypesMod.DefaultNavigatorOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.DefaultRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.RouterFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseNavigationBuilderMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, Any] */](
    createRouter: RouterFactory[State, Any, RouterOptions],
    options: (DefaultNavigatorOptions[ParamListBase, State, ScreenOptions, EventMap]) & RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createRouter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
}
