package typings.reactSvgRadarChart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClassName extends StObject {
    
    var className: String = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Color extends StObject {
    
    var color: String = js.native
  }
  object Color {
    
    @scala.inline
    def apply(color: String): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fill extends StObject {
    
    var className: String = js.native
    
    var fill: String = js.native
  }
  object Fill {
    
    @scala.inline
    def apply(className: String, fill: String): Fill = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fill]
    }
    
    @scala.inline
    implicit class FillMutableBuilder[Self <: Fill] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FontFamily extends StObject {
    
    var className: String = js.native
    
    var fontFamily: String = js.native
    
    var fontSize: Double = js.native
    
    var textAnchor: String = js.native
  }
  object FontFamily {
    
    @scala.inline
    def apply(className: String, fontFamily: String, fontSize: Double, textAnchor: String): FontFamily = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontFamily]
    }
    
    @scala.inline
    implicit class FontFamilyMutableBuilder[Self <: FontFamily] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    }
  }
}
