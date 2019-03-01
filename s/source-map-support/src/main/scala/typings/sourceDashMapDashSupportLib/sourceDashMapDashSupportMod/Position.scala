package typings
package sourceDashMapDashSupportLib.sourceDashMapDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var source: java.lang.String
}

object Position {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, source: java.lang.String): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Position]
  }
}

