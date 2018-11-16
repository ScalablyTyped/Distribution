package typings
package router5Lib.coreRouterDashLifecycleMod.createDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  def isStarted(): scala.Boolean = js.native
  def start(): Router = js.native
  def start(done: router5Lib.router5Mod.DoneFn): Router = js.native
  def start(startPathOrState: java.lang.String): Router = js.native
  def start(startPathOrState: java.lang.String, done: router5Lib.router5Mod.DoneFn): Router = js.native
  def start(startPathOrState: router5Lib.createDashRouterMod.State): Router = js.native
  def start(startPathOrState: router5Lib.createDashRouterMod.State, done: router5Lib.router5Mod.DoneFn): Router = js.native
  def stop(): Router = js.native
}

