package typings.reactDashDataDashGrid.AdazzleReactDataGrid

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
    val __obj = js.Dynamic.literal(colOverscanEndIdx = colOverscanEndIdx.asInstanceOf[js.Any], colOverscanStartIdx = colOverscanStartIdx.asInstanceOf[js.Any], colVisibleEndIdx = colVisibleEndIdx.asInstanceOf[js.Any], colVisibleStartIdx = colVisibleStartIdx.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], lastFrozenColumnIndex = lastFrozenColumnIndex.asInstanceOf[js.Any], rowOverscanEndIdx = rowOverscanEndIdx.asInstanceOf[js.Any], rowOverscanStartIdx = rowOverscanStartIdx.asInstanceOf[js.Any], rowVisibleEndIdx = rowVisibleEndIdx.asInstanceOf[js.Any], rowVisibleStartIdx = rowVisibleStartIdx.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollState]
  }
}

