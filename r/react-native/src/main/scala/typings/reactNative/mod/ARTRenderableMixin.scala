package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.bevel
import typings.reactNative.reactNativeStrings.butt
import typings.reactNative.reactNativeStrings.miter
import typings.reactNative.reactNativeStrings.round
import typings.reactNative.reactNativeStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARTRenderableMixin
  extends StObject
     with ARTNodeMixin {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var strokeCap: js.UndefOr[butt | square | round] = js.undefined
  
  var strokeDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var strokeJoin: js.UndefOr[bevel | miter | round] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object ARTRenderableMixin {
  
  inline def apply(): ARTRenderableMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARTRenderableMixin]
  }
  
  extension [Self <: ARTRenderableMixin](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeCap(value: butt | square | round): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    inline def setStrokeDash(value: js.Array[Double]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    inline def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
    
    inline def setStrokeJoin(value: bevel | miter | round): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
