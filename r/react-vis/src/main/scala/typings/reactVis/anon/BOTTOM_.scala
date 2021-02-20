package typings.reactVis.anon

import typings.reactVis.reactVisStrings.bottom
import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import typings.reactVis.reactVisStrings.top
import typings.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BOTTOM_ extends StObject {
  
  var BOTTOM: bottom = js.native
  
  var HORIZONTAL: horizontal = js.native
  
  var LEFT: left = js.native
  
  var RIGHT: right = js.native
  
  var TOP: top = js.native
  
  var VERTICAL: vertical = js.native
}
object BOTTOM_ {
  
  @scala.inline
  def apply(BOTTOM: bottom, HORIZONTAL: horizontal, LEFT: left, RIGHT: right, TOP: top, VERTICAL: vertical): BOTTOM_ = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], HORIZONTAL = HORIZONTAL.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], VERTICAL = VERTICAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTTOM_]
  }
  
  @scala.inline
  implicit class BOTTOM_MutableBuilder[Self <: BOTTOM_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBOTTOM(value: bottom): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHORIZONTAL(value: horizontal): Self = StObject.set(x, "HORIZONTAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT(value: left): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT(value: right): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOP(value: top): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERTICAL(value: vertical): Self = StObject.set(x, "VERTICAL", value.asInstanceOf[js.Any])
  }
}
