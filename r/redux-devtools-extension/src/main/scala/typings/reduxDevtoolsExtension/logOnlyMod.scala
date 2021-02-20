package typings.reduxDevtoolsExtension

import typings.redux.mod.StoreEnhancer
import typings.reduxDevtoolsExtension.anon.FnCall
import typings.reduxDevtoolsExtension.mod.EnhancerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logOnlyMod {
  
  @JSImport("redux-devtools-extension/logOnly", "composeWithDevTools")
  @js.native
  def composeWithDevTools(options: EnhancerOptions): FnCall = js.native
  @JSImport("redux-devtools-extension/logOnly", "composeWithDevTools")
  @js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
  
  @JSImport("redux-devtools-extension/logOnly", "devToolsEnhancer")
  @js.native
  def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[_, js.Object] = js.native
}
