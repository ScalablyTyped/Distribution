package typings.reduxDashDevtoolsDashExtension.reduxDashDevtoolsDashExtensionMod

import typings.redux.reduxMod.StoreEnhancer
import typings.reduxDashDevtoolsDashExtension.Fn_A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def composeWithDevTools(options: EnhancerOptions): Fn_A = js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
  def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[_, js.Object] = js.native
}

