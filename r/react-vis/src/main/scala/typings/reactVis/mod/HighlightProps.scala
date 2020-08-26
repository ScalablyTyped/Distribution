package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightProps extends AbstractSeriesProps[LineMarkSeriesPoint] {
  var enableX: js.UndefOr[Boolean] = js.native
  var enableY: js.UndefOr[Boolean] = js.native
  var highlightHeight: Double = js.native
  var highlightWidth: Double = js.native
  var highlightX: String | Double = js.native
  var highlightY: String | Double = js.native
  def onBrush(row: js.Any): js.Any = js.native
  def onBrushEnd(row: js.Any): js.Any = js.native
  def onBrushStart(row: js.Any): js.Any = js.native
  def onDrag(row: js.Any): js.Any = js.native
  def onDragEnd(row: js.Any): js.Any = js.native
  def onDragStart(row: js.Any): js.Any = js.native
}

object HighlightProps {
  @scala.inline
  def apply(
    highlightHeight: Double,
    highlightWidth: Double,
    highlightX: String | Double,
    highlightY: String | Double,
    onBrush: js.Any => js.Any,
    onBrushEnd: js.Any => js.Any,
    onBrushStart: js.Any => js.Any,
    onDrag: js.Any => js.Any,
    onDragEnd: js.Any => js.Any,
    onDragStart: js.Any => js.Any
  ): HighlightProps = {
    val __obj = js.Dynamic.literal(highlightHeight = highlightHeight.asInstanceOf[js.Any], highlightWidth = highlightWidth.asInstanceOf[js.Any], highlightX = highlightX.asInstanceOf[js.Any], highlightY = highlightY.asInstanceOf[js.Any], onBrush = js.Any.fromFunction1(onBrush), onBrushEnd = js.Any.fromFunction1(onBrushEnd), onBrushStart = js.Any.fromFunction1(onBrushStart), onDrag = js.Any.fromFunction1(onDrag), onDragEnd = js.Any.fromFunction1(onDragEnd), onDragStart = js.Any.fromFunction1(onDragStart))
    __obj.asInstanceOf[HighlightProps]
  }
  @scala.inline
  implicit class HighlightPropsOps[Self <: HighlightProps] (val x: Self) extends AnyVal {
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
    def setHighlightHeight(value: Double): Self = this.set("highlightHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightWidth(value: Double): Self = this.set("highlightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightX(value: String | Double): Self = this.set("highlightX", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightY(value: String | Double): Self = this.set("highlightY", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBrush(value: js.Any => js.Any): Self = this.set("onBrush", js.Any.fromFunction1(value))
    @scala.inline
    def setOnBrushEnd(value: js.Any => js.Any): Self = this.set("onBrushEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnBrushStart(value: js.Any => js.Any): Self = this.set("onBrushStart", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDrag(value: js.Any => js.Any): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDragEnd(value: js.Any => js.Any): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDragStart(value: js.Any => js.Any): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableX(value: Boolean): Self = this.set("enableX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableX: Self = this.set("enableX", js.undefined)
    @scala.inline
    def setEnableY(value: Boolean): Self = this.set("enableY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableY: Self = this.set("enableY", js.undefined)
  }
  
}

