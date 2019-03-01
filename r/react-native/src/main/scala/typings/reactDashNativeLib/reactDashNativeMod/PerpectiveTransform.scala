package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpectiveTransform extends js.Object {
  var perspective: scala.Double
}

object PerpectiveTransform {
  @scala.inline
  def apply(perspective: scala.Double): PerpectiveTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("perspective")(perspective)
    __obj.asInstanceOf[PerpectiveTransform]
  }
}

