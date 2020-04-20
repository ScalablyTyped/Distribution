package typings.reactVirtualized.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollEventData extends js.Object {
  var clientHeight: Double
  var scrollHeight: Double
  var scrollTop: Double
}

object ScrollEventData {
  @scala.inline
  def apply(clientHeight: Double, scrollHeight: Double, scrollTop: Double): ScrollEventData = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollEventData]
  }
}

