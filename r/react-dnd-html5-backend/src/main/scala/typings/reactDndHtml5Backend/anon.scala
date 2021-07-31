package typings.reactDndHtml5Backend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnchorX extends StObject {
    
    var anchorX: Double
    
    var anchorY: Double
  }
  object AnchorX {
    
    @scala.inline
    def apply(anchorX: Double, anchorY: Double): AnchorX = {
      val __obj = js.Dynamic.literal(anchorX = anchorX.asInstanceOf[js.Any], anchorY = anchorY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorX]
    }
    
    @scala.inline
    implicit class AnchorXMutableBuilder[Self <: AnchorX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorX(value: Double): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorY(value: Double): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetX extends StObject {
    
    var offsetX: Double
    
    var offsetY: Double
  }
  object OffsetX {
    
    @scala.inline
    def apply(offsetX: Double, offsetY: Double): OffsetX = {
      val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetX]
    }
    
    @scala.inline
    implicit class OffsetXMutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    }
  }
}
