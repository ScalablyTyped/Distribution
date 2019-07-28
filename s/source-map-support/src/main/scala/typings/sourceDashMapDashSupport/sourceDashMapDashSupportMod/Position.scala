package typings.sourceDashMapDashSupport.sourceDashMapDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: Double
  var line: Double
  var source: String
}

object Position {
  @scala.inline
  def apply(column: Double, line: Double, source: String): Position = {
    val __obj = js.Dynamic.literal(column = column, line = line, source = source)
  
    __obj.asInstanceOf[Position]
  }
}

