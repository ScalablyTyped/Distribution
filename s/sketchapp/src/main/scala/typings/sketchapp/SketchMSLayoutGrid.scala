package typings.sketchapp

import typings.sketchapp.sketchappStrings.layoutGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSLayoutGrid extends SketchMSLayout {
  var _class: layoutGrid = js.native
  var columnWidth: Double = js.native
  var drawHorizontal: Boolean = js.native
  var drawHorizontalLines: Boolean = js.native
  var drawVertical: Boolean = js.native
  var gutterHeight: Double = js.native
  var gutterWidth: Double = js.native
  var guttersOutside: Boolean = js.native
  var horizontalOffset: Double = js.native
  var isEnabled: Boolean = js.native
  var numberOfColumns: Double = js.native
  var rowHeightMultiplication: Double = js.native
  var totalWidth: Double = js.native
}

object SketchMSLayoutGrid {
  @scala.inline
  def apply(
    _class: layoutGrid,
    columnWidth: Double,
    drawHorizontal: Boolean,
    drawHorizontalLines: Boolean,
    drawVertical: Boolean,
    gutterHeight: Double,
    gutterWidth: Double,
    guttersOutside: Boolean,
    horizontalOffset: Double,
    isEnabled: Boolean,
    numberOfColumns: Double,
    rowHeightMultiplication: Double,
    totalWidth: Double
  ): SketchMSLayoutGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], drawHorizontal = drawHorizontal.asInstanceOf[js.Any], drawHorizontalLines = drawHorizontalLines.asInstanceOf[js.Any], drawVertical = drawVertical.asInstanceOf[js.Any], gutterHeight = gutterHeight.asInstanceOf[js.Any], gutterWidth = gutterWidth.asInstanceOf[js.Any], guttersOutside = guttersOutside.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], rowHeightMultiplication = rowHeightMultiplication.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutGrid]
  }
  @scala.inline
  implicit class SketchMSLayoutGridOps[Self <: SketchMSLayoutGrid] (val x: Self) extends AnyVal {
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
    def set_class(value: layoutGrid): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawHorizontal(value: Boolean): Self = this.set("drawHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawHorizontalLines(value: Boolean): Self = this.set("drawHorizontalLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawVertical(value: Boolean): Self = this.set("drawVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def setGutterHeight(value: Double): Self = this.set("gutterHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setGutterWidth(value: Double): Self = this.set("gutterWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuttersOutside(value: Boolean): Self = this.set("guttersOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfColumns(value: Double): Self = this.set("numberOfColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeightMultiplication(value: Double): Self = this.set("rowHeightMultiplication", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalWidth(value: Double): Self = this.set("totalWidth", value.asInstanceOf[js.Any])
  }
  
}

