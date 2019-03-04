package typings
package reactDashVirtualizedLib.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexRange extends js.Object {
  var startIndex: scala.Double
  var stopIndex: scala.Double
}

object IndexRange {
  @scala.inline
  def apply(startIndex: scala.Double, stopIndex: scala.Double): IndexRange = {
    val __obj = js.Dynamic.literal(startIndex = startIndex, stopIndex = stopIndex)
  
    __obj.asInstanceOf[IndexRange]
  }
}

