package typings.reduxDevtoolsExtension.mod

import typings.redux.mod.StoreEnhancer
import typings.reduxDevtoolsExtension.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-devtools-extension", "composeWithDevTools")
@js.native
object composeWithDevTools extends js.Object {
  def apply(options: EnhancerOptions): FnCall = js.native
  def apply[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
}

