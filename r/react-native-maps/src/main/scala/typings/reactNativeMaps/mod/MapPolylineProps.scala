package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapPolylineProps extends ViewProps {
  var coordinates: js.Array[LatLng] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var geodesic: js.UndefOr[Boolean] = js.native
  var lineCap: js.UndefOr[LineCapType] = js.native
  var lineDashPattern: js.UndefOr[js.Array[Double]] = js.native
  var lineDashPhase: js.UndefOr[Double] = js.native
  var lineJoin: js.UndefOr[LineJoinType] = js.native
  var miterLimit: js.UndefOr[Double] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeColors: js.UndefOr[js.Array[String]] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var tappable: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object MapPolylineProps {
  @scala.inline
  def apply(coordinates: js.Array[LatLng]): MapPolylineProps = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPolylineProps]
  }
  @scala.inline
  implicit class MapPolylinePropsOps[Self <: MapPolylineProps] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: LatLng*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[LatLng]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    @scala.inline
    def setLineCap(value: LineCapType): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    @scala.inline
    def setLineDashPatternVarargs(value: Double*): Self = this.set("lineDashPattern", js.Array(value :_*))
    @scala.inline
    def setLineDashPattern(value: js.Array[Double]): Self = this.set("lineDashPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashPattern: Self = this.set("lineDashPattern", js.undefined)
    @scala.inline
    def setLineDashPhase(value: Double): Self = this.set("lineDashPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashPhase: Self = this.set("lineDashPhase", js.undefined)
    @scala.inline
    def setLineJoin(value: LineJoinType): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiterLimit: Self = this.set("miterLimit", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeColorsVarargs(value: String*): Self = this.set("strokeColors", js.Array(value :_*))
    @scala.inline
    def setStrokeColors(value: js.Array[String]): Self = this.set("strokeColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColors: Self = this.set("strokeColors", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTappable(value: Boolean): Self = this.set("tappable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTappable: Self = this.set("tappable", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

