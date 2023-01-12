package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Right
import typings.reactNativeChartsWrapper.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarLineChartBase
  extends StObject
     with ChartBase {
  
  var autoScaleMinMaxEnabled: js.UndefOr[Boolean] = js.undefined
  
  var borderColor: js.UndefOr[Color] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var doubleTapToZoomEnabled: js.UndefOr[Boolean] = js.undefined
  
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  
  var drawBorders: js.UndefOr[Boolean] = js.undefined
  
  var drawGridBackground: js.UndefOr[Boolean] = js.undefined
  
  var extraOffsets: js.UndefOr[Offsets] = js.undefined
  
  var gridBackgroundColor: js.UndefOr[Color] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var highlightPerDragEnabled: js.UndefOr[Boolean] = js.undefined
  
  var identifier: js.UndefOr[String] = js.undefined
  
  var keepPositionOnRotation: js.UndefOr[Boolean] = js.undefined
  
  var maxHighlightDistance: js.UndefOr[Double] = js.undefined
  
  var maxVisibleValueCount: js.UndefOr[Double] = js.undefined
  
  var minOffset: js.UndefOr[Double] = js.undefined
  
  var pinchZoom: js.UndefOr[Boolean] = js.undefined
  
  var scaleEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scaleXEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scaleYEnabled: js.UndefOr[Boolean] = js.undefined
  
  var syncX: js.UndefOr[Boolean] = js.undefined
  
  var syncY: js.UndefOr[Boolean] = js.undefined
  
  var viewPortOffsets: js.UndefOr[Offsets] = js.undefined
  
  var visibleRange: js.UndefOr[X] = js.undefined
  
  var yAxis: js.UndefOr[Right] = js.undefined
  
  var zoom: js.UndefOr[typings.reactNativeChartsWrapper.anon.AxisDependency] = js.undefined
}
object BarLineChartBase {
  
  inline def apply(): BarLineChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLineChartBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarLineChartBase] (val x: Self) extends AnyVal {
    
    inline def setAutoScaleMinMaxEnabled(value: Boolean): Self = StObject.set(x, "autoScaleMinMaxEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoScaleMinMaxEnabledUndefined: Self = StObject.set(x, "autoScaleMinMaxEnabled", js.undefined)
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setDoubleTapToZoomEnabled(value: Boolean): Self = StObject.set(x, "doubleTapToZoomEnabled", value.asInstanceOf[js.Any])
    
    inline def setDoubleTapToZoomEnabledUndefined: Self = StObject.set(x, "doubleTapToZoomEnabled", js.undefined)
    
    inline def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    inline def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
    
    inline def setDrawBorders(value: Boolean): Self = StObject.set(x, "drawBorders", value.asInstanceOf[js.Any])
    
    inline def setDrawBordersUndefined: Self = StObject.set(x, "drawBorders", js.undefined)
    
    inline def setDrawGridBackground(value: Boolean): Self = StObject.set(x, "drawGridBackground", value.asInstanceOf[js.Any])
    
    inline def setDrawGridBackgroundUndefined: Self = StObject.set(x, "drawGridBackground", js.undefined)
    
    inline def setExtraOffsets(value: Offsets): Self = StObject.set(x, "extraOffsets", value.asInstanceOf[js.Any])
    
    inline def setExtraOffsetsUndefined: Self = StObject.set(x, "extraOffsets", js.undefined)
    
    inline def setGridBackgroundColor(value: Color): Self = StObject.set(x, "gridBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setGridBackgroundColorUndefined: Self = StObject.set(x, "gridBackgroundColor", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHighlightPerDragEnabled(value: Boolean): Self = StObject.set(x, "highlightPerDragEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightPerDragEnabledUndefined: Self = StObject.set(x, "highlightPerDragEnabled", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setKeepPositionOnRotation(value: Boolean): Self = StObject.set(x, "keepPositionOnRotation", value.asInstanceOf[js.Any])
    
    inline def setKeepPositionOnRotationUndefined: Self = StObject.set(x, "keepPositionOnRotation", js.undefined)
    
    inline def setMaxHighlightDistance(value: Double): Self = StObject.set(x, "maxHighlightDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxHighlightDistanceUndefined: Self = StObject.set(x, "maxHighlightDistance", js.undefined)
    
    inline def setMaxVisibleValueCount(value: Double): Self = StObject.set(x, "maxVisibleValueCount", value.asInstanceOf[js.Any])
    
    inline def setMaxVisibleValueCountUndefined: Self = StObject.set(x, "maxVisibleValueCount", js.undefined)
    
    inline def setMinOffset(value: Double): Self = StObject.set(x, "minOffset", value.asInstanceOf[js.Any])
    
    inline def setMinOffsetUndefined: Self = StObject.set(x, "minOffset", js.undefined)
    
    inline def setPinchZoom(value: Boolean): Self = StObject.set(x, "pinchZoom", value.asInstanceOf[js.Any])
    
    inline def setPinchZoomUndefined: Self = StObject.set(x, "pinchZoom", js.undefined)
    
    inline def setScaleEnabled(value: Boolean): Self = StObject.set(x, "scaleEnabled", value.asInstanceOf[js.Any])
    
    inline def setScaleEnabledUndefined: Self = StObject.set(x, "scaleEnabled", js.undefined)
    
    inline def setScaleXEnabled(value: Boolean): Self = StObject.set(x, "scaleXEnabled", value.asInstanceOf[js.Any])
    
    inline def setScaleXEnabledUndefined: Self = StObject.set(x, "scaleXEnabled", js.undefined)
    
    inline def setScaleYEnabled(value: Boolean): Self = StObject.set(x, "scaleYEnabled", value.asInstanceOf[js.Any])
    
    inline def setScaleYEnabledUndefined: Self = StObject.set(x, "scaleYEnabled", js.undefined)
    
    inline def setSyncX(value: Boolean): Self = StObject.set(x, "syncX", value.asInstanceOf[js.Any])
    
    inline def setSyncXUndefined: Self = StObject.set(x, "syncX", js.undefined)
    
    inline def setSyncY(value: Boolean): Self = StObject.set(x, "syncY", value.asInstanceOf[js.Any])
    
    inline def setSyncYUndefined: Self = StObject.set(x, "syncY", js.undefined)
    
    inline def setViewPortOffsets(value: Offsets): Self = StObject.set(x, "viewPortOffsets", value.asInstanceOf[js.Any])
    
    inline def setViewPortOffsetsUndefined: Self = StObject.set(x, "viewPortOffsets", js.undefined)
    
    inline def setVisibleRange(value: X): Self = StObject.set(x, "visibleRange", value.asInstanceOf[js.Any])
    
    inline def setVisibleRangeUndefined: Self = StObject.set(x, "visibleRange", js.undefined)
    
    inline def setYAxis(value: Right): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    inline def setZoom(value: typings.reactNativeChartsWrapper.anon.AxisDependency): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
