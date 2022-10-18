package typings.router5

import typings.router5.distTypesBaseMod.DoneFn
import typings.router5.distTypesBaseMod.NavigationOptions
import typings.router5.distTypesBaseMod.State
import typings.router5.distTypesRouterMod.DefaultDependencies
import typings.router5.distTypesRouterMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransitionMod {
  
  @JSImport("router5/dist/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: Null,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any], toState.asInstanceOf[js.Any], fromState.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: State,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any], toState.asInstanceOf[js.Any], fromState.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
