package typings
package reactDashConfirmLib.reactDashConfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-confirm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def confirmable[P](
    component: reactLib.reactMod.ReactNs.ComponentType[reactDashConfirmLib.reactDashConfirmMod.ReactConfirmProps with P]
  ): reactLib.reactMod.ReactNs.ComponentType[P] = js.native
  def createConfirmation(component: reactLib.reactMod.ReactNs.ComponentType[_]): js.Function1[/* props */ js.Any, js.Promise[java.lang.String]] = js.native
  def createConfirmation(component: reactLib.reactMod.ReactNs.ComponentType[_], unmountDelay: scala.Double): js.Function1[/* props */ js.Any, js.Promise[java.lang.String]] = js.native
}

