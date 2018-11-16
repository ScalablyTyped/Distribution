package typings
package router5Lib.corePluginsMod.createDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Router extends js.Object {
  def hasPlugin(pluginName: java.lang.String): scala.Boolean
  def usePlugin(plugins: router5Lib.corePluginsMod.PluginFactory*): Router
}

