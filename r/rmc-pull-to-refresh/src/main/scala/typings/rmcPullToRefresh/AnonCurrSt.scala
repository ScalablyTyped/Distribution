package typings.rmcPullToRefresh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrSt extends js.Object {
  var currSt: String
  var dragOnEdge: Boolean
}

object AnonCurrSt {
  @scala.inline
  def apply(currSt: String, dragOnEdge: Boolean): AnonCurrSt = {
    val __obj = js.Dynamic.literal(currSt = currSt.asInstanceOf[js.Any], dragOnEdge = dragOnEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrSt]
  }
}

