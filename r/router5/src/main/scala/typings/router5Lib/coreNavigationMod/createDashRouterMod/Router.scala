package typings
package router5Lib.coreNavigationMod.createDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  def cancel(): Router = js.native
  def forward(fromRoute: java.lang.String, toRoute: java.lang.String): Router = js.native
  def navigate(routeName: java.lang.String): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(routeName: java.lang.String, done: router5Lib.router5Mod.DoneFn): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(routeName: java.lang.String, routeParams: router5Lib.createDashRouterMod.Params): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(
    routeName: java.lang.String,
    routeParams: router5Lib.createDashRouterMod.Params,
    done: router5Lib.router5Mod.DoneFn
  ): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(
    routeName: java.lang.String,
    routeParams: router5Lib.createDashRouterMod.Params,
    options: router5Lib.coreNavigationMod.Options
  ): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigate(
    routeName: java.lang.String,
    routeParams: router5Lib.createDashRouterMod.Params,
    options: router5Lib.coreNavigationMod.Options,
    done: router5Lib.router5Mod.DoneFn
  ): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigateToDefault(): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigateToDefault(done: router5Lib.router5Mod.DoneFn): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigateToDefault(opts: router5Lib.coreNavigationMod.Options): router5Lib.coreNavigationMod.CancelFn = js.native
  def navigateToDefault(opts: router5Lib.coreNavigationMod.Options, done: router5Lib.router5Mod.DoneFn): router5Lib.coreNavigationMod.CancelFn = js.native
}

