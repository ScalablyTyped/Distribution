package typings.reactSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index[T /* <: Double | js.Array[Double] */] extends StObject {
    
    var index: Double
    
    var value: T
    
    var valueNow: Double
  }
  object Index {
    
    inline def apply[T /* <: Double | js.Array[Double] */](index: Double, value: T, valueNow: Double): Index[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueNow = valueNow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[T]]
    }
    
    extension [Self <: Index[?], T /* <: Double | js.Array[Double] */](x: Self & Index[T]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNow(value: Double): Self = StObject.set(x, "valueNow", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T /* <: Double | js.Array[Double] */] extends StObject {
    
    var index: Double
    
    var value: T
  }
  object Value {
    
    inline def apply[T /* <: Double | js.Array[Double] */](index: Double, value: T): Value[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    extension [Self <: Value[?], T /* <: Double | js.Array[Double] */](x: Self & Value[T]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
