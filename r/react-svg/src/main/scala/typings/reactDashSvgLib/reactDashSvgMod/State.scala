package typings
package reactDashSvgLib.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var hasError: scala.Boolean
  var isLoading: scala.Boolean
}

object State {
  @scala.inline
  def apply(hasError: scala.Boolean, isLoading: scala.Boolean): State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasError")(hasError)
    __obj.updateDynamic("isLoading")(isLoading)
    __obj.asInstanceOf[State]
  }
}

