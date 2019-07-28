package typings.remoteDashReduxDashDevtools.remoteDashReduxDashDevtoolsMod

import typings.redux.reduxMod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remote-redux-devtools", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def composeWithDevTools(): js.Function1[
    /* repeated */ StoreEnhancer[js.Object, js.Object], 
    StoreEnhancer[js.Object, js.Object]
  ] = js.native
  def composeWithDevTools(funcs: (StoreEnhancer[js.Object, js.Object])*): StoreEnhancer[js.Object, js.Object] = js.native
  def composeWithDevTools(options: RemoteReduxDevToolsOptions): js.Function1[
    /* repeated */ StoreEnhancer[js.Object, js.Object], 
    StoreEnhancer[js.Object, js.Object]
  ] = js.native
}

