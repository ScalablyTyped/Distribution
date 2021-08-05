package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapPolylineProps
  extends StObject
     with ViewProps {
  
  var coordinates: js.Array[LatLng]
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var geodesic: js.UndefOr[Boolean] = js.undefined
  
  var lineCap: js.UndefOr[LineCapType] = js.undefined
  
  var lineDashPattern: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineDashPhase: js.UndefOr[Double] = js.undefined
  
  var lineJoin: js.UndefOr[LineJoinType] = js.undefined
  
  var miterLimit: js.UndefOr[Double] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeColors: js.UndefOr[js.Array[String]] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  var tappable: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object MapPolylineProps {
  
  inline def apply(coordinates: js.Array[LatLng]): MapPolylineProps = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPolylineProps]
  }
  
  extension [Self <: MapPolylineProps](x: Self) {
    
    inline def setCoordinates(value: js.Array[LatLng]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: LatLng*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    inline def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    inline def setLineCap(value: LineCapType): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineDashPattern(value: js.Array[Double]): Self = StObject.set(x, "lineDashPattern", value.asInstanceOf[js.Any])
    
    inline def setLineDashPatternUndefined: Self = StObject.set(x, "lineDashPattern", js.undefined)
    
    inline def setLineDashPatternVarargs(value: Double*): Self = StObject.set(x, "lineDashPattern", js.Array(value :_*))
    
    inline def setLineDashPhase(value: Double): Self = StObject.set(x, "lineDashPhase", value.asInstanceOf[js.Any])
    
    inline def setLineDashPhaseUndefined: Self = StObject.set(x, "lineDashPhase", js.undefined)
    
    inline def setLineJoin(value: LineJoinType): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    inline def setOnPress(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeColors(value: js.Array[String]): Self = StObject.set(x, "strokeColors", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorsUndefined: Self = StObject.set(x, "strokeColors", js.undefined)
    
    inline def setStrokeColorsVarargs(value: String*): Self = StObject.set(x, "strokeColors", js.Array(value :_*))
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    inline def setTappableUndefined: Self = StObject.set(x, "tappable", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
