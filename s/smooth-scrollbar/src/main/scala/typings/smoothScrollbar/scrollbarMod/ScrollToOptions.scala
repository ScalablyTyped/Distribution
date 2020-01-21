package typings.smoothScrollbar.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions extends js.Object {
  def callback(): Unit
  def easing(percent: Double): Double
}

object ScrollToOptions {
  @scala.inline
  def apply(callback: () => Unit, easing: Double => Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), easing = js.Any.fromFunction1(easing))
  
    __obj.asInstanceOf[ScrollToOptions]
  }
}

