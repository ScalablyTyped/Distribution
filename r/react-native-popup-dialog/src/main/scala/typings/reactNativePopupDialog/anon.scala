package typings.reactNativePopupDialog

import typings.reactNativePopupDialog.mod.SlideFromTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnimationDuration extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var toValue: js.UndefOr[Double] = js.native
  }
  object AnimationDuration {
    
    @scala.inline
    def apply(): AnimationDuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationDuration]
    }
    
    @scala.inline
    implicit class AnimationDurationMutableBuilder[Self <: AnimationDuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    }
  }
  
  @js.native
  trait SlideFrom extends StObject {
    
    var slideFrom: js.UndefOr[SlideFromTypes] = js.native
    
    var toValue: js.UndefOr[Double] = js.native
  }
  object SlideFrom {
    
    @scala.inline
    def apply(): SlideFrom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideFrom]
    }
    
    @scala.inline
    implicit class SlideFromMutableBuilder[Self <: SlideFrom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSlideFrom(value: SlideFromTypes): Self = StObject.set(x, "slideFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideFromUndefined: Self = StObject.set(x, "slideFrom", js.undefined)
      
      @scala.inline
      def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    }
  }
}
