package typings.reactSvgRadarChart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: String
  }
  object ClassName {
    
    inline def apply(className: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    var color: String
  }
  object Color {
    
    inline def apply(color: String): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fill extends StObject {
    
    var className: String
    
    var fill: String
  }
  object Fill {
    
    inline def apply(className: String, fill: String): Fill = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fill]
    }
    
    extension [Self <: Fill](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontFamily extends StObject {
    
    var className: String
    
    var fontFamily: String
    
    var fontSize: Double
    
    var textAnchor: String
  }
  object FontFamily {
    
    inline def apply(className: String, fontFamily: String, fontSize: Double, textAnchor: String): FontFamily = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontFamily]
    }
    
    extension [Self <: FontFamily](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    }
  }
}
