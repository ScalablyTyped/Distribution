package typings
package router5Lib.coreRouteDashLifecycleMod.createDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  def canActivate(
    name: java.lang.String,
    canActivateHandler: router5Lib.coreRouteDashLifecycleMod.ActivationFnFactory
  ): Router = js.native
  def canActivate(name: java.lang.String, canActivateHandler: scala.Boolean): Router = js.native
  def canDeactivate(
    name: java.lang.String,
    canDeactivateHandler: router5Lib.coreRouteDashLifecycleMod.ActivationFnFactory
  ): Router = js.native
  def canDeactivate(name: java.lang.String, canDeactivateHandler: scala.Boolean): Router = js.native
  def clearCanDeactivate(name: java.lang.String): Router = js.native
}

