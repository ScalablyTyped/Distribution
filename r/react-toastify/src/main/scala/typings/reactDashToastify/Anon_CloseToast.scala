package typings.reactDashToastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseToast extends js.Object {
  def closeToast(): Unit
}

object Anon_CloseToast {
  @scala.inline
  def apply(closeToast: () => Unit): Anon_CloseToast = {
    val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction0(closeToast))
  
    __obj.asInstanceOf[Anon_CloseToast]
  }
}

