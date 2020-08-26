package typings.reactNativeSvgCharts.anon

import typings.reactNative.mod.GestureResponderEvent
import typings.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typings.reactNativeSvg.mod.FillRule
import typings.reactNativeSvg.mod.Linecap
import typings.reactNativeSvg.mod.Linejoin
import typings.reactNativeSvg.mod.NumberArray
import typings.reactNativeSvg.mod.NumberProp
import typings.reactNativeSvg.mod.TransformObject
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-none`
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-only`
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.`non-scaling-stroke`
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.auto
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.default
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.inherit
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.nonScalingStroke
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.none
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-svg.react-native-svg.PathProps> */
@js.native
trait PartialPathProps extends js.Object {
  var clipPath: js.UndefOr[String] = js.native
  var clipRule: js.UndefOr[FillRule] = js.native
  var d: js.UndefOr[String] = js.native
  var delayLongPress: js.UndefOr[Double] = js.native
  var delayPressIn: js.UndefOr[Double] = js.native
  var delayPressOut: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[typings.reactNativeSvg.mod.Color] = js.native
  var fillOpacity: js.UndefOr[NumberProp] = js.native
  var fillRule: js.UndefOr[FillRule] = js.native
  var id: js.UndefOr[String] = js.native
  var marker: js.UndefOr[String] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
  var mask: js.UndefOr[String] = js.native
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var opacity: js.UndefOr[NumberProp] = js.native
  var origin: js.UndefOr[NumberArray] = js.native
  var originX: js.UndefOr[NumberProp] = js.native
  var originY: js.UndefOr[NumberProp] = js.native
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  var rotation: js.UndefOr[NumberProp] = js.native
  var scale: js.UndefOr[NumberArray] = js.native
  var scaleX: js.UndefOr[NumberProp] = js.native
  var scaleY: js.UndefOr[NumberProp] = js.native
  var skew: js.UndefOr[NumberArray] = js.native
  var skewX: js.UndefOr[NumberProp] = js.native
  var skewY: js.UndefOr[NumberProp] = js.native
  var stroke: js.UndefOr[typings.reactNativeSvg.mod.Color] = js.native
  var strokeDasharray: js.UndefOr[js.Array[NumberProp] | NumberProp] = js.native
  var strokeDashoffset: js.UndefOr[NumberProp] = js.native
  var strokeLinecap: js.UndefOr[Linecap] = js.native
  var strokeLinejoin: js.UndefOr[Linejoin] = js.native
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.native
  var strokeOpacity: js.UndefOr[NumberProp] = js.native
  var strokeWidth: js.UndefOr[NumberProp] = js.native
  var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject] = js.native
  var translate: js.UndefOr[NumberArray] = js.native
  var translateX: js.UndefOr[NumberProp] = js.native
  var translateY: js.UndefOr[NumberProp] = js.native
  var vectorEffect: js.UndefOr[none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri] = js.native
  var x: js.UndefOr[NumberArray] = js.native
  var y: js.UndefOr[NumberArray] = js.native
}

object PartialPathProps {
  @scala.inline
  def apply(): PartialPathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPathProps]
  }
  @scala.inline
  implicit class PartialPathPropsOps[Self <: PartialPathProps] (val x: Self) extends AnyVal {
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
    def setClipPath(value: String): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    @scala.inline
    def setClipRule(value: FillRule): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setDelayLongPress(value: Double): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    @scala.inline
    def setDelayPressIn(value: Double): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    @scala.inline
    def setDelayPressOut(value: Double): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFillVarargs(value: Double*): Self = this.set("fill", js.Array(value :_*))
    @scala.inline
    def setFill(value: typings.reactNativeSvg.mod.Color): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacity(value: NumberProp): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRule(value: FillRule): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setMarkerEnd(value: String): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    @scala.inline
    def setMarkerMid(value: String): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    @scala.inline
    def setMarkerStart(value: String): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    @scala.inline
    def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    @scala.inline
    def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    @scala.inline
    def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderGrant", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    @scala.inline
    def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    @scala.inline
    def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderReject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    @scala.inline
    def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    @scala.inline
    def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    @scala.inline
    def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onResponderTerminate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    @scala.inline
    def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOpacity(value: NumberProp): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOriginVarargs(value: NumberProp*): Self = this.set("origin", js.Array(value :_*))
    @scala.inline
    def setOrigin(value: NumberArray): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setOriginX(value: NumberProp): Self = this.set("originX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginX: Self = this.set("originX", js.undefined)
    @scala.inline
    def setOriginY(value: NumberProp): Self = this.set("originY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginY: Self = this.set("originY", js.undefined)
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    @scala.inline
    def setRotation(value: NumberProp): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScaleVarargs(value: NumberProp*): Self = this.set("scale", js.Array(value :_*))
    @scala.inline
    def setScale(value: NumberArray): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScaleX(value: NumberProp): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: NumberProp): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setSkewVarargs(value: NumberProp*): Self = this.set("skew", js.Array(value :_*))
    @scala.inline
    def setSkew(value: NumberArray): Self = this.set("skew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkew: Self = this.set("skew", js.undefined)
    @scala.inline
    def setSkewX(value: NumberProp): Self = this.set("skewX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewX: Self = this.set("skewX", js.undefined)
    @scala.inline
    def setSkewY(value: NumberProp): Self = this.set("skewY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewY: Self = this.set("skewY", js.undefined)
    @scala.inline
    def setStrokeVarargs(value: Double*): Self = this.set("stroke", js.Array(value :_*))
    @scala.inline
    def setStroke(value: typings.reactNativeSvg.mod.Color): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeDasharrayVarargs(value: NumberProp*): Self = this.set("strokeDasharray", js.Array(value :_*))
    @scala.inline
    def setStrokeDasharray(value: js.Array[NumberProp] | NumberProp): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    @scala.inline
    def setStrokeDashoffset(value: NumberProp): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: Linecap): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeLinejoin(value: Linejoin): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    @scala.inline
    def setStrokeMiterlimit(value: NumberProp): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: NumberProp): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: NumberProp): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTranslateVarargs(value: NumberProp*): Self = this.set("translate", js.Array(value :_*))
    @scala.inline
    def setTranslate(value: NumberArray): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setTranslateX(value: NumberProp): Self = this.set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    @scala.inline
    def setTranslateY(value: NumberProp): Self = this.set("translateY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    @scala.inline
    def setVectorEffect(value: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
    @scala.inline
    def setXVarargs(value: NumberProp*): Self = this.set("x", js.Array(value :_*))
    @scala.inline
    def setX(value: NumberArray): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setYVarargs(value: NumberProp*): Self = this.set("y", js.Array(value :_*))
    @scala.inline
    def setY(value: NumberArray): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

