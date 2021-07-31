package typings.rcTextarea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
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
  
  trait MaxHeight extends StObject {
    
    var height: Double
    
    var maxHeight: Double
    
    var minHeight: Double
    
    var overflowY: js.Any
  }
  object MaxHeight {
    
    @scala.inline
    def apply(height: Double, maxHeight: Double, minHeight: Double, overflowY: js.Any): MaxHeight = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], overflowY = overflowY.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxHeight]
    }
    
    @scala.inline
    implicit class MaxHeightMutableBuilder[Self <: MaxHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowY(value: js.Any): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String | Double | js.Array[String]
  }
  object Value {
    
    @scala.inline
    def apply(value: String | Double | js.Array[String]): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
