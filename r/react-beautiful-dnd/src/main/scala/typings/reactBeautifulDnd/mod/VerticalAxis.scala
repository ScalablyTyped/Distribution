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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalAxis extends Axis {
  
  var crossAxisEnd: right = js.native
  
  var crossAxisLine: x = js.native
  
  var crossAxisSize: width = js.native
  
  var crossAxisStart: left = js.native
  
  var direction: vertical = js.native
  
  var end: bottom = js.native
  
  var line: y = js.native
  
  var size: height = js.native
  
  var start: top = js.native
}
object VerticalAxis {
  
  @scala.inline
  def apply(
    crossAxisEnd: right,
    crossAxisLine: x,
    crossAxisSize: width,
    crossAxisStart: left,
    direction: vertical,
    end: bottom,
    line: y,
    size: height,
    start: top
  ): VerticalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
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
