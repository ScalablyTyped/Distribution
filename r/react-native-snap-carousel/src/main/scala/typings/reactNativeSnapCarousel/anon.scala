package typings.reactNativeSnapCarousel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
  
  trait Index[T] extends StObject {
    
    var index: Double
    
    var item: T
  }
  object Index {
    
    inline def apply[T](index: Double, item: T): Index[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[T]]
    }
    
    extension [Self <: Index[?], T](x: Self & Index[T]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputRange extends StObject {
    
    var inputRange: js.Array[Double]
    
    var outputRange: js.Array[Double]
  }
  object InputRange {
    
    inline def apply(inputRange: js.Array[Double], outputRange: js.Array[Double]): InputRange = {
      val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputRange]
    }
    
    extension [Self <: InputRange](x: Self) {
      
      inline def setInputRange(value: js.Array[Double]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
      
      inline def setInputRangeVarargs(value: Double*): Self = StObject.set(x, "inputRange", js.Array(value :_*))
      
      inline def setOutputRange(value: js.Array[Double]): Self = StObject.set(x, "outputRange", value.asInstanceOf[js.Any])
      
      inline def setOutputRangeVarargs(value: Double*): Self = StObject.set(x, "outputRange", js.Array(value :_*))
    }
  }
}
