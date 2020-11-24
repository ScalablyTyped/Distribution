package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightProps extends AbstractSeriesProps[LineMarkSeriesPoint] {
  
  var drag: js.UndefOr[Boolean] = js.native
  
  var enableX: js.UndefOr[Boolean] = js.native
  
  var enableY: js.UndefOr[Boolean] = js.native
  
  var highlightHeight: js.UndefOr[Double] = js.native
  
  var highlightWidth: js.UndefOr[Double] = js.native
  
  var highlightX: js.UndefOr[String | Double] = js.native
  
  var highlightY: js.UndefOr[String | Double] = js.native
  
  var onBrush: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onBrushEnd: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onBrushStart: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onDrag: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onDragEnd: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.native
}
object HighlightProps {
  
  @scala.inline
  def apply(): HighlightProps = {
    val __obj = js.Dynamic.literal()
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
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setEnableX(value: Boolean): Self = this.set("enableX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableX: Self = this.set("enableX", js.undefined)
    
    @scala.inline
    def setEnableY(value: Boolean): Self = this.set("enableY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableY: Self = this.set("enableY", js.undefined)
    
    @scala.inline
    def setHighlightHeight(value: Double): Self = this.set("highlightHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightHeight: Self = this.set("highlightHeight", js.undefined)
    
    @scala.inline
    def setHighlightWidth(value: Double): Self = this.set("highlightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightWidth: Self = this.set("highlightWidth", js.undefined)
    
    @scala.inline
    def setHighlightX(value: String | Double): Self = this.set("highlightX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightX: Self = this.set("highlightX", js.undefined)
    
    @scala.inline
    def setHighlightY(value: String | Double): Self = this.set("highlightY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightY: Self = this.set("highlightY", js.undefined)
    
    @scala.inline
    def setOnBrush(value: /* area */ HighlightArea | Null => Unit): Self = this.set("onBrush", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBrush: Self = this.set("onBrush", js.undefined)
    
    @scala.inline
    def setOnBrushEnd(value: /* area */ HighlightArea | Null => Unit): Self = this.set("onBrushEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBrushEnd: Self = this.set("onBrushEnd", js.undefined)
    
    @scala.inline
    def setOnBrushStart(value: /* area */ HighlightArea | Null => Unit): Self = this.set("onBrushStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBrushStart: Self = this.set("onBrushStart", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* area */ HighlightArea | Null => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: /* area */ HighlightArea | Null => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* area */ HighlightArea | Null => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
  }
}
