package typings.reactDashDataDashGrid.AdazzleReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollState extends js.Object {
  var colOverscanEndIdx: Double
  var colOverscanStartIdx: Double
  var colVisibleEndIdx: Double
  var colVisibleStartIdx: Double
  var height: Double
  var isScrolling: Boolean
  var lastFrozenColumnIndex: Double
  var rowOverscanEndIdx: Double
  var rowOverscanStartIdx: Double
  var rowVisibleEndIdx: Double
  var rowVisibleStartIdx: Double
  var scrollDirection: SCROLL_DIRECTION
  var scrollLeft: Double
  var scrollTop: Double
}

object ScrollState {
  @scala.inline
  def apply(
    colOverscanEndIdx: Double,
    colOverscanStartIdx: Double,
    colVisibleEndIdx: Double,
    colVisibleStartIdx: Double,
    height: Double,
    isScrolling: Boolean,
    lastFrozenColumnIndex: Double,
    rowOverscanEndIdx: Double,
    rowOverscanStartIdx: Double,
    rowVisibleEndIdx: Double,
    rowVisibleStartIdx: Double,
    scrollDirection: SCROLL_DIRECTION,
    scrollLeft: Double,
    scrollTop: Double
  ): ScrollState = {
    val __obj = js.Dynamic.literal(colOverscanEndIdx = colOverscanEndIdx, colOverscanStartIdx = colOverscanStartIdx, colVisibleEndIdx = colVisibleEndIdx, colVisibleStartIdx = colVisibleStartIdx, height = height, isScrolling = isScrolling, lastFrozenColumnIndex = lastFrozenColumnIndex, rowOverscanEndIdx = rowOverscanEndIdx, rowOverscanStartIdx = rowOverscanStartIdx, rowVisibleEndIdx = rowVisibleEndIdx, rowVisibleStartIdx = rowVisibleStartIdx, scrollDirection = scrollDirection, scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[ScrollState]
  }
}

