package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-table", "ensurePluginOrder")
@js.native
object ensurePluginOrder extends js.Object {
  def apply[D /* <: js.Object */](
    plugins: js.Array[PluginHook[D]],
    befores: js.Array[String],
    pluginName: String,
    afters: js.Array[String]
  ): Unit = js.native
}

