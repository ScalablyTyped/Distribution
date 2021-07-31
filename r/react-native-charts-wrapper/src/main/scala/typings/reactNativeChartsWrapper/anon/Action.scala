package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: String
  
  var bottom: js.UndefOr[Double] = js.undefined
  
  var centerX: js.UndefOr[Double] = js.undefined
  
  var centerY: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var right: js.UndefOr[Double] = js.undefined
  
  var scaleX: js.UndefOr[Double] = js.undefined
  
  var scaleY: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object Action {
  
  @scala.inline
  def apply(action: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
