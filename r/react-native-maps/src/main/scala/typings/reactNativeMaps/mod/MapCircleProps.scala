package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapCircleProps
  extends StObject
     with ViewProps {
  
  var center: LatLng
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var lineCap: js.UndefOr[LineCapType] = js.undefined
  
  var lineDashPattern: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineDashPhase: js.UndefOr[Double] = js.undefined
  
  var lineJoin: js.UndefOr[LineJoinType] = js.undefined
  
  var miterLimit: js.UndefOr[Double] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var radius: Double
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object MapCircleProps {
  
  inline def apply(center: LatLng, radius: Double): MapCircleProps = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapCircleProps]
  }
  
  extension [Self <: MapCircleProps](x: Self) {
    
    inline def setCenter(value: LatLng): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
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
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
