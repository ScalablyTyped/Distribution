package typings
package reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def composeWithDevTools(options: EnhancerOptions): reduxDashDevtoolsDashExtensionLib.Anon_A = js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (reduxLib.reduxMod.StoreEnhancer[StoreExt, js.Object])*): reduxLib.reduxMod.StoreEnhancer[StoreExt, js.Object] = js.native
  def devToolsEnhancer(options: EnhancerOptions): reduxLib.reduxMod.StoreEnhancer[_, js.Object] = js.native
}

