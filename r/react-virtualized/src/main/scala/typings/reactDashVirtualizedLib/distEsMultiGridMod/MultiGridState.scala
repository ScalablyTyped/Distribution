package typings
package reactDashVirtualizedLib.distEsMultiGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiGridState extends js.Object {
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
}

object MultiGridState {
  @scala.inline
  def apply(scrollLeft: scala.Double, scrollTop: scala.Double): MultiGridState = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[MultiGridState]
  }
}

