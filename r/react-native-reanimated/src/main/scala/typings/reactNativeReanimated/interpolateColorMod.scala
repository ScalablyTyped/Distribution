package typings.reactNativeReanimated

import typings.reactNativeReanimated.reactNativeReanimatedStrings.HSV
import typings.reactNativeReanimated.reactNativeReanimatedStrings.RGB
import typings.reactNativeReanimated.reanimated2CommonTypesMod.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolateColorMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/interpolateColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ColorSpace extends StObject
  @JSImport("react-native-reanimated/lib/types/reanimated2/interpolateColor", "ColorSpace")
  @js.native
  object ColorSpace extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ColorSpace & Double] = js.native
    
    @js.native
    sealed trait HSV
      extends StObject
         with ColorSpace
    /* 1 */ val HSV: typings.reactNativeReanimated.interpolateColorMod.ColorSpace.HSV & Double = js.native
    
    @js.native
    sealed trait RGB
      extends StObject
         with ColorSpace
    /* 0 */ val RGB: typings.reactNativeReanimated.interpolateColorMod.ColorSpace.RGB & Double = js.native
  }
  
  inline def interpolateColor(value: Double, inputRange: js.Array[Double], outputRange: js.Array[String | Double]): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColor")(value.asInstanceOf[js.Any], inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def interpolateColor(
    value: Double,
    inputRange: js.Array[Double],
    outputRange: js.Array[String | Double],
    colorSpace: RGB | HSV
  ): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColor")(value.asInstanceOf[js.Any], inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def interpolateSharableColor(value: Double, interpolateConfig: SharedValue[InterpolateConfig]): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSharableColor")(value.asInstanceOf[js.Any], interpolateConfig.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def useInterpolateConfig(inputRange: js.Array[Double], outputRange: js.Array[String | Double]): SharedValue[InterpolateConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterpolateConfig")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[SharedValue[InterpolateConfig]]
  inline def useInterpolateConfig(inputRange: js.Array[Double], outputRange: js.Array[String | Double], colorSpace: ColorSpace): SharedValue[InterpolateConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterpolateConfig")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any])).asInstanceOf[SharedValue[InterpolateConfig]]
  
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
  
  trait InterpolateHSV extends StObject {
    
    var h: js.Array[Double]
    
    var s: js.Array[Double]
    
    var v: js.Array[Double]
  }
  object InterpolateHSV {
    
    inline def apply(h: js.Array[Double], s: js.Array[Double], v: js.Array[Double]): InterpolateHSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterpolateHSV]
    }
    
    extension [Self <: InterpolateHSV](x: Self) {
      
      inline def setH(value: js.Array[Double]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHVarargs(value: Double*): Self = StObject.set(x, "h", js.Array(value*))
      
      inline def setS(value: js.Array[Double]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSVarargs(value: Double*): Self = StObject.set(x, "s", js.Array(value*))
      
      inline def setV(value: js.Array[Double]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVVarargs(value: Double*): Self = StObject.set(x, "v", js.Array(value*))
    }
  }
  
  trait InterpolateRGB extends StObject {
    
    var a: js.Array[Double]
    
    var b: js.Array[Double]
    
    var g: js.Array[Double]
    
    var r: js.Array[Double]
  }
  object InterpolateRGB {
    
    inline def apply(a: js.Array[Double], b: js.Array[Double], g: js.Array[Double], r: js.Array[Double]): InterpolateRGB = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterpolateRGB]
    }
    
    extension [Self <: InterpolateRGB](x: Self) {
      
      inline def setA(value: js.Array[Double]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAVarargs(value: Double*): Self = StObject.set(x, "a", js.Array(value*))
      
      inline def setB(value: js.Array[Double]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBVarargs(value: Double*): Self = StObject.set(x, "b", js.Array(value*))
      
      inline def setG(value: js.Array[Double]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGVarargs(value: Double*): Self = StObject.set(x, "g", js.Array(value*))
      
      inline def setR(value: js.Array[Double]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRVarargs(value: Double*): Self = StObject.set(x, "r", js.Array(value*))
    }
  }
}
