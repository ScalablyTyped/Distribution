package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolateConfig extends StObject {
  
  var cache: SharedValue[InterpolateRGB | InterpolateHSV | Null]
  
  var colorSpace: ColorSpace
  
  var inputRange: js.Array[Double]
  
  var outputRange: js.Array[String | Double]
}
object InterpolateConfig {
  
  inline def apply(
    cache: SharedValue[InterpolateRGB | InterpolateHSV | Null],
    colorSpace: ColorSpace,
    inputRange: js.Array[Double],
    outputRange: js.Array[String | Double]
  ): InterpolateConfig = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolateConfig]
  }
  
  extension [Self <: InterpolateConfig](x: Self) {
    
    inline def setCache(value: SharedValue[InterpolateRGB | InterpolateHSV | Null]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: ColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setInputRange(value: js.Array[Double]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
    
    inline def setInputRangeVarargs(value: Double*): Self = StObject.set(x, "inputRange", js.Array(value*))
    
    inline def setOutputRange(value: js.Array[String | Double]): Self = StObject.set(x, "outputRange", value.asInstanceOf[js.Any])
    
    inline def setOutputRangeVarargs(value: (String | Double)*): Self = StObject.set(x, "outputRange", js.Array(value*))
  }
}
