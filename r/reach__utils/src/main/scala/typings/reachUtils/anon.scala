package typings.reachUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CalledFrom[T] extends StObject {
    
    var calledFrom: js.UndefOr[String] = js.undefined
    
    var controlledValue: js.UndefOr[T] = js.undefined
    
    var defaultValue: T | js.Function0[T]
  }
  object CalledFrom {
    
    inline def apply[T](defaultValue: T | js.Function0[T]): CalledFrom[T] = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalledFrom[T]]
    }
    
    extension [Self <: CalledFrom[?], T](x: Self & CalledFrom[T]) {
      
      inline def setCalledFrom(value: String): Self = StObject.set(x, "calledFrom", value.asInstanceOf[js.Any])
      
      inline def setCalledFromUndefined: Self = StObject.set(x, "calledFrom", js.undefined)
      
      inline def setControlledValue(value: T): Self = StObject.set(x, "controlledValue", value.asInstanceOf[js.Any])
      
      inline def setControlledValueUndefined: Self = StObject.set(x, "controlledValue", js.undefined)
      
      inline def setDefaultValue(value: T | js.Function0[T]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueFunction0(value: () => T): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollX extends StObject {
    
    var scrollX: Double
    
    var scrollY: Double
  }
  object ScrollX {
    
    inline def apply(scrollX: Double, scrollY: Double): ScrollX = {
      val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollX]
    }
    
    extension [Self <: ScrollX](x: Self) {
      
      inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    }
  }
}
