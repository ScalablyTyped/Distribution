package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.bevel
import typings.reactNative.reactNativeStrings.butt
import typings.reactNative.reactNativeStrings.miter
import typings.reactNative.reactNativeStrings.round
import typings.reactNative.reactNativeStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARTRenderableMixin extends ARTNodeMixin {
  
  var fill: js.UndefOr[String] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeCap: js.UndefOr[butt | square | round] = js.native
  
  var strokeDash: js.UndefOr[js.Array[Double]] = js.native
  
  var strokeJoin: js.UndefOr[bevel | miter | round] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object ARTRenderableMixin {
  
  @scala.inline
  def apply(): ARTRenderableMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARTRenderableMixin]
  }
  
  @scala.inline
  implicit class ARTRenderableMixinMutableBuilder[Self <: ARTRenderableMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(value: butt | square | round): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeDash(value: js.Array[Double]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    @scala.inline
    def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
    
    @scala.inline
    def setStrokeJoin(value: bevel | miter | round): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
