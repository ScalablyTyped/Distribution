package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextLayoutLine extends StObject {
  
  var ascender: Double
  
  var capHeight: Double
  
  var descender: Double
  
  var height: Double
  
  var text: String
  
  var width: Double
  
  var x: Double
  
  var xHeight: Double
  
  var y: Double
}
object TextLayoutLine {
  
  inline def apply(
    ascender: Double,
    capHeight: Double,
    descender: Double,
    height: Double,
    text: String,
    width: Double,
    x: Double,
    xHeight: Double,
    y: Double
  ): TextLayoutLine = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], capHeight = capHeight.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xHeight = xHeight.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayoutLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextLayoutLine] (val x: Self) extends AnyVal {
    
    inline def setAscender(value: Double): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
    
    inline def setCapHeight(value: Double): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
    
    inline def setDescender(value: Double): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXHeight(value: Double): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
