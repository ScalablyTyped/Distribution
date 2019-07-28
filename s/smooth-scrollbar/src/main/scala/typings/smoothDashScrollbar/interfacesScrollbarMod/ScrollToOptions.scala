package typings.smoothDashScrollbar.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions extends js.Object {
  def callback(`this`: Scrollbar): Unit
  def easing(percent: Double): Double
}

object ScrollToOptions {
  @scala.inline
  def apply(callback: Scrollbar => Unit, easing: Double => Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), easing = js.Any.fromFunction1(easing))
  
    __obj.asInstanceOf[ScrollToOptions]
  }
}

