package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.bottom
import typings.reactBeautifulDnd.reactBeautifulDndStrings.height
import typings.reactBeautifulDnd.reactBeautifulDndStrings.horizontal
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

/* Rewritten from type alias, can be one of: 
  - typings.reactBeautifulDnd.mod.VerticalAxis
  - typings.reactBeautifulDnd.mod.HorizontalAxis
*/
trait Axis extends StObject
object Axis {
  
  @scala.inline
  def HorizontalAxis(
    crossAxisEnd: bottom,
    crossAxisLine: y,
    crossAxisSize: height,
    crossAxisStart: top,
    direction: horizontal,
    end: right,
    line: x,
    size: width,
    start: left
  ): typings.reactBeautifulDnd.mod.HorizontalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.HorizontalAxis]
  }
  
  @scala.inline
  def VerticalAxis(
    crossAxisEnd: right,
    crossAxisLine: x,
    crossAxisSize: width,
    crossAxisStart: left,
    direction: vertical,
    end: bottom,
    line: y,
    size: height,
    start: top
  ): typings.reactBeautifulDnd.mod.VerticalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = crossAxisEnd.asInstanceOf[js.Any], crossAxisLine = crossAxisLine.asInstanceOf[js.Any], crossAxisSize = crossAxisSize.asInstanceOf[js.Any], crossAxisStart = crossAxisStart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.VerticalAxis]
  }
}
