package typings
package smoothDashScrollbarLib.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions extends js.Object {
  def callback(`this`: Scrollbar): scala.Unit
  def easing(percent: scala.Double): scala.Double
}

object ScrollToOptions {
  @scala.inline
  def apply(callback: Scrollbar => scala.Unit, easing: scala.Double => scala.Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), easing = js.Any.fromFunction1(easing))
  
    __obj.asInstanceOf[ScrollToOptions]
  }
}

