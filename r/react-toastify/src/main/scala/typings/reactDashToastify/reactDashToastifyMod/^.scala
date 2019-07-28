package typings.reactDashToastify.reactDashToastifyMod

import typings.react.reactMod.StatelessComponent
import typings.reactDashTransitionDashGroup.reactDashTransitionDashGroupMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toastify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Bounce: Transition = js.native
  val Flip: Transition = js.native
  val Slide: Transition = js.native
  val ToastContainer: StatelessComponent[ToastContainerProps] = js.native
  val Zoom: Transition = js.native
  val toast: Toast = js.native
  def cssTransition(options: CssTransitionOptions): Transition = js.native
}

