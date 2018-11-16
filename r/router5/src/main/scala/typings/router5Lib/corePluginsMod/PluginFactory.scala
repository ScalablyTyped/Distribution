package typings
package router5Lib.corePluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginFactory extends js.Object {
  var pluginName: java.lang.String = js.native
  def apply(router: router5Lib.corePluginsMod.createDashRouterMod.Router): Plugin = js.native
  def apply(
    router: router5Lib.corePluginsMod.createDashRouterMod.Router,
    dependencies: router5Lib.createDashRouterMod.Dependencies
  ): Plugin = js.native
}

