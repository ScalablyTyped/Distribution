package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompassParams
  extends StObject
     with FrameStruct
     with PointKnob {
  
  var customLayer: js.UndefOr[Any] = js.undefined
  
  var degreeScale: js.UndefOr[Boolean] = js.undefined
  
  var pointSymbols: js.UndefOr[js.Array[String]] = js.undefined
  
  var pointSymbolsVisible: js.UndefOr[Boolean] = js.undefined
  
  var roseVisible: js.UndefOr[Boolean] = js.undefined
  
  var rotateFace: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object CompassParams {
  
  inline def apply(): CompassParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompassParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompassParams] (val x: Self) extends AnyVal {
    
    inline def setCustomLayer(value: Any): Self = StObject.set(x, "customLayer", value.asInstanceOf[js.Any])
    
    inline def setCustomLayerUndefined: Self = StObject.set(x, "customLayer", js.undefined)
    
    inline def setDegreeScale(value: Boolean): Self = StObject.set(x, "degreeScale", value.asInstanceOf[js.Any])
    
    inline def setDegreeScaleUndefined: Self = StObject.set(x, "degreeScale", js.undefined)
    
    inline def setPointSymbols(value: js.Array[String]): Self = StObject.set(x, "pointSymbols", value.asInstanceOf[js.Any])
    
    inline def setPointSymbolsUndefined: Self = StObject.set(x, "pointSymbols", js.undefined)
    
    inline def setPointSymbolsVarargs(value: String*): Self = StObject.set(x, "pointSymbols", js.Array(value*))
    
    inline def setPointSymbolsVisible(value: Boolean): Self = StObject.set(x, "pointSymbolsVisible", value.asInstanceOf[js.Any])
    
    inline def setPointSymbolsVisibleUndefined: Self = StObject.set(x, "pointSymbolsVisible", js.undefined)
    
    inline def setRoseVisible(value: Boolean): Self = StObject.set(x, "roseVisible", value.asInstanceOf[js.Any])
    
    inline def setRoseVisibleUndefined: Self = StObject.set(x, "roseVisible", js.undefined)
    
    inline def setRotateFace(value: Boolean): Self = StObject.set(x, "rotateFace", value.asInstanceOf[js.Any])
    
    inline def setRotateFaceUndefined: Self = StObject.set(x, "rotateFace", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
