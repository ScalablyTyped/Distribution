package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginHook[D /* <: js.Object */] extends StObject {
  
  def apply(hooks: Hooks[D]): Unit = js.native
  
  var pluginName: js.UndefOr[String] = js.native
}
