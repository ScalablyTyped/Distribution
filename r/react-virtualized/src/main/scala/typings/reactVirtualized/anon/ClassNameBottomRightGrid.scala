package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`-1`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNameBottomRightGrid extends js.Object {
  var classNameBottomLeftGrid: _empty = js.native
  var classNameBottomRightGrid: _empty = js.native
  var classNameTopLeftGrid: _empty = js.native
  var classNameTopRightGrid: _empty = js.native
  var enableFixedColumnScroll: `false` = js.native
  var enableFixedRowScroll: `false` = js.native
  var fixedColumnCount: `0` = js.native
  var fixedRowCount: `0` = js.native
  var scrollToColumn: `-1` = js.native
  var scrollToRow: `-1` = js.native
}

object ClassNameBottomRightGrid {
  @scala.inline
  def apply(
    classNameBottomLeftGrid: _empty,
    classNameBottomRightGrid: _empty,
    classNameTopLeftGrid: _empty,
    classNameTopRightGrid: _empty,
    enableFixedColumnScroll: `false`,
    enableFixedRowScroll: `false`,
    fixedColumnCount: `0`,
    fixedRowCount: `0`,
    scrollToColumn: `-1`,
    scrollToRow: `-1`
  ): ClassNameBottomRightGrid = {
    val __obj = js.Dynamic.literal(classNameBottomLeftGrid = classNameBottomLeftGrid.asInstanceOf[js.Any], classNameBottomRightGrid = classNameBottomRightGrid.asInstanceOf[js.Any], classNameTopLeftGrid = classNameTopLeftGrid.asInstanceOf[js.Any], classNameTopRightGrid = classNameTopRightGrid.asInstanceOf[js.Any], enableFixedColumnScroll = enableFixedColumnScroll.asInstanceOf[js.Any], enableFixedRowScroll = enableFixedRowScroll.asInstanceOf[js.Any], fixedColumnCount = fixedColumnCount.asInstanceOf[js.Any], fixedRowCount = fixedRowCount.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameBottomRightGrid]
  }
  @scala.inline
  implicit class ClassNameBottomRightGridOps[Self <: ClassNameBottomRightGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassNameBottomLeftGrid(value: _empty): Self = this.set("classNameBottomLeftGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassNameBottomRightGrid(value: _empty): Self = this.set("classNameBottomRightGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassNameTopLeftGrid(value: _empty): Self = this.set("classNameTopLeftGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassNameTopRightGrid(value: _empty): Self = this.set("classNameTopRightGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableFixedColumnScroll(value: `false`): Self = this.set("enableFixedColumnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableFixedRowScroll(value: `false`): Self = this.set("enableFixedRowScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedColumnCount(value: `0`): Self = this.set("fixedColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedRowCount(value: `0`): Self = this.set("fixedRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToColumn(value: `-1`): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToRow(value: `-1`): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
  }
  
}

