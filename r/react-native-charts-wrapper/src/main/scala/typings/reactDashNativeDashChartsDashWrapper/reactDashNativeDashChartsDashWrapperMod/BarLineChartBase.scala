package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import typings.reactDashNative.reactDashNativeMod.AccessibilityActionEvent
import typings.reactDashNative.reactDashNativeMod.AccessibilityActionInfo
import typings.reactDashNative.reactDashNativeMod.AccessibilityRole
import typings.reactDashNative.reactDashNativeMod.AccessibilityState
import typings.reactDashNative.reactDashNativeMod.AccessibilityStates
import typings.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typings.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typings.reactDashNative.reactDashNativeMod.Insets
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNative.reactDashNativeStrings.`box-none`
import typings.reactDashNative.reactDashNativeStrings.`box-only`
import typings.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typings.reactDashNative.reactDashNativeStrings.assertive
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.button
import typings.reactDashNative.reactDashNativeStrings.no
import typings.reactDashNative.reactDashNativeStrings.none
import typings.reactDashNative.reactDashNativeStrings.polite
import typings.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typings.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typings.reactDashNative.reactDashNativeStrings.yes
import typings.reactDashNativeDashChartsDashWrapper.Anon_AxisDependency
import typings.reactDashNativeDashChartsDashWrapper.Anon_DataIndex
import typings.reactDashNativeDashChartsDashWrapper.Anon_Digits
import typings.reactDashNativeDashChartsDashWrapper.Anon_DurationX
import typings.reactDashNativeDashChartsDashWrapper.Anon_LeftRight
import typings.reactDashNativeDashChartsDashWrapper.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarLineChartBase extends ChartBase {
  var autoScaleMinMaxEnabled: js.UndefOr[Boolean] = js.undefined
  var borderColor: js.UndefOr[Color] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var doubleTapToZoomEnabled: js.UndefOr[Boolean] = js.undefined
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  var drawBorders: js.UndefOr[Boolean] = js.undefined
  var drawGridBackground: js.UndefOr[Boolean] = js.undefined
  var extraOffsets: js.UndefOr[Offsets] = js.undefined
  var gridBackgroundColor: js.UndefOr[Double] = js.undefined
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
  var visibleRange: js.UndefOr[Anon_X] = js.undefined
  var yAxis: js.UndefOr[Anon_LeftRight] = js.undefined
  var zoom: js.UndefOr[Anon_AxisDependency] = js.undefined
}

