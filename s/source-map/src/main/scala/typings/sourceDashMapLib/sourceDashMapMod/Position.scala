package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: scala.Double
  var line: scala.Double
}

object Position {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): Position = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[Position]
  }
}

