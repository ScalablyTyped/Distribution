package typings.reactDashSvg.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var hasError: Boolean
  var isLoading: Boolean
}

object State {
  @scala.inline
  def apply(hasError: Boolean, isLoading: Boolean): State = {
    val __obj = js.Dynamic.literal(hasError = hasError, isLoading = isLoading)
  
    __obj.asInstanceOf[State]
  }
}