object BarLineChartBase {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    animation: Anon_DurationX = null,
    autoScaleMinMaxEnabled: js.UndefOr[Boolean] = js.undefined,
    borderColor: Int | Double = null,
    borderWidth: Int | Double = null,
    chartBackgroundColor: Int | Double = null,
    chartDescription: ChartDescription = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    doubleTapToZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    dragDecelerationEnabled: js.UndefOr[Boolean] = js.undefined,
    dragDecelerationFrictionCoef: Int | Double = null,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    drawBorders: js.UndefOr[Boolean] = js.undefined,
    drawGridBackground: js.UndefOr[Boolean] = js.undefined,
    extraOffsets: Offsets = null,
    gridBackgroundColor: Int | Double = null,
    group: String = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    highlightPerDragEnabled: js.UndefOr[Boolean] = js.undefined,
    highlightPerTapEnabled: js.UndefOr[Boolean] = js.undefined,
    highlights: js.Array[Anon_DataIndex] = null,
    hitSlop: Insets = null,
    identifier: String = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keepPositionOnRotation: js.UndefOr[Boolean] = js.undefined,
    legend: ChartLegend = null,
    logEnabled: js.UndefOr[Boolean] = js.undefined,
    marker: Anon_Digits = null,
    maxHighlightDistance: Int | Double = null,
    maxVisibleValueCount: Int | Double = null,
    minOffset: Int | Double = null,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    noDataText: String = null,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onChange: /* event */ ChartChangeEvent => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onResponderEnd: /* event */ GestureResponderEvent => Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => Boolean = null,
    onSelect: /* event */ ChartSelectEvent => Unit = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onTouchCancel: /* event */ GestureResponderEvent => Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => Unit = null,
    pinchZoom: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    scaleEnabled: js.UndefOr[Boolean] = js.undefined,
    scaleXEnabled: js.UndefOr[Boolean] = js.undefined,
    scaleYEnabled: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    syncX: js.UndefOr[Boolean] = js.undefined,
    syncY: js.UndefOr[Boolean] = js.undefined,
    testID: String = null,
    touchEnabled: js.UndefOr[Boolean] = js.undefined,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    viewPortOffsets: Offsets = null,
    visibleRange: Anon_X = null,
    xAxis: xAxis = null,
    yAxis: Anon_LeftRight = null,
    zoom: Anon_AxisDependency = null
  ): BarLineChartBase = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScaleMinMaxEnabled)) __obj.updateDynamic("autoScaleMinMaxEnabled")(autoScaleMinMaxEnabled.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (chartBackgroundColor != null) __obj.updateDynamic("chartBackgroundColor")(chartBackgroundColor.asInstanceOf[js.Any])
    if (chartDescription != null) __obj.updateDynamic("chartDescription")(chartDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleTapToZoomEnabled)) __obj.updateDynamic("doubleTapToZoomEnabled")(doubleTapToZoomEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dragDecelerationEnabled)) __obj.updateDynamic("dragDecelerationEnabled")(dragDecelerationEnabled.asInstanceOf[js.Any])
    if (dragDecelerationFrictionCoef != null) __obj.updateDynamic("dragDecelerationFrictionCoef")(dragDecelerationFrictionCoef.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBorders)) __obj.updateDynamic("drawBorders")(drawBorders.asInstanceOf[js.Any])
    if (!js.isUndefined(drawGridBackground)) __obj.updateDynamic("drawGridBackground")(drawGridBackground.asInstanceOf[js.Any])
    if (extraOffsets != null) __obj.updateDynamic("extraOffsets")(extraOffsets.asInstanceOf[js.Any])
    if (gridBackgroundColor != null) __obj.updateDynamic("gridBackgroundColor")(gridBackgroundColor.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightPerDragEnabled)) __obj.updateDynamic("highlightPerDragEnabled")(highlightPerDragEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightPerTapEnabled)) __obj.updateDynamic("highlightPerTapEnabled")(highlightPerTapEnabled.asInstanceOf[js.Any])
    if (highlights != null) __obj.updateDynamic("highlights")(highlights.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (!js.isUndefined(keepPositionOnRotation)) __obj.updateDynamic("keepPositionOnRotation")(keepPositionOnRotation.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (!js.isUndefined(logEnabled)) __obj.updateDynamic("logEnabled")(logEnabled.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (maxHighlightDistance != null) __obj.updateDynamic("maxHighlightDistance")(maxHighlightDistance.asInstanceOf[js.Any])
    if (maxVisibleValueCount != null) __obj.updateDynamic("maxVisibleValueCount")(maxVisibleValueCount.asInstanceOf[js.Any])
    if (minOffset != null) __obj.updateDynamic("minOffset")(minOffset.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (!js.isUndefined(pinchZoom)) __obj.updateDynamic("pinchZoom")(pinchZoom.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleEnabled)) __obj.updateDynamic("scaleEnabled")(scaleEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleXEnabled)) __obj.updateDynamic("scaleXEnabled")(scaleXEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleYEnabled)) __obj.updateDynamic("scaleYEnabled")(scaleYEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(syncX)) __obj.updateDynamic("syncX")(syncX.asInstanceOf[js.Any])
    if (!js.isUndefined(syncY)) __obj.updateDynamic("syncY")(syncY.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (viewPortOffsets != null) __obj.updateDynamic("viewPortOffsets")(viewPortOffsets.asInstanceOf[js.Any])
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarLineChartBase]
  }
}

