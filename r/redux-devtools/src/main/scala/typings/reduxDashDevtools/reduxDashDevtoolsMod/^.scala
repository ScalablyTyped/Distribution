package typings.reduxDashDevtools.reduxDashDevtoolsMod

import typings.react.reactMod.ReactElement
import typings.redux.reduxMod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDevTools(el: ReactElement): IDevTools = js.native
  def persistState(debugSessionKey: String): StoreEnhancer[js.Object, js.Object] = js.native
}

