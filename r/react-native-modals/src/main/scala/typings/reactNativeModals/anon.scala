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
    
    inline def apply(): AnimationDuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationDuration]
    }
    
    extension [Self <: AnimationDuration](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SlideFrom extends StObject {
    
    var slideFrom: js.UndefOr[SlideFromTypes] = js.undefined
    
    var toValue: js.UndefOr[Double] = js.undefined
  }
  object SlideFrom {
    
    inline def apply(): SlideFrom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideFrom]
    }
    
    extension [Self <: SlideFrom](x: Self) {
      
      inline def setSlideFrom(value: SlideFromTypes): Self = StObject.set(x, "slideFrom", value.asInstanceOf[js.Any])
      
      inline def setSlideFromUndefined: Self = StObject.set(x, "slideFrom", js.undefined)
      
      inline def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    }
  }
  
  trait Width extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Width {
    
    inline def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    extension [Self <: Width](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
