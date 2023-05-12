package typings.reactNavigationCore

import typings.reactNavigationCore.anon.Descriptors
import typings.reactNavigationCore.anon.NavigationOptions
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
    options: (DefaultNavigatorOptions[ParamListBase, State, ScreenOptions, EventMap]) & NavigationBuilderOptions[ScreenOptions] & RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createRouter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  
  trait NavigationBuilderOptions[ScreenOptions /* <: js.Object */] extends StObject {
    
    /**
      * Default options specified by the navigator.
      * It receives the custom options in the arguments if a function is specified.
      */
    var defaultScreenOptions: js.UndefOr[
        ScreenOptions | (js.Function1[/* props */ NavigationOptions[ScreenOptions], ScreenOptions])
      ] = js.undefined
  }
  object NavigationBuilderOptions {
    
    inline def apply[ScreenOptions /* <: js.Object */](): NavigationBuilderOptions[ScreenOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationBuilderOptions[ScreenOptions]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationBuilderOptions[?], ScreenOptions /* <: js.Object */] (val x: Self & NavigationBuilderOptions[ScreenOptions]) extends AnyVal {
      
      inline def setDefaultScreenOptions(value: ScreenOptions | (js.Function1[/* props */ NavigationOptions[ScreenOptions], ScreenOptions])): Self = StObject.set(x, "defaultScreenOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultScreenOptionsFunction1(value: /* props */ NavigationOptions[ScreenOptions] => ScreenOptions): Self = StObject.set(x, "defaultScreenOptions", js.Any.fromFunction1(value))
      
      inline def setDefaultScreenOptionsUndefined: Self = StObject.set(x, "defaultScreenOptions", js.undefined)
    }
  }
}
