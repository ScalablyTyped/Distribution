package typings.reactSvgPanZoom

import typings.reactSvgPanZoom.mod.ToolbarPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Background extends StObject {
    
    var background: String
    
    var height: Double
    
    var position: /* "none" */ String
    
    var width: Double
  }
  object Background {
    
    @scala.inline
    def apply(background: String, height: Double, position: /* "none" */ String, width: Double): Background = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    @scala.inline
    implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: /* "none" */ String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var SVGAlignX: js.UndefOr[/* "center" */ String] = js.undefined
    
    var SVGAlignY: js.UndefOr[/* "center" */ String] = js.undefined
    
    var position: js.UndefOr[ToolbarPosition] = js.undefined
  }
  object Position {
    
    @scala.inline
    def apply(): Position = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: ToolbarPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSVGAlignX(value: /* "center" */ String): Self = StObject.set(x, "SVGAlignX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVGAlignXUndefined: Self = StObject.set(x, "SVGAlignX", js.undefined)
      
      @scala.inline
      def setSVGAlignY(value: /* "center" */ String): Self = StObject.set(x, "SVGAlignY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVGAlignYUndefined: Self = StObject.set(x, "SVGAlignY", js.undefined)
    }
  }
}
