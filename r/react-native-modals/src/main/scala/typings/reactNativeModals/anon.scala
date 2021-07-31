package typings.reactNativeModals

import typings.reactNativeModals.mod.SlideFromTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnimationDuration extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var toValue: js.UndefOr[Double] = js.undefined
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
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SlideFrom extends StObject {
    
    var slideFrom: js.UndefOr[SlideFromTypes] = js.undefined
    
    var toValue: js.UndefOr[Double] = js.undefined
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
  
  trait Width extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Width {
    
    @scala.inline
    def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
