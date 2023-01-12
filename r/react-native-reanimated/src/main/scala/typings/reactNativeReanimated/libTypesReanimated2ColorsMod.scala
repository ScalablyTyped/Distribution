package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2ColorsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/Colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RGBtoHSV(rgb: RGB): HSV = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBtoHSV")(rgb.asInstanceOf[js.Any]).asInstanceOf[HSV]
  inline def RGBtoHSV(r: Double, g: Double, b: Double): HSV = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBtoHSV")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[HSV]
  
  inline def blue(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blue")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def convertToHSVA(color: Any): ParsedColorArray = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToHSVA")(color.asInstanceOf[js.Any]).asInstanceOf[ParsedColorArray]
  
  inline def green(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("green")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hsvToColor(h: Double, s: Double, v: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToColor")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  
  inline def isColor(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColor")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def opacity(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("opacity")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def processColor(color: Any): js.UndefOr[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("processColor")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | Null]]
  
  inline def processColorInitially(color: Any): js.UndefOr[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("processColorInitially")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | Null]]
  
  inline def red(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rgbaColor(r: Double, g: Double, b: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaColor")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  inline def rgbaColor(r: Double, g: Double, b: Double, alpha: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaColor")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  
  inline def toRGBA(HSVA: ParsedColorArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGBA")(HSVA.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait HSV extends StObject {
    
    var h: Double
    
    var s: Double
    
    var v: Double
  }
  object HSV {
    
    inline def apply(h: Double, s: Double, v: Double): HSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSV]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HSV] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  type ParsedColorArray = js.Tuple4[Double, Double, Double, Double]
  
  trait RGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGB {
    
    inline def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
