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
  implicit class VerticalAxisOps[Self <: VerticalAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrossAxisEnd(value: right): Self = this.set("crossAxisEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisLine(value: typings.reactBeautifulDnd.reactBeautifulDndStrings.x): Self = this.set("crossAxisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisSize(value: width): Self = this.set("crossAxisSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAxisStart(value: left): Self = this.set("crossAxisStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: bottom): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: y): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: height): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: top): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
