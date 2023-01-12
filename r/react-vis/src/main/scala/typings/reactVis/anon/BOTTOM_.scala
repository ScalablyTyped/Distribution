package typings.reactVis.anon

import typings.reactVis.reactVisStrings.bottom
import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import typings.reactVis.reactVisStrings.top
import typings.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOTTOM_ extends StObject {
  
  var BOTTOM: bottom
  
  var HORIZONTAL: horizontal
  
  var LEFT: left
  
  var RIGHT: right
  
  var TOP: top
  
  var VERTICAL: vertical
}
object BOTTOM_ {
  
  inline def apply(): BOTTOM_ = {
    val __obj = js.Dynamic.literal(BOTTOM = "bottom", HORIZONTAL = "horizontal", LEFT = "left", RIGHT = "right", TOP = "top", VERTICAL = "vertical")
    __obj.asInstanceOf[BOTTOM_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BOTTOM_] (val x: Self) extends AnyVal {
    
    inline def setBOTTOM(value: bottom): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    inline def setHORIZONTAL(value: horizontal): Self = StObject.set(x, "HORIZONTAL", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: left): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: right): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setTOP(value: top): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    
    inline def setVERTICAL(value: vertical): Self = StObject.set(x, "VERTICAL", value.asInstanceOf[js.Any])
  }
}
