package typings
package smoothDashScrollbarLib.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val globalPlugins: PluginMap = js.native
  def addPlugins(Plugins: smoothDashScrollbarLib.TypeofClassScrollbarPlugin*): scala.Unit = js.native
  def initPlugins(scrollbar: smoothDashScrollbarLib.scrollbarMod.Scrollbar, options: js.Any): js.Array[ScrollbarPlugin] = js.native
}

