package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientHeight extends js.Object {
  var clientHeight: Double
  var scrollHeight: Double
  var scrollTop: Double
}

object AnonClientHeight {
  @scala.inline
  def apply(clientHeight: Double, scrollHeight: Double, scrollTop: Double): AnonClientHeight = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientHeight]
  }
}

