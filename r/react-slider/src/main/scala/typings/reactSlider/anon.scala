package typings.reactSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index extends StObject {
    
    var index: Double
    
    var value: Double | js.Array[Double]
    
    var valueNow: Double
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, value: Double | js.Array[Double], valueNow: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueNow = valueNow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNow(value: Double): Self = StObject.set(x, "valueNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait Value extends StObject {
    
    var index: Double
    
    var value: Double | js.Array[Double]
  }
  object Value {
    
    @scala.inline
    def apply(index: Double, value: Double | js.Array[Double]): Value = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
