package typings.rcResizeObserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var offsetHeight: Double
    
    var offsetWidth: Double
    
    var width: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetHeight extends StObject {
    
    var height: Double
    
    var offsetHeight: Double
    
    var offsetWidth: Double
    
    var width: Double
  }
  object OffsetHeight {
    
    @scala.inline
    def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): OffsetHeight = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetHeight]
    }
    
    @scala.inline
    implicit class OffsetHeightMutableBuilder[Self <: OffsetHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
