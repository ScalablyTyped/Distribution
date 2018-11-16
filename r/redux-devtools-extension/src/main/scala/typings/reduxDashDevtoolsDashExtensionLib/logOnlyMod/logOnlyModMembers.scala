package typings
package reduxDashDevtoolsDashExtensionLib.logOnlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension/logOnly", JSImport.Namespace)
@js.native
object logOnlyModMembers extends js.Object {
  def composeWithDevTools(funcs: js.Function*): reduxLib.reduxMod.StoreEnhancer[_, js.Object] = js.native
  def composeWithDevTools(options: reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionMod.EnhancerOptions): js.Function1[/* repeated */js.Function, js.Function1[/* repeated */_, _]] = js.native
  def devToolsEnhancer(options: reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionMod.EnhancerOptions): reduxLib.reduxMod.StoreEnhancer[_, js.Object] = js.native
}

