package typings.reactVirtualized.esMultiGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiGridState extends js.Object {
  var scrollLeft: Double
  var scrollTop: Double
}

object MultiGridState {
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): MultiGridState = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiGridState]
  }
}

