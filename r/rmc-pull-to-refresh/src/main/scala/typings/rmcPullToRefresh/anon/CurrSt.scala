package typings.rmcPullToRefresh.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrSt extends js.Object {
  var currSt: String
  var dragOnEdge: Boolean
}

object CurrSt {
  @scala.inline
  def apply(currSt: String, dragOnEdge: Boolean): CurrSt = {
    val __obj = js.Dynamic.literal(currSt = currSt.asInstanceOf[js.Any], dragOnEdge = dragOnEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrSt]
  }
}

