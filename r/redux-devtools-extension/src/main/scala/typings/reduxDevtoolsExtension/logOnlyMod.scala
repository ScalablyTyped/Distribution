package typings.reduxDevtoolsExtension

import typings.redux.mod.StoreEnhancer
import typings.reduxDevtoolsExtension.anon.FnCall
import typings.reduxDevtoolsExtension.mod.EnhancerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logOnlyMod {
  
  @JSImport("redux-devtools-extension/logOnly", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def composeWithDevTools(options: EnhancerOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("composeWithDevTools")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  @scala.inline
  def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeWithDevTools")(funcs.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[StoreExt, js.Object]]
  
  @scala.inline
  def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[js.Any, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("devToolsEnhancer")(options.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[js.Any, js.Object]]
}
