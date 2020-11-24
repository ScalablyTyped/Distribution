package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginHook[D /* <: js.Object */] extends js.Object {
  
  def apply(hooks: Hooks[D]): Unit = js.native
  
  var pluginName: js.UndefOr[String] = js.native
}
