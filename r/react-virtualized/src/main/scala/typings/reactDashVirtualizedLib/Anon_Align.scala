package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto | reactDashVirtualizedLib.reactDashVirtualizedLibStrings.start | reactDashVirtualizedLib.reactDashVirtualizedLibStrings.end | reactDashVirtualizedLib.reactDashVirtualizedLibStrings.center
  var cellIndex: scala.Double
  var height: scala.Double
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
  var width: scala.Double
}

object Anon_Align {
  @scala.inline
  def apply(
    align: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto | reactDashVirtualizedLib.reactDashVirtualizedLibStrings.start | reactDashVirtualizedLib.reactDashVirtualizedLibStrings.end | reactDashVirtualizedLib.reactDashVirtualizedLibStrings.center,
    cellIndex: scala.Double,
    height: scala.Double,
    scrollLeft: scala.Double,
    scrollTop: scala.Double,
    width: scala.Double
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cellIndex = cellIndex, height = height, scrollLeft = scrollLeft, scrollTop = scrollTop, width = width)
  
    __obj.asInstanceOf[Anon_Align]
  }
}

