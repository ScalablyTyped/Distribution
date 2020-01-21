package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginHook[D /* <: js.Object */] extends js.Object {
  var pluginName: js.UndefOr[String] = js.native
  def apply(hooks: Hooks[D]): Unit = js.native
}

