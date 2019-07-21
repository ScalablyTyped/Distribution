package typings
package reduxDashDevtoolsLib.reduxDashDevtoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDevTools(el: reactLib.reactMod.ReactElement): IDevTools = js.native
  def persistState(debugSessionKey: java.lang.String): reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object] = js.native
}

