package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Right
import typings.reactNativeChartsWrapper.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarLineChartBase extends ChartBase {
  
  var autoScaleMinMaxEnabled: js.UndefOr[Boolean] = js.native
  
  var borderColor: js.UndefOr[Color] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var doubleTapToZoomEnabled: js.UndefOr[Boolean] = js.native
  
  var dragEnabled: js.UndefOr[Boolean] = js.native
  
  var drawBorders: js.UndefOr[Boolean] = js.native
  
  var drawGridBackground: js.UndefOr[Boolean] = js.native
  
  var extraOffsets: js.UndefOr[Offsets] = js.native
  
  var gridBackgroundColor: js.UndefOr[Color] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var highlightPerDragEnabled: js.UndefOr[Boolean] = js.native
  
  var identifier: js.UndefOr[String] = js.native
  
  var keepPositionOnRotation: js.UndefOr[Boolean] = js.native
  
  var maxHighlightDistance: js.UndefOr[Double] = js.native
  
  var maxVisibleValueCount: js.UndefOr[Double] = js.native
  
  var minOffset: js.UndefOr[Double] = js.native
  
  var pinchZoom: js.UndefOr[Boolean] = js.native
  
  var scaleEnabled: js.UndefOr[Boolean] = js.native
  
  var scaleXEnabled: js.UndefOr[Boolean] = js.native
  
  var scaleYEnabled: js.UndefOr[Boolean] = js.native
  
  var syncX: js.UndefOr[Boolean] = js.native
  
  var syncY: js.UndefOr[Boolean] = js.native
  
  var viewPortOffsets: js.UndefOr[Offsets] = js.native
  
  var visibleRange: js.UndefOr[X] = js.native
  
  var yAxis: js.UndefOr[Right] = js.native
  
  var zoom: js.UndefOr[typings.reactNativeChartsWrapper.anon.AxisDependency] = js.native
}
object BarLineChartBase {
  
  @scala.inline
  def apply(): BarLineChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLineChartBase]
  }
  
  @scala.inline
  implicit class BarLineChartBaseOps[Self <: BarLineChartBase] (val x: Self) extends AnyVal {
    
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
    def setAutoScaleMinMaxEnabled(value: Boolean): Self = this.set("autoScaleMinMaxEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScaleMinMaxEnabled: Self = this.set("autoScaleMinMaxEnabled", js.undefined)
    
    @scala.inline
    def setBorderColor(value: Color): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setDoubleTapToZoomEnabled(value: Boolean): Self = this.set("doubleTapToZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleTapToZoomEnabled: Self = this.set("doubleTapToZoomEnabled", js.undefined)
    
    @scala.inline
    def setDragEnabled(value: Boolean): Self = this.set("dragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragEnabled: Self = this.set("dragEnabled", js.undefined)
    
    @scala.inline
    def setDrawBorders(value: Boolean): Self = this.set("drawBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawBorders: Self = this.set("drawBorders", js.undefined)
    
    @scala.inline
    def setDrawGridBackground(value: Boolean): Self = this.set("drawGridBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawGridBackground: Self = this.set("drawGridBackground", js.undefined)
    
    @scala.inline
    def setExtraOffsets(value: Offsets): Self = this.set("extraOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraOffsets: Self = this.set("extraOffsets", js.undefined)
    
    @scala.inline
    def setGridBackgroundColor(value: Color): Self = this.set("gridBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridBackgroundColor: Self = this.set("gridBackgroundColor", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHighlightPerDragEnabled(value: Boolean): Self = this.set("highlightPerDragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightPerDragEnabled: Self = this.set("highlightPerDragEnabled", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setKeepPositionOnRotation(value: Boolean): Self = this.set("keepPositionOnRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepPositionOnRotation: Self = this.set("keepPositionOnRotation", js.undefined)
    
    @scala.inline
    def setMaxHighlightDistance(value: Double): Self = this.set("maxHighlightDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHighlightDistance: Self = this.set("maxHighlightDistance", js.undefined)
    
    @scala.inline
    def setMaxVisibleValueCount(value: Double): Self = this.set("maxVisibleValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVisibleValueCount: Self = this.set("maxVisibleValueCount", js.undefined)
    
    @scala.inline
    def setMinOffset(value: Double): Self = this.set("minOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinOffset: Self = this.set("minOffset", js.undefined)
    
    @scala.inline
    def setPinchZoom(value: Boolean): Self = this.set("pinchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinchZoom: Self = this.set("pinchZoom", js.undefined)
    
    @scala.inline
    def setScaleEnabled(value: Boolean): Self = this.set("scaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleEnabled: Self = this.set("scaleEnabled", js.undefined)
    
    @scala.inline
    def setScaleXEnabled(value: Boolean): Self = this.set("scaleXEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleXEnabled: Self = this.set("scaleXEnabled", js.undefined)
    
    @scala.inline
    def setScaleYEnabled(value: Boolean): Self = this.set("scaleYEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleYEnabled: Self = this.set("scaleYEnabled", js.undefined)
    
    @scala.inline
    def setSyncX(value: Boolean): Self = this.set("syncX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncX: Self = this.set("syncX", js.undefined)
    
    @scala.inline
    def setSyncY(value: Boolean): Self = this.set("syncY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncY: Self = this.set("syncY", js.undefined)
    
    @scala.inline
    def setViewPortOffsets(value: Offsets): Self = this.set("viewPortOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewPortOffsets: Self = this.set("viewPortOffsets", js.undefined)
    
    @scala.inline
    def setVisibleRange(value: X): Self = this.set("visibleRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleRange: Self = this.set("visibleRange", js.undefined)
    
    @scala.inline
    def setYAxis(value: Right): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    
    @scala.inline
    def setZoom(value: typings.reactNativeChartsWrapper.anon.AxisDependency): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
