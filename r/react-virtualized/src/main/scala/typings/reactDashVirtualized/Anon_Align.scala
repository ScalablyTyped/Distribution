package typings.reactDashVirtualized

import typings.reactDashVirtualized.reactDashVirtualizedStrings.auto
import typings.reactDashVirtualized.reactDashVirtualizedStrings.center
import typings.reactDashVirtualized.reactDashVirtualizedStrings.end
import typings.reactDashVirtualized.reactDashVirtualizedStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: auto | start | end | center
  var cellIndex: Double
  var height: Double
  var scrollLeft: Double
  var scrollTop: Double
  var width: Double
}

object Anon_Align {
  @scala.inline
  def apply(
    align: auto | start | end | center,
    cellIndex: Double,
    height: Double,
    scrollLeft: Double,
    scrollTop: Double,
    width: Double
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cellIndex = cellIndex, height = height, scrollLeft = scrollLeft, scrollTop = scrollTop, width = width)
  
    __obj.asInstanceOf[Anon_Align]
  }
}

