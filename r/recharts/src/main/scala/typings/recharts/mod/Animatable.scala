package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animatable extends StObject {
  
  var animationBegin: js.UndefOr[Double] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var animationEasing: js.UndefOr[AnimationEasingType] = js.undefined
  
  var animationId: js.UndefOr[Double] = js.undefined
  
  var isAnimationActive: js.UndefOr[Boolean] = js.undefined
  
  var isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined
  
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.undefined
  
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.undefined
}
object Animatable {
  
  @scala.inline
  def apply(): Animatable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animatable]
  }
  
  @scala.inline
  implicit class AnimatableMutableBuilder[Self <: Animatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationBegin(value: Double): Self = StObject.set(x, "animationBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationBeginUndefined: Self = StObject.set(x, "animationBegin", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: AnimationEasingType): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    @scala.inline
    def setAnimationId(value: Double): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationIdUndefined: Self = StObject.set(x, "animationId", js.undefined)
    
    @scala.inline
    def setIsAnimationActive(value: Boolean): Self = StObject.set(x, "isAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnimationActiveUndefined: Self = StObject.set(x, "isAnimationActive", js.undefined)
    
    @scala.inline
    def setIsUpdateAnimationActive(value: Boolean): Self = StObject.set(x, "isUpdateAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUpdateAnimationActiveUndefined: Self = StObject.set(x, "isUpdateAnimationActive", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: RechartsFunction): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: RechartsFunction): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
  }
}
