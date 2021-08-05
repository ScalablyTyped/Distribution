package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactBeautifulDnd.mod.VerticalAxis
  - typings.reactBeautifulDnd.mod.HorizontalAxis
*/
trait Axis extends StObject
object Axis {
  
  inline def HorizontalAxis(): typings.reactBeautifulDnd.mod.HorizontalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = "bottom", crossAxisLine = "y", crossAxisSize = "height", crossAxisStart = "top", direction = "horizontal", end = "right", line = "x", size = "width", start = "left")
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.HorizontalAxis]
  }
  
  inline def VerticalAxis(): typings.reactBeautifulDnd.mod.VerticalAxis = {
    val __obj = js.Dynamic.literal(crossAxisEnd = "right", crossAxisLine = "x", crossAxisSize = "width", crossAxisStart = "left", direction = "vertical", end = "bottom", line = "y", size = "height", start = "top")
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.VerticalAxis]
  }
}
