package typings.reactNativeSnapCarousel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Index[T] extends StObject {
    
    var index: Double = js.native
    
    var item: T = js.native
  }
  object Index {
    
    @scala.inline
    def apply[T](index: Double, item: T): Index[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[T]]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index[_], T] (val x: Self with Index[T]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InputRange extends StObject {
    
    var inputRange: js.Array[Double] = js.native
    
    var outputRange: js.Array[Double] = js.native
  }
  object InputRange {
    
    @scala.inline
    def apply(inputRange: js.Array[Double], outputRange: js.Array[Double]): InputRange = {
      val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputRange]
    }
    
    @scala.inline
    implicit class InputRangeMutableBuilder[Self <: InputRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputRange(value: js.Array[Double]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRangeVarargs(value: Double*): Self = StObject.set(x, "inputRange", js.Array(value :_*))
      
      @scala.inline
      def setOutputRange(value: js.Array[Double]): Self = StObject.set(x, "outputRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputRangeVarargs(value: Double*): Self = StObject.set(x, "outputRange", js.Array(value :_*))
    }
  }
}
