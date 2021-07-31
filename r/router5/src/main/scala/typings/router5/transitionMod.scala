package typings.router5

import typings.router5.baseMod.DoneFn
import typings.router5.baseMod.NavigationOptions
import typings.router5.baseMod.State
import typings.router5.routerMod.DefaultDependencies
import typings.router5.routerMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionMod {
  
  @JSImport("router5/dist/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: Null,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any], toState.asInstanceOf[js.Any], fromState.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: State,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any], toState.asInstanceOf[js.Any], fromState.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
