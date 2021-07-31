package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typings.reactBeautifulDnd.reactBeautifulDndStrings.height
import typings.reactBeautifulDnd.reactBeautifulDndStrings.left
import typings.reactBeautifulDnd.reactBeautifulDndStrings.right
import typings.reactBeautifulDnd.reactBeautifulDndStrings.top
import typings.reactBeautifulDnd.reactBeautifulDndStrings.vertical
import typings.reactBeautifulDnd.reactBeautifulDndStrings.width
import typings.reactBeautifulDnd.reactBeautifulDndStrings.x
import typings.reactBeautifulDnd.reactBeautifulDndStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalAxis
  extends StObject
     with Axis {
  
  var crossAxisEnd: right
  
  var crossAxisLine: x
  
  var crossAxisSize: width
  
  var crossAxisStart: left
  
  var direction: vertical
  
  var end: bottom
  
  var line: y
  
  var size: height
  
  var start: top
}
object VerticalAxis {
  
  @scala.inline
  def apply(): VerticalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = "right", crossAxisLine = "x", crossAxisSize = "width", crossAxisStart = "left", direction = "vertical", end = "bottom", line = "y", size = "height", start = "top")
    __obj.asInstanceOf[VerticalAxis]
  }
  
  @scala.inline
  implicit class VerticalAxisMutableBuilder[Self <: VerticalAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossAxisEnd(value: right): Self = StObject.set(x, "crossAxisEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisLine(value: typings.reactBeautifulDnd.reactBeautifulDndStrings.x): Self = StObject.set(x, "crossAxisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisSize(value: width): Self = StObject.set(x, "crossAxisSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisStart(value: left): Self = StObject.set(x, "crossAxisStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: bottom): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: y): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: top): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
