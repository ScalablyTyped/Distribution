package typings.smoothDashScrollbar.pluginMod

import typings.smoothDashScrollbar.TypeofClassScrollbarPlugin
import typings.smoothDashScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val globalPlugins: PluginMap = js.native
  def addPlugins(Plugins: TypeofClassScrollbarPlugin*): Unit = js.native
  def initPlugins(scrollbar: Scrollbar, options: js.Any): js.Array[ScrollbarPlugin] = js.native
}

