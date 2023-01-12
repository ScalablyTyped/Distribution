package typings.reactNativeChartsWrapper.anon

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BL_TR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BR_TL
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_RIGHT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_LEFT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TL_BR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TR_BL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var colors: js.UndefOr[js.Array[typings.reactNativeChartsWrapper.mod.Color]] = js.undefined
  
  var orientation: js.UndefOr[
    TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR
  ] = js.undefined
  
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
}
object Angle {
  
  inline def apply(): Angle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setColors(value: js.Array[typings.reactNativeChartsWrapper.mod.Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: typings.reactNativeChartsWrapper.mod.Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setOrientation(value: TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    inline def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value*))
  }
}
