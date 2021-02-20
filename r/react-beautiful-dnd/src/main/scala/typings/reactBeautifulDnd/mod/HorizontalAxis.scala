package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typings.reactBeautifulDnd.reactBeautifulDndStrings.height
import typings.reactBeautifulDnd.reactBeautifulDndStrings.horizontal
import typings.reactBeautifulDnd.reactBeautifulDndStrings.left
import typings.reactBeautifulDnd.reactBeautifulDndStrings.right
import typings.reactBeautifulDnd.reactBeautifulDndStrings.top
import typings.reactBeautifulDnd.reactBeautifulDndStrings.width
import typings.reactBeautifulDnd.reactBeautifulDndStrings.x
import typings.reactBeautifulDnd.reactBeautifulDndStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalAxis extends Axis {
  
  var crossAxisEnd: bottom = js.native
  
  var crossAxisLine: y = js.native
  
  var crossAxisSize: height = js.native
  
  var crossAxisStart: top = js.native
  
  var direction: horizontal = js.native
  
  var end: right = js.native
  
  var line: x = js.native
  
  var size: width = js.native
  
  var start: left = js.native
}
object HorizontalAxis {
  
  @scala.inline
  def apply(
    crossAxisEnd: bottom,
    crossAxisLine: y,
    crossAxisSize: height,
    crossAxisStart: top,
    direction: horizontal,
    end: right,
    line: x,
    size: width,
    start: left
  ): HorizontalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalAxis]
  }
  
  @scala.inline
  implicit class HorizontalAxisMutableBuilder[Self <: HorizontalAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossAxisEnd(value: bottom): Self = StObject.set(x, "crossAxisEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisLine(value: y): Self = StObject.set(x, "crossAxisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisSize(value: height): Self = StObject.set(x, "crossAxisSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisStart(value: top): Self = StObject.set(x, "crossAxisStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: right): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: typings.reactBeautifulDnd.reactBeautifulDndStrings.x): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: width): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: left): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
