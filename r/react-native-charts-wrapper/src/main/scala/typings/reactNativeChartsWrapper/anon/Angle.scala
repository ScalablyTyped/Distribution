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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Angle extends StObject {
  
  var angle: js.UndefOr[Double] = js.native
  
  var colors: js.UndefOr[js.Array[typings.reactNativeChartsWrapper.mod.Color]] = js.native
  
  var orientation: js.UndefOr[
    TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR
  ] = js.native
  
  var positions: js.UndefOr[js.Array[Double]] = js.native
}
object Angle {
  
  @scala.inline
  def apply(): Angle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit class AngleMutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[typings.reactNativeChartsWrapper.mod.Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: typings.reactNativeChartsWrapper.mod.Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setOrientation(value: TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    @scala.inline
    def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value :_*))
  }
}
