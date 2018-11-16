package typings
package reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension", JSImport.Namespace)
@js.native
object reduxDashDevtoolsDashExtensionModMembers extends js.Object {
  def composeWithDevTools(funcs: js.Function*): reduxLib.reduxMod.StoreEnhancer[_, js.Object] = js.native
  def composeWithDevTools(options: EnhancerOptions): js.Function1[/* repeated */js.Function, js.Function1[/* repeated */_, _]] = js.native
  def devToolsEnhancer(options: EnhancerOptions): reduxLib.reduxMod.StoreEnhancer[_, js.Object] = js.native
}

