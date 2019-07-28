package typings.reactDashConfirm.reactDashConfirmMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-confirm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def confirmable[P](component: ComponentType[ReactConfirmProps with P]): ComponentType[P] = js.native
  def createConfirmation(component: ComponentType[_]): js.Function1[/* props */ js.Any, js.Promise[String]] = js.native
  def createConfirmation(component: ComponentType[_], unmountDelay: Double): js.Function1[/* props */ js.Any, js.Promise[String]] = js.native
}

