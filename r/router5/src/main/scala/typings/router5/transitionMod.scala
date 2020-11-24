package typings.router5

import typings.router5.baseMod.DoneFn
import typings.router5.baseMod.NavigationOptions
import typings.router5.baseMod.State
import typings.router5.routerMod.DefaultDependencies
import typings.router5.routerMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("router5/dist/transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  
  def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: Null,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = js.native
  def default(
    router: Router[DefaultDependencies],
    toState: State,
    fromState: State,
    opts: NavigationOptions,
    callback: DoneFn
  ): js.Function0[Unit] = js.native
}
