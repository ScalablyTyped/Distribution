package typings
package router5Lib.router5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5", JSImport.Namespace)
@js.native
object router5ModMembers extends js.Object {
  val constants: router5Lib.constantsMod.Constants = js.native
  val errorCodes: router5Lib.constantsMod.ErrorCodes = js.native
  val loggerPlugin: router5Lib.corePluginsMod.PluginFactory = js.native
  def createRouter(routers: js.Array[router5Lib.createDashRouterMod.Route]): router5Lib.createDashRouterMod.Router = js.native
  def createRouter(
    routers: js.Array[router5Lib.createDashRouterMod.Route],
    options: stdLib.Partial[router5Lib.createDashRouterMod.Options]
  ): router5Lib.createDashRouterMod.Router = js.native
  def createRouter(
    routers: js.Array[router5Lib.createDashRouterMod.Route],
    options: stdLib.Partial[router5Lib.createDashRouterMod.Options],
    dependencies: router5Lib.createDashRouterMod.Dependencies
  ): router5Lib.createDashRouterMod.Router = js.native
  def default(routers: js.Array[router5Lib.createDashRouterMod.Route]): router5Lib.createDashRouterMod.Router = js.native
  def default(
    routers: js.Array[router5Lib.createDashRouterMod.Route],
    options: stdLib.Partial[router5Lib.createDashRouterMod.Options]
  ): router5Lib.createDashRouterMod.Router = js.native
  def default(
    routers: js.Array[router5Lib.createDashRouterMod.Route],
    options: stdLib.Partial[router5Lib.createDashRouterMod.Options],
    dependencies: router5Lib.createDashRouterMod.Dependencies
  ): router5Lib.createDashRouterMod.Router = js.native
}

