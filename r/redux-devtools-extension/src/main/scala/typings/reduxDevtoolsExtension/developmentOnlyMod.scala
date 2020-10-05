package typings.reduxDevtoolsExtension

import typings.redux.mod.StoreEnhancer
import typings.reduxDevtoolsExtension.anon.FnCall
import typings.reduxDevtoolsExtension.mod.EnhancerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-devtools-extension/developmentOnly", JSImport.Namespace)
@js.native
object developmentOnlyMod extends js.Object {
  def composeWithDevTools(options: EnhancerOptions): FnCall = js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
  def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[_, js.Object] = js.native
}

