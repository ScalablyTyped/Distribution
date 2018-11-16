package typings
package smoothDashScrollbarLib.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/plugin", JSImport.Namespace)
@js.native
object pluginModMembers extends js.Object {
  val globalPlugins: PluginMap = js.native
  def addPlugins(
    Plugins: (ScalablyTyped.runtime.Instantiable2[
      /* scrollbar */ smoothDashScrollbarLib.scrollbarMod.Scrollbar, 
      /* options */ js.UndefOr[/* options */ js.Any], 
      ScrollbarPlugin
    ])*
  ): scala.Unit = js.native
  def initPlugins(scrollbar: smoothDashScrollbarLib.scrollbarMod.Scrollbar, options: js.Any): coreDashJsLib.Array[ScrollbarPlugin] = js.native
}

