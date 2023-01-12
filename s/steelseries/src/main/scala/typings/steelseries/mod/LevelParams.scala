package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelParams
  extends StObject
     with FrameStruct {
  
  var decimalsVisible: js.UndefOr[Boolean] = js.undefined
  
  var pointerColor: js.UndefOr[ColorDef] = js.undefined
  
  var rotateFace: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var textOrientationFixed: js.UndefOr[Boolean] = js.undefined
}
object LevelParams {
  
  inline def apply(): LevelParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelParams] (val x: Self) extends AnyVal {
    
    inline def setDecimalsVisible(value: Boolean): Self = StObject.set(x, "decimalsVisible", value.asInstanceOf[js.Any])
    
    inline def setDecimalsVisibleUndefined: Self = StObject.set(x, "decimalsVisible", js.undefined)
    
    inline def setPointerColor(value: ColorDef): Self = StObject.set(x, "pointerColor", value.asInstanceOf[js.Any])
    
    inline def setPointerColorUndefined: Self = StObject.set(x, "pointerColor", js.undefined)
    
    inline def setRotateFace(value: Boolean): Self = StObject.set(x, "rotateFace", value.asInstanceOf[js.Any])
    
    inline def setRotateFaceUndefined: Self = StObject.set(x, "rotateFace", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTextOrientationFixed(value: Boolean): Self = StObject.set(x, "textOrientationFixed", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationFixedUndefined: Self = StObject.set(x, "textOrientationFixed", js.undefined)
  }
}
