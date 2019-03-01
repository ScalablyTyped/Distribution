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
  def apply(callback: js.Function1[Scrollbar, scala.Unit], easing: js.Function1[scala.Double, scala.Double]): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[ScrollToOptions]
  }
}

