package typings.reactDashVirtualized.distEsScrollSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollParams extends js.Object {
  var clientHeight: Double
  var clientWidth: Double
  var scrollHeight: Double
  var scrollLeft: Double
  var scrollTop: Double
  var scrollWidth: Double
}

object OnScrollParams {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    scrollHeight: Double,
    scrollLeft: Double,
    scrollTop: Double,
    scrollWidth: Double
  ): OnScrollParams = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight, clientWidth = clientWidth, scrollHeight = scrollHeight, scrollLeft = scrollLeft, scrollTop = scrollTop, scrollWidth = scrollWidth)
  
    __obj.asInstanceOf[OnScrollParams]
  }
}

