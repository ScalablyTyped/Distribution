package typings.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientHeight extends js.Object {
  var clientHeight: Double
  var scrollHeight: Double
  var scrollTop: Double
}

object ClientHeight {
  @scala.inline
  def apply(clientHeight: Double, scrollHeight: Double, scrollTop: Double): ClientHeight = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientHeight]
  }
}

