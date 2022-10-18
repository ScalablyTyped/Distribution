package typings.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMapSize extends StObject {
  
  /**
    * Resolution of color map -- number corresponding to the number of steps colors are interpolated into.
    *
    * @default 256
    * @platform iOS: Google Maps only
    * @platform Android: Supported
    */
  var colorMapSize: Double
  
  /**
    * Colors (one or more) to used for gradient.
    *
    * @platform iOS: Google Maps only
    * @platform Android: Supported
    */
  var colors: js.Array[String]
  
  /**
    * Array of floating point values from 0 to 1 representing where each color starts.
    *
    * Array length must be equal to `colors` array length.
    *
    * @platform iOS: Google Maps only
    * @platform Android: Supported
    */
  var startPoints: js.Array[Double]
}
object ColorMapSize {
  
  inline def apply(colorMapSize: Double, colors: js.Array[String], startPoints: js.Array[Double]): ColorMapSize = {
    val __obj = js.Dynamic.literal(colorMapSize = colorMapSize.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], startPoints = startPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMapSize]
  }
  
  extension [Self <: ColorMapSize](x: Self) {
    
    inline def setColorMapSize(value: Double): Self = StObject.set(x, "colorMapSize", value.asInstanceOf[js.Any])
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setStartPoints(value: js.Array[Double]): Self = StObject.set(x, "startPoints", value.asInstanceOf[js.Any])
    
    inline def setStartPointsVarargs(value: Double*): Self = StObject.set(x, "startPoints", js.Array(value*))
  }
}
